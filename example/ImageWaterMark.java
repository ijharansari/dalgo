import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
//from  ww  w .j a v a  2  s  .c  o  m
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageWaterMark {
  public static void main(String[] args) throws IOException {
    BufferedImage im = ImageIO.read(new File("/home/ijhar/Downloads/KATHMANDU.jpg"));
    BufferedImage im2 = ImageIO.read(new File("/home/ijhar/Downloads/Flag-Nepal.jpg"));

    BufferedImage resizedImage = new BufferedImage(50, 50, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = resizedImage.createGraphics();
        graphics2D.drawImage(im2, 0, 0, 50, 50, null);
        graphics2D.dispose();


    Graphics2D g = im.createGraphics();
    g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.4f));
    g.drawImage(resizedImage, im.getWidth()-50,im.getHeight()-50, null);
    g.dispose();

    ImageIO.write(im, "jpeg", new File("/home/ijhar/Downloads/merged.jpeg"));
  }

}
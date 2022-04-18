import java.io.File;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Utility resize images
 */

public class ImageResizer {
    public static void main(String args[]) throws IOException {
        BufferedImage originalImage = ImageIO.read(new File("/home/ijhar/Pictures/1234.png"));
        BufferedImage resizedImage = new BufferedImage(400, 200, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = resizedImage.createGraphics();
        graphics2D.drawImage(resizedImage, 0, 0, 400, 200, null);
        graphics2D.dispose();

        ImageIO.write(resizedImage, "png", new File("/home/ijhar/Pictures/12345.png"));
    }
}

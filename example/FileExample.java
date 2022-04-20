import java.io.File;

public class FileExample {
    public static void main(String args[]) {
        String abcd = "/home/ubuntu/tomcat8/photocert_dati_b2b/resourceDir/content@photocert.co.uk/postman/content@photocert.co.uk_simpleupload_829154.jpg";
        File file = new File("/home/ubuntu/tomcat8/photocert_dati_b2b/resourceDir/content@photocert.co.uk/postman/content@photocert.co.uk_simpleupload_829154.jpg");
        System.out.println(abcd.replace("photocert_dati_b2b/resourceDir/", "photocert_dati_b2b/thumbnailDir/"));
        System.out.println(file.getName().substring(file.getName().lastIndexOf(".")+1));
    }
}

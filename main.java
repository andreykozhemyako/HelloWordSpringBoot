package properties;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class main {
    public static void main(String[] args) throws InterruptedException {
        //for (int i = 0; i < 3; i++) {
        PropertyReader readerOne = new PropertyReader("D:\\Users\\AKozhemyako\\IdeaProjects\\HelloWordSpringBoot\\src\\main\\resources\\properties\\personA.properties");
        PropertyReader readerTwo = new PropertyReader("D:\\Users\\AKozhemyako\\IdeaProjects\\HelloWordSpringBoot\\src\\main\\resources\\properties\\personB.properties");


        readerOne.start();
        readerOne.join();
        readerTwo.start();
        readerTwo.join();
        System.out.println("___________________________");
        // }
    }
}

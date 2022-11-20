package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class BaseTest {
static WebDriver driver;
    public static void main(String[] args) {
        System.out.println("hello world");

     Dimension size = driver.manage().window().getSize();
     int startX = size.width /2;
     int endX = startX;

    }


}

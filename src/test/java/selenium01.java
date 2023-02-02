import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium01 {
    public static void main(String[] args) {
System.setProperty("Webdriver.chrome.driver","src/drivers/selenium-java-4.8.0");

        WebDriver driver = new ChromeDriver();

driver.get("https://www.amazon.com/");


    }
}

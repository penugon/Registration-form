import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class RegistrationFormTest {
    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/en-gb?route=account/register");
    }


    @Test()
    public void validateAllElements(){
        WebElement registerAccount = driver.findElement(By.tagName("h1"));
        Assert.assertTrue(registerAccount.isDisplayed(), "Element is Present");

        WebElement text = driver.findElement(By.xpath("//div[@id ='content']//p"));
        Assert.assertTrue(text.isDisplayed(),"Element is Present");

        WebElement detailsField = driver.findElement(By.xpath("//fieldset[@id ='account']//legend"));
        Assert.assertTrue(detailsField.isDisplayed(),"Element is Present");

        WebElement firstNameField = driver.findElement(By.xpath("//input[@id='input-firstname']"));
        Assert.assertTrue(firstNameField.isDisplayed(), "FirstNameField is Present");

        WebElement lastNameField = driver.findElement(By.xpath("//input[@id='input-lastname']"));
        Assert.assertTrue(lastNameField.isDisplayed(),"LastNameFeild  is present");

        WebElement emailField = driver.findElement(By.xpath("//input[@id='input-email']"));
        Assert.assertTrue(emailField.isDisplayed(),"EmailFeild  is present");

        WebElement password = driver.findElement(By.xpath("//legend[text()='Your Password']"));
        Assert.assertTrue(password.isDisplayed(),"PasswordTextElement is Present");

        WebElement passwordField = driver.findElement(By.xpath("//input[@id='input-password']"));
        Assert.assertTrue(passwordField.isDisplayed(),"PasswordFeild  is present");

        WebElement newsLetter = driver.findElement(By.xpath("//input[@id='input-newsletter']"));
        Assert.assertTrue(newsLetter.isDisplayed(),"NewsLetterFeild  is present");

        WebElement privacypolicy = driver.findElement(By.name("agree"));
        Assert.assertTrue(privacypolicy.isDisplayed(),"PrivacyPolicyFeild  is present");

        WebElement button = driver.findElement(By.xpath("//button[contains(@class, 'btn-primary')]"));
        Assert.assertTrue(button.isDisplayed(),"ContinueField is Present");






    }
    @Test(priority = 1)
    public  void EmptyfieldSubmission(){

        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("lakshmi");

        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys("Lakshmi25@gmail.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("lakshmi@25");

        WebElement privacypolicy = driver.findElement(By.name("agree"));
        privacypolicy.click();

        WebElement button = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/form/div/button"));
        button.click();


    }


    @Test(priority = 2)
    public void invaildEmailField(){

        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("john");

        WebElement lastname = driver.findElement(By.id("input-lastname"));
        lastname.sendKeys("Doe");

        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys("johndo25@");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("johndo@25");

        WebElement privacypolicy = driver.findElement(By.name("agree"));
        privacypolicy.click();

        WebElement button = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/form/div/button"));
        button.click();






    }

    @Test(priority = 3)
    public void validatePasswordLength(){

        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("john");

        WebElement lastname = driver.findElement(By.id("input-lastname"));
        lastname.sendKeys("Doe");

        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys("johndo25@gmail.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("12345");

        WebElement privacypolicy = driver.findElement(By.name("agree"));
        privacypolicy.click();

        WebElement button = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/form/div/button"));
        button.click();





    }

    @Test(priority = 4)
    public void vailatePrivacyPolicy(){

        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("john");

        WebElement lastname = driver.findElement(By.id("input-lastname"));
        lastname.sendKeys("Doe");

        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys("johndoe25@gmail.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("johndoe@25");

        WebElement button = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/form/div/button"));
        button.click();




    }

    @Test(priority = 5)
    public void Successfulregistration(){

        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("john");

        WebElement lastname = driver.findElement(By.id("input-lastname"));
        lastname.sendKeys("Doe");

        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys("john@gmail.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("johndoe@25");

        WebElement privacypolicy = driver.findElement(By.name("agree"));
        privacypolicy.click();

        WebElement button = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/form/div/button"));
        button.click();





    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }





}

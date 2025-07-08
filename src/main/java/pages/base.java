package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class base {
    WebDriver driver;
    public  base (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    protected void click(By by){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).click();
    }
    protected void click(WebElement element){
        element.click();
    }
    protected void setText(By by , String name){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        driver.findElement(by).sendKeys(name);
    }
    protected String  getText (By by  ){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
      String text = driver.findElement(by).getText();
      return text;

    }
     protected String  getText (WebElement element ){
      String text = element.getText();
      return text;

    }
    protected int  getSize(By  by ){
      int text = driver.findElements(by).size();
      return text;

    }
    protected void isSelect(By by,int index){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        Select  select =new Select(driver.findElement(by));
        select.selectByIndex(index);
    }
    protected void hoverOverElement(By by) {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        WebElement element = driver.findElement(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

   protected void openInNewTab(By by) {
        //open in new tab
       WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
        //go to the new tab
       ArrayList<String>  tabs = new ArrayList<>(driver.getWindowHandles());
       driver.switchTo().window(tabs.get(1));
    }


}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homepage extends base {
    public homepage(WebDriver driver) {
        super(driver);
    }

    final private By account_deleted = By.xpath("//a[@href=\"/delete_account\"]");
    final public By logoOFhOmePage = By.xpath("//*[@src=\"/static/images/home/logo.png\"]");
    final private By signupAndLoginbutton = By.xpath("//a[@href=\"/login\"]");
    final private By contactus = By.xpath("//a[@href=\"/contact_us\"]");
    final private By testcases = By.xpath("//a[@href=\"/test_cases\"]");
    final private By products_tesxt= By.xpath("//a[@href='/products']");
    final private By gameConsole=By.xpath("//a[@href=\"/en/c/electronics/gaming-consoles\"]");
    final private By thirdProduct_t=By.xpath("//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 MuiGrid-grid-sm-4 MuiGrid-grid-lg-3 muiltr-40ir45\"][3]//a//h3");
    final private By thirdProduct=By.xpath("//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 MuiGrid-grid-sm-4 MuiGrid-grid-lg-3 muiltr-40ir45\"][3]//a");
    final private By thirdProductAfterClick=By.xpath("//div[@class=\"ProductDetails_product__details__gl63Y\"]/h1");

    final private By electronics = By.xpath("//a[@href=\"/en/c/electronics\"]");
    public void hoverOnELectronicsCategory() {
        hoverOverElement(electronics);

    }
    public void clickOnGamingConsole(){
        click(gameConsole);
    }
    public String retriveDataOfThirdproduct(){
        return driver.findElement(thirdProduct_t).getText();
    }
    public void openThirdProduct(){
        openInNewTab(thirdProduct);
    }
    public String thidProductAfterClick(){
        return driver.findElement(thirdProductAfterClick).getText();
    }


    public void goToSignUpPage() {
        click(signupAndLoginbutton);
    }


    public void testcasesPage() {
click(testcases);
    }
    public void productsPage() {
click(products_tesxt);
    }



}


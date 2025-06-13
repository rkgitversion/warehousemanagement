package stepdefinitions;

import com.bdd.pages.DashBoardPage;
import com.bdd.pages.HomePage;
import com.bdd.pages.LoginPage;
import com.bdd.pages.RegisterPage;
import context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterStepDefinition {

    private TestContext testContext;
  private HomePage homePage;
  private RegisterPage registerPage;
  private DashBoardPage dashBoardPage;
  private LoginPage loginPage;

    public RegisterStepDefinition(TestContext context) {
        this.testContext = context;
        homePage = new HomePage(testContext.getDriver());
        registerPage = new RegisterPage(testContext.getDriver());
        dashBoardPage = new DashBoardPage(testContext.getDriver());
        loginPage = new LoginPage(testContext.getDriver());
    }

    @Then("verify home page title {string}")
    public void verify_home_page_title(String expectedHomePageTitle) {
       String actualHomePagetitle = homePage.getTitle();
        Assert.assertEquals(actualHomePagetitle,expectedHomePageTitle, " Home page title not matched "+actualHomePagetitle);
    }

    @When("user click on register link")
    public void user_click_on_register_link() throws InterruptedException {
       homePage.clickRegisterLink();
       Thread.sleep(2000);
    }

    @Then("verify the register page title {string}")
    public void verify_the_register_page_title(String expectedRegisterTitle) {
       String actualRegisterTitle = registerPage.getTitle();
       Assert.assertEquals(actualRegisterTitle,expectedRegisterTitle, "Register page title not matched "+actualRegisterTitle);
    }

    @When("user enter FirstName {string}")
    public void user_enter_first_name(String fname) {
       registerPage.enterFirstName(fname);
    }

    @When("user enter LastName {string}")
    public void user_enter_last_name(String lname) {
       registerPage.enterLastName(lname);
    }

    @When("user enter EmailAddress {string}")
    public void user_enter_email_address(String email) {
       registerPage.enterEmail(email);
    }

    @When("user enter Password {string}")
    public void user_enter_password(String pass) {
       registerPage.enterPassword(pass);
    }

    @When("user enter ConfirmPassword {string}")
    public void user_enter_confirm_password(String confirmPassword) {
       registerPage.enterConfirmPassword(confirmPassword);
    }

    @When("user select the role as {string}")
    public void user_select_the_role_as(String role) {
       registerPage.selectRole(role);
    }

    @When("user click on register button")
    public void user_click_on_register_button() {
       registerPage.clickRegisterButton();
    }

    @Then("verify the logout button visible")
    public void verify_the_logout_button_visible() throws InterruptedException {
       dashBoardPage.logoutLink.isDisplayed();
       dashBoardPage.clickLogoutLink();

    }
}

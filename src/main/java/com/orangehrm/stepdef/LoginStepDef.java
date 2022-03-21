package com.orangehrm.stepdef;

import java.util.List;

import com.orangehrm.config.BaseClass;
import com.orangehrm.pom.HomePage;
import com.orangehrm.pom.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class LoginStepDef {

	@Given("user on loginpage")
	public void user_on_loginpage() {
		LoginPage log = new LoginPage(BaseClass.driver);
		log.isPageOpened();
	}

	/*@When("user enters username")
	public void user_enters_username() {
		LoginPage log = new LoginPage(BaseClass.driver);
		log.enterUserName();
		
	}

	@When("enters password")
	public void enters_password() {
		LoginPage log = new LoginPage(BaseClass.driver);
		log.enterPassword();
	}*/
	
	@When("user enters {string}")
	public void user_enters(String string) {
		LoginPage log = new LoginPage(BaseClass.driver);
		log.enterUserName(string);
	}

	@When("enters {string}")
	public void enters(String string) {
		LoginPage log = new LoginPage(BaseClass.driver);
		log.enterPassword(string);
	}

	@When("click on login")
	public void click_on_login() {
		LoginPage log = new LoginPage(BaseClass.driver);
		log.clickOnLogin();
	}
	
	

	@Then("user should be logged into the application")
	public void user_should_be_logged_into_the_application() {
		HomePage home = new HomePage(BaseClass.driver);
		home.isPageOpened();
	}

	@When("User click on logout")
	public void user_click_on_logout() {
		HomePage home = new HomePage(BaseClass.driver);
		home.logOutOfApplication();
	}

	@Then("user should be on login page")
	public void user_should_be_on_login_page() {
		LoginPage log = new LoginPage(BaseClass.driver);
		log.isPageOpened();
	}
	
	@When("user enters {string} as username")
	public void user_enters_as_username(String string) {
		LoginPage log = new LoginPage(BaseClass.driver);
		log.enterUserName(string);
	}

	@When("enters {string} as password")
	public void enters_as_password(String string) {
		LoginPage log = new LoginPage(BaseClass.driver);
		log.enterPassword(string);
	}
	
	@When("click on login <java>")
	public void click_on_login_java(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		List<List<String>> list = dataTable.asLists();
		System.out.println(list.get(0));
		System.out.println(list.get(0).get(0));
		
		LoginPage log = new LoginPage(BaseClass.driver);
		log.clickOnLogin();
	}
	
	
}

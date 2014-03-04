package com.bestbuy.coreblue.screen;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.bestbuy.coreblue.model.TestNgParameters;
import com.bestbuy.coreblue.selenium.util.MagicNumbers;

public class ImplementationScreen extends AbstractBaseScreen {

	private Log log = LogFactory.getLog("ImplementationScreen");

	public ImplementationScreen(TestNgParameters tngparam) {
		super(tngparam);
		tngparam.getDevice().get("device").toUpperCase();
	}
	public void setStoreSetup(String methodName) {
		try {
			Thread.sleep(50000);
			waitForGivenTime(MagicNumbers.TWO_THOUSAND_SECONDS);
			waitForElementPresent(uiId.getStoreNumber().trim(), methodName);
			getWebElement(uiId.getStoreNumber().trim());
			click();
			sendKeys(uiDat.getStoreNumber());
			waitForElementPresent(uiId.getSetButton().trim(), methodName);
			getWebElement(uiId.getSetButton().trim());
			click();
			Thread.sleep(10000);
			waitForElementPresent(uiId.getStoreConfirm().trim(), methodName);
			getWebElement(uiId.getStoreConfirm().trim());
			sendKeys(uiDat.getLoginEmail());
			Thread.sleep(10000);
			
		} catch (Exception e) {
			
			log.info("EXCEPTION IN STORE LOGIN " + e.getMessage());
		}
	}

	public void login(String methodName) {
		try {
			waitForGivenTime(MagicNumbers.FOUR_THOUSAND_SECONDS);
			waitForElementPresent(uiId.getLoginUsername().trim(), methodName);
			getWebElement(uiId.getLoginUsername().trim());
			sendKeys(uiDat.getLoginUsername());
			waitForElementPresent(uiId.getLoginPassword().trim(), methodName);
			getWebElement(uiId.getLoginPassword().trim());
			sendKeys(uiDat.getLoginPassword());
			waitForElementPresent(uiId.getLoginButton().trim(), methodName);
			getWebElement(uiId.getLoginButton().trim());
			click();
			waitForGivenTime(MagicNumbers.HALF_SECONDS);
			Thread.sleep(10000);
		} catch (Exception e) {
			log.info("EXCEPTION IN LOGIN " + e.getMessage());
		}
	}
	
	public void searchiPad(String methodName) {
		try {
			waitForGivenTime(MagicNumbers.FOUR_THOUSAND_SECONDS);
			waitForElementPresent(uiId.getSearchAppointmentButton().trim(), methodName);
			getWebElement(uiId.getSearchAppointmentButton().trim());
			click();
			Thread.sleep(10000);
			waitForElementPresent(uiId.getSearchText().trim(), methodName);
			getWebElement(uiId.getSearchText().trim());
			click();
			sendKeys(uiDat.getSearchValue());
			waitForElementPresent(uiId.getSearchButton().trim(), methodName);
			getWebElement(uiId.getSearchButton().trim());
			click();
			Thread.sleep(10000);
			waitForGivenTime(MagicNumbers.HALF_SECONDS);
			Thread.sleep(10000);
		} catch (Exception e) {
			log.info("EXCEPTION IN SEARCHIPAD " + e.getMessage());
		}
	}


	public void driverQuit() {
		try {
			quitDriver();
		} catch (Exception e) {
			log.info("EXCEPTION IN DRIVER QUIT " + e.getMessage());
		}
	}
}

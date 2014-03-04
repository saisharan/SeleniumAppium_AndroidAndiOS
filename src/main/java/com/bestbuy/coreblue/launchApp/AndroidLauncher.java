package com.bestbuy.coreblue.launchApp;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.bestbuy.coreblue.model.TestNgParameters;
import com.bestbuy.coreblue.selenium.util.CheckFileExist;

public class AndroidLauncher {
	
	private WebDriver driver;
	private RemoteWebDriver remoteWebDriver = null;
	private Log log = LogFactory.getLog("AndroidLauncher");
	
	public WebDriver androidDriver(TestNgParameters tngparam) {
		log.info("LAUNCHING COREBLUE APPLICATION");
		try {
			CheckFileExist fileCheck = new CheckFileExist();
			File app = new File(tngparam.getApp().get("app"));
			DesiredCapabilities capabilities = new DesiredCapabilities();  
			capabilities.setCapability("device","Android");
		    capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
			capabilities.setCapability(CapabilityType.VERSION, tngparam.getVersion().get("version"));
			capabilities.setCapability(CapabilityType.PLATFORM, Platform.valueOf(tngparam.getPlatform().get("platform").toUpperCase()));
			capabilities.setCapability("app-package", tngparam.getPckage().get("pckage"));
			capabilities.setCapability("app-activity", "."+tngparam.getActivity().get("activity"));
			capabilities.setCapability("app",fileCheck.fileExisting(app.getAbsolutePath()));
			driver = new RemoteWebDriver(new URL("http://"+tngparam.getServerIp().get("serverIp")+":4723/wd/hub"), capabilities);
			System.out.println("^^^^^^"+driver);
		} catch (Exception e) {
			throw new Error(e.getMessage());
		}
		return driver;
	}
	
	public boolean isAppInstalled(String bundleId){
        try {
                Map<String, String> args = new HashMap<String, String>();
                args.put("bundleId", bundleId);
                Object result = remoteWebDriver.executeScript("mobile: isAppInstalled", args);
                if (result.toString().toLowerCase().equals("true")) {
                        return true;
                } else if (result.toString().toLowerCase().equals("false")) {
                        return false;
                } else {
                	log.info(result.toString());
                        return false;
                }
        } catch (WebDriverException e) {
        	log.error(e.getMessage());
        }
        return false;
}
}

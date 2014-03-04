package com.bestbuy.coreblue.enumscreen;

import org.openqa.selenium.WebDriver;

import com.bestbuy.coreblue.launchApp.AndroidLauncher;
import com.bestbuy.coreblue.model.TestNgParameters;

public enum AppLauncher {

	ANDROID() {
		public WebDriver execute(TestNgParameters tngparam) {
			try {
				AndroidLauncher al=new AndroidLauncher();
				return al.androidDriver(tngparam);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}
	};

	public WebDriver execute(TestNgParameters tngparam) {
		return null;

	}

}

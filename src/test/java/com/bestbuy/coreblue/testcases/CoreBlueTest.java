package com.bestbuy.coreblue.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bestbuy.coreblue.model.TestNgParameters;
import com.bestbuy.coreblue.screen.ImplementationScreen;

public class CoreBlueTest {

	protected ImplementationScreen impScreen;
	protected String methodName;

	@BeforeClass(alwaysRun = true)
	@Parameters(value = { "device", "version", "platform", "package",
			"activity", "app", "serverip" })
	public void setup(String device, String version, String platform,
			String pckage, String activity, String app, String serverip) {
		try {
			TestNgParameters tngparam = new TestNgParameters();
			tngparam.getDevice().put("device", device);
			tngparam.getVersion().put("version", version);
			tngparam.getPlatform().put("platform", platform);
			tngparam.getPckage().put("pckage", pckage);
			tngparam.getActivity().put("activity", activity);
			tngparam.getApp().put("app", app);
			tngparam.getServerIp().put("serverIp", serverip);
			impScreen = new ImplementationScreen(tngparam);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test
	public void testSetStoreSetup() {
		System.out.println("Executing Store Login Scenario");
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try {
			impScreen.setStoreSetup(methodName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testLogin() {
		System.out.println("Executing Login Scenario");
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try {
			impScreen.login(methodName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSearch() {
		System.out.println("Executing Search Scenario");
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try {
			impScreen.searchiPad(methodName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterClass
	public void tearDown() {
		impScreen.driverQuit();
	}

}

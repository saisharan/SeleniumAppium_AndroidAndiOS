package com.bestbuy.coreblue.model;

import java.util.HashMap;
import java.util.Map;

public class UiIdentifiers {

	private Map<String, String> elementType = new HashMap<String, String>();

	private String storeNumber;
	private String setButton;
	private String storeConfirm;
	private String loginUsername;
	private String loginPassword;
	private String loginButton;
	private String searchAppointmentButton;
	private String searchButton;
	private String searchText;
	public Map<String, String> getElementType() {
		return elementType;
	}
	public void setElementType(Map<String, String> elementType) {
		this.elementType = elementType;
	}
	public String getStoreNumber() {
		return storeNumber;
	}
	public void setStoreNumber(String storeNumber) {
		this.storeNumber = storeNumber;
	}
	public String getLoginUsername() {
		return loginUsername;
	}

	public String getStoreConfirm() {
		return storeConfirm;
	}
	public void setStoreConfirm(String storeConfirm) {
		this.storeConfirm = storeConfirm;
	}
	public String getSetButton() {
		return setButton;
	}
	public void setSetButton(String setButton) {
		this.setButton = setButton;
	}
	public void setLoginUsername(String loginUsername) {
		this.loginUsername = loginUsername;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getLoginButton() {
		return loginButton;
	}
	public String getSearchAppointmentButton() {
		return searchAppointmentButton;
	}
	public String getSearchButton() {
		return searchButton;
	}
	public void setLoginButton(String loginButton) {
		this.loginButton = loginButton;
	}
	public void setSearchAppointmentButton(String searchAppointmentButton) {
		this.searchAppointmentButton = searchAppointmentButton;
	}
	public void setSearchButton(String searchButton) {
		this.searchButton = searchButton;
	}
	public String getSearchText() {
		return searchText;
	}
	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}

}

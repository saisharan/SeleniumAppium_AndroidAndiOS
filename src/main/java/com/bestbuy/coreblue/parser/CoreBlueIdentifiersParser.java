package com.bestbuy.coreblue.parser;
import com.bestbuy.coreblue.model.UiIdentifiers;
import com.ximpleware.VTDGen;
import com.ximpleware.VTDNav;

public class CoreBlueIdentifiersParser {

	public UiIdentifiers parseXml(String xmlFile) throws Exception {

		UiIdentifiers uiId = new UiIdentifiers();
		VTDGen vg = new VTDGen();
		if (vg.parseFile(xmlFile, true)) {
			VTDNav vn = vg.getNav();
			if (vn.matchElement("identifiers")) {
				if (vn.toElement(VTDNav.FC,"storeNumber")) {
					int value = vn.getAttrVal("type");
					int key = vn.getText();
					uiId.getElementType().put(vn.toString(key), vn.toString(value));
					uiId.setStoreNumber(vn.toString(key));
				}
				if (vn.toElement(VTDNav.NS,"setButton")) {
					int value = vn.getAttrVal("type");
					int key = vn.getText();
					uiId.getElementType().put(vn.toString(key), vn.toString(value));
					uiId.setSetButton(vn.toString(key));
				}
				if (vn.toElement(VTDNav.NS,"storeConfirm")) {
					int value = vn.getAttrVal("type");
					int key = vn.getText();
					uiId.getElementType().put(vn.toString(key), vn.toString(value));
					uiId.setStoreConfirm(vn.toString(key));
				}
				if (vn.toElement(VTDNav.NS,"loginUsername")) {
					int value = vn.getAttrVal("type");
					int key = vn.getText();
					uiId.getElementType().put(vn.toString(key), vn.toString(value));
					uiId.setLoginUsername(vn.toString(key));
				}
				if (vn.toElement(VTDNav.NS,"loginPassword")) {
					int value = vn.getAttrVal("type");
					int key = vn.getText();
					uiId.getElementType().put(vn.toString(key), vn.toString(value));
					uiId.setLoginPassword(vn.toString(key));
				}
				if (vn.toElement(VTDNav.NS,"loginButton")) {
					int value = vn.getAttrVal("type");
					int key = vn.getText();
					uiId.getElementType().put(vn.toString(key), vn.toString(value));
					uiId.setLoginButton(vn.toString(key));
				}
				if (vn.toElement(VTDNav.NS,"searchAppointmentButton")) {
					int value = vn.getAttrVal("type");
					int key = vn.getText();
					uiId.getElementType().put(vn.toString(key), vn.toString(value));
					uiId.setSearchAppointmentButton(vn.toString(key));
				}
				if (vn.toElement(VTDNav.NS,"searchText")) {
					int value = vn.getAttrVal("type");
					int key = vn.getText();
					uiId.getElementType().put(vn.toString(key), vn.toString(value));
					uiId.setSearchText(vn.toString(key));
				}
				if (vn.toElement(VTDNav.NS,"searchButton")) {
					int value = vn.getAttrVal("type");
					int key = vn.getText();
					uiId.getElementType().put(vn.toString(key), vn.toString(value));
					uiId.setSearchButton(vn.toString(key));
				}
				
			}			
		}		
		return uiId;
	}
}

package com.bestbuy.coreblue.parser;

import com.bestbuy.coreblue.model.UiData;
import com.ximpleware.VTDGen;
import com.ximpleware.VTDNav;

public class UiDataParser {

	public UiData parseXml(String xmlFile) throws Exception {
		UiData uiDat = new UiData();
		VTDGen vg = new VTDGen();

		if (vg.parseFile(xmlFile, true)) {
			VTDNav vn = vg.getNav();
			if (vn.matchElement("uiData")) {
				if (vn.toElement(VTDNav.FC, "storeNumber")) {
					int key = vn.getText();
					uiDat.setStoreNumber(vn.toString(key));
				}
				if (vn.toElement(VTDNav.NS, "loginUsername")) {
					int key = vn.getText();
					uiDat.setLoginUsername(vn.toString(key));
				}
				if (vn.toElement(VTDNav.NS, "loginPassword")) {
					int key = vn.getText();
					uiDat.setLoginPassword(vn.toString(key));
				}
				if (vn.toElement(VTDNav.NS, "loginEmail")) {
					int key = vn.getText();
					uiDat.setLoginEmail(vn.toString(key));
				}
				if (vn.toElement(VTDNav.NS, "searchValue")) {
					int key = vn.getText();
					uiDat.setSearchValue(vn.toString(key));
				}
			}	
		}
		return uiDat;
	}

}

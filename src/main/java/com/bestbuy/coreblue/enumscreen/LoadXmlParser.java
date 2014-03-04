package com.bestbuy.coreblue.enumscreen;

import com.bestbuy.coreblue.model.UiIdentifiers;
import com.bestbuy.coreblue.parser.CoreBlueIdentifiersParser;

public enum LoadXmlParser {

	ANDROID{
		public UiIdentifiers execute(){
			CoreBlueIdentifiersParser uid= new CoreBlueIdentifiersParser();
			try {
				return uid.parseXml("./src/main/resources/CoreBlueUiIdentifiers.xml");
			} catch (Exception e) {

				e.printStackTrace();
			}
			return null;
		}
	};

	public UiIdentifiers execute(){
		return null;
	}
}

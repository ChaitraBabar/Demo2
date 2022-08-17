package com.cl.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ObjRepository {
	
	
	//Fetching XPATH 
	public static Properties p;
	/**
	 * Load Property File.
	 * 
	 **/
	public static String getValue(String key)
	{
		//String v="./Config/Config.properties";
		String v="./TestData/ObjRepository.properties";
		try
		{
			p=new Properties();
			p.load(new FileInputStream(v));
			v=p.getProperty(key);
		}
		catch(Exception e)
		{
			
		}
		return v;
}
}
	

package com.java.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class NProperties {

	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("abc.properties");
		p.load(fis);
		String url = p.getProperty("url");
		String user = p.getProperty("user");
		String password = p.getProperty("password");
		
		System.out.println(url +" "+user+" "+password);

	}

}

package org.kg.myapp.emp.util;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class EncryptMain {

	public static void main(String[] args) {
		StandardPBEStringEncryptor enc = new StandardPBEStringEncryptor();
		enc.setPassword("asd");
		System.out.println("ENC(" + enc.encrypt("net.sf.log4jdbc.DriverSpy") + ")");
		System.out.println("ENC(" + enc.encrypt("jdbc:log4jdbc:oracle:thin:@localhost:1521/xepdb1") + ")");
		System.out.println("ENC(" + enc.encrypt("hr") + ")");
		System.out.println("ENC(" + enc.encrypt("hr") + ")");

	}

}

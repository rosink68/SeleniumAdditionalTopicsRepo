package passwordEncryptionAndDecryptionDemo;

import java.util.Base64;

public class EncriptsActualPasswordDemo {

	public static void main(String[] args) throws InterruptedException {
		
		String password = "anna12345";
		
		byte[] passwordInBytes = password.getBytes();
		
		String encodedPassword = Base64.getEncoder().encodeToString(passwordInBytes);
		
		System.out.println(encodedPassword);
	}
}

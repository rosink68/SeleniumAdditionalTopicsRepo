package passwordEncryptionAndDecryptionDemo;

import java.util.Base64;

public class DecryptsEncryptedPasswordDemo {

	public static void main(String[] args) {
		
		String encryptedPassword = "YW5uYTEyMzQ1";
		
		byte[] decryptedPasswordInBytes = Base64.getDecoder().decode(encryptedPassword);
		
		String decryptedPasswordInText = new String(decryptedPasswordInBytes);

		System.out.println(decryptedPasswordInText);
	}
}

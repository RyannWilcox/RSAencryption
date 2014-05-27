

import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class RSATest {

	public static void main(String[] args) throws IOException {
		RSA rsa = new RSA();
		rsa.createKeys();
		
		// read in some text and then convert to BigInteger
		String text = "hey how are you";

		BigInteger plaintext = new BigInteger(text.getBytes());
		BigInteger ciphertext = rsa.encrypt(plaintext);
		
		System.out.println("Before Encryption: "+ text + "\n");
		System.out.println("ciphertext: "+ new String(ciphertext.toByteArray()) + "\n");
		
		BigInteger decryptedText = rsa.decrypt(ciphertext);
		System.out.println("plaintext: " + new String(decryptedText.toByteArray()));
		
	}

}

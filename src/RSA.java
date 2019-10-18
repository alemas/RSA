import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.*;

import javax.crypto.Cipher;

public class RSA {
	
	public static KeyPair generateKeyPair(int bitSize) {
		
		try {
			KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
			
			//Inicia o gerador com bitSize para as chaves
			generator.initialize(bitSize);
			
			return generator.generateKeyPair();
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static byte[] cipher(RSAPublicKey key, String originalText) {
		
		byte[] cipherText = null;
		
		try {
			final Cipher cipher = Cipher.getInstance("RSA");
			
			cipher.init(Cipher.ENCRYPT_MODE, key);
			cipherText = cipher.doFinal(originalText.getBytes());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cipherText;
	}
	
}

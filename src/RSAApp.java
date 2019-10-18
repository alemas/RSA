import java.security.KeyPair;
import java.security.interfaces.*;

public class RSAApp {

	public static void main(String[] args) {
		
		KeyPair keys = RSA.generateKeyPair(1024);
		
		String prvKeyString = "\n  M�dulo: " + ((RSAPrivateKey) keys.getPrivate()).getModulus() + "\n  Expoente privado: " + ((RSAPrivateKey) keys.getPrivate()).getPrivateExponent();
		String pblKeyString = "\n  M�dulo: " + ((RSAPublicKey) keys.getPublic()).getModulus() + "\n  Expoente p�blico: " + ((RSAPublicKey) keys.getPublic()).getPublicExponent();
		System.out.println("Chave privada: " + prvKeyString + "\n\nChave p�blica: " + pblKeyString);
		
		String message = "The KeyPairGenerator class is used to generate pairs of public and private keys. Key pair generators are constructed using the getInstance factory methods (static methods that return instances of a given class).";

		byte[] cipherText = RSA.cipher((RSAPublicKey) keys.getPublic(), message);
		
		
		
	}

}

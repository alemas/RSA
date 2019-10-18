import java.security.KeyPair;
import java.security.interfaces.*;

public class RSAApp {

	public static void main(String[] args) {
		
		KeyPair keys = RSA.generateKeyPair(1024);
		
		String prvKeyString = "\n  Módulo: " + ((RSAPrivateKey) keys.getPrivate()).getModulus() + "\n  Expoente privado: " + ((RSAPrivateKey) keys.getPrivate()).getPrivateExponent();
		String pblKeyString = "\n  Módulo: " + ((RSAPublicKey) keys.getPublic()).getModulus() + "\n  Expoente público: " + ((RSAPublicKey) keys.getPublic()).getPublicExponent();
		System.out.println("Chave privada: " + prvKeyString + "\n\nChave pública: " + pblKeyString);
		
		String message = "The KeyPairGenerator class is used to generate pairs of public and private keys. Key pair generators are constructed using the getInstance factory methods (static methods that return instances of a given class).";

		byte[] cipherText = RSA.cipher((RSAPublicKey) keys.getPublic(), message);
		
		
		
	}

}

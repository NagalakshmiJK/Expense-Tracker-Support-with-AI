import java.security.SecureRandom;
import java.util.Base64;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class Authentication {
    
	private String Username,HashingPassword;
	
	public String getUsername() {
		return Username;
	}
	
	public String getHashingPassword() {
		return HashingPassword;
	}
	
	public void setUsername(String Username) {
		this.Username = Username;
	}
	
	public void setHashingPassword(String HashingPassword) {
		this.HashingPassword = HashingPassword;
	}
	
	public String hashpassword(String plainpassword , byte[] salt) throws Exception {
		PBEKeySpec spec = new PBEKeySpec(plainpassword.toCharArray(), salt, 1000 , 256);
		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
		return Base64.getEncoder().encodeToString(factory.generateSecret(spec).getEncoded());
	}
	public byte[] genereteSalt() {
		byte[] salt = new byte[10];
		new SecureRandom().nextBytes(salt);
		return salt;
	}
}

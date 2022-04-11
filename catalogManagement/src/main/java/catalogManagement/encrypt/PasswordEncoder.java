package catalogManagement.encrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
    private static BCryptPasswordEncoder bCryptPasswordEncoder= new BCryptPasswordEncoder();

    public static String encodePassword(String rawPassword){
        return bCryptPasswordEncoder.encode(rawPassword);
    }

    public static boolean matchPassword(String rawPassword, String encpwd){
        return bCryptPasswordEncoder.matches(rawPassword,encpwd);
    }
}

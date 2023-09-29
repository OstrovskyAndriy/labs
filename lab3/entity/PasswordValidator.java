package entity;


import java.util.regex.Pattern;

public class PasswordValidator {

    private static String password;

    public PasswordValidator(String password) {
        this.password = password;
    }

    public final String getPassword() {
        return password;
    }

    public final void setPassword(String password) {
        this.password = password;
    }

    public static boolean isValidPassword() throws Exception {
        if (password.length() < 8) {
            throw new Exception("length less than 8");
        }

        if (!Pattern.compile("[a-z]").matcher(password).find() || !Pattern.compile("[A-Z]").matcher(password).find()) {
            throw new Exception("the password must contain [a-z][A-Z]");
        }

        if (!Pattern.compile("\\d").matcher(password).find()) {
            throw new Exception("the password must contain [0-9]");
        }

        if (!Pattern.compile("[!@#$%&*]").matcher(password).find()) {
            throw new Exception("the password must contain [!@#$%&*]");
        }

        return true;
    }
}

package src;

import java.util.Scanner;

public class Authentication {

    private static final String LOGIN_USER = "vitali";
    private static final String PASSWORD_USER = "1234";
    private static final String LOGIN_ADMIN = "admin";
    private static final String PASSWORD_ADMIN = "4321";

    public void authenticate() {
        Scanner s = new Scanner(System.in);

        boolean isAuthenticationSuccess = false;
        for (int i = 3; i != 0 && !isAuthenticationSuccess; i--) {
            String login;
            String password;

            System.out.print("Login: ");
            login = s.nextLine();

            System.out.print("Password: ");
            password = s.nextLine();

            if (validateAdmin(login, password)) {
                isAuthenticationSuccess = true;
                System.out.println("Password is correct. You are logged in with the admin role ");
            } else {
                System.out.println("Password is incorrect. Please try again. ");
            }
        }

        if (!isAuthenticationSuccess) {
            throw new RuntimeException("Login failed.");
        }
    }

    public static boolean validateAdmin(String login, String password) {
        return login.equals(LOGIN_ADMIN) && password.equals(PASSWORD_ADMIN);
    }



}

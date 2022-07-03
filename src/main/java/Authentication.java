package src.main.java;

import java.util.Scanner;

public class Authentication {
    private static final String LOGIN = "Dima";
    private static final String PASSWORD = "123";
    public static int authenticate(){
        Scanner s = new Scanner(System.in);
        int maxCount = 5;
        boolean isLoginSuccess = false;
        while(maxCount > 0 && !isLoginSuccess) {
            System.out.println("Login:");
            var login = s.nextLine();
            System.out.println("Password:");
            var password = s.nextLine();

            if(login.equals(LOGIN) && password.equals(PASSWORD)){
                isLoginSuccess = true;

            }
            else {
                System.out.println("Error login ");
            }
            maxCount--;

        }
        return isLoginSuccess ? 0: -1;

    }
}

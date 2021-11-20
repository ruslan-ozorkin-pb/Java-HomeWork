package com.pb.ozorkin.hw8;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class OnlineShop {
    public static void main(String[]  args) throws IOException, WrongLoginException, WrongPasswordException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Auth auth1 = new Auth();
        Scanner input = new Scanner(System.in);
        System.out.println("Придумайте логин от 5 до 20 символов, который должен содержать только латинские буквы и цифры: ");
        String cLogin = input.nextLine();
        System.out.println("Придумайте пароль который должен быть более 5 символов, содержать только латинские буквы и цифры и знак подчеркивания");
        String cPassword = input.nextLine();
        System.out.println("Повторите пароль");
        String ccPassword = input.nextLine();
        auth1.signUp(cLogin,cPassword,ccPassword);
        System.out.println("Для входа ведите свой логин");
        String login2 = bufferedReader.readLine();
        System.out.println("Введите пароль");
        String password2 = bufferedReader.readLine();
        try {
            auth1.signIn(login2, password2);
        } catch (WrongLoginException e1) {
            e1.printStackTrace();
        }

//        auth1.signIn(authLogin,authPassword);

//        if (cLogin.equals(authLogin) && cPassword.equals(authPassword)) {
//            System.out.println("Вход прошел успешно");} else {
//            System.out.println("Неправильно введен логин или пароль");}


//        boolean correct = true;
//        int digit = 0;
//        if (cPassword.length() < 5 && cPassword.length() > 20) {
//            /* The password is less than 8 characters, return false */
//            return false;
//        }
//        if( !cPassword.matches("[a-zA-Z0-9]{5,20}") ) {
//            /* A non-alphanumeric character was found, return false */
//            return false;
//        }
//
//        /* All checks at this point have passed, the password is valid */
//        return correct;
//        https://mkyong.com/regular-expressions/how-to-validate-password-with-regular-expression/

    }

}

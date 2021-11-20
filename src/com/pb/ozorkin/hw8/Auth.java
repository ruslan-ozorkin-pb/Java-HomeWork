package com.pb.ozorkin.hw8;

import java.util.regex.Pattern;

public class Auth {
    private String login;
    private String password;
    private String confirmpassword;

    public void Auth () {
    }

    public void Auth (String login2, String password2) {
        this.login=login2;
        this.password=password2;
    }

    public void signUp(String login, String password, String confirmpassword) throws WrongPasswordException, WrongLoginException {
        System.out.println("Логин: " + login + " пароль: " + password + " повторно пароль: " + confirmpassword);
        if(Pattern.matches("[a-zA-Z0-9]{5,20}", login)){
            this.login = login;
        } else {
            throw new WrongLoginException("Логин не соответствет требованиям");
        }
        if(!(Pattern.matches("\\w{5,}", password)))
            throw new WrongPasswordException("Пароль не соответствет требованиям");
        else if(!(password.equals(confirmpassword))){
            throw new WrongPasswordException("Пароль не совпадает");
        } else {
            this.password = password;
            this.confirmpassword = confirmpassword;
        }


    }
    public void signUp(String login, String password) {
        System.out.println("Логин: " + login + " пароль: " + password);
        this.login = login;
        this.password = password; }


    public void signIn(String login2, String password2) throws WrongLoginException {
        if(!(login.equals(login2)) || (!(password.equals(password2)))) {
            throw new WrongLoginException("Логин или пароль введены некорректно");
        } else {
            System.out.println(new StringBuilder().append("Вы вошли ").append(login));
        }

    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }
}
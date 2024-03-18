package main.com.nahuel.domain;

import java.util.Scanner;

public class Person {
        private String user;
        private String password;

    public String getUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su usuario: ");
        String user = scanner.nextLine();
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su contraseña: ");
        String password = scanner.nextLine();
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}


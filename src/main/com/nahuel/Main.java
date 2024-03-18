package main.com.nahuel;

import main.com.nahuel.domain.Cajero;
import main.com.nahuel.domain.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Bienvenido");
        person.getUser();
        person.getPassword();

        Cajero cajero = new Cajero();
        cajero.setOpcionesOperacion();
    }
}

package main.com.nahuel.domain;

import java.util.Scanner;

public class Cajero {
    float money = 0;
    int optionYesOrNo;

    public void setOpcionesOperacion () {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Menu principal");
                System.out.println("Elija una opcion del 1 al 4");
                System.out.println("1_Estado de su cuenta");
                System.out.println("2_Ingresar dinero a su cuenta");
                System.out.println("3_Realizar una transferencia");
                System.out.println("4_Cerrar sesion");
                int option = scanner.nextInt();
                if (option == 1){
                    verEstadoCuenta();
                    menuCerrar();
                 } else if (option == 2) {
                    ingresarDinero();
                    menuCerrar();
                } else if (option == 3) {
                    transferirDinero();
                    menuCerrar();
                }else{
                    cerrarSesion();
                }
    }

    public void verEstadoCuenta (){
            System.out.println("El estado de cuenta es: " + money);
    }
    public void ingresarDinero () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("¿Cuantos dinero va a ingresar?");
            float moneyReceived = scanner.nextFloat();
            System.out.println("El dinero ingresado es de $" + moneyReceived);
            money += moneyReceived;
    }
    public void transferirDinero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el alias del destinatario: ");
        String name = scanner.next();
        System.out.println("¿Cuanto dinero va a trasferir?");
        float moneyTransferred = scanner.nextFloat();
        if (money >= moneyTransferred) {
            System.out.println("Se ha transferido $" + moneyTransferred + " al usuario " + name);
            money -= moneyTransferred;
        } else {
            System.out.println("No posee fondos necesarios para transferir");
        }
    }


    public void menuCerrar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1_Desea volver al menu");
        System.out.println("2_Cerrar sesion");
        optionYesOrNo = scanner.nextInt();
        if (optionYesOrNo == 1) {
            setOpcionesOperacion();
        } else {
            cerrarSesion();
        }
    }

    public void cerrarSesion() {
        System.out.println("Fin de la sesion");
    }

}

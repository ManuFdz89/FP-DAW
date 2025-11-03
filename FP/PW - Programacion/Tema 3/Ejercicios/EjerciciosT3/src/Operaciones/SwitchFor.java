package Operaciones;

import java.util.Scanner;

public class SwitchFor {

    Scanner teclado = new Scanner(System.in);

    public void ejercicio1(){

        teclado = new Scanner(System.in);

        System.out.println("Introduce un número (1-7): ");
        int dia = teclado.nextInt();

        String nombreDia;

        switch (dia){
            case 1 -> nombreDia = "Lunes";
            case 2 -> nombreDia = "Martes";
            case 3 -> nombreDia = "Miercoles";
            case 4 -> nombreDia = "Jueves";
            case 5 -> nombreDia = "Viernes";
            case 6 -> nombreDia = "Sábado";
            case 7 -> nombreDia = "Domingo";
            default -> nombreDia = "Número no válido";
        }

        System.out.printf("el dia %d es: %s%n", dia, nombreDia);

    }
    public void ejercicio2(){

        System.out.println("Introduce tu calificacion (A-F): ");
        String nota = teclado.next();
        String calificacion;

        switch (nota.toLowerCase()){
            case "a" -> calificacion = "Excelente";
            case "b" -> calificacion = "Muy bien";
            case "c" -> calificacion = "Bien";
            case "d" -> calificacion = "Suficiente";
            case "f" -> calificacion = "Insuficiente";
            default -> calificacion = "Nota no válida";
        }
        System.out.printf("Calificacion %s: %s%n", nota.toUpperCase(), calificacion);


    }
    public void ejercicio3(){
        System.out.print("Introduce el primer numero: ");
        int numUno = teclado.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int numDos = teclado.nextInt();
        System.out.println("Introduce la operación (+, -, *, /): ");
        String operaciones = teclado.next();

        int resultado = switch (operaciones){
            case "+" -> numUno+numDos;
            case "-" -> numUno-numDos;
            case "*" -> numUno*numDos;
            case "/" -> numUno/numDos;
            default -> 0;
        };
        System.out.printf("Resultado: %d %s %d = %d", numUno, operaciones, numDos, resultado);
    }
    public void ejercicio4(){
        System.out.println("----MENU----");
        System.out.println("1. Ver Perfil");
        System.out.println("2. Configuracion");
        System.out.println("3. Ayuda");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
        int seleccion = teclado.nextInt();

        String resultado ="";

        resultado= switch (seleccion){
            case 1 -> "Ver perfil";
            case 2 -> "Configuración";
            case 3 -> "Ayuda";
            case 4 -> "Salir";
            default -> "Selecciona un valor admitido.";
        };
        System.out.printf("Has seleccionado: %s%n", resultado);

    }


    public void scn(){
        teclado.close();
    }


}

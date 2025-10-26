package Operaciones;

import java.util.Scanner;

public class Operaciones {

    Scanner teclado;

    public void ejercicio1(){

        teclado = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = teclado.nextInt();

        if (edad>=18){
            System.out.println("Eres mayor de edad. Puedes votar");
        }else {
            System.out.println("Eres menor de edad. No puedes votar");
        }

        //teclado.close();
    }
    public void ejercicio2(){

       teclado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int numero = teclado.nextInt();

        if (numero<0){
            System.out.println("El numero introducido es negativo");
        }else if(numero==0){
            System.out.println("el numero introducido es 0");
        }else {
            System.out.println("el numero introducido es positivo");
        }
    }
    public void ejercicio3(){

       teclado = new Scanner(System.in);

        System.out.println("Introduce tu nota: ");
        double nota = teclado.nextDouble();

        if(nota>=5){
            System.out.println("¡Enhorabuena! has aprobado");
        }else {
            System.out.println("Has suspendido :(");
        }

    }
    public void ejercicio4(){

        teclado = new Scanner(System.in);

        System.out.println("introduce el importe de la compra: ");
        double precioCompra = teclado.nextDouble();
        double descuento = 0;

        if(precioCompra>=100){
            descuento = precioCompra*0.1;
        }else {
            descuento=0;
        }
        System.out.printf("Importe compra: %.1f €%n",precioCompra);
        System.out.printf("Descuento aplicado: %.1f €%n",descuento);
        System.out.printf("Importe Final: %.1f €%n",(precioCompra-descuento));
    }
    public void ejercicio5(){
        teclado = new Scanner(System.in);

        System.out.println("introduce un numero: ");
        int numero = teclado.nextInt();

        if(numero%2==0){
            System.out.printf("el numero %d es par%n",numero);
        }else {
            System.out.printf("el numero %d es impar%n",numero);
        }
    }
    public void ejercicio6(){
        teclado = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = teclado.nextInt();

        if(edad>=16){
            System.out.println("Acceso permitido");
        }else {
            System.out.println("Acceso denegado. Debes tener almenos 16 años.");
        }


    }
    public void ejercicio7(){
        teclado = new Scanner(System.in);
        System.out.print("Introduce tu nota: ");
        double nota = teclado.nextDouble();
        String resultado = "0";

        if (nota<=4){
            resultado = "Suspenso";
        } else if (nota>=5 && nota <=6) {
            resultado = "Aprobado";
        } else if (nota>=7 && nota<=8) {
            resultado = "Notable";
        } else if (nota>=9 && nota<=10) {
            resultado = "Sobresaliente";
        } else {
            resultado = "Valor introducido fuera de rango";
        }
        System.out.println("Tu calificacion es: "+resultado);
    }
    public void ejercicio8(){
        teclado = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        int nUno = teclado.nextInt();

        System.out.println("Introduced el segundo numero: ");
        int nDos = teclado.nextInt();
        int primero=0;
        int segundo=0;

        if (nUno>nDos){
            primero = nUno;
            segundo = nDos;
        }else {
            primero = nDos;
            segundo = nUno;
        }
        System.out.printf("El numero %d es mayor que %d",primero, segundo);

    }
    public void ejercicio9(){
        teclado = new Scanner(System.in);

        System.out.println("Introduce tu peso en Kg");
        double peso = teclado.nextDouble();
        System.out.println("Introduce tu altura en metros");
        double altura = teclado.nextDouble();

        double imc = peso / Math.pow(altura, 2);
        System.out.printf("Tu IMC es: %.2f%n",imc);

        if (imc<18.5){
            System.out.println("Estas por debajo del peso normal");
        } else if (imc>=18.5 && imc<=24.5) {
            System.out.println("Estas en peso normal");
        }else {
            System.out.println("Estas por encima del peso normal");
        }
    }
    public void ejercicio10(){
        teclado = new Scanner(System.in);

        System.out.print("Introduce tu altura en cm:");
        int altura = teclado.nextInt();

        if (altura>=120 && altura<=200){
            System.out.println("Puedes subir");
        }else {
            System.out.println("Demasiado alto o demasiado bajo");
        }



    }
    public void ejercicio11(){


    }


}

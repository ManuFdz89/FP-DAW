package Operaciones;

import java.util.Scanner;

public class Operaciones {

    Scanner teclado = new Scanner(System.in);

    public void ejercicio1(){

        System.out.println("Introduce tu edad: ");
        int edad = teclado.nextInt();

        if (edad>=18){
            System.out.println("Eres mayor de edad. Puedes votar");
        }else {
            System.out.println("Eres menor de edad. No puedes votar");
        }

    }
    public void ejercicio2(){

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

        System.out.println("Introduce tu nota: ");
        double nota = teclado.nextDouble();

        if(nota>=5){
            System.out.println("¡Enhorabuena! has aprobado");
        }else {
            System.out.println("Has suspendido :(");
        }

    }
    public void ejercicio4(){

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

        System.out.println("introduce un numero: ");
        int numero = teclado.nextInt();

        if(numero%2==0){
            System.out.printf("el numero %d es par%n",numero);
        }else {
            System.out.printf("el numero %d es impar%n",numero);
        }
    }
    public void ejercicio6(){

        System.out.println("Introduce tu edad: ");
        int edad = teclado.nextInt();

        if(edad>=16){
            System.out.println("Acceso permitido");
        }else {
            System.out.println("Acceso denegado. Debes tener almenos 16 años.");
        }


    }
    public void ejercicio7(){

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

        System.out.print("Introduce tu altura en cm:");
        int altura = teclado.nextInt();

        if (altura>=120 && altura<=200){
            System.out.println("Puedes subir");
        }else {
            System.out.println("Demasiado alto o demasiado bajo");
        }



    }
    public void ejercicio11(){
        System.out.println("Introduce el importe de la compra: ");
        double pCompra = teclado.nextDouble();
        System.out.println("¿Eres socio?");
        boolean socio = teclado.nextBoolean();
        System.out.println("Importe Original: "+pCompra);
        double desc;
        int descuento;

        if (socio && pCompra>=200){
            descuento = 20;
            desc = pCompra*0.2;
            pCompra = pCompra*0.8;
            System.out.println("Eres socio y tu compra es >=200");
        } else if (socio && pCompra<200){
            descuento = 10;
            desc = pCompra*0.1;
            pCompra = pCompra*0.9;
            System.out.println("Eres socio y tu compra es <200");
        } else if (!socio && pCompra>=300) {
            descuento = 5;
            desc = pCompra*0.05;
            pCompra = pCompra*0.95;
            System.out.println("No eres socio y tu compra es >=300");
        }else {
            descuento = 0;
            desc = 0;
            System.out.println("No eres socio y tu compra es <300");
        }
        System.out.printf("Descuento aplicado (%d%%): %.1f%n",descuento, desc);
        System.out.println("Importe final: "+pCompra);


    }
    public void ejercicio13(){
        System.out.print("Introduce tu edad: ");
        int edad = teclado.nextInt();
        System.out.print("Introduce el dia de la semana (1-7): ");
        int diaSem = teclado.nextInt();
        double precio=0;
        if (diaSem>0 &&diaSem<8){
            if (edad<12 || (edad<18 && diaSem==2)){
                precio =0;
            } else if (edad<18) {
                precio =5;
            } else if (edad>17 && edad<65) {
                precio =10;
                if (diaSem == 4){
                    precio = 7;
                }
            } else {
                precio=6;
            }
        }else {
            System.out.println("Introduce un dia válido");
        }
        System.out.println("Edad: "+edad+" años.");
        System.out.println("Dia de la semana: "+diaSem);
        System.out.println("¿Eres menor de 12?: "+edad);
        System.out.println("Precio entrada: "+precio);

    }

    public void scn(){
        teclado.close();
    }

}

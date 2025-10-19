import java.util.Scanner;

public class Ejercicio {

    private Scanner teclado;
    /*
    Hágase una aplicación que permita introducir el número de bebidas y bocadillos
    comprados (valores entre 0 y 20). Además se podrá introducir el precio de cada
    bebida (valor entre 0.00 € y 3.00 €) y de cada bocadillo (valor entre 0.00 € y 5.00
    €). También se podrá introducir el número de alumnos que realizaron la compra
    (valor entre 0 y 10). Se mostrará el total de la compra (con el subtotal de las
    bebidas y de los bocadillos) y la cantidad que debe pagar cada alumno
    redondeada a 2 decimales.
     */
    public void ejercicio1() {
        /*  1 -> Pedir cosas por teclado
            2 -> guardar cosas en variables
            3 -> realizar calculos
            4 -> mostrar informacion */

        teclado = new Scanner(System.in);
        System.out.println("Cuantas bebidas vas a comprar");
        int bebidas = teclado.nextInt();
        System.out.println("Cuantoss bocadillos vas a comprar");
        int bocadillos = teclado.nextInt();
        System.out.println("Cuanto vale cada bebida");
        double precioBebidas = teclado.nextDouble();
        System.out.println("Cuanto vale cada bocadillo");
        double precioBocadillo = teclado.nextDouble();
        System.out.println("Cuantos alumnos realizaron la compra");
        int alumnos = teclado.nextInt();

        double costeBebidas = bebidas * precioBebidas;
        double costeBocadillo = bocadillos * precioBocadillo;
        double compra = costeBebidas + costeBocadillo;
        double precioPersona = compra/alumnos;

        System.out.printf("Subtotal bebidas: %.2f %n",costeBebidas);
        System.out.printf("Subtotal bocadillos: %.2f %n",costeBocadillo);
        System.out.printf("total compra: %.2f%n",compra);
        System.out.printf("Cantidad por alumnos: %.2f %n",precioPersona);

        teclado.close();
    }


}

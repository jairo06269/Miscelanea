package co.edu.sena;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

    double numero1=0;
    double numero2=0;
    double numero3=0;
    Scanner sr = new Scanner(System.in);

        System.out.println("Que desea hacer?");
        System.out.println("1. Calcular el área de un triángulo.");
        System.out.println("2. Ingresar dos números por teclado y sumarlos");
        System.out.println("3. Ingresar un número y visualizar el número elevado al cuadrado.");
        System.out.println("4. Escribir un algoritmo que convierta de euros a dólares.");
        System.out.println("5. Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del área y del\n" +
                "perímetro");
        System.out.println("6. Escribir un algoritmo que determine el área y el volúmen de un cilindro");
        System.out.println("7. Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y\n" +
                "el área (pi*r)^2 del círculo inscrito.");
        System.out.println("8. Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y\n" +
                "el área (pi*r)^2 del círculo inscrito.");

        numero1=sr.nextDouble();
        Data data = new Data();

        if (numero1 == 1)
        {
            System.out.println("Elegiste 1. Calcular el área de un triángulo.");
            System.out.println("ingrese base");
            numero1 = sr.nextDouble();
            System.out.println("ingrese altura");
            numero2 = sr.nextDouble();
            System.out.println("el area del triangulo es "+data.calcularAreaTriangulo(numero1,numero2));
        }
        if (numero1 == 2)
        {
            System.out.println("Elegiste 2. Ingresar dos números por teclado y sumarlos");
            System.out.println("ingrese numero1");
            numero1 = sr.nextDouble();
            System.out.println("ingrese numero2");
            numero2 = sr.nextDouble();
            System.out.println("la suma de los dos numeros es "+data.sumarDosNumeros(numero1,numero2));
        }
        if (numero1 == 3)
        {
            System.out.println("Elegiste  Ingresar un número y visualizar el número elevado al cuadrado");
            System.out.println("ingrese el numero a elevar ");
            numero1 = sr.nextDouble();

            System.out.println("el numero elevado al cuadrado es "+data.elevarNumeroAlCuadrado(numero1));
        }







        ;
    }
}
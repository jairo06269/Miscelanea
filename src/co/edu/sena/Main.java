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
        System.out.println("8. Calcular el promedio de tres (3) números ingresados por teclado");

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
        if (numero1 == 4)
        {
            System.out.println("Elegiste  4. Escribir un algoritmo que convierta de euros a dólares.");
            System.out.println("ingrese el valor a convertir a dolares ");
            numero1 = sr.nextDouble();

            System.out.println("el valor convertido a dolares es "+data.convertirADolares(numero1));

        }

        if (numero1 == 5)
        {
            System.out.println("Elegiste  5. Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del área y del\n" +
                    "perímetro");
            System.out.println("ingrese el valor del lado del cuadrado");
            numero1 = sr.nextDouble();
            System.out.println("el area del cuadrado es: "+data.areaCuadrado(numero1));
            System.out.println("el perimetro del cuadrado es: "+data.perimetroCuadrado(numero1));
        }

        if (numero1 == 6)
        {
            System.out.println("6. Escribir un algoritmo que determine el área y el volúmen de un cilindro");
            System.out.println("ingrese altura de cilindro");
            numero1 = sr.nextDouble();
            System.out.println("ingrese radio del cilindro");
            numero2 = sr.nextDouble();
            System.out.println("El volumen del cilindro es "+data.calcularAreaCilindro(numero1,numero2));
            System.out.println("El area del cilindro es "+ data.calcularVolumenCilindro(numero1,numero2));
        }
        if (numero1 == 7)
        {
            System.out.println("7. Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y\n" +
                    "el área (pi*r)^2 del círculo inscrito.");
            System.out.println("ingrese radio de circunferencia");
            numero1 = sr.nextDouble();

            System.out.println("El area del circulo es "+data.areaCirculo(numero1));

        }
        if (numero1 == 8)
        {
            System.out.println("8. Calcular el promedio de tres (3) números ingresados por teclado");
            System.out.println("ingrese numero1");
            numero1 = sr.nextDouble();
            System.out.println("ingrese numero2");
            numero2 = sr.nextDouble();
            System.out.println("ingrese numero3");
            numero3 = sr.nextDouble();

            System.out.println("El promedio de los tres numero es: "+data.calcularPromedio(numero1,numero2,numero3));

        }









        ;
    }
}
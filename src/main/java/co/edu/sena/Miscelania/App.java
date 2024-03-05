package co.edu.sena.Miscelania;

import java.security.Principal;
import java.util.Scanner;

public class App {

    static Scanner data = new Scanner(System.in);

    public static void main(String[] args) {

        int Opcion;
        do {
            System.err.println("Bienvenido al menu de opciones");
            System.err.println("1. Operadores");
            System.err.println("2. Condicionales");
            System.err.println("3. Ciclos");
            System.err.println("99. Salir");
            System.err.println("Por Favor digite una opción");
            
            Opcion = data.nextInt();

            switch (Opcion) {
                case 1:
                    Operadores();
                    break;
                case 2:
                    Condicionales();
                    break;
                case 3:
                    Ciclos();
                    break;
                case 99:
                    System.err.println("Saliendo del programa...");
                    break;
                default:
                    System.err.println("Opción no válida");
                    break;
            }
        } while (Opcion != 99);
    }

    static void Operadores() {
        double Num1;
        double Num2;
        double Num3;
        double Num4;
        System.err.println("Calcular el área de un triángulo");
        System.err.println("Ingresa la base del triángulo: ");
        Num1 = data.nextDouble();
        System.err.println("Ingresa la altura del triángulo: ");
        Num2 = data.nextDouble();
        Num3 = Ejercicios.trianglearea(Num1, Num2);
        System.err.println("El resultado es: " + Num3);
        
        System.err.println("Suma de dos números");
        System.err.println("Ingresa el primer número: ");
        Num1 = data.nextDouble();
        System.err.println("Ingresa el segundo número: ");
        Num2 = data.nextDouble();
        Num3 = Ejercicios.Addnumbers(Num1, Num2);
        System.err.println("La suma de los dos números es: " + Num3);
        
        System.err.println("Número elevado al cuadrado");
        System.err.println("Ingresa un número: ");
        Num1 = data.nextDouble();
        Num3 = Ejercicios.squared(Num1);
        System.err.println("El resultado es: " + Num3);
        
        System.err.println("Conversión de euros a dólares");
        System.err.println("Ingresa la cantidad de euros a convertir en dólares:");
        Num1 = data.nextDouble();
        Num3 = Ejercicios.moneyconversion(Num1);
        System.err.println(Num1 + " euros equivale a " + Num3);
        
        System.err.println("Hallar perímetro y área de un cuadrado");
        System.err.println("Ingresa el valor de un lado del cuadrado: ");
        Num1 = data.nextDouble();
        Num3 = Ejercicios.squaresareaperimeter(Num1)[0];
        double perimeter = Ejercicios.squaresareaperimeter(Num1)[1];
        System.err.println("El área del cuadrado es: " + Num3);
        System.err.println("El perímetro del cuadrado es: " + perimeter);
        
        System.err.println("Calcular el área y el volumen de un cilindro");
        System.err.println("Ingresa el radio del cilindro: ");
        Num1 = data.nextDouble();
        System.err.println("Ingresa la altura del cilindro: ");
        Num2 = data.nextDouble();
        double area = Ejercicios.cylinderareaperimeter(Num1, Num2)[0];
         double volume = Ejercicios.cylinderareaperimeter(Num1, Num2)[1];
        System.err.println("El área del cilindro es: " + area);
        System.err.println("El volumen del cilindro es: " + volume);
        
        System.err.println("Calcular la longitud de una circunferencia y el área del círculo inscrito");
        System.err.println("Ingresa el radio de la circunferencia: ");
        Num1 = data.nextDouble();
        double length = Ejercicios.radiuscircumferencelength(Num1)[0];
        double circ_area = Ejercicios.radiuscircumferencelength(Num1)[1];
        System.err.println("La longitud de la circunferencia es: " + length);
        System.err.println("El área del círculo inscrito es: " + circ_area);
        
        System.err.println("Calcular el promedio de tres números");
        System.err.println("Ingresa el primer número: ");
        Num1 = data.nextDouble();
        System.err.println("Ingresa el segundo número: ");
        Num2 = data.nextDouble();
        System.err.println("Ingresa el tercer número: ");
        Num3 = data.nextDouble();
        Num4= Ejercicios.averageofthree(Num1, Num2, Num3);
        System.err.println("El promedio de los tres números es: " + Num4 + "\n");
    }

    static void Condicionales() {
        double num1;
        double num2;
        double num3;
        double result;
        // primero punto Escribir un algoritmo para saber si el número ingresado por teclado es positivo o negativo
        System.err.println("Saber si un numeroe es positivo o negativo");
        System.err.println("Digite un número:");
        num1 = data.nextDouble();
        if (num1 < 0) {
            System.err.println("El número es negativo" + "\n");
        }
        else {
            System.err.println("El número es positivo" + "\n");
        }

        // Segundo punto. Escribir un algoritmo que reciba dos números por teclado y diga cuál es el mayor y cuál el menor.
        System.err.println("Ingresar dos numeros y saber cual es el mayor y menor");
        System.err.println("Digite el primer número:");
        num1 = data.nextDouble();
        System.err.println("Digite el segundo número:");
        num2 = data.nextDouble();        

        if (num1 > num2) {
            System.err.println("El número " + num1 + " es mayor que el número " + num2 + "\n");
        }
        else {
            System.err.println("El número " + num2 + " es mayor que el número " + num1 + "\n");
        }

        //Tercer punto. Escriba un programa que lea tres números enteros positivos y que calcule e imprima en pantalla el menor y el mayor de ellos.
       
       System.err.println("Ingresar tres numeros y sabes cual es el menor y mayor de los tres");
        System.err.println("Digite el primer número:");
        num1 = data.nextDouble();
        System.err.println("Digite el segundo número:");
        num2 = data.nextDouble();
        System.err.println("Digite el tercer número:");
        num3 = data.nextDouble(); 

        if (num1 < num2 && num2 < num3) {
            System.err.println("El numero menor es el " + num1 + " y el mayor " + num3 + "\n");
        }
        else if (num1 > num2 && num2 > num3) {
            System.err.println("El numero menor es el " + num3 + " y el mayor " + num1 + "\n");
        }
        else if (num1 < num2 && num2 > num3) {
            if (num1 > num3) {
                System.err.println("El numero menor es el " + num3 + " y el mayor " + num2 + "\n");
            }
            else {
                System.err.println("El numero menor es el " + num1 + " y el mayor " + num2 + "\n");
            }
        }
    
        // Cuarto punto. Dados dos números A y B, sumarlos si A es menor que B o sino restarlos
        System.err.println("Sumar o restar");
        System.err.println("Digite el primer número:");
        num1 = data.nextDouble();
        System.err.println("Digite el segundo número:");
        num2 = data.nextDouble();
        if (num1 < num2) {
            result = num1 + num2 ;
            System.err.println("El resultado de la suma es: " + result + "\n");
        }
        else {
            result = num1 - num2;
            System.err.println("El resultado de la resta es: " + result + "\n");
        }
        //Quinto punto. Dados dos números A y B encontrar el cociente entre A y B. Recordar que la división por cero no está definida, en ese caso debe aparecer una leyenda anunciando que la división no es posible.
        System.err.println("Cociente de dos numeros");
        System.err.println("Digite el primer número:");
        num1 = data.nextDouble();
        System.err.println("Digite el segundo número:");
        num2 = data.nextDouble();

        result = num1 / num2;

        if (num2 == 0) {
            System.err.println("La division no es posible");
        }
        else {
            System.err.println("El resultado de la divison es: " + result + "\n" );
        }
        // sexto punto Dados dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario multiplicarlos
        System.err.println("suma o multiplicacion");
        System.err.println("Digite el primer número:");
        num1 = data.nextDouble();
        System.err.println("Digite el segundo número:");
        num2 = data.nextDouble();

        if (num1 < 0 || num2 < 0) {
            result = num1 + num2;
            System.err.println("El resultado de la suma es: " + result + "\n");
        }
        else {
            result = num1 * num2;
            System.err.println("El resultado de la multiplicación es: " + result + "\n");
        }

        //septimo punto Escribir un algoritmo que determine si un año es bisiesto o no

        System.err.println("Año bisiesto");
        System.err.println("Digite el año actual: ");
        num1 = data.nextDouble();

        if (num1 %4 == 0) {
            System.err.println("El año es bisiesto");
        }
        else {
            System.err.println("El año no es bisiesto");
        }
    }

    

    static void Ciclos() {
        double num1;
        double num2;
        //primer punto. Imprimir todos los múltiplos de 3 que hay entre 1 y 100.

}
}
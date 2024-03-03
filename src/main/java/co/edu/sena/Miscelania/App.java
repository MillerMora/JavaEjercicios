package co.edu.sena.Miscelania;

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
        // Código de Condicionales()...
    }

    static void Ciclos() {
        // Código de Ciclos()...
    }
}

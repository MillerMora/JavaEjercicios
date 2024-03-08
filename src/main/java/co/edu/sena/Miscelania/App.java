package co.edu.sena.Miscelania;
import java.util.Scanner;

public class App {

    static Scanner data = new Scanner(System.in);
    static int option, subOption;
    static double Num1, Num2 , Num3, Num4;
    static double result;

    public static void main(String[] args) {
        do {
            System.err.println("Bienvenido al menu de opciones");
            System.err.println("1. Operadores");
            System.err.println("2. Condicionales");
            System.err.println("3. Ciclos");
            System.err.println("99. Salir");
            System.err.println("Por Favor digite una opción");
            
            option = data.nextInt();

            switch (option) {
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
        } while (option != 99);
    }

    static void Operadores (){
        do {
            System.err.println("Bienvenido al submenu de operadores");
            System.err.println("1. Calcular el área de un triángulo");
            System.err.println("2. Suma de dos números");
            System.err.println("3. Número elevado al cuadrado");
            System.err.println("4. Conversión de euros a dólares");
            System.err.println("5. Hallar perímetro y área de un cuadrado");
            System.err.println("6. Calcular el área y el volumen de un cilindro");
            System.err.println("7. Calcular la longitud de una circunferencia y el área del círculo inscrito");
            System.err.println("8. Calcular el promedio de tres números");
            System.err.println("99. Salir");
            System.err.println("Por Favor digite una opción");
            subOption = data.nextInt();
            switch (subOption) {
                case 1:
                    calculateTriangleArea();
                    break;
                case 2:
                    addNumbers();
                    break;
                case 3:
                    calculateSquare();
                    break;
                case 4:
                    convertCurrency();
                    break;
                case 5:
                    calculateSquareProperties();
                    break;
                case 6:
                    calculateCylinderProperties();
                    break;
                case 7:
                    calculateCircumferenceProperties();
                    break;
                case 8:
                    calculateAverage();
                    break;
                case 99:
                    System.err.println("Saliendo...");
                    break;
                default:
                    System.err.println("Opción inválida. Por favor, intente nuevamente.");
                    break;

            }
        } while (subOption != 99);
    }
    static void calculateTriangleArea() {

        System.err.println("Calcular el área de un triángulo");
        System.err.println("Ingresa la base del triángulo: ");
        Num1 = data.nextDouble();
        System.err.println("Ingresa la altura del triángulo: ");
        Num2 = data.nextDouble();
        Num3 = Ejercicios.trianglearea(Num1, Num2);
        System.err.println("El resultado es: " + Num3);
    }
    
    static void addNumbers() {
        System.err.println("Suma de dos números");
        System.err.println("Ingresa el primer número: ");
        Num1 = data.nextDouble();
        System.err.println("Ingresa el segundo número: ");
        Num2 = data.nextDouble();
        Num3 = Ejercicios.Addnumbers(Num1, Num2);
        System.err.println("La suma de los dos números es: " + Num3);
    }
    
    static void calculateSquare() {
        System.err.println("Número elevado al cuadrado");
        System.err.println("Ingresa un número: ");
        Num1 = data.nextDouble();
        Num3 = Ejercicios.squared(Num1);
        System.err.println("El resultado es: " + Num3);
    }
    
    static void convertCurrency() {
        System.err.println("Conversión de euros a dólares");
        System.err.println("Ingresa la cantidad de euros a convertir en dólares:");
        Num1 = data.nextDouble();
        Num3 = Ejercicios.moneyconversion(Num1);
        System.err.println(Num1 + " euros equivale a " + Num3);
    }
    
    static void calculateSquareProperties() {
        System.err.println("Hallar perímetro y área de un cuadrado");
        System.err.println("Ingresa el valor de un lado del cuadrado: ");
        Num1 = data.nextDouble();
        Num3 = Ejercicios.squaresareaperimeter(Num1)[0];
        double perimeter = Ejercicios.squaresareaperimeter(Num1)[1];
        System.err.println("El área del cuadrado es: " + Num3);
        System.err.println("El perímetro del cuadrado es: " + perimeter);
        
    }
    
    static void calculateCylinderProperties() {
        System.err.println("Calcular el área y el volumen de un cilindro");
        System.err.println("Ingresa el radio del cilindro: ");
        Num1 = data.nextDouble();
        System.err.println("Ingresa la altura del cilindro: ");
        Num2 = data.nextDouble();
        double area = Ejercicios.cylinderareaperimeter(Num1, Num2)[0];
         double volume = Ejercicios.cylinderareaperimeter(Num1, Num2)[1];
        System.err.println("El área del cilindro es: " + area);
        System.err.println("El volumen del cilindro es: " + volume);
    }
    
    static void calculateCircumferenceProperties() {
        System.err.println("Calcular la longitud de una circunferencia y el área del círculo inscrito");
        System.err.println("Ingresa el radio de la circunferencia: ");
        Num1 = data.nextDouble();
        double length = Ejercicios.radiuscircumferencelength(Num1)[0];
        double circ_area = Ejercicios.radiuscircumferencelength(Num1)[1];
        System.err.println("La longitud de la circunferencia es: " + length);
        System.err.println("El área del círculo inscrito es: " + circ_area);
    }
    
    static void calculateAverage() {
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
        do {
            System.err.println("Bienvenido al submenu de Condicionales");
            System.err.println("1. Saber si un número es positivo o negativo");
            System.err.println("2. Encontrar el mayor y el menor de dos números");
            System.err.println("3. Encontrar el menor y el mayor de tres números");
            System.err.println("4. Sumar o restar dos números dependiendo de cuál es mayor");
            System.err.println("5. Calcular el cociente de dos números");
            System.err.println("6. Sumar si al menos uno de los números es negativo, multiplicar en caso contrario");
            System.err.println("7. Determinar si un año es bisiesto");
            System.err.println("99. Salir al menú principal");
            System.err.println("Por Favor digite una opción");
            subOption = data.nextInt();
            switch (subOption) {
                case 1:
                    positiveOrNegative();
                    break;
                case 2:
                    findMinMaxOfTwoNumbers();
                    break;
                case 3:
                    findMinMaxOfThreeNumbers();
                    break;
                case 4:
                    sumOrSubtractDependingOnGreater();
                    break;
                case 5:
                    calculateQuotient();
                    break;
                case 6:
                    sumOrMultiplyDependingOnNegativity();
                    break;
                case 7:
                    checkLeapYear();
                    break;
                case 99:
                    System.err.println("Saliendo al menú principal...");
                    break;
                default:
                    System.err.println("Opción inválida. Por favor, intente nuevamente.");
                    break;
            }
        } while (subOption != 99);
    }

    static void positiveOrNegative() {
        System.err.println("Saber si un número es positivo o negativo");
        System.err.println("Digite un número:");
        Num1 = data.nextDouble();
        if (Num1 < 0) {
            System.err.println("El número es negativo" + "\n");
        } else {
            System.err.println("El número es positivo" + "\n");
        }
    }

    static void findMinMaxOfTwoNumbers() {
        System.err.println("Ingresar dos numeros y saber cual es el mayor y menor");
        System.err.println("Digite el primer número:");
        Num1 = data.nextDouble();
        System.err.println("Digite el segundo número:");
        Num2 = data.nextDouble();        

        if (Num1 > Num2) {
            System.err.println("El número " + Num1 + " es mayor que el número " + Num2 + "\n");
        }
        else {
            System.err.println("El número " + Num2 + " es mayor que el número " + Num1 + "\n");
        }
    }

    static void findMinMaxOfThreeNumbers() {
        System.err.println("Ingresar tres numeros y sabes cual es el menor y mayor de los tres");
        System.err.println("Digite el primer número:");
        Num1 = data.nextDouble();
        System.err.println("Digite el segundo número:");
        Num2 = data.nextDouble();
        System.err.println("Digite el tercer número:");
        Num3 = data.nextDouble(); 

        if (Num1 < Num2 && Num2 < Num3) {
            System.err.println("El numero menor es el " + Num1 + " y el mayor " + Num3 + "\n");
        }
        else if (Num1 > Num2 && Num2 > Num3) {
            System.err.println("El numero menor es el " + Num3 + " y el mayor " + Num1 + "\n");
        }
        else if (Num1 < Num2 && Num2 > Num3) {
            if (Num1 > Num3) {
                System.err.println("El numero menor es el " + Num3 + " y el mayor " + Num2 + "\n");
            }
            else {
                System.err.println("El numero menor es el " + Num1 + " y el mayor " + Num2 + "\n");
            }
        }
    }

    static void sumOrSubtractDependingOnGreater() {
        System.err.println("Sumar o restar");
        System.err.println("Digite el primer número:");
        Num1 = data.nextDouble();
        System.err.println("Digite el segundo número:");
        Num2 = data.nextDouble();
        if (Num1 < Num2) {
            result = Num1 + Num2 ;
            System.err.println("El resultado de la suma es: " + result + "\n");
        }
        else {
            result = Num1 - Num2;
            System.err.println("El resultado de la resta es: " + result + "\n");
        }
    }

    static void calculateQuotient() {
        System.err.println("Cociente de dos numeros");
        System.err.println("Digite el primer número:");
        Num1 = data.nextDouble();
        System.err.println("Digite el segundo número:");
        Num2 = data.nextDouble();

        result = Num1 / Num2;

        if (Num2 == 0) {
            System.err.println("La division no es posible");
        }
        else {
            System.err.println("El resultado de la divison es: " + result + "\n" );
        }
    }

    static void sumOrMultiplyDependingOnNegativity() {
        System.err.println("suma o multiplicacion");
        System.err.println("Digite el primer número:");
        Num1 = data.nextDouble();
        System.err.println("Digite el segundo número:");
        Num2 = data.nextDouble();

        if (Num1 < 0 || Num2 < 0) {
            result = Num1 + Num2;
            System.err.println("El resultado de la suma es: " + result + "\n");
        }
        else {
            result = Num1 * Num2;
            System.err.println("El resultado de la multiplicación es: " + result + "\n");
        }

    }

    static void checkLeapYear() {
        
        System.err.println("Año bisiesto");
        System.err.println("Digite el año actual: ");
        Num1 = data.nextDouble();

        if (Num1 %4 == 0) {
            System.err.println("El año es bisiesto");
        }
        else {
            System.err.println("El año no es bisiesto");
        }
    }

    static void Ciclos() {
        do {
            System.err.println("Bienvenido al submenu de Ciclos");
            System.err.println("1. Imprimir todos los múltiplos de 3 que hay entre 1 y 100.");
            System.err.println("2. Imprimir los números impares entre 0 y 100.");
            System.err.println("3. Imprimir los números pares del 1 al 100.");
            System.err.println("4. Imprimir los cuadrados de los números del 1 al 30.");
            System.err.println("5. Sumar los cuadrados de los cien primeros números naturales.");
            System.err.println("6. Generar y mostrar todos los números entre dos números dados.");
            System.err.println("7. Sumar todos los números ingresados por teclado hasta que se digite cero.");
            System.err.println("99. Salir al menú principal");
            System.err.println("Por Favor digite una opción");
            option = data.nextInt();
            switch (option) {
                case 1:
                    printMultiplesOfThree();
                    break;
                case 2:
                    printOddNumbers();
                    break;
                case 3:
                    printEvenNumbers();
                    break;
                case 4:
                    printSquaresOfNumbers();
                    break;
                case 5:
                    sumOfSquaresOfNaturalNumbers();
                    break;
                case 6:
                    generateNumbersBetweenTwoNumbers();
                    break;
                case 7:
                    sumNumbersUntilZero();
                    break;
                case 99:
                    System.err.println("Saliendo al menú principal...");
                    break;
                default:
                    System.err.println("Opción inválida. Por favor, intente nuevamente.");
                    break;
            }
        } while (option != 99);
    }
    
    static void printMultiplesOfThree() {
        System.err.println("Imprimir todos los múltiplos de 3 que hay entre 1 y 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.err.print(i + " ");
            }
        }
        System.err.println();
    }
    
    static void printOddNumbers() {
        System.err.println("Imprimir los números impares entre 0 y 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.err.print(i + " ");
            }
        }
        System.err.println();
    }
    
    static void printEvenNumbers() {
        System.err.println("Imprimir los números pares del 1 al 100:");
        for (int i = 2; i <= 100; i += 2) {
            System.err.print(i + " ");
        }
        System.err.println();
    }
    
    static void printSquaresOfNumbers() {
        System.err.println("Imprimir los cuadrados de los números del 1 al 30:");
        for (int i = 1; i <= 30; i++) {
            int square = i * i;
            System.err.print(square + " ");
        }
        System.err.println();
    }
    
    static void sumOfSquaresOfNaturalNumbers() {
        System.err.println("Sumar los cuadrados de los cien primeros números naturales:");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        System.err.println("La suma de los cuadrados de los primeros 100 números naturales es: " + sum);
    }
    
    static void generateNumbersBetweenTwoNumbers() {
        System.err.println("Generar y mostrar todos los números entre dos números dados:");
        System.err.println("Digite el primer número:");
        int num1 = data.nextInt();
        System.err.println("Digite el segundo número:");
        int num2 = data.nextInt();
        System.err.println("Números entre " + num1 + " y " + num2 + ":");
        if (num1 < num2) {
            for (int i = num1 + 1; i < num2; i++) {
                System.err.print(i + " ");
            }
        } else {
            for (int i = num2 + 1; i < num1; i++) {
                System.err.print(i + " ");
            }
        }
        System.err.println();
    }
    
    static void sumNumbersUntilZero() {
        System.err.println("Sumar todos los números ingresados por teclado hasta que se digite cero:");
        int sum = 0;
        int num;
        do {
            System.err.println("Digite un número (digite 0 para salir):");
            num = data.nextInt();
            sum += num;
        } while (num != 0);
        System.err.println("La suma de los números ingresados es: " + sum);
    }
}   
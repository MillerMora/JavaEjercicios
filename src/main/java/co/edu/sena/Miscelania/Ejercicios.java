package co.edu.sena.Miscelania;

public class Ejercicios {
    public static double trianglearea(double Num1, double Num2) {
        return Num1 * Num2 / 2;
    }

    public static double Addnumbers(double Num1, double Num2) {
        return Num1 + Num2;
    }

    public static double squared(double Num1) {
        return Math.pow(Num1, 2);
    }

    public static double moneyconversion(double euros) {
        return euros * 1.08;
    }

    public static double[] squaresareaperimeter(double Num1) {
        double Num4 = Num1 * Num1;
        double Num5 = Num1 * 4;
        return new double[]{Num4, Num5};
    }

    public static double[] cylinderareaperimeter(double Num1, double Num2) {
        double Num4 = 2 * Math.PI * Num1 * (Num1 + Num2);
        double Num5 = Math.PI * Math.pow(Num1, 2) * Num2;
        return new double[]{Num4, Num5};
    }

    public static double[] radiuscircumferencelength(double Num1) {
        double Num4 = 2 * Math.PI * Num1;
        double Num5 = Math.PI * Math.pow(Num1, 2);
        return new double[]{Num4, Num5};
    }

    public static double averageofthree(double Num1, double Num2, double Num3) {
        return (Num1 + Num2 + Num3) / 3;
    }
}

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
/*
    Целые (Название/Размер[байты]/Диапазон) -->
      byte/1 байт/-128...127
      short/2 байта/-2^15...2^15-1
      int/4 байта/-2^31...2^31-1
      long/8 байт/-2^63...2^63-1

    Вещественные -->
        С фиксированной точкой (3.2) -->
            float/4 байта/ - дефолтная точность 3.2
            double/8 байт/ - двойная точность 3.200 и т.д.
        С плавающей точкой (например 3.2 = 32 * 10^-1 = 0.32 * 10) -->
            mE+-p где m - мантисса, p - порядок => 32E-2

        Символьный (char/2/2^16) - символы из юникода, синтаксис - одинарные кавычки
        Логический (boolean) принимает либо истину(R[кроме 0]), либо опровержение/ложь(0)

    Переменные */
        Scanner scanner = new Scanner(System.in);
        //y = 2 * sqrt(x)//
        //System.out.println(2 * Math.sqrt(scanner.nextInt() + 1));
        //task 3//
        double k = scanner.nextDouble(), y = scanner.nextDouble();
        double U = (Math.log(k - y) + Math.pow(y, 4))/(Math.exp(y) + 2.355 * Math.pow(k, 2));
        System.out.printf("U=%.2f\n", U);
/*
    Константы
        final double PI = 3.14;
        final short G = 10;
*/
    }
}

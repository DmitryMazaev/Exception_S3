import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = in.nextDouble();

        System.out.print("Выберите действие: 1 - сложение, 2 - деление, ... : ");
        int com = in.nextInt();

        System.out.print("Введите второе число: ");
        double b = in.nextDouble();

        if (com == 1)
        {
            CalcSum calcSum = new CalcSum(a, b);
            calcSum.calculateSum(a, b);
        }
    }
}

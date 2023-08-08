public class CalcExp
{
    private double a;
    private double b;

    public double calculateExp (double a, double b) throws InvalidInputException
    {
        if (a == 0)
        {
            throw new InvalidInputException("Введено некорректное основание степени");
        }
        double c = Math.pow(a, b);
        System.out.printf("%f ^ %f = %f", a, b, c);
        return c;
    }
}
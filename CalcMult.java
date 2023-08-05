public class CalcMult
{
    private double a;
    private double b;

    public double calculateMult (double a, double b)
    {
        double c = a * b;
        System.out.printf("%f * %f = %f", a, b, c);
        return c;
    }
}
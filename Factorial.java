public class Factorial
{
    public static void main(String[] args)
    {
        int sum=6;
        int fact=1;
        for(int i=1;i<=sum;i++)
        {
            fact *=i;
        }
        System.out.println(fact);
    }
}
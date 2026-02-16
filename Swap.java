public class Swap {
    public static void main(String[] args)
    {
        int a=23;
        int c=56;
        a=a+c;
        c=a-c;
        a=a-c;
        System.out.println("a="+a);
        System.out.println("c="+c);
    }
}

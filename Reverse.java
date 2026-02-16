import java.util.Scanner;
public class Reverse
{
    public static void main(String[] args)
    {
        Scanner og=new Scanner(System.in);
        System.out.println("Entre the string:");
        String str=og.nextLine();
        String a="";
        for(int i=str.length()-1;i>=0;i--)
        {
        a +=str.charAt(i);
        }
        System.out.println("Reverse string:"+a); 
    }
}
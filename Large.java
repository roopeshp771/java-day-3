public class Large
{
    public static void main(String[] args)
    {
        int[] arr={10,23,5,33,78};
        int large=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>large)
            {
                large=arr[i];
            }
        }
        System.out.println(large);
    }
}
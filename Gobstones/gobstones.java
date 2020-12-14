import java.util.Scanner;
class Gobstones
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num;
        num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i]%4==0)
            System.out.println("YES");
        else
            System.out.println("NO");
        }   
    }
}
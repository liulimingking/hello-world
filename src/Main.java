
import java.util.Scanner;
public class Main {
    public static void main(String [] args)
    {
        int a[][] = new int [100][1];
        a[99][0]=1;
        System.out.println(a[99][0]);
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt(),b=sc.nextInt();
        System.out.println(b+c);
    }
}

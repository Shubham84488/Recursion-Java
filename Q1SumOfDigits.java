import java.util.Scanner;

public class Q1SumOfDigits {

    public static int findSum(int n) {
        if(n<=1){                       //base condition
            return 0;
        }
        return n%10 + findSum(n/10);    // recursive call
    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        int res = findSum(num);
        System.out.println(res);

        sc.close();
    }
}
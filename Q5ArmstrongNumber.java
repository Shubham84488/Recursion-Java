import java.util.Scanner;

public class Q5ArmstrongNumber {

    public static long armstrong(int num) {
        if(num==0){         //base condition
            return 0;
        }        
        int sum =num%10;
        int current= sum*sum*sum;
        long remaining = armstrong(num/10);// recursive call
            
        return current+remaining;
    }


    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        long asum=armstrong(num);

        if(num==asum){
            System.out.println("Number is an armstrong number");
        }
        else{
            System.out.println("Number is not an armstrong number");
        }
        sc.close();
    }
}

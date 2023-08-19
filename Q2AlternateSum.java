import java.util.Scanner;

public class Q2AlternateSum {
    public static int findAsum(int n) {
        if(n==0)return n;       //base condition
        
        else if(n%2==0){
            return findAsum(n-1)-n;// recursive call
        }
        else{
            return findAsum(n-1)+n;// recursive call
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        int res = findAsum(num);
        System.out.println(res);

        sc.close();
    }
}

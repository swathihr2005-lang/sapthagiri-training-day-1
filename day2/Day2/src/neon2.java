import java.util.Scanner;
public class neon2 {
    
    public static boolean check(int n) {
        int sq = n * n;
        int sum = 0;
        int temp = sq;

        while (temp != 0) {
            int d = temp % 10;  
            sum = sum + d;
            temp = temp / 10;   
        }

        return sum == n;
    }

    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (check(num)) {
            System.out.println(num + " is a Neon number.");
        } else {
            System.out.println(num + " is not a Neon number.");
        }

        sc.close();
    }
}

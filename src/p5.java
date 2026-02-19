import java.util.Scanner;
public class p5 {
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number:");
        int n=sc.nextInt();
        int c=0;
        if(n==0){
            System.out.println("no. of digits=1");
        }
        else{
              while(n!=0){
            c=c+1;
            n=n/10;
        }
        System.out.println("no. of digits="+c);
    }
    }
}


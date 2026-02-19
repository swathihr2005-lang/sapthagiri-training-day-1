import java.util.Scanner;
public class strongNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
     System.out.print("enter a number:");
     int n=sc.nextInt();
     int temp=n;
     int sum=0;
     while(temp>0){
         int digit=temp%10;
         int fact=1;
         for(int i=1;i<=digit;i++){
             fact=fact*i;
         }
         sum+=fact;
         temp/=10;
     }
    }
    
}

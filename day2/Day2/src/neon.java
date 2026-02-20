import java.util.Scanner;
public class neon {
     public static void main(String[] args) {
        
     Scanner sc=new Scanner(System.in);
     System.out.print("enter a number:");
     int n=sc.nextInt();
     int square=n*n;
     int sum=0;
     while(square>0){
         sum+=square%10;
         square/=10;
     }if(sum==n){
         System.out.println(n+"is an neon number");
         
                 
                 }else{
         System.out.println(n+"not a neon number");
         
     }
             }
     
}
    


import java.util.Scanner;
public class p4 {
    


    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number:");
         int n=sc.nextInt();
         int c=0;
       
        /*
         int temp=n,sum=0;
         while(temp!=0){
             c++;
             temp=temp/10;
         }
         temp=n;
         while(temp!=0){
             int d=temp%10;
             sum+=Math.pow(d,c);
             temp=temp/10;
         }
           if(sum==n){
        System.out.println("armstrong");
}
else{
System.out.println(" not armstrong");
    }
    }
} */
         
         int s=0;
         while(n!=0){
            c=c+1;
            n=n/10;
        }
         while(n!=0){
             int d=n%10;
             s+=Math.pow(d, c);
             n=n/10;
         }
         if(s==n){
        System.out.println("armstrong");
}
else{
System.out.println(" not armstrong");
    }
}
}
    


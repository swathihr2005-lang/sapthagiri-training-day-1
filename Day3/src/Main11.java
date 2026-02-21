class Bank{
   void interest(){
       System.out.println("Bank provides interest on deposits");
   }
   static void interest(double rate){
       System.out.println("interst rate is 12");
   }
}

class SBI extends Bank{
    
   
   static void interest(double rate,int years){
     
       System.out.println("total interst is");
       int principal=100;
        System.out.println((principal*rate*years)/100); 
   }
}
public class Main11 {
    public static void main(String[] args){
      SBI ob=new SBI();
    ob.interest();
    ob.interest(12.0);
    ob.interest(12.0,5);
    }
   
}


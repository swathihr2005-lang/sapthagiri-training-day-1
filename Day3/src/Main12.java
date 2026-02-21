class Vehicle{
   void speed(){
       System.out.println("vehicle is good");
   }
   static void speed(int maxSpeed){
       System.out.println("maximum speed is 10");
   }
}

class car extends Vehicle{
   
   static void speed(String mode){
       System.out.println("car is running");
   }
}

public class Main12 {
    public static void main(String[] args){
      car ob=new car();
    ob.speed();
    ob.speed(10); 
    ob.speed("swa");
    }
   
}

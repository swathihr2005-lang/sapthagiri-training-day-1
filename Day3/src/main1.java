class Animal{
    void print(){
        System.out.println("sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("dog barks");
    }}
    class Puppy extends Dog{
        void display(){
            System.out.println("puppy class");
        
}}
public class main1 {
    public static void main(String[] args) {
      Puppy ob=new Puppy();
         ob.print();
            ob.display();
            ob.sound();
        }
  
    }//multiple
    


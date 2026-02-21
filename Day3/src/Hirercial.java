class Animal{
    void print(){
        System.out.println("sound");
    }
}
class Dog extends Animal{
    void sound(){
        
        System.out.println("dog barks");
    }}
    class Puppy extends Animal{
        void display(){
            System.out.println("puppy class");
        
}}
public class Hirercial {
    public static void main(String[] args) {
        Dog ob=new Dog();
      Puppy ob1=new Puppy();
         ob.print();
         ob.sound();
            ob1.display();
            
        }
  
    
}

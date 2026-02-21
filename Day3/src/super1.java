class Parent{
    int x=10;
    void print(){
        System.out.println("parent class");
    }
}
class child extends Parent{
        int x=20;
        void show(){
            super.print();
        System.out.println(x);
        
        System.out.println(super.x);
        
    }}
public class super1 {
     public static void main(String[]args){
        child ob=new child();
        ob.show();
    }
}
//variables using super
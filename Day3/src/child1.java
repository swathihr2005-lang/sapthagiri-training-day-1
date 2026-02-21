class Parent{
   void show(){
        System.out.println("Parent static Method");
    }
}
public class child1 extends Parent{
        @Override
     void show(){
        System.out.println("Child static method");
    }
    public static void main(String[]args){
        Parent ob=new child1();
        ob.show();
    }
        
    
}

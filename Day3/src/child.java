class Parent{
    Parent(){
        
        System.out.println("parent");
    }
    }

public class child extends Parent {
    child(){
        super();
        System.out.println("child");
    }
    public static void main(String[]args){
        child ob=new child();
        
    }
    
}//constructor using super


public class Student {
    String name;
    int age;
    Student( ){
        System.out.println("default");
    }
    Student(String n,int a){
      this();
       this. name=n;
       this. age=a;
    }
    
    void display(){
       
        System.out.println(name+" "+age);
    }
    public static void main(String[]args){
        Student ob=new Student("swathi",20);
        ob.display();
        
        ob.name="swathi";
        ob.age=21;
       System.out.println(ob.name+" "+ob.age);
    }
    
}

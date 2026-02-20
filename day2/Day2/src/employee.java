
public class employee {
    int id;
    String name;
    double salary;
    employee(int i,String n,double s){
        this.id=i;
        this.name=n;
        this.salary=s;
    }
    void print(){
        System.out.println(id+" "+name+" "+salary);
    }
    public static void main(String[] args){
        employee ob=new employee(12,"swathi",24);
        employee ob1=new employee(13,"swa",20);
        ob.print();
        ob1.print();
    }
    
    
}

class E1 {
    String name;
    int age;
    public E1(String name,int age){
        this.name=name;
        this.age=age;
    }
}
public class Main{
    public static void main(String[] args){
        E1 s1=new E1("Alice",20);
        System.out.println(s1);
    }
}

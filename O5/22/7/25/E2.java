//mport java.util.*;
class E2 {
    String name;
    public E2(String name){
        this.name=name;
    }

 class Main{
    public static void main(String[] args[]) throws Exception{
        E2 myArray[]=new E2[3];
        myArray [0]=new E2("Java");
        myArray [1]=new E2("Objective");
        myArray [2]=new E2("Array");
        for(E2 str:myArray){
            System.out.println(str.name);
        }
    }
}}
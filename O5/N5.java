public class N5 {
    private  int top;
    private int size;
    private char[] stack;
    N5(int size){
        this.size=size;
        stack=new char[size];
        top=-1;
    }void push(char c){
        if(top==stack.length-1){
            System.out.println("Stack is overflow");
        }else{
        stack[++top]=c;
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack is underflow");
        }else{
             System.out.print(stack[top--]+" ");
        }
       
    }

        public static void main(String[] args){
            String g="Naseema";
            char k[]=g.toCharArray();
            N5 e=new N5(k.length);
            if( k.length==0){
                System.out.println("empty input string");
            }else{
            for(int i=0;i<k.length;i++){
                e.push(k[i]);
            }
            for(int i=0;i<k.length;i++){
                e.pop();
            }
            System.out.println();
        }
        }
}

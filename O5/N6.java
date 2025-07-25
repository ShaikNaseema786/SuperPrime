public class N6 {
    private char[] stack;
    private int top;
    private int size;

    N6(int size){
        this.size = size;
        stack = new char[size];
        top = -1;
    }

    void push(char c){
        if(top == size - 1){
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = c;
        }
    }

    public char pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return '\0'; // Return null char on underflow
        } else {
            return stack[top--];
        }
    }

    public boolean math(char open, char close){
        return (open == '{' && close == '}') ||
               (open == '(' && close == ')') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args){
        boolean flag = false;
        String w = "{{(())}}";
        char[] ch = w.toCharArray();
        N6 b = new N6(ch.length);

        for(int i = 0; i < ch.length; i++){
            char current = ch[i];

            if(current == '{' || current == '(' || current == '['){
                b.push(current);
            } else if(current == '}' || current == ')' || current == ']'){
                char popped = b.pop();
                if(popped == '\0' || !b.math(popped, current)){
                    flag = true; // mismatch or underflow found
                    break;       // no need to continue
                }
            }
        }

        // If stack not empty, brackets are not balanced
        if(b.top != -1) flag = true;

        if(flag){
            System.out.println("Brackets are NOT balanced");
        } else {
            System.out.println("Brackets are balanced");
        }
    }
}

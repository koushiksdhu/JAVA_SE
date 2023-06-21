public class stackException {
    public static void main(String args[]){
        Stack s = new Stack();
        try{
        // s.push(10);
        // s.push(20);
        // s.push(30);
        // s.push(40);
        // s.push(50);
        // s.push(50);
        s.pop();
        }
        // catch(StackOverflow e){
        //     System.out.println(e);
        // }
        catch(StackUnderflow e){
            System.out.println(e);
        }
    }
}

class Stack{
    private int size;
    private int S[];
    private int top = -1;

    public void stack(int sz){
        size = sz;
        S = new int[size];
    }
    
    public void push(int x) throws StackOverflow{
        if (top == size-1)
            throw new StackOverflow();
        top++;
        S[top] = x;
    }

    public int pop() throws StackUnderflow{
        if(top == -1)
            throw new StackUnderflow();
        int x = S[top];
        top--;
        return x;
    }
}

class StackOverflow extends Exception{
    public String toString(){
        return "Stack is full.";
    }
}

class StackUnderflow extends Exception{
    public String toString(){
        return "Stack is empty.";
    }
}
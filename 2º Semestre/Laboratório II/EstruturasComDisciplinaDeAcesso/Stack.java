public class Stack {
    private Object s[];

    private int top = -1;

    public Stack(int size) {
        s = new Object[size];
    }

    public boolean isEmpty() {
        if (top == -1)
            return true;
        return false;
    }

    public boolean isFull() {
        if (top == s.length - 1)
            return true;
        return false;
    }

    public void push(Object obj) throws OverflowException {
        if (!isFull()) {
            s[++top] = obj;
        } else
            throw new OverflowException();
    }

    public Object pop() throws UnderflowException {
        if (!isEmpty()) {
            Object o =  s[top];
            s[top] = null;
            top--;
            return o;
        } else
            throw new UnderflowException();

    }

    public Stack reverse() throws UnderflowException, OverflowException{
        Object[]  backup = new Object[s.length];
        Stack reversed = new Stack(s.length);
        Object elem;
        int top = this.top;
        int i = -1;
        while(!isEmpty()){
            elem = pop();
            backup[++i] = elem;
            reversed.push(elem);
        }
        s = backup;
        this.top = top;
        return reversed;
    }
    
    
    public static void main(String args[]) {
        Stack s = new Stack(5);
        try {
            s.push("1");
            s.push("2");
            s.push("3");
            s.push("4");
            s.push("5");
            s.reverse();
        } catch (OverflowException e) {
            System.out.println(e.toString());
        } catch (UnderflowException e) {
            System.out.println(e.toString());
        }
    }

}

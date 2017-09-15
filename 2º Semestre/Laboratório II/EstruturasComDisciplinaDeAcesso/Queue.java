

public class Queue {
    protected int first = 0, last = -1;

    protected Object q[];

    public Queue(int size) {
        q = new Object[size];
    }

    public boolean isEmpty() {
        if (last == first - 1)
            return true;
        return false;
    }

    public boolean isFull() {
        if (last == q.length - 1)
            return true;
        return false;
    }

    /* Insert the element in the final of this queue */
    public void enqueue(Object element) throws OverflowException {
        if (isFull()) {
            throw new OverflowException();
        } else {
            last++;
            q[last] = element;
        }
    }

    /* Retrives and remove the first element of this queue */
    public Object dequeue() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException();
        } else {
            Object o = q[first];
            q[first] = null;
            first++;
            return o;
        }
    }
    
    
    
    public Queue merge(Queue q1, Queue q2){
        Queue q3 = new Queue(30);
        return q3;
        
    }

    public Queue makeQueueFromStack(Stack s) throws UnderflowException, OverflowException {
        Stack stack = s;
        int stackSize = 0;
        while(!(stack.isEmpty())){
            stack.pop();
            stackSize++;
        }
        Queue q = new Queue(stackSize);
        stack = s;
        stack.reverse();
        while(!(stack.isEmpty())){
            q.enqueue(stack.pop());
        }
        return q;
    }
    
    public static void main(String args[]) {
        Stack s = new Stack(3);
        try {
            s.push("1");
            s.push("2");
            s.push("3");
            Queue q = new Queue(3);
            q.makeQueueFromStack(s);
        } catch (UnderflowException e) {
            System.out.println(e.toString());
        } catch (OverflowException e) {
            System.out.println(e.toString());
        }

    }
}



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
			Object o = s[top];
			s[top] = null;
			top--;
			return o;
		} else
			throw new UnderflowException();

	}

}
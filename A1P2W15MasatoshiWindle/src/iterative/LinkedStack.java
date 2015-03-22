package iterative;

public class LinkedStack<T> implements UnboundedStackInterface<T> {
	
	protected LLNode<T> stack;

	@Override
	public void pop() throws StackUnderflowException {
		if(!isEmpty()) {
			stack = stack.getLink();
		}
		else 
			throw new StackUnderflowException("Pop attempted on an empty stack");
	}

	@Override
	public T top() throws StackUnderflowException {
		T topOfStack = null;
		if(!isEmpty())
			topOfStack = (T) stack.getInfo();
		else
			throw new StackUnderflowException("Top attempted on an empty stack");
	    return topOfStack;
	}

	@Override
	public boolean isEmpty() {
		if(stack==null) 
			return true;
		else return false;
	}

	@Override
	public void push(T element) {
		LLNode<T> topNode = new LLNode<T>(element);
		topNode.setLink(stack);
		stack = topNode;

	}
	
	public String toString()
	{
		String output = "The Stack\n=========\n";
		LLNode<T> loopStack = stack;
		while(loopStack != null)
		{
			output += (Integer)loopStack.getInfo() + "\n";
			loopStack = loopStack.getLink();
		}
		return output;
	}

}

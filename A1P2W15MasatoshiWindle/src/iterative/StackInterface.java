package iterative;


public interface StackInterface<T> {
	
	void pop() throws StackUnderflowException;
	// Throws StackunderflowException if this stack is empty
	// otherwise removes the top element from the stack
	
	T top() throws StackUnderflowException;
	// Throws StackunderflowException if this stack is empty
	// otherwise returns the top element from the stack
	
	boolean isEmpty();
	// Returns true if this stack is empty, otherwise returns false

}

package Assignment1;

public class StackImplementation {
	int top;
	int size;
	int[] stack;
	StackImplementation(){
		top=-1;
		size=10;
		stack=new int[size];
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==size-1;
	}
	public int push(int data) {
		if(isFull()) {
			System.out.println("Stack is full");
		}
		return stack[++top]=data;
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		return stack[top--];
	}
	public int peek() {
		return stack[top];
	}

	public static void main(String[] args) {
		StackImplementation obj=new StackImplementation();
		obj .push(34);
		obj.push(56);
		obj.push(45);
		obj.push(21);
		System.out.println(obj.isEmpty());
		System.out.println(obj.isFull());
		System.out.println(obj.pop());
		System.out.println(obj.size);

	}

}

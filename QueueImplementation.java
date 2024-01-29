package Assignment1;

public class QueueImplementation {
	int front;
	int rear;
	int size=10;
	int[] object;
	QueueImplementation(){
		front=-1;
		rear=-1;
		object= new int[size];
	}
	public boolean isEmpty() {
		return rear<=front;
	}
	int enqueue(int data) {
		return object[++rear]=data;
	}
	int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		if(rear>=front) {
			return object[++front];
		}
		return (Integer) null;
	}
	int queueSize() {
		return rear-front;
	}

	public static void main(String[] args) {
		QueueImplementation st=new QueueImplementation();
		System.out.println(st.isEmpty());
		st.enqueue(10);
		st.enqueue(34);
		st.enqueue(56);
		st.enqueue(31);
		System.out.println(st.isEmpty());
		System.out.println(st.queueSize());
		System.out.println(st.dequeue());

	}

}

/**
 * This class tests all methods from the Queue & Node classes. This class functions as a way to keep track of a waiting line using the ADT queue.
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-215 Module 2 Lab 3)
 * Fall 2023 (10/06/2023)
 */
public class Application {

	public static void main(String[] args) {
		Queue<String> queue = new Queue<String>(); //The queue is created
		Node<String> bob = new Node<String>(); //A Node is created to queue Bob
		bob.setData("Bob"); //Node bob now has its data set to its name
		Node<String> alice = new Node<String>(); //A Node is created to queue Alice
		alice.setData("Alice"); //Node alice now has its data set to its name
		Node<String> bill = new Node<String>(); //A Node is created to queue bill
		bill.setData("Bill"); //Node bill now has its data set to its name
		queue.enqueue(bill); //Bill is queued
		queue.getQueue(); //Queue is printed
		queue.enqueue(alice); //Alice is queued
		queue.getQueue();
		queue.enqueue(bob); //Bob is queued
		queue.getQueue();
		System.out.println(queue.dequeue().getData() + " has been serviced."); //Bill is deueued/serviced.
		queue.getQueue();
		Node<String> jane = new Node<String>(); //A Node is created to queue Jane
		jane.setData("Jane"); //Node jane now has its data set to its name
		queue.enqueue(jane); //Jane is queued
		queue.getQueue();
		Node<String> hamad = new Node<String>(); //A Node is created to queue Hamad
		hamad.setData("Hamad"); //Node hamad now has its data set to its name
		queue.enqueue(hamad); //Hamad is queued
		queue.getQueue();
		System.out.println(queue.dequeue().getData() + " has been serviced."); //Alice is deueued/serviced.
		queue.getQueue();
		System.out.println(queue.dequeue().getData() + " has been serviced."); //Bob is deueued/serviced.
		queue.getQueue();
		Node<String> jim = new Node<String>(); //A Node is created to queue Jim
		jim.setData("Jim"); //Node jim now has its data set to its name
		queue.enqueue(jim); //Jim is queued
		queue.getQueue();
		System.out.println(queue.dequeue().getData() + " has been serviced."); //Jane is deueued/serviced.
		queue.getQueue();
		System.out.println(queue.dequeue().getData() + " has been serviced."); //Hamad is deueued/serviced.
		queue.getQueue(); //Only Jim is left in the queue
	}//end main()
}//end Application class

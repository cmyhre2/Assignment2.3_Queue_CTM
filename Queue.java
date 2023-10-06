/**
 * This class tracks to order in which nodes are processed with the help of the LinkedList class.
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-215 Module 2 Lab 3)
 * Fall 2023 (10/06/2023)
 */
public class Queue<T> {
	LinkedList<T> list = new LinkedList<T>();//LinkedList variable list to store a list of Strings (Customer names)

	/**
	 * Method to see if there are any elements in the linked list.
	 * @return boolean true/false
	 */
	public boolean isEmpty()
	{
		return list.isEmpty();
	}//end isEmpty
	
	/**
	 * This method prints the queue. First, checks if the queue is empty and prints an appropriate response 
	 * for that situation. Otherwise, cycles through the linked list and prints the data of each node.
	 * @return method terminates if the queue is empty
	 */
	public void getQueue()
	{
		if(list.isEmpty()) {
			System.out.println("The queue is empty.");
			return;
		}
		System.out.println("\nPeople currently in the queue:");
		Node<T> node = list.getList();
		while(node!=null) {
		System.out.println(node.getData());
		node = node.getNextNode();
		}//while loop
		System.out.println("\n");
	}//end getQueue
	
	/**
	 * This method adds a new type T node to the queue. It first checks to see
	 * if the queue is empty. If so, it sets the head and the tail nodes
	 * to the node passed in. If the queue is not empty it places the node
	 * at the end of the list and updates the pointers in the tail. This
	 * implementation does not support adding entries to the middle
	 * of the queue.
	 * @param aNode
	 */
	public void enqueue(Node<T> aNode)
	{
		list.addNode(aNode);
		System.out.println(aNode.getData() + " has arrived.");
	}//end enqueue()
	
	/**
	 * This method removes the first node in the queue and returns it.
	 * @return list.removeHead()
	 */
	public Node<T> dequeue()
	{
		if (list.isEmpty() ) {
			System.out.println("Error: Can't dequeue, the queue is already empty.");
		}//end if statement
		return list.removeHead();
	}//end dequeue()
}//end Queue class

/**
 * This class models a linked list in which each node has a pointer
 * to the node after it, except the tail which does not have a node after.
 * @author rkelley/njohnson (v1.0) & Chris Myhre (v1.1+)
 * @version 1.2 (CS-215 Module 2 Lab 3)
 * Fall 2023 (10/06/2023)
 */
public class LinkedList<T> {

	private Node<T> head; //Type T node to represent the head of the list
	private Node<T> tail; //Type T node to represent the tail (end) of the list
	private int length; //variable to keep track of the number of elements in the list
	
	/**
	 * The constructor for this object initializes the list such that
	 * it is empty (no head or tail) node.
	 */
	public LinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}//end empty-argument constructor
	
	/**
	 * Method to see if there are any elements in the list.
	 * @return boolean true/false
	 */
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}//end isEmpty
	
	/**
	 * This method returns the head node of the list from which
	 * you can traverse the entire by following node links.
	 * @return
	 */
	public Node<T> getList()
	{
		return head;
	}//end getList
	
	/**
	 * This method adds a new type T node to the list. It first checks to see
	 * if the list is empty. If so, it sets the head and the tail nodes
	 * to the node passed in. If the list is not empty it places the node
	 * at the end of the list and updates the pointers in the tail. This
	 * implementation does not support adding entries to the middle
	 * of the list.
	 * @param aNode
	 */
	public void addNode(Node<T> aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		
		tail.setNextNode(aNode);
		tail=tail.getNextNode();
		tail.setNextNode(null);
		length++;
		
	}//end addNode
	
	/*
	 * This method removes the head of the linked list.
	 */
	public Node<T> removeHead()
	{
		if (isEmpty() ) {
			System.out.println("Error");
			return null;
		}
		Node<T> temp = head;
		head = head.getNextNode();
		length--;
		return temp;
	}//end removeHead()

}//end class
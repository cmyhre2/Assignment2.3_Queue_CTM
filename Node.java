/**
 * This class creates objects to be queued and processed.
 * 
 * @author Chris Myhre
 * @version 1.1 (CS-215 Module 2 Lab 3)
 * Fall 2023 (10/06/2023)
 */
public class Node<T> {
	private T data;  //data that the object stores, of type T to support any type of data
	private Node<T> nextNode; //pointer to the nextNode that will be in GenericLinkedList, of type T to support any type of data
	
	/**
	 * Constructor build Node object. Initializes nextNode and data
	 * to null.
	 */
	public Node()
	{
		setNextNode(null);
		data=null;
	}//end empty-argument constructor
	
	/**
	 * This method sets the type T data of the object, type T = choosen data type upon instantiation.
	 * @param data
	 */
	public void setData(T data) {
		this.data=data;
	}//end setData
	
	/**
	 * This method returns the type T data of the object.
	 * @return T (data)
	 */
	public T getData() {
		return this.data;
	}//end getData
	
	/**
	 * This method returns itself to the caller. 
	 * @return
	 */
	public Node<T> getNode() {
		return this;
	}//end getNode
	
	/**
	 * This method updates the pointer for the next type T node.
	 * @param nextNode
	 */
	public void setNextNode(Node<T> nextNode)
	{
		this.nextNode=nextNode;
	}//end setNextNode
	
	/**
	 * This method returns the node stored in the next type T node pointer.
	 * @return Node object
	 */
	public Node<T> getNextNode() {
		return nextNode;
	}//end getNextNode
}//end Node class

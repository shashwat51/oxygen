package TreeEx;

public class Node {

	public int data;
	public Node leftChild;
	public Node rightChild;
	
	public Node(int data)
	{
		this.data=data;
		leftChild=null;
		rightChild=null;
	}
	
	public void displayNode(Node n)
	{
		System.out.println("data of Node= "+n.data);
	}
}

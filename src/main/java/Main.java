package tht;
public class hjj {


public static Node<Integer> exc1(int n, int x, int y) {	
	Node <Integer> F = new Node <> ((int)(Math.random()*(y-x+1))+x);
	Node <Integer> C = F;
	Node <Integer> next;

	for (int i=0; i<n; i++) {
		next = new Node <> ((int)(Math.random()*(y-x+1))+x);
		C.setNext(next);
		C = next;

	}
	return F;


}

public static int exc2 (int x, Node <Integer> h) {
	int count = 0;
	Node <Integer> current = h;
	
	while (current != null) {
		if (current.getValue() == x) {
			count++;
		}
		current = current.getNext();
	}
	return count;
}


	
	public static void main(String[] args) {
		Node <Integer> Z = exc1(4,5,6);
		System.out.println(Z);
		System.out.println(exc2(5, Z));
		

	}

} 

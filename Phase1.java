import java.util.*;
import java.io.*;

public class Phase1 {

	public static void main(String[] args) {
		int MAXBUFFER = 100;
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i=0; i<10; i++)
     			q.add(i);
 		System.out.println("Elements of queue-"+q);
 		int removedele = q.remove();
    		System.out.println("removed element-" + removedele);
 
    		System.out.println(q);
 
    // To view the head of queue
    		int head = q.peek();
   		System.out.println("head of queue-" + head);
 
    // Rest all methods of collection interface,
    // Like size and contains can be used with this
    // implementation.
    		int size = q.size();
    		System.out.println("Size of queue-" + size);
	/*
		public double getNext() {
 		return  Math.log(1-rand.nextDouble())/(-lambda);
		}
	*/
	}

}

package ch15.list_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		long startTime, endTime;

		startTime = System.nanoTime();	// ns : 10E-9
		for(int i=0; i<10000; i++)
			list1.add(0, String.valueOf(i));	// index 재작업이 이루어진다.
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + " ns");
		// 16.5ms
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++)
			list2.add(0, String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime-startTime) + " ns");
		// 3.8ms
	}

}

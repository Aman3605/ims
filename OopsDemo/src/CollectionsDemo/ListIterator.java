package CollectionsDemo;

import java.util.LinkedList;
import java.util.List;


//Program to traverse list in forward & backward direction
//using ListIterator

public class ListIterator {

	public static void main(String[] args) {
		
		// Create a LinkedList
        LinkedList<String> linkedlist = new LinkedList<String>();
     
        // Add elements to LinkedList
        linkedlist.add("Delhi");
        linkedlist.add("Agra");
        linkedlist.add("Mysore");
        linkedlist.add("Chennai");
        linkedlist.add("Pune");
     
        // Obtaining ListIterator - Traverse in forward/backward direction
        java.util.ListIterator<String> listIt = linkedlist.listIterator();
     
        // Iterating the list in forward direction
        System.out.println("Forward iteration:");
        while(listIt.hasNext()){
           System.out.println(listIt.next());
        }

 

        // Iterating the list in backward direction
        System.out.println("\nBackward iteration:");
        while(listIt.hasPrevious()){
           System.out.println(listIt.previous());
    
    }
        System.out.println("** South Cities **");
        System.out.println("Using subList() Method of List Interface to extract data from List");
        
        List<String> sCities=linkedlist.subList(2, 4);
        System.out.println(sCities);
	}

}
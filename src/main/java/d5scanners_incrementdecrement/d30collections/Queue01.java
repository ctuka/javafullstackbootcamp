package d5scanners_incrementdecrement.d30collections;

import java.util.*;

public class Queue01 {
    public static void main(String[] args)  {
        /*
        Queue<String> storage = new Queue<String>();
        storage.add("Tefo");


        //2) remove() method: removes and returns the item at the front of the queue (head element)
//Throws an exception if the queue is empty
        System.out.println(storage.remove());//Milk
        System.out.println(storage);//[Meat, Egg, Baklava, Kunefe, Fruit]

//3) peek(): returns the item at the front of the queue, returns null if the queue is empty
        System.out.println(storage.peek());//Meat
        System.out.println(storage);//[Meat, Egg, Baklava, Kunefe, Fruit]

//4) clear() method removes all the items in the queue, making it empty

        //5) poll(): removes and returns the item at the front of the queue. Returns null if the queue is empty
        System.out.println(storage.poll());//null

//6) element(): returns the item at the front of the queue, but throws an exception if the queue is empty
// System.out.println(storage.element()); //NoSuchElementException


        //PriorityQueue is gets comparasion object and acccourding to the that comparasion and sort elements int he object according to the
        //that coparasion
        //PriorityQueue is a queue tool that sorts objects accourding to theri priority order in a FIFO structure.
        //Object with highest prioririty always removed first
        */

        PriorityQueue<String> emergencyQueue = new PriorityQueue<>();

        //add elements to a PriorityQueue
        emergencyQueue.add("Mehmet");
        emergencyQueue.add("Mathias");
        emergencyQueue.add("Edin");
        emergencyQueue.add("Micheal");
        emergencyQueue.add("Maria");
        System.out.println(emergencyQueue);

        //Deque (Double-Ended Quesu) is data stracture taht allows adding and removing elements from both ends.
        //Deques can be sorted as FIFO (First in First out) or LIFO (Last in First out)
        //Create a must for social media prifile.
        Deque<String> d = new LinkedList<>();
        d.add("Mehmet");
        d.add("Mathias");
        d.add("Edin");
        d.add("Micheal");
        d.add("Maria");
        System.out.println(d);

        d.addFirst("Tom");
        System.out.println(d);  //[Tom, Mehmet, Mathias, Edin, Micheal, Maria]

        for (String dq : d) {
            System.out.println(dq);
        }

        d.addLast("Hanks");
        System.out.println(d); //[Tom, Mehmet, Mathias, Edin, Micheal, Maria, Hanks]

        d.removeFirst(); //removes the first elemenet from queue
        d.removeLast();  //removes the last elemenet from queue
        System.out.println(d);


        //ArrayDeque (implementing deque interface)
// This structure allows for fast addition and removal of elements at both the beginning and the end.
// ArrayDeque offers higher performance compared to LinkedList because it uses an array-based structure for its contents.
// ArrayDeque is ideal for fast addition/removal operations at both ends.
//ArrayDeque has a dynamic structure
        ArrayDeque<String> adeq = new ArrayDeque<>();


        adeq.addFirst("first");
        System.out.println(adeq);

        adeq.addLast("last");
        System.out.println(adeq);
        String removedL = adeq.removeLast();
        System.out.println(removedL);
        System.out.println(adeq);

    }


}

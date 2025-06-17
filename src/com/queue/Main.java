// Java PriorityQueue
package com.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating comparator
        Comparator<Integer> comparator = new MyComparator();

        // Creating PriorityQueue
        PriorityQueue<Integer> queue = new PriorityQueue<>(20, comparator);

        // Adding elements to PriorityQueue
        queue.add(1);
        queue.add(3);
        queue.add(7);
        queue.add(2);
        queue.add(8);
        queue.add(9);

        // Printing elements of queue to console
        System.out.println(queue);

        // Printing head of PriorityQueue without deletion
        System.out.println(queue.peek());

        // Printing elements of queue to console
        System.out.println(queue);

        // Printing head of PriorityQueue with deleting it
        System.out.println(queue.poll());

        // Printing elements of queue to console
        System.out.println(queue); // Element 1 is no longer there

        // Adding element 1 back
        queue.add(1);

        // Printing elements of queue to console
        System.out.println(queue);
    }

    // MyComparator class
    static class MyComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer number1, Integer number2) {
            if (number1 < number2) {
                return -1;
            } else if (number1 > number2 ) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
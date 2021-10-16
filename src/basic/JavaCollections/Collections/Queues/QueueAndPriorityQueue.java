package src.basic.JavaCollections.Collections.Queues;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Java Queue interface orders the element in FIFO(First In First Out) manner.
 * n FIFO, first element is removed first and last element is removed at last.
 */

public class QueueAndPriorityQueue {
    public static void main(String[] args) {
        Queue<String> qList = new PriorityQueue<>();
        qList.add("Feel");
        qList.add("Good");
        qList.add("Music");
//        qList.add(null);
        System.out.println(qList);
        System.out.println(qList.size());
        System.out.println(qList.peek());// without del
        System.out.println(qList.poll());// with del
        System.out.println(qList);
        System.out.println(qList.size());
    }
}

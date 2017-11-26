import java.util.Scanner;
import java.util.*;

/**
 * Created by nimal on 11/16/2017.
 */
public class Queue {
    public int[] queue;
    public int front,rear,size,len;

    Queue(int n){
        size= n;
        rear= -1;
        front= -1;
        len= 0;
        queue= new int[size];

    }


    public void displayQueueFields(){
        System.out.println("size-->"+size+" rear-->"+rear+"  front-->"+front+"  len-->"+len);

    }

    public boolean isEmpty(){
        return front==-1;
    }
    public boolean isFull(){
        return front== 0 && rear==size -1;
    }
    public int getSize(){ return len;    }
    public int peek(){
        if(isEmpty())
            throw new NoSuchElementException("underflow ");
        return queue[front];
    }


    public void insert(int i){
        if(rear== -1){
            rear= 0;
            front=0;
            queue[rear]= i;
            len=1;
        }
        else if (rear+1< size) {
            queue[++rear]= i;
            len++;
        }
        else if (rear+1>= size) {
            throw new IndexOutOfBoundsException("Overflow exception");
        }

    }
    public int remove(){
        if (isEmpty()) {
            throw new NoSuchElementException("underflow exception");

        }
        else{
            len--;
            int ele= queue[front];
            if (front == rear) {
                front= -1;
                rear= -1;
            }
            else{
                front++;

            }
            return ele;
        }
    }
    public void displayQueue(){
        System.out.println("Queue");
        if (len== 0) {
            System.out.println("Empty");
            return;
        }
        for (int i=front;i<=rear ;i++ ) {
            System.out.println(queue[i]+" ");
            System.out.println();

        }
    }


}

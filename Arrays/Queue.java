import java.util.Scanner;

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

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length of array");
        int n= sc.nextInt();
        Queue objQueue= new Queue(n);
        objQueue.displayQueueFields();
    }
    public boolean isEmpty(){
        return front==-1;
    }
    public boolean isFull(){
        return front== 0 && rear==size -1;
    }

}

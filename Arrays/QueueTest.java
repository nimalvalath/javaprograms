import java.util.Scanner;
class QueueTest{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length of array");
        int n= sc.nextInt();
        Queue objQueue= new Queue(n);
        objQueue.displayQueueFields();
        //objQueue.remove(); this will cause- underflow
        objQueue.insert(10);
        objQueue.insert(11);
        objQueue.insert(12);
        objQueue.insert(13);
        objQueue.insert(14);
        objQueue.insert(15);
        objQueue.insert(16);
        objQueue.insert(17);
        objQueue.insert(18);
        objQueue.insert(19);
        //objQueue.insert(20);this will cause- overflow 
        objQueue.displayQueue();
        objQueue.remove();
        objQueue.displayQueue();
        objQueue.remove();
        objQueue.displayQueue();
        objQueue.remove();
        objQueue.displayQueue();
        objQueue.remove();
        objQueue.displayQueue();
        objQueue.remove();
        objQueue.displayQueue();
        objQueue.remove();
        objQueue.displayQueue();
        objQueue.remove();
        objQueue.displayQueue();
        objQueue.remove();
        objQueue.displayQueue();
        objQueue.remove();
        objQueue.displayQueue();
        objQueue.remove(); 
        objQueue.displayQueue();
        //objQueue.remove();
        //above will cause- underflow
        //after printing Empty

        objQueue.insert(10);
        objQueue.displayQueue();
        
    }
}
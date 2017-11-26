import java.util.Scanner;
class QueueTest{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length of array");
        int n= sc.nextInt();
        Queue objQueue= new Queue(n);
        objQueue.displayQueueFields();
        //objQueue.remove(); this will cause- underflow
        System.out.println("insertion begin");
        objQueue.insert(10);
        System.out.println("insertion value=11");
        objQueue.insert(11);
        System.out.println("insertion value=12");
        objQueue.insert(12);
        System.out.println("insertion value=13");
        objQueue.insert(13);
        System.out.println("insertion value=14");
        objQueue.insert(14);
        System.out.println("insertion value=15");
        objQueue.insert(15);
        System.out.println("insertuin value=16");
        objQueue.insert(16);
        System.out.println("insertion value=17");
        objQueue.insert(17);
        System.out.println("insertion value=18");
        objQueue.insert(18);
        System.out.println("insertion value=19");
        objQueue.insert(19);
        //objQueue.insert(20);this will cause- overflow 
        objQueue.displayQueue();
        System.out.println("Remove operation Begin");
        objQueue.remove();
        objQueue.displayQueue();
        System.out.println("Remove operation 2nd time");
        objQueue.remove();
        objQueue.displayQueue();
        System.out.println("Remove operation 3nd time");
        objQueue.remove();
        objQueue.displayQueue();
        System.out.println("Remove operation 4nd time");
        objQueue.remove();
        objQueue.displayQueue();
        System.out.println("Remove operation 5nd time");
        objQueue.remove();
        objQueue.displayQueue();
        System.out.println("Remove operation 6nd time");
        objQueue.remove();
        objQueue.displayQueue();
        System.out.println("Remove operation 7nd time");
        objQueue.remove();
        objQueue.displayQueue();
        System.out.println("Remove operation 8nd time");
        objQueue.remove();
        objQueue.displayQueue();
        System.out.println("Remove operation 9nd time");
        objQueue.remove();
        objQueue.displayQueue();
        System.out.println("Remove operation 10nd time");
        objQueue.remove(); 
        objQueue.displayQueue();
        //objQueue.remove();
        //above will cause- underflow
        //after printing Empty

        objQueue.insert(10);
        objQueue.displayQueue();
        
    }
}
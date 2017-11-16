import java.util.*;
public class Stack{
	int len,size,rear,front;
	int[] stack;
	Stack(int n){
		size=n;
		stack= new int[size];
		len=0;
		front=-1;
		rear=-1;
	}
	public void  displayStackInitialConfiguration(){
		System.out.println("size-->"+size+" len-->"+len+" front-->"+front+" rear-->"+rear);
	}
	public boolean isEmpty(){
		return (rear==-1);

	}
	public boolean isFull(){
		return (rear==size-1 && front==0);
	}
	public void insert(int n){
		if (isFull()) {
			return ;
		}
		else{
			if(front==-1 && rear== -1){
				front=0;
				rear=0;
				stack[rear]=n;
				len=1;
			}
			else if(rear<size-1){
				stack[++rear]=n;
				len++;	
			}
			else if(rear>=size-1){
				throw new IndexOutOfBoundsException("Overflow exception");
			}

		}
		
	}
	public int remove(){
		if(isEmpty()){
			throw new NoSuchElementException("underflow ");
		}
		else{
			len--;
			int ele=stack[rear];
			if(front==rear){
				front=-1;
				rear=-1;
			}
			else{
			rear--;	
			}
			return ele;
			
		}

	}
	 public void displayStack(){
        System.out.println("Stack");
        if (len== 0) {
            System.out.println("Empty");
            return;
        }
        for (int i=rear;i>=front ;i-- ) {
            System.out.println(stack[i]+" ");
            System.out.println();

        }
    }
	
}
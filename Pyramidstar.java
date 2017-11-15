import java.util.Scanner;
class PyramidStar{
	public static void main(String[] args) {
		//incomplete
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height of triangle: ");
		int height=sc.nextInt();
		System.out.println("    *     ");
		System.out.println("   **    ");
		System.out.println("  ***   ");
		System.out.println(" ****  ");
		System.out.println("*****");
		printPyramidStar1(height);
		System.out.println();
		System.out.println("    *     ");
		System.out.println("   * *    ");
		System.out.println("  * * *   ");
		System.out.println(" * * * *  ");
		System.out.println("* * * * *");
		System.out.println();
		printPyramidStar2(height);
		System.out.println();
		System.out.println("    *     ");
		System.out.println("   * *    ");
		System.out.println("  *   *   ");
		System.out.println(" *     *  ");
		System.out.println("* * * * *");
		System.out.println();
		printEmptyPyramid(4);
		System.out.println();
		System.out.println("    1     ");
		System.out.println("   2 2    ");
		System.out.println("  3 3 3   ");
		System.out.println(" 4 4 4 4  ");
		//System.out.println("* * * * *");
		System.out.println();
		printEmptyNumberPyramid1(4);
		System.out.println();
		System.out.println("    1");
		System.out.println("   121");
		System.out.println("  12321");
		System.out.println(" 1234321");
		printEmptyNumberPyramid2(4);
		System.out.println();
		System.out.println("3 3 3 3");
		System.out.println(" 2   2 ");
		System.out.println("   1   ");
		System.out.println();
		printInverseNumberPyramid();
		System.out.println();
		System.out.println("end of program");
	}

	public static void printPyramidStar1(int height){
		for(int i=1;i<=height;i++){
			for(int j=1;j<=height-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public static void printPyramidStar2(int height){
		for(int i=1;i<=height;i++){
			for(int j=1;j<=height-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}	
	
	public static void printEmptyPyramid(int height){
	
		for(int i=1;i<=height;i++){
					
				for(int j=1;j<(height*2);j++){
				if(j+i==5||j-i==3||height==i){	
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		
		}
	
	}
	public static void printEmptyNumberPyramid1(int height){
	
		for(int i=1;i<=height;i++){
					
				for(int j=1;j<(height*2);j++){
				if(i+j==3){
					System.out.print(" ");
				}	
				else if(j+i==5||j-i==3||j-i==1||(i==4&&j==3)){
					//if(i!=1&&j!=2||i==4&&j==3)		
					System.out.print(i);
				}
				else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		
		}
	
	}
	
	public static void printEmptyNumberPyramid2(int height){
	
		for(int i=1;i<=height;i++){
					
		
		for(int j=1;j<=height-i;j++){

			System.out.print(" ");
		}
		//System.out.println("hai");
		int counter=1;
			while(counter<=i){
				System.out.print(counter);
				counter++;
			}
		int counter2=i;
			while(counter2>0){
				if(counter2==1){
				System.out.print(" ");
				}
				else{
					System.out.print(counter2-1);

				}
				counter2--;
			}	
		System.out.println();
		}


				
	}

	public static void printInverseNumberPyramid(){

		for(int i=1;i<=3;i++){
			
			for(int j=1;j<=7;j++){
				if(i==1 && (j%2!=0)){
					System.out.print("3");
				}
				else if((i==2 && j==2) || (i==2 && j==6)){
					System.out.print("2");
				}
				else if((i==3 && j== 4)){
					System.out.print("1");
				}
				else{
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}




}
//its not java.utils.Scanner;
//or java.Util.scanner;
//or java.Util.Scanner odnt miss semi colon ";"

import java.util.Scanner;
class SumOf2Nums{
	static Scanner reader=new Scanner(System.in);
	//Scanner reader=new Scanner(System.in);
	//donot forget System.in part
	//
	public static void main(String[] args) {
		System.out.print("enter first number: ");
		int number1=reader.nextInt();
		System.out.print("enter second number: ");
		int number2=reader.nextInt();
/*boolean nextBoolean()
Scans the next token of the input into a boolean value and returns that value.
byte	nextByte()
Scans the next token of the input as a byte.
byte	nextByte(int radix)
Scans the next token of the input as a byte.
double	nextDouble()
Scans the next token of the input as a double.
float	nextFloat()
Scans the next token of the input as a float.
int	nextInt()
Scans the next token of the input as an int.
int	nextInt(int radix)
Scans the next token of the input as an int.
String	nextLine()
Advances this scanner past the current line and returns the input that was skipped.
long	nextLong()
Scans the next token of the input as a long.
long	nextLong(int radix)
Scans the next token of the input as a long.
short	nextShort()
Scans the next token of the input as a short.
short	nextShort(int radix)
Scans the next token of the input as a short.
*/

		System.out.println	("The sum is: "+(number1+number2));

	}
	
}
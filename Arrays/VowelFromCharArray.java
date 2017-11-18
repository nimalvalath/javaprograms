
public class VowelFromCharArray{
	public static void main(String[] args) {
		char[] charArray={'a','b','c','d','e','f','g','h','i','j','k'};
		int[] vowels={97,101,105,111,117,65,69,73,79,85};
		
		int countVowel=getVowelsCountsFromArray(charArray);
		System.out.println(countVowel);
	}
	public static void countVowels(char[] array){
		int count=0;
		for(int i=0;i<array.length;i++){
			if(array[i]!='0'){
				count++;
			}
		}
		System.out.println("count of vowels-->"+count);
	}
	
	public static int getVowelsCountsFromArray(char[] arr){
		
		int count=0;
		for(int i=0;i<arr.length;i++){
			//System.out.println(temp[i]);
			if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O'|| arr[i] == 'U'){
				count++;	
							
			}
		}

		return count;
	}

}
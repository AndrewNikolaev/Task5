package palindrom;
import java.util.Scanner;

public class poli {
	public static void main (String arg[]) {
		Scanner input = new Scanner (System.in);
		System.out.println("write any string and press Enter");
		String num = input.nextLine();
		char[] simbol = num.toCharArray(); 
        System.out.println(istPalindrom(simbol));
	}
	public static boolean istPalindrom(char[] num){
	        boolean palindrom = false;
	        if(num.length%2 == 0){
	            for(int i = 0; i < num.length/2-1; i++){
	                if(num[i] != num[num.length-i-1]){
	                    return false;
	                }else{
	                    palindrom = true;
	                }
	            }
	        }else{
	            for(int i = 0; i < (num.length-1)/2-1; i++){
	                if(num[i] != num[num.length-i-1]){
	                    return false;
	                }else{
	                    palindrom = true;
	                }
	            }
	        }
	        return palindrom;
	}
}



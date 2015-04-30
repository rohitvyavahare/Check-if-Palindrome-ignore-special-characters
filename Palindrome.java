
public class Palindrome {
	
	
	public static boolean CheckPalindrome(String check){
		int first =0;
		int last = check.length()-1;
		
		while(first < last-1){
			
			if(!(Character.isLetter(check.charAt(first)))){
				first ++;
			}
			else if(!(Character.isLetter(check.charAt(last)))){
				last --;
			}			
			else if(! (Character.toLowerCase(check.charAt(first))  == (Character.toLowerCase(check.charAt(last))) ) ){
				return false;
			}
			else{
				first++;
				last--;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args){
				
		String check = "Red rum, sir, is murder";				
		System.out.println(CheckPalindrome(check));
		
	}
	
	

}

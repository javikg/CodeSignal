
public class TheJourneyBegins {
	
	/*1*/
	int add(int param1, int param2) {
		return param1+param2;
		}
	
	/*2*/
	
	int centuryFromYear(int year) {
	    if(year%100==0) return year/100;
	    else return year/100+1;
	}
	
	
	/*3*/
	
	boolean checkPalindrome(String inputString) {
	    String reversedString = new StringBuffer(inputString).reverse().toString();
	    if (inputString.equals(reversedString)) {
	        return true;
	    } else {
	        return false;
	    }
	}
}

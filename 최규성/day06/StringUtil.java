package day06Hw;

//import java.util.Scanner;

public class StringUtil {

	/*1. 하나의 문자를 입력받아 해당 문자가 대문자이면 true 를 반환하는 isUpperChar( char c )
	메소드를 작성하시오*/
	boolean isUpperChar(char c) {
		if(c >= 'A' && c<= 'Z') {
			return true;
		} else {
			return false;
		}
	}
/*	2. 하나의 문자를 입력받아 해당 문자가 소문자이면 true를 반환하는 isLowerChar(char c) 메
	소드를 작성하시오*/	
	boolean isLowerChar(char c) {
		if(c >= 'a' && c<= 'z') {
			return true;
		} else {
		return false;
		}
	}
//	3. 두개의 숫자를 입력받아 큰수를 반환하는 max( int i, int j) 메소드를 작성하시오
	int max(int i ,int j) {
		if(i > j) {
			return i;
		} else {
			return j;
		}
	}
// 	4. 3번 반대
	int min(int i ,int j) {
		if(i < j) {
			return i;
		} else {
			return j;
		}
	}
//5. 문자열을 입력받아 거꾸로 변경하는 reverseString( String str ) 메소드를 작성하시오
	String reverseString(String str) {
		char[] chars = new char[str.length()];
		
		for(int i =str.length()-1 , j = 0; i>=0; i--) {
			chars[j++] = str.charAt(i);
		}
		String s = new String(chars);
		return s;
	}
//6. 문자열을 입력받아 대문자로 변경하는 toUpperString( String str ) 메소드를 작성하시오
	String toUpperString(String str) {
		String changeStr = "";
		 for(int i = 0; i<str.length(); i++) {
			 char c = str.charAt(i);
			if(isLowerChar(str.charAt(i))) {
				c =(char)(c -('a' -'A'));
			} 
			changeStr = changeStr + c;
		 }
		 return changeStr;
	}
	
	
	
//7. 문자열을 입력받아 소문자로 변경하는 toLowerString( String str ) 메소드를 작성하시오
	
	String toLowerString(String str) {
		String changeStr = "";
		 for(int i = 0; i<str.length(); i++) {
			 char c = str.charAt(i);
			if(isUpperChar(str.charAt(i))) {
				c =(char)(c +('a' -'A'));
			} 
			changeStr = changeStr + c;
		 }
		 return changeStr;
	}
}

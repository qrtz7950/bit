package kr.co.mlec.homework.homework05;
/**
 * 스트링도구모음
 * @author 도트박이
 *
 */
public class StringUtil {
	
	/**
	 * 해당 문자의 대문자 확인 메소드
	 * @param char
	 * @return boolean
	 */
	boolean isUpperChar(char c) {
		boolean bool;
		int a = (int)c;
		bool = (a>='A' && a<='Z');
		
		return bool;
	}
	
	/**
	 * 해당 문자의 소문자 확인 메소드
	 * @param char
	 * @return boolean
	 */
	boolean isLowerChar(char c) {
		boolean bool;
		int a = (int)c;
		bool = (a>='a' && a<='z');
		
		return bool;
	}
	
	/**
	 * 두 수 중 큰수 반환
	 * @param int
	 * @param int
	 * @return int
	 */
	int max(int a, int b) {
		int max = a>b ? a : b;
		return max;
	}
	
	/**
	 * 두 수 중 작은수 반환
	 * @param int
	 * @param int
	 * @return int
	 */
	int min(int a, int b) {
		int min = a<b ? a : b;
		return min;
	}
	
	/**
	 * 문자열 거꾸로 만들어서 반환하는 쓸데없는 메소드
	 * @param String
	 * @return String
	 */
	String reverseString(String str) {
		
		String rts = new String();	
		
		char[] c = new char[str.length()];
		c = stringToChar(str);
			
		for(int i = str.length()-1; i>=0; i--) {
			rts += c[i];
		}
		return rts;
	}
	
	/**
	 * 문자열 모두 대문자로!!
	 * @param String
	 * @return String
	 */
	String toUpperString(String str) {
		
		String strA = new String();
		
		char[] c = new char[str.length()];
		c = stringToChar(str);
		
		for(int i=0; i<str.length(); i++) {
			if(c[i]>='a' && c[i]<='z') {
				c[i] = (char)(c[i]-('a'-'A'));
			}
			strA += c[i];
		}
		
		
		return strA;
	}
	
	/**
	 * 문자열 모두 소문자로!!
	 * @param String
	 * @return String
	 */
	String toLowerString(String str) {
			
			String stra = new String();
			
			char[] c = new char[str.length()];
			c = stringToChar(str);
			
			for(int i=0; i<str.length(); i++) {
				if(c[i]>='A' && c[i]<='Z') {
					c[i] = (char)(c[i]+('a'-'A'));
				}
				stra += c[i];
			}
			
			
			return stra;
		}
	
	/**
	 * 귀찮아서 만든 문자열 배열변환 메소드
	 * @param String
	 * @return char[]
	 */
	char[] stringToChar(String str) {
		
		char[] c = new char[str.length()];
		str.getChars(0, str.length(), c, 0);
		
		return c;
	}
}

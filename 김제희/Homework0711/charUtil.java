package kr.co.Homework0711;

public class charUtil {
	
	public static int checkChar(String strData, char ch) {
		
		int n=0;
		
		for(int i = 0; i<=strData.length(); i++) {
			if(strData.indexOf(ch,i) != -1) {
				n++;
				i=strData.indexOf(ch,i);
			}
		}
		
		return n;		
	}
	
	public static String removeChar(String strData, char ch) {
		
		String strRemove ="";
		char [] strArr = new char[strData.length()];
		strData.getChars(0, strData.length(), strArr, 0);
		
		for(int i=0; i<strData.length(); i++) {
			if(strArr[i] != ch) {
				strRemove += strArr[i];
			}
		}
				
		return strRemove;
	}
	
	
}

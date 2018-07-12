package day07Hw;

public class ControlString {

	public static int checkChar(String strData, char ch) {

		int cnt = 0;

		for (int i = strData.length(); i >= 0; i--) {
			i = strData.lastIndexOf(ch, i);
			if (i != -1) {
				cnt++;
			}
		}

		return cnt;
	}

	/**
	 * 입력된 문자열에 입력된 문자와 같은 문자를 뺀 문자열을 반환하는 메소드
	 */
	public static String removeChar(String oriStr, char delChar) {

		String str = "";
		char[] cs = new char[oriStr.length()];
		oriStr.getChars(0, oriStr.length(), cs, 0);

		for (int i = 0; i < oriStr.length(); i++) {
			if (cs[i] != delChar) {
				str += cs[i];
			}
		}

		return str;
	}
}

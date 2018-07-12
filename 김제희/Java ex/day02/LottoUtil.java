package kr.co.mlec.day02;
import java.util.Random;

/**
 * 로또와 관련된 편리한 기능을 제공하는 클래스
 * @author 김제희
 */

public class LottoUtil {
	/**
	 * 오늘의 로또확률을 제공합니다
	 * 오늘의 로또확률(0-100%)
	 * @return
	 */
		public static int todayprobaillty() {
			return new Random().nextInt(100) +1;
	}

}

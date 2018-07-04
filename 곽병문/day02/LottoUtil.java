package kr.co.mlec.day02;

import java.util.Random;

/**
 * 로또와 관련된 편리한 기능을 제공하는 클래스
 * @author BeeMil
 *
 */

public class LottoUtil {
	/**
	 * 오늘의 로또확률을 제공
	 * @return 오늘의 로또확률 (0~100%사이)
	 */
	public static int todayProbability() {
		return new Random().nextInt(100) + 1;
	}

}

package day04;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ArrayMain04 {

	public static void main(String[] args) {

		int[] nums = { 10, 20, 30, 40, 50 };
		int[] nums2 = new int[nums.length]; //nums를 복사하려함
		
		/*for(int i = 0; i <nums.length; i++) {
			nums2[i] = nums[i];
		}
		
		nums[0] = 100;	//nums의 값을 바꿔도 nums2의 0번지값이 변하지 않음(깊은 복사)
		*/
		
		System.arraycopy(nums, 0, nums2, 2, 2);//(원본배열, 시작위치, 복사할배열명, 시작위치, 복사할개수)
											//nums의 0번지값을 nums2의 2번지부터 몇개 복사할지 씀
											//출력결과 [0, 0, 10, 20, 0]
		
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(nums2));
	}
}

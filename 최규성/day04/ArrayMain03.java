package day04;

import java.util.Arrays;

public class ArrayMain03 {

	public static void main(String[] args) {

		// 10, 20, 30, 40, 50 을 가지는 배열생성
		// int[] arr = {10,20,30,40,50};
		int[] arr = new int[] { 10, 20, 30, 40, 50 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// 위의 arr을 100,200,300,400,500,600,700을 갖는 배열 선언으로 변경하려함
		// arr={100,200,300,400,500,600,700}; //에러남
		/*arr = new int[7];
		for (int j = 0; j <= arr.length; j++) {
			arr[j] = j * 100;
		}
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}*/
		String[] strArr = new String[3];

		System.out.println("1.5 버전의 for문을 이용한 출력(for-each문)");
		for (String str : strArr) {
			System.out.print(str); // 출력결과 nullnullnull
		}
		System.out.println();
		System.out.println("Arrays.toString()을 이용한 출력");
		System.out.println(Arrays.toString(strArr)); // 출력결과 [null, null, null]

	}

}

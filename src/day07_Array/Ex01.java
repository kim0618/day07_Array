package day07_Array;

public class Ex01 {
	public static void main(String[] args) {
		
		/*
		 배열
		 - 같은 자료형으로 여러개의 공간을 만들어 사용하는 것
		 - 자료형 [] 변수명(배열명)
		 - 자료형 배열명()변수명 []
		 -  index(첨자) : 0번째 부터 시작
		 */
		int[] arr = new int[5];		//배열의 기본 형태 arr = 배열이름, new int[5] 는 5개의 공간
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
		arr[4]=500;
		
		System.out.println("arr 0 : "+arr[0]);
		System.out.println("arr 0 : "+arr[1]);
		System.out.println("arr 0 : "+arr[2]);
		System.out.println("arr 0 : "+arr[3]);
		System.out.println("arr 0 : "+arr[4]);
		
		System.out.println(arr.length);
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = (i+1) * 100;
			System.out.println(arr[i]);
		}
		
		//int arr01 [] = new int[] {10,20,30,40,50};
		int arr01 [] = {10,20,30,40,50};
		for(int i =0; i<arr01.length;i++) {
			System.out.println(arr01[i]);
		}
		
		
		
		
		
		
		
	}
}

package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04_List {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		int num;
		String addNum, printNum;
		
		// 자료형에서 소문자에서 .을 찍으면 아무것도 안나오는데
		// 대문자가 있는것은 뭔가 많이 나옴
		
		System.out.println("만들 공간의 개수 입력 : ");
		num = input.nextInt();
		for(int i=0; i<num; i++) {
			System.out.println("추가할 수 입력 : ");
			addNum=input.next();
			arr.add(addNum);
		}
		System.out.println("---- 저장 값 출력 ----");
		for(int i=0; i<arr.size(); i++) {
			Object obj = arr.get(i);
			System.out.println(arr.get(i));
			
			String ss= (String)obj;
			System.out.println(ss);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

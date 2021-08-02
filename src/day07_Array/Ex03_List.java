package day07_Array;

import java.util.ArrayList;

public class Ex03_List {
	public static void main(String[] args) {
		
		/*
		 List
		 - ArrayList
		 - LinkedList
		 - Stack...등이 있다.
		 ArrayList
		 - 데이터에 대한 순서가 있다. index로 접근 가능하다
		 - 중복된 데이터를 저장할 수 있다.
		 - 배열과는 다르게 서로 다른 자료형도 넣을 수 있다.	
		 - 가변의 크기를 갖는다. 
		 */
		ArrayList arr = new ArrayList();
		
		arr.add("123");
		arr.add("456");
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		
		System.out.println(arr.size());
		//arr에 몇개의 공간이 할당되었는지
				
		System.out.println(arr.contains("123"));
		
		//arr에 그 값이 있는 없는지 알아보는 것
		System.out.println(arr.remove("123"));
		//arr에 "123"이 할당된 값을 지워라
		System.out.println(arr);
		System.out.println(arr.get(0));
		//remove로 "123"을 지웟으니 0번째엿던 값이 없어지고 1번째 값이 0번째 값으로 옭겨짐

		arr.clear();
		// 저장된 공간 모두 삭제
		System.out.println("삭제 후 arr : "+arr);
		
		
		
	}
}

package day07_Array;

import java.util.ArrayList;

public class Ex03_List {
	public static void main(String[] args) {
		
		/*
		 List
		 - ArrayList
		 - LinkedList
		 - Stack...���� �ִ�.
		 ArrayList
		 - �����Ϳ� ���� ������ �ִ�. index�� ���� �����ϴ�
		 - �ߺ��� �����͸� ������ �� �ִ�.
		 - �迭���� �ٸ��� ���� �ٸ� �ڷ����� ���� �� �ִ�.	
		 - ������ ũ�⸦ ���´�. 
		 */
		ArrayList arr = new ArrayList();
		
		arr.add("123");
		arr.add("456");
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		
		System.out.println(arr.size());
		//arr�� ��� ������ �Ҵ�Ǿ�����
				
		System.out.println(arr.contains("123"));
		
		//arr�� �� ���� �ִ� ������ �˾ƺ��� ��
		System.out.println(arr.remove("123"));
		//arr�� "123"�� �Ҵ�� ���� ������
		System.out.println(arr);
		System.out.println(arr.get(0));
		//remove�� "123"�� ���m���� 0��°���� ���� �������� 1��° ���� 0��° ������ �İ���

		arr.clear();
		// ����� ���� ��� ����
		System.out.println("���� �� arr : "+arr);
		
		
		
	}
}

package day07_Array;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*	String name[] = new String[3];
			
			
			for(int i=0; i<name.length; i++) {
				System.out.println(i+1+"��° �̸� �Է� : ");
				name[i] = input.next();
			}
			for(int i=0; i<name.length; i++) {
				System.out.println(i+1+"��° �̸� �Է� : "+name[i]);
			}*/
			
			
		/*	int arr[] = new int[] {10,54,13,17,25,30};
			
			for(int i =0; i<arr.length;i++) {
				if(arr[i]%2 ==0) {
				System.out.println("¦�� : "+arr[i]);
			}else {
				System.out.println("Ȧ�� : "+arr[i]);
			}
			*/
		
			
			int arr[] = new int[] {10,54,13,17,25,30};
			String odd_even=null;
			int i=0;
			System.out.print("¦��,Ȧ�� �Է� : ");
			odd_even=input.next();
			
				if(odd_even.equals("¦��")) {
					for(int j =0; j<arr.length;j++) {
						if(arr[j]%2 ==0) {
						System.out.println(odd_even+":"+arr[j]);
					}
				}
					}
				else {
					for(int j =0; j<arr.length;j++) {
						if(arr[j]%2 ==1) {
						System.out.println(odd_even+":"+arr[j]);
					}
					}
				}
	}
}

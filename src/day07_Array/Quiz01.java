package day07_Array;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*	String name[] = new String[3];
			
			
			for(int i=0; i<name.length; i++) {
				System.out.println(i+1+"¹øÂ° ÀÌ¸§ ÀÔ·Â : ");
				name[i] = input.next();
			}
			for(int i=0; i<name.length; i++) {
				System.out.println(i+1+"¹øÂ° ÀÌ¸§ ÀÔ·Â : "+name[i]);
			}*/
			
			
		/*	int arr[] = new int[] {10,54,13,17,25,30};
			
			for(int i =0; i<arr.length;i++) {
				if(arr[i]%2 ==0) {
				System.out.println("Â¦¼ö : "+arr[i]);
			}else {
				System.out.println("È¦¼ö : "+arr[i]);
			}
			*/
		
			
			int arr[] = new int[] {10,54,13,17,25,30};
			String odd_even=null;
			int i=0;
			System.out.print("Â¦¼ö,È¦¼ö ÀÔ·Â : ");
			odd_even=input.next();
			
				if(odd_even.equals("Â¦¼ö")) {
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

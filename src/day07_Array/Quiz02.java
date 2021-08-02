package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	/*	String n,p;
		int n1=0;
		ArrayList name = new ArrayList();
		ArrayList phone = new ArrayList();
		while(true) {
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.종료");
			System.out.print(">>> ");
			n1 = input.nextInt();
			if(n1 == 5) {
				System.out.println("프로그램 종료 ~ !");
				break;
			}
			switch(n1) {
			case 1:
				System.out.println("이름 입력 : ");
				n=input.next();
				if(name.indexOf(n) == -1) {
					System.out.println("연락처 입력 : ");
					p=input.next();
					name.add(n);
					phone.add(p);
				}else {
					System.out.println("이미 존재합니다.");
				}break;
			case 2:
				System.out.println("찾을 이름 입력 : ");
				n = input.next();
				if(name.indexOf(n) == -1) {
					System.out.println(n+"님은 목록에 없습니다.");
				}else {
					System.out.println(name.get(name.indexOf(n))+" : "+phone.get(name.indexOf(n)));
				}
				break;
			case 3:
				System.out.println("삭제할 연락처 이름 : ");
				n=input.next();
				if(name.indexOf(n) == -1) {
					System.out.println("삭제할 이름이 존재하지 않습니다.");
				}else {
					System.out.print(name.remove(name.indexOf(n))+":");
					System.out.println(phone.remove(name.indexOf(n)));
				}break;
			case 4:
				for(int i=0;i<name.size();i++) {
				System.out.println(name.get(i)+":"+phone.get(i));
				}
				break;
			}
			System.out.println("");
		}*/
		
		String n,p;
		int n1=0;
		ArrayList name = new ArrayList();
		ArrayList phone = new ArrayList();
		
		while(true) {
		System.out.println("1. 연락처 등록");
		System.out.println("2. 연락처 보기");
		System.out.println("3. 연락처 삭제");
		System.out.println("4. 모든 연락처 보기");
		System.out.println("5. 종료");
		System.out.println(">>> ");
		n1=input.nextInt();
		if(n1 == 5) {
			System.out.println("시스템 종료합니다 ~");
			break;
		}
		switch(n1) {
			case 1:
				System.out.println("이름 입력 : ");
				n = input.next();
				if(name.indexOf(n) == -1) {
					System.out.println("연락처 입력 : ");
					p = input.next();
					name.add(n);
					phone.add(p);
				}else {
					System.out.println("이름이 존재 합니다.");
			}break;
			case 2:
				System.out.println("찾을 이름 입력 : ");
				n = input.next();
				if(name.indexOf(n)== -1) {
					System.out.println(n+"님은 연락처가 없습니다.");
				}else {
					System.out.println(name.get(name.indexOf(n))+" : "+phone.get(name.indexOf(n)));
				}break;
			case 3:
				System.out.println("삭제할 이름 : ");
				n=input.next();
				if(name.indexOf(n)== -1) {
					System.out.println("삭제할 이름이 존재하지 않습니다.");
				}else {
					System.out.print(name.remove(name.indexOf(n))+" : ");
					System.out.println(phone.remove(name.indexOf(n))+"삭제");
				}break;
			case 4:
				for(int i = 0; i<name.size();i++) {
					System.out.println(name.get(i)+ " : "+phone.get(i));
				}
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

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
			System.out.println("1.����ó ���");
			System.out.println("2.����ó ����");
			System.out.println("3.����ó ����");
			System.out.println("4.��� ����ó ����");
			System.out.println("5.����");
			System.out.print(">>> ");
			n1 = input.nextInt();
			if(n1 == 5) {
				System.out.println("���α׷� ���� ~ !");
				break;
			}
			switch(n1) {
			case 1:
				System.out.println("�̸� �Է� : ");
				n=input.next();
				if(name.indexOf(n) == -1) {
					System.out.println("����ó �Է� : ");
					p=input.next();
					name.add(n);
					phone.add(p);
				}else {
					System.out.println("�̹� �����մϴ�.");
				}break;
			case 2:
				System.out.println("ã�� �̸� �Է� : ");
				n = input.next();
				if(name.indexOf(n) == -1) {
					System.out.println(n+"���� ��Ͽ� �����ϴ�.");
				}else {
					System.out.println(name.get(name.indexOf(n))+" : "+phone.get(name.indexOf(n)));
				}
				break;
			case 3:
				System.out.println("������ ����ó �̸� : ");
				n=input.next();
				if(name.indexOf(n) == -1) {
					System.out.println("������ �̸��� �������� �ʽ��ϴ�.");
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
		System.out.println("1. ����ó ���");
		System.out.println("2. ����ó ����");
		System.out.println("3. ����ó ����");
		System.out.println("4. ��� ����ó ����");
		System.out.println("5. ����");
		System.out.println(">>> ");
		n1=input.nextInt();
		if(n1 == 5) {
			System.out.println("�ý��� �����մϴ� ~");
			break;
		}
		switch(n1) {
			case 1:
				System.out.println("�̸� �Է� : ");
				n = input.next();
				if(name.indexOf(n) == -1) {
					System.out.println("����ó �Է� : ");
					p = input.next();
					name.add(n);
					phone.add(p);
				}else {
					System.out.println("�̸��� ���� �մϴ�.");
			}break;
			case 2:
				System.out.println("ã�� �̸� �Է� : ");
				n = input.next();
				if(name.indexOf(n)== -1) {
					System.out.println(n+"���� ����ó�� �����ϴ�.");
				}else {
					System.out.println(name.get(name.indexOf(n))+" : "+phone.get(name.indexOf(n)));
				}break;
			case 3:
				System.out.println("������ �̸� : ");
				n=input.next();
				if(name.indexOf(n)== -1) {
					System.out.println("������ �̸��� �������� �ʽ��ϴ�.");
				}else {
					System.out.print(name.remove(name.indexOf(n))+" : ");
					System.out.println(phone.remove(name.indexOf(n))+"����");
				}break;
			case 4:
				for(int i = 0; i<name.size();i++) {
					System.out.println(name.get(i)+ " : "+phone.get(i));
				}
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

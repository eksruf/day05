package day05;

import java.util.Scanner;

public class Quiz03 {
public static void main(String[] args) {
	
	String id="",pw="", id1="", pw1="";
	for(;;) {
	System.out.println("1.�α���");
	System.out.println("2.ȸ������");
	System.out.println("3.������");
	Scanner input= new Scanner(System.in);
	
	System.out.println(">>>");
	int su = input.nextInt();
	
	if(su==1) {
		System.out.println("���̵� �Է�: ");
		id=input.next();
		System.out.println("��й�ȣ �Է�: ");
		pw=input.next();
		if(id.equals(id1) && pw.equals(pw1)) {
			System.out.println("��������");
		}else {
			System.out.println("�Է��� ������ �����ϴ�.");
		}
	}else if(su==2) {
		System.out.println("������ ���̵� �Է�: ");
		id1=input.next();
		System.out.println("������ ��й�ȣ �Է�: ");
		pw1=input.next();
	}else if(su==3) {
			System.out.println("���α׷� ����");
			break;
		}else {
			System.out.println("�߸��Է�");
		}
	}
	
	
}
}

package day05;

import java.util.Scanner;

public class Quiz04 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int money=0, menu=0;
	
	System.out.println("����� ���� �ϼ���>>");
	money= input.nextInt();
	for(;;) {
	System.out.println("=======Ŀ�� ���Ǳ�=======");
	
	System.out.println("1.Ŀ��(200) \n2.���ھ�(250) \n3.��ȯ \n4.����");
	System.out.println("�޴��� �����ϼ���>>");
	menu=input.nextInt();

	
	if(menu==1) {
		money-=200;
		if(money<200) {
			System.out.println("�ܾ׺���");
		}else {
			System.out.println("�ܾ�"+money);
			System.out.println("���ְ� �弼��\n");
		}
	}else if(menu==2) {
		money-=250;
		if(money<250) {
			System.out.println("�ܾ׺���");
		}else {
			System.out.println("�ܾ�"+money);
			System.out.println("���ְ� �弼��\n");
		}
	}else if(menu==3){
		System.out.println(money+"\n");
		money=0;
	}else if(menu==4) {
		System.out.println("�����մϴ�.");
		break;
	}else {
		System.out.println("�߸��Է��ϼ̽��ϴ�.");
	}
	}
}
}

package day05;

import java.util.Scanner;

public class Quiz02 {
public static void main(String[] args) {
	//1~10������ ���ڸ� �Է¹޾� 1���� �Է¹��� �������� ���� ���Ͻÿ�
	Scanner input = new Scanner(System.in);
//	int su, sum=0;
//	while(true) {
//	System.out.println("�� �Է�(1~10): ");
//	su=input.nextInt();
//	if(su>1 && su<10) {
//	break;}
//	System.out.println("�߸��Է�.�ٽ�.");
//	
//	
//	}for (int i =1;i<=su;i++) {
//		sum+=i;
//		System.out.println("��: "+sum);
	//10~20������ ���ڸ� �Է¹޾� 1���� �Է¹��� �������� ���� ���Ͻÿ�
	
	int su,sum=0; 
	
	System.out.println("���ڸ� �Է��ϼ���: ");
	su=input.nextInt();
	if(su>=10&&su<=20) {
	for(int i=1;i<=su;i++) {
		sum+=i;
	}
	}else {
		System.out.println("�߸��Է�.�ٽ�");
	}
	System.out.println(sum);
	
	
	
	
	
	
	//�� ���� �Է¹޾� �Է¹��� �� ������ ���� ���ϼ���
		//�Է°�: 1,10 =>55 10,1 => 55
	
	/*
	int num1=0 , num2=0, sum=0;
	int i=0;
	System.out.println("�� �� �Է�: ");
	num1 = input.nextInt();
	num2 = input.nextInt();

	for (i=num2;num1>=i;i++) 
		sum+=i;
	
	
		for (i=num1;num2>=i;i++) 
		sum+=i;
	
	System.out.println(sum);
	*/
//	int num1, num2, sum=0;
//	System.out.println("�� �� �Է�");
//	num1=input.nextInt();
//	num2=input.nextInt();
//	
//	int max=0, min=0;
//	
//	if(num1>num2) {
//		max=num1;
//		min=num2;
//	}else {
//		max=num2;
//		min=num1;
//	}
//	while(min<=max) {
//		sum+=min;
//		min++;
//	}System.out.println(sum);
}
}

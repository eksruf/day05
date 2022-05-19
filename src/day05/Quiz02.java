package day05;

import java.util.Scanner;

public class Quiz02 {
public static void main(String[] args) {
	//1~10사이의 숫자만 입력받아 1부터 입력받은 수까지의 합을 구하시오
	Scanner input = new Scanner(System.in);
//	int su, sum=0;
//	while(true) {
//	System.out.println("수 입력(1~10): ");
//	su=input.nextInt();
//	if(su>1 && su<10) {
//	break;}
//	System.out.println("잘못입력.다시.");
//	
//	
//	}for (int i =1;i<=su;i++) {
//		sum+=i;
//		System.out.println("합: "+sum);
	//10~20사이의 숫자만 입력받아 1부터 입력받은 수까지의 합을 구하시오
	
	int su,sum=0; 
	
	System.out.println("숫자를 입력하세요: ");
	su=input.nextInt();
	if(su>=10&&su<=20) {
	for(int i=1;i<=su;i++) {
		sum+=i;
	}
	}else {
		System.out.println("잘못입력.다시");
	}
	System.out.println(sum);
	
	
	
	
	
	
	//두 수를 입력받아 입력받은 수 사이의 합을 구하세요
		//입력값: 1,10 =>55 10,1 => 55
	
	/*
	int num1=0 , num2=0, sum=0;
	int i=0;
	System.out.println("두 수 입력: ");
	num1 = input.nextInt();
	num2 = input.nextInt();

	for (i=num2;num1>=i;i++) 
		sum+=i;
	
	
		for (i=num1;num2>=i;i++) 
		sum+=i;
	
	System.out.println(sum);
	*/
//	int num1, num2, sum=0;
//	System.out.println("두 수 입력");
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

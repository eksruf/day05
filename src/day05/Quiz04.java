package day05;

import java.util.Scanner;

public class Quiz04 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int money=0, menu=0;
	
	System.out.println("요금을 투입 하세요>>");
	money= input.nextInt();
	for(;;) {
	System.out.println("=======커피 자판기=======");
	
	System.out.println("1.커피(200) \n2.코코아(250) \n3.반환 \n4.종료");
	System.out.println("메뉴를 선택하세요>>");
	menu=input.nextInt();

	
	if(menu==1) {
		money-=200;
		if(money<200) {
			System.out.println("잔액부족");
		}else {
			System.out.println("잔액"+money);
			System.out.println("맛있게 드세요\n");
		}
	}else if(menu==2) {
		money-=250;
		if(money<250) {
			System.out.println("잔액부족");
		}else {
			System.out.println("잔액"+money);
			System.out.println("맛있게 드세요\n");
		}
	}else if(menu==3){
		System.out.println(money+"\n");
		money=0;
	}else if(menu==4) {
		System.out.println("종료합니다.");
		break;
	}else {
		System.out.println("잘못입력하셨습니다.");
	}
	}
}
}

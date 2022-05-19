package day05;

import java.util.Scanner;

public class Quiz03 {
public static void main(String[] args) {
	
	String id="",pw="", id1="", pw1="";
	for(;;) {
	System.out.println("1.로그인");
	System.out.println("2.회원가입");
	System.out.println("3.나가기");
	Scanner input= new Scanner(System.in);
	
	System.out.println(">>>");
	int su = input.nextInt();
	
	if(su==1) {
		System.out.println("아이디 입력: ");
		id=input.next();
		System.out.println("비밀번호 입력: ");
		pw=input.next();
		if(id.equals(id1) && pw.equals(pw1)) {
			System.out.println("인증성공");
		}else {
			System.out.println("입력한 정보가 없습니다.");
		}
	}else if(su==2) {
		System.out.println("생성할 아이디 입력: ");
		id1=input.next();
		System.out.println("생성할 비밀번호 입력: ");
		pw1=input.next();
	}else if(su==3) {
			System.out.println("프로그램 종료");
			break;
		}else {
			System.out.println("잘못입력");
		}
	}
	
	
}
}

package day05;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
	/*
	 반복문
	 -규칙적으로 값이 변한다면 반복문을 사용할 수 있다.
	 */
//	int sum = 0, i=0;
//	//초기값; 조건식; 증감식
//	for(i=1; i<=10; i++) {
//		System.out.println(i);
//		sum = sum+i;
//	}
//	System.out.println("i: "+i);
//	System.out.println("sum: "+sum);
	/*
	i++; sum = sum+i;
	i++; sum = sum+i;
	i++; sum = sum+i;
	i++; sum = sum+i;
	i++; sum = sum+i;
	i++; sum = sum+i;
	i++; sum = sum+i;
	i++; sum = sum+i;
	i++; sum = sum+i;
	i++; sum = sum+i;
	System.out.println("sum: "+sum);
	 */
		/*
		for(int k=1; k<=10; k+=2) {
			System.out.println("k: "+k);
		}
		System.out.println("========");
		for(int k=1; k<=10; k++) {
			if(k%2 ==1) {
				System.out.println("k: "+k);
			}
		}
		*/
		
		//사용자로 부터 입력받은 수 까지의 짝 홀 총합을 구하세요
		
//		Scanner input = new Scanner(System.in);
//		
//		int su;
//		
//		System.out.println("수를 입력하세요");
//		su = input.nextInt();
//		
//		for(int k=0; 0<=su; k++ ) {
//			if(k%2==0) {
//				System.out.println("k: "+k);
//			}else if(k%2!=0) {
//				System.out.println("k: "+k);
//			}
//			
//		}
		
		
		
		Scanner input = new Scanner (System.in);
		int num, evenSum=0, oddSum=0, allsum=0;
		System.out.println("수입력:");
		num = input.nextInt();
		for (int k=1; k<= num; k++) {
			//System.out.println("k: "+k);
			if(k%2==0) {
				evenSum+=k;
			}else {
				oddSum+=k;
			}
			allsum +=k;
		}
		
		System.out.println("allSum: "+allsum);
		System.out.println("evenSum: "+evenSum);
		System.out.println("oddSum: "+oddSum);
		
		int i=0;
		for (;i<3;) {//(;;)설정없이 만들면 무한반복
			System.out.println("test");
		i++;
		}
		
		
		
		
		
		
		
		
		
	}
}

package day05;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
	/*
	 �ݺ���
	 -��Ģ������ ���� ���Ѵٸ� �ݺ����� ����� �� �ִ�.
	 */
//	int sum = 0, i=0;
//	//�ʱⰪ; ���ǽ�; ������
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
		
		//����ڷ� ���� �Է¹��� �� ������ ¦ Ȧ ������ ���ϼ���
		
//		Scanner input = new Scanner(System.in);
//		
//		int su;
//		
//		System.out.println("���� �Է��ϼ���");
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
		System.out.println("���Է�:");
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
		for (;i<3;) {//(;;)�������� ����� ���ѹݺ�
			System.out.println("test");
		i++;
		}
		
		
		
		
		
		
		
		
		
	}
}

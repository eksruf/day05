package day05;

public class Quiz01 {
public static void main(String[] args) {
	int i=1;
	for(;i<=4;i++) {
		System.out.println(i+".hello");
	}
	
	System.out.println("=======");
	
	int sum=0;
	for( i=1;i<=100;i++) {
		sum= sum + i;  //sum+=i
		//System.out.println(sum);
		if(sum==528) {
			System.out.println("i: "+i);
		}
	}
	System.out.println("=======");
	
	
	for(i=1;i<=25;i++) {
		System.out.print(i+"\t");
		if(i%5==0) {
			System.out.println();//println() 자체가 엔터를 포함하니 ()안 공백이어도 (\n안써도) 괜츈
		}
	}

}
}

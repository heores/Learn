import java.util.Scanner;

/**
 * 已知S1=a S2=a+aa S3=a+aa+aaa S4=a+aa+aaa+aaaa
 * 求解Sn=？
 */
public class Ch1_2_3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入a的数值： ");
		int a = input.nextInt();
		System.out.print("请输入n的数值： ");
		int n = input.nextInt();
		//long startTime = System.currentTimeMillis();    //获取开始时间
		long startTime=System.nanoTime();   //获取开始时间  
		int tem = a;
		int sum = a;
		for (int i = 1; i < n; i++) {
			a = a * 10 + tem;
			sum = sum + a;
		}
		System.out.print("" + "Sn的答案等于" + sum);
		//long endTime = System.currentTimeMillis();    //获取结束时间
		long endTime=System.nanoTime(); //获取结束时间
		//System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
		System.out.println("程序运行时间： "+(endTime-startTime)+"ns"); 
	}
}

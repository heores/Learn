/*
 * 求1！+2！+3！+...+n!
 * 求 阶乘之和
 * 
 */
import java.util.Scanner;
public class Ch1_2_8{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入最大阶乘数值： ");
		int n = input.nextInt();
		long An=1,Sn=0;
		for(int i=1;i<=n;i++){
			An=An*i;
			Sn=Sn+An;
			System.out.println(i+"的阶乘等于"+An);
			System.out.println(i+"的阶乘之和"+Sn);
		}
		System.out.println("以下为最终结果");
		System.out.println(n+"的阶乘等于"+An);
		System.out.println(n+"的阶乘之和"+Sn);
	}
}
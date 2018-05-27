/*
 * 求1+3+5+7+9+...+n
 * 
 * 求奇数之和
 * 
 */
import java.util.Scanner;
public class Ch1_2_9{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入求和最大奇数： ");
		int n = input.nextInt();
		int m = n+1;
		long Sn=0;
		for(int i=1;i<=n;i=i+2){
			Sn=Sn+i;
			System.out.println(i+"的奇数之和"+Sn);
		}
		System.out.println("以下为最终结果");
		System.out.println(n+"的奇数之和"+Sn);
		System.out.println(m+"的偶数之和"+drink(m));
	}
	
	
	public static int drink(int n) {
		long Sn=0;
		for(int i=2;i<=n;i=i+2){
			Sn=Sn+i;
			//System.out.println(i+"的偶数之和"+Sn);
		}
		return (int) Sn;
	}
}

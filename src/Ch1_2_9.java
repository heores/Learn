/*
 * ��1+3+5+7+9+...+n
 * 
 * ������֮��
 * 
 */
import java.util.Scanner;
public class Ch1_2_9{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print("������������������ ");
		int n = input.nextInt();
		int m = n+1;
		long Sn=0;
		for(int i=1;i<=n;i=i+2){
			Sn=Sn+i;
			System.out.println(i+"������֮��"+Sn);
		}
		System.out.println("����Ϊ���ս��");
		System.out.println(n+"������֮��"+Sn);
		System.out.println(m+"��ż��֮��"+drink(m));
	}
	
	
	public static int drink(int n) {
		long Sn=0;
		for(int i=2;i<=n;i=i+2){
			Sn=Sn+i;
			//System.out.println(i+"��ż��֮��"+Sn);
		}
		return (int) Sn;
	}
}

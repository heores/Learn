/*
 * ��1��+2��+3��+...+n!
 * �� �׳�֮��
 * 
 */
import java.util.Scanner;
public class Ch1_2_8{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print("���������׳���ֵ�� ");
		int n = input.nextInt();
		long An=1,Sn=0;
		for(int i=1;i<=n;i++){
			An=An*i;
			Sn=Sn+An;
			System.out.println(i+"�Ľ׳˵���"+An);
			System.out.println(i+"�Ľ׳�֮��"+Sn);
		}
		System.out.println("����Ϊ���ս��");
		System.out.println(n+"�Ľ׳˵���"+An);
		System.out.println(n+"�Ľ׳�֮��"+Sn);
	}
}
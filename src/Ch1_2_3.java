import java.util.Scanner;

/**
 * ��֪S1=a S2=a+aa S3=a+aa+aaa S4=a+aa+aaa+aaaa
 * ���Sn=��
 */
public class Ch1_2_3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������a����ֵ�� ");
		int a = input.nextInt();
		System.out.print("������n����ֵ�� ");
		int n = input.nextInt();
		//long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��
		long startTime=System.nanoTime();   //��ȡ��ʼʱ��  
		int tem = a;
		int sum = a;
		for (int i = 1; i < n; i++) {
			a = a * 10 + tem;
			sum = sum + a;
		}
		System.out.print("" + "Sn�Ĵ𰸵���" + sum);
		//long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		long endTime=System.nanoTime(); //��ȡ����ʱ��
		//System.out.println("��������ʱ�䣺" + (endTime - startTime) + "ms");    //�����������ʱ��
		System.out.println("��������ʱ�䣺 "+(endTime-startTime)+"ns"); 
	}
}

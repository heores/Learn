import java.util.Scanner;
/**
 * @author USER
 * ��������
 */
public class Ch1_1_2 {
	public static void main(String[] args) {
		int i, j, k, n;
		Scanner input=new Scanner(System.in);
		System.out.print("���������������Ĳ����� ");
		n = input.nextInt();
		// ���ѭ�����Ʋ���
		for (i = 1; i <= n; i++) {
			//��������кţ�����Ǻ���ߵĿո�
			for (j = 1; j <= i-1; j++)
				System.out.print(" ");
			//��������кţ�����Ǻŵĸ�����
			for (k = 1; k <= 2*(n+1-i)-1; k++)
				System.out.printf("*");
			//һ�н�������
			System.out.printf("\n");
		}
	}
}

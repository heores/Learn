import java.util.Scanner;

/**
 * @author USER
 * ���ߵ�������
 */
public class Ch1_1_3 {
	public static void main(String[] args) {
		int i, j, k, n;
		Scanner input = new Scanner(System.in);
		System.out.print("���������������Ĳ����� ");
		n = input.nextInt();
		// ���ѭ�����Ʋ���
		for (i = 1; i <= n; i++) {
			
			//��������кţ�����Ǻ���ߵĿո�
			//for (j = 1; j <= n - i; j++)
			//	System.out.print(" ");
			//��������кţ�����Ǻŵĸ�����
			
			for (k = 1; k <=n+1-i; k++)
				System.out.printf("*");
			//һ�н�������
			System.out.printf("\n");
		}
	}
}

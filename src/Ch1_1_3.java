import java.util.Scanner;

/**
 * @author USER
 * 靠边倒三角形
 */
public class Ch1_1_3 {
	public static void main(String[] args) {
		int i, j, k, n;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入您金字塔的层数： ");
		n = input.nextInt();
		// 外层循环控制层数
		for (i = 1; i <= n; i++) {
			
			//根据外层行号，输出星号左边的空格。
			//for (j = 1; j <= n - i; j++)
			//	System.out.print(" ");
			//根据外层行号，输出星号的个数。
			
			for (k = 1; k <=n+1-i; k++)
				System.out.printf("*");
			//一行结束换行
			System.out.printf("\n");
		}
	}
}

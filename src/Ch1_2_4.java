/**
 * 已知S1=a S2=a+aa S3=a+aa+aaa S4=a+aa+aaa+aaaa 求解Sn=？
 */
public class Ch1_2_4 {
	public static void main(String[] args) {
		long startTime=System.nanoTime();   //获取开始时间
		int seq = seq(1);
		
		System.out.println(seq);

		int an = an(3);
		System.out.println(an);

		int sn = sn(3);
		System.out.println(sn);
		
		long endTime=System.nanoTime(); //获取结束时间
		System.out.println("程序运行时间： "+(endTime-startTime)+"ns"); 
	}

	/**
	 * sn=a*(1+10^1+10^2+10^3 +10^n-1)
	 */

	public static int sn(int n) {
		int result = 0;

		if (n == 1) {
			return n;
		}

		for (int i = 1; i < n + 1; i++) {
			result = result + an(i);
		}
		return result;
	}


	public static int an(int n) {
		int result = 0;

		if (n == 1) {
			return n;
		}

		for (int i = 1; i < n + 1; i++) {
			result = result + seq(i - 1);
		}
		return result;
	}

	/**
	 * 计算seq（立方)
	 * 
	 * @param n
	 * @return
	 */
	public static int seq(int n) {
		int result = 1;

		for (int i = 0; i < n; i++) {
			result = result * 10;
		}
		return result;
	}
}

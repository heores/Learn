/*
 * �ݹ���N�Ľ׳�
 *
 * 
 */
public class Ch1_3_7{
	public static void main(String []args){
		System.out.println(m(5));
	}
	public static int m(int n){
		if (n==1)
			return 1;
		else
			return n*m(n-1);
	}
}

/*
 * �ݹ���N��ֵ
 * 1 1 2 3 5 8 13 21 34 55 X
 * 
 */
class TestD{
	public static void main(String []args){
		System.out.println(m(11));
	}
	public static int m(int n){
		if(n==1||n==2)
			return 1;
		else
			return m(n-1)+m(n-2);
	}
}


/*
 * �ݹ���N��ֵ
 * 1 1 2 3 5 8 13 21 34 55 X
 * ��forѭ�����
 */
class TestF{
	public static void main(String []args){
		int j=1,k=1;int n=40;int an=1;
		for(int i=3;i<=n;i++){
			an=j+k;
			j=k;
			k=an;
			//System.out.println(an);
		}
		System.out.println(an);
	}
	
}

/*
 * �ݹ���N��ֵ
 * 1 1 2 3 5 8 13 21 34 55 X
 * ��forѭ�����
 * ���÷���
 */
class TestT {
	public static void main(String[] args) {
		TestT x=new TestT();
		System.out.println(x.m(40));
		//System.out.println(m(40));
	}
	//ע�Ͳ��ּ���static����ֱ�ӵ���
	//δע�Ͳ��ֲ���staticֻ�ܴ���һ��������ʷ���
	//public static long m(int n) {
	public long m(int n) {
		
		if(n<1){
			System.out.println("���������0����ֵ");
			return 0;
		}
		if (n == 1 || n == 2)
			return 1;
		
		else {
			long f1 = 1;
			long f2 = 1;
			long f = 0;
			for (int i = 3; i <= n; i++) {
				f = f1 + f2;
				f1 = f2;
				f2 = f;
			}
			return f;
		}

	}
}


/*
 * �ݹ���N��ֵ
 * 1 1 2 3 5 8 13 21 34 55 X
 * ��forѭ�����
 * �Ż�����
 */
class TestTx {
	public static void main(String[] args) {
		for(int i=1;i<=40;i++){
		System.out.println(m(i));
		}
	}

	public static long m(int n) {
		
			long f1 = 1;
			long f2 = 1;
			long f = 1;
			for (int i = 3; i <= n; i++) {
				f = f1 + f2;
				f1 = f2;
				f2 = f;
			}
			return f;
		}

	}

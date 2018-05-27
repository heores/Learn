public class Ch1_3_6{
	public static void main(String []args){
		m1();
		m2(15);
		m2(9);
		m3(2,8);
		m3('2',8);
		m4(9,5);
		int i=m4(9,15);
		System.out.println(i);
	}
	public static void m1(){
		System.out.println("您好！");
		System.out.println("欢迎来到Java世界！");
	}
	public static void m2(int i){
		if(i<10)
			return;
		System.out.println(i);
	}
	public static void m3(int j,int k){
		System.out.println(j+k);
	}
	
	public static int m4(int j,int k){
		return j>k?j:k;
	}
	
}
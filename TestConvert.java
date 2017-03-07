public class TestConvert{
	public static void main(String[] args){
		int i1 = 123;
		int i2 = 456;
		double d1 = (i1+i2)*1.2;
		float f1 = (float)((i1+i2)*1.2);
		
		byte b1 = 1;
		byte b2 = 2;
		byte b3 = (byte)(b1+b2);
		System.out.println(b3);
		
		double d2 = 1e200;
		float f2 = (float)d2;
		System.out.println(f2);
		
		float f3 = 1.23f;
		long l1 = 123;
		long l2	=	30000000000L;
		float	f	=	l1+l2+f3;
		long l = (long)f;
		
		
	 }
	}
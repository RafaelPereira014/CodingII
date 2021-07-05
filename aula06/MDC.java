class MDC {
	public static void main(String[] args) {
		System.out.print("mdc = "+mdc(10,2));
	}
	
	public static int mdc(int a,int b){
		int result = 0;
		
		if(b==0) result = a;
		if(b!=0) result = mdc(b,a % b);
	
		return result;
	}
}
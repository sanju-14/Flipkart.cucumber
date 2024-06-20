package Practice2022;

class Override1 {
	
	private void m1() {
		
		System.out.println("m1");
	}

}

class Override2 extends Override1
{
	
	private void m1() {
		
		System.out.println("m2");
	}
	
	public static void main(String[] args) {
		
		Override2 ovr=new Override2();
		ovr.m1();
	}

}

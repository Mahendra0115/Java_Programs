package pack;
class Test{
	
		protected void m1(){
		System.out.println("method 1");
	}
}

class Demo{
	public static void main(String args[]){
	Test test = new Test();
		test.m1();
		
	}
}
package basicloops;

class Sample {
	private int x,y;//object variables or instance variables
	
	//It is automatically called when object is created..
	public Sample(){
		System.out.println("Inside constructor...");
	}
	
	public Sample(int x,int y){
		this.x = x;
		this.y = y;
	}
	public void read(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public void show(){
		System.out.println(x);
		System.out.println(y);
	}
	
	public void sum(){
		System.out.println("The sum is : " + (x+y));
	}
}

public class Sample1 {
	
	String numString = "1000";
	int id=Integer.valueOf(numString).intValue();
	public static void main(String[] args) {
		Sample obj = new Sample();
		obj.read(10,20);
		obj.show();
		obj.sum();
		
		Sample obj2 = new Sample(100,200);
		obj2.show();
		obj2.sum();
		
	}
}

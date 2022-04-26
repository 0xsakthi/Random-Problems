//abstract class created
abstract class ab{
	public abstract void print_hi(); //abstract method also created
	public static void test(){
		System.out.println("iam from ab");
	}
}
//we extend the class to another class 
class second extends ab{
	public void print_hi(){ //its compulsury to create print_hi method because its abstract method from extended class
		System.out.println("hi");
	}
}
//main class
class abstr{
	public static void main(String[] args){
		second obj = new second(); //object creation
		obj.test(); //
		obj.print_hi();
	}
}

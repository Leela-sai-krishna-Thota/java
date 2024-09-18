//program for multilevel  inhertence 
class guest {
	void read(){
		System.out.println("read only");
	}
}
class develope extends guest{
	void develope(){
		System.out.println("write only");
	}
}
class manager extends develope{
	void manage(){
	System.out.println("manage all");
	}
}
public class multilevelinher{
	public static void main(String[] args){
		manager m = new manager();
		m.read();
		m.develope();
		m.manage();
		
	}
}

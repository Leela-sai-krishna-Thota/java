//program for single inhertence 
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
public class singleinher{
	public static void main(String[] args){
		developer d = new developer();
		d.read();
		d.develope();
	}
}

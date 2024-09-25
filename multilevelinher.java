//multilevelinheritance
class animal{
	void makesound(){
		System.out.println("shout!");
	}
}
class dog extends animal{
	void makesound(){
		System.out.println("woof!");
	}
}
class puppy extends dog{
	void makesound(){
		System.out.println("yap!");
	}
}
public class multilevelinheritance{
	public static void main(String[] args){
		animal a=new animal();
		dog d=new dog();
		puppy p=new puppy();
		a.makesound();
		d.makesound();
		p.makesound();
	}
}

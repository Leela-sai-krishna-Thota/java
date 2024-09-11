// constructor
class box{
	double width,height,depth;
	box(){
		width=2.36;
		height=3.45;
		depth=4.56;
		
	}
	double volume()
	{
		return(width*height*depth);
	}
}
public class constructor{
	public static void main(String[] args){
	box b1 = new box();
	box b2 = new box();
	System.out.println("volume1 = "+b1.volume());
	System.out.println("volume2 = "+b2.volume());
	}
}

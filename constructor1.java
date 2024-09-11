// constructor
class box{
	double width,height,depth;
	box(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
		
	}
	double volume()
	{
		return(width*height*depth);
	}
}
public class constructor1{
	public static void main(String[] args){
	box b1 = new box(2,3,4);
	box b2 = new box(5,6,3);
	System.out.println("volume1 = "+b1.volume());
	System.out.println("volume2 = "+b2.volume());
	}
}

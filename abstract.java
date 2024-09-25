abstract class shape {
	abstract double calculatearea();
	}
class circle extends shape {
		double r;
	circle(double r) {
		this.r=r;
	}
	double calculatearea() {
		return 3.14*r*r;
	}
}
class rectangle extends shape {
	double l;
	double w;
	rectangle( double l,double w) {
		this.l=l;
		this.w=w;
		}
	double calculatearea() {
		return l*w;
		}
	}
public class main {
	public static void main(String[] args) {
		circle c = new circle(5);
		rectangle re= new rectangle (5,8);
	System.out.println("circle ="+ c.calculatearea());			
	System.out.println("rectangle ="+ re.calculatearea());
	}
}	

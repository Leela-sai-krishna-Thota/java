class vehicle  {
	int maxspeed = 120;
	}
class car extends vehicle {
	int maxspeed = 180;
		void display() {
		System.out.println("maxspeed vehicle= "+super.maxspeed);	
		System.out.println("maxspeed  car= "+maxspeed);
		}
	}
	public class superkey {
		public static void main(String[] args) {
		 car c = new car();
		 c.display();
		 }
	} 	

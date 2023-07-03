class Car{
	
	public static final int speed = 150;
	private String type;
	public String getType() {
		return type;
	}
	
	public String getRevenueData() {
		
		String data = "Revenue:" + calculateRevenue();
		return data;
	}
	private int calculateRevenue() {
		return 12000;
	}

	public void setType(java.lang.String string) {
		this.type = string;
	}

    public void speed() {
    }

    public void design() {
    }

    public void build() {
    }
	
	
}
public class App {

	public static void main(String[] args) {
	System.out.println(Car.speed);
     Car o1= new Car();
     Car o2= new Car();
     o1.setType("sidhu");
     System.out.println(o1.getType());
     o2.setType("Ahuja");
     System.out.println(o2.getType());
	}
}

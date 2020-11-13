package mod1;

public class Weather {

	public Weather() {
		// TODO Auto-generated constructor stub
		int temperture=65;
		String sunCondition="overcast";
		
		if (temperture>80) {
			System.out.println("It's pleasent. Wear a short and T-shirt");
		}
		
		if (temperture>60) {
			System.out.println("It's a little bit cooler. Wear a long-sleeve shirt and jeans");
		}else {
			System.out.println("It's a cold day. Bring a sweater");
		}


}
}
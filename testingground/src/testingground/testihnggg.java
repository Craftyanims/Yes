package testingground;

public class testihnggg {

	static int rng = (int) Math.random();

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println(rng);
			rng = (int) (Math.random()*2);

		}

	}

}

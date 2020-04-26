package Basics;

public class Cities {

	public static void main(String[] args) {

		String[] cities = {"New York", "San Francisco", "Miami", "Los Angeles"};
		
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		
		String[] states = new String[5];
		
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		
		System.out.println(states[0]);
		
		String[] countries;
		countries = new String [2];
		
		countries[0] = "Canada";
		countries[1] = "UK";
		
		System.out.println(countries[0]);
		
		System.out.println("*****************");
		
		
		int i = 0;
		
		do {
			System.out.println("STATE:" + states[i]);
			i=i+1;
		} while (i<5);
		
		System.out.println("lallalalalaal");
		
		
		int n=0;
		
		while(n<=4) {
			System.out.println("STATE at "+ n + " : " + states[n]);
			n++;
		}
		
		boolean stateFound = false;
		n = 0;
		
		while (!stateFound) {
			String state = states[n];
			System.out.println(state);

			if (state == "Texas") {
				System.out.println("State is found!");
				stateFound = true;
			}
			n++;
		}
		
		for (int x = 0;x < 5; x++) {
			System.out.println(states[x]);
		}
		
	}

}

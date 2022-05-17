package ai.jobiak.enumexample;

public enum Season {

	Monsoon,Winter,Spring,Summer;

	public static void main(String[] args) {
	
		Season s=Season.Summer;
		System.out.println(s);
		
		for(Season r: Season.values()) {
			
			System.out.println(r);
		}
			
    }
}

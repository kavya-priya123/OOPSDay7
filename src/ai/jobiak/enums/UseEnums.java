package ai.jobiak.enums;

public class UseEnums {

	public static void main(String[] args) {
	
		
		Apple apple = Apple.Kashmir;
		System.out.println(apple);
		
		for(Apple element : Apple.values()) {
			
			System.out.println(element+" "+element.ordinal());
													//index			
		}
	}

}

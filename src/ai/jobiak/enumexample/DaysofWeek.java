package ai.jobiak.enumexample;

public enum DaysofWeek {

     SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
		  
 public static void main(String[] args) {
     DaysofWeek d=DaysofWeek.WEDNESDAY;
      System.out.println(d);
     
     
     for(DaysofWeek r :DaysofWeek.values()) {
    	 System.out.println(r);
     }
  /*switch(d)
	 {
	 case SUNDAY:
		  System.out.println(SUNDAY);
		  break;
	 case MONDAY:
		  System.out.println(MONDAY);
		  
	 case TUESDAY:
		  System.out.println(TUESDAY);
	 
	 case WEDNESDAY:
		  System.out.println(WEDNESDAY);
		  break;
	 case THURSDAY:
		  System.out.println(THURSDAY);
		  
	 case FRIDAY:
		  System.out.println(FRIDAY);
		  
	 case SATURDAY:
		  System.out.println(SATURDAY);
	      break;
	 default:
		  System.out.println("Not a day");
	     
	 } */
	 
 }
	 
 }
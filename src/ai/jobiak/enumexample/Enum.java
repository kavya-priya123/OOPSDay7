package ai.jobiak.enumexample;

public class Enum {
	public static void main(String[] args) {
		TrafficSignal[] signals=TrafficSignal.values();
		for(TrafficSignal signal:signals) {
			System.out.println("Name:"+signal.name()+" Action:"+signal.getAction());
		}
	}

}

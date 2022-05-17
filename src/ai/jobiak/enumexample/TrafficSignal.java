package ai.jobiak.enumexample;

public enum TrafficSignal {
    RED("wait"),GREEN("go"),ORANGE("slow down");
	
	private String action;
	public String getAction() {
		return this.action;
	}

    TrafficSignal(String action) {
	this.action = action;
}
}
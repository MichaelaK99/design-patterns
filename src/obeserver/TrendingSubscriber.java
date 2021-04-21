package obeserver;

public class TrendingSubscriber implements Observer {
	
	private String name;
	private Observable trend;

	public TrendingSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		
		if (this.trend == null) {
			System.out.println(this.getName() + " has no new trend");
			return;
		}
		
		String newTopic = this.trend.getUpdate();
		System.out.println(this.getName() + "received an update: " + newTopic);
	}

	@Override
	public void setTopic(Observable video) {
		this.trend = video;
	}

	public String getName() {
		return name;
	}
}

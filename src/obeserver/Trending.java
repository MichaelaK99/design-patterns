package obeserver;

import java.util.ArrayList;
import java.util.List;

public class Trending implements Observable {
	
	private List<Observer> trending;
	private String video;
	
	
	public Trending() {
		this.trending = new ArrayList<>();
	}

	@Override
	public void subscribe(Observer observer) {
		this.trending.add(observer);
		observer.setTopic(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.trending.remove(observer);

	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.trending) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.video;
	}

	public void setTopic(String topic) {
		this.video = topic;
		this.notifyObservers();
	}

}

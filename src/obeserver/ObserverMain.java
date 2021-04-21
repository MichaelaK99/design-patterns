package obeserver;

public class ObserverMain {

	public static void main(String[] args) {
Trending topic = new Trending();
Observer obs1 = new TrendingSubscriber("User 01 ");
Observer obs2 = new TrendingSubscriber("User 02 ");
Observer obs3 = new TrendingSubscriber("User 03 ");

topic.subscribe(obs1);
topic.subscribe(obs2);
topic.subscribe(obs3);

topic.setTopic("#1 in the trending: new song");


	}

}

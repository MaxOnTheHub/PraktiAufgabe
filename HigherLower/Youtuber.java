public class Youtuber {
    private final String name;
    private final long subscribers;

    public Youtuber(String name, long subscribers) {
        this.name = name;
        this.subscribers = subscribers;
    }

    public String getName() {
        return name;
    }

    public long getSubscribers() {
        return subscribers;
    }
}
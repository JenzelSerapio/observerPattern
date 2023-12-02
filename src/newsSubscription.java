public class newsSubscription {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        Subscriber person1 = new Subscriber("Jenzel");
        Subscriber person2 = new Subscriber("Leah");

        newsAgency.subscribe(person1);
        newsAgency.subscribe(person2);

        newsAgency.reportBreakingNews("NYT reporter says Israel knew Hamas' attack plan over a year ago");

        newsAgency.unsubscribe(person2);

        newsAgency.reportBreakingNews("DOH on alert for new pathogens as flu-like cases spike");

    }
}
package lt.techin.andzej;

import lt.techin.philatelist.Philatelist;
import lt.techin.philatelist.PostStamp;

import java.util.ArrayList;
import java.util.List;

public class PhilatelistImplemented implements Philatelist {

    List<PostStamp> postStampList;

    public PhilatelistImplemented() {
        postStampList = new ArrayList<>();
    }

    @Override
    public void addToCollection(PostStamp postStamp) {
        if (postStampList.contains(postStamp)) throw new IllegalArgumentException();
        if (postStamp == null) throw new IllegalArgumentException();
        if (postStamp.getName() == null || postStamp.getName().isEmpty()) throw new IllegalArgumentException();
        postStampList.add(postStamp);
    }

    @Override
    public int getNumberOfPostStampsInCollection() {
        return postStampList.size();
    }

    @Override
    public void printAllPostStampNames() {
        for (PostStamp p : postStampList) {
            System.out.println(p.getName());
        }
    }

    @Override
    public void printPostStampsWithPriceGreaterThan(double v) {
        for (PostStamp p : postStampList) {
            if (p.getMarketPrice() > v) {
                System.out.println(p.getName());
            }
        }
    }

    @Override
    public boolean isPostStampInCollection(PostStamp postStamp) {
        return postStampList.contains(postStamp);
    }

    @Override
    public boolean isPostStampWithNameInCollection(String s) {
        for (PostStamp p : postStampList) {
            if (p.getName().equals(s)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double calculateTotalMarketPrice() {
        double sum = 0;
        for (PostStamp p : postStampList) {
            sum += p.getMarketPrice();
        }
        return sum;
    }

    @Override
    public double getAveragePostStampPrice() {
        double sum = 0;
        for (PostStamp p : postStampList) {
            sum += p.getMarketPrice();
        }
        return sum / postStampList.size();
    }

    @Override
    public PostStamp getTheMostExpensivePostStampByMarketValue() {
        PostStamp result = null;
        for (PostStamp p : postStampList) {
            if (result == null || p.getMarketPrice() > result.getMarketPrice()) {
                result = p;
            }
        }
        return result;
    }

    @Override
    public List<PostStamp> findPostStampsByNameContaining(String s) {
        List<PostStamp> result = new ArrayList<>();
        for (PostStamp p : postStampList) {
            if (p.getName().toLowerCase().contains(s.toLowerCase())) {
                result.add(p);
            }
        }
        return result;
    }

    @Override
    public List<PostStamp> getSortedPostStampsByName() {
        List<PostStamp> result = new ArrayList<>(postStampList);
        result.sort(new CustomerSortingComparator());
        return result;
    }
}

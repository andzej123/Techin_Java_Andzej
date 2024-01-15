package lt.techin.andzej;

import lt.techin.philatelist.PostStamp;

import java.util.Comparator;

public class CustomerSortingComparator implements Comparator<PostStamp> {
    @Override
    public int compare(PostStamp o1, PostStamp o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

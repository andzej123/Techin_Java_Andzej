package lt.techin.andzej;

import lt.techin.philatelist.PostStamp;

public class Main {
    public static void main(String[] args) {
        PhilatelistImplemented ph = new PhilatelistImplemented();
        PostStamp post1 = new PostStamp(null, 15, 11);
        PostStamp post2 = new PostStamp("CCC", 7, 11);
        PostStamp post3 = new PostStamp("ABD", 16, 11);

        ph.addToCollection(post1);
        ph.addToCollection(post2);
        ph.addToCollection(post3);


        System.out.println(ph.getNumberOfPostStampsInCollection());
        System.out.println(ph.findPostStampsByNameContaining("d"));
        System.out.println(ph.getSortedPostStampsByName());


    }
}

package lt.techin.andzej;

import lt.vtvpmc.Article;

public class MyArticle implements Article {

    private final String heading;
    private final String brief;

    public MyArticle(String heading, String brief) {
        this.heading = heading;
        this.brief = brief;
    }

    @Override
    public String getHeading() {
        return this.heading;
    }

    @Override
    public String getBrief() {
        return this.brief;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            MyArticle article = (MyArticle)o;
            if (this.heading != null) {
                if (this.heading.equals(article.heading)) {
                    return this.brief != null ? this.brief.equals(article.brief) : article.brief == null;
                }
            } else if (article.heading == null) {
                return this.brief != null ? this.brief.equals(article.brief) : article.brief == null;
            }

            return false;
        } else {
            return false;
        }
    }

    public int hashCode() {
        int result = this.heading != null ? this.heading.hashCode() : 0;
        result = 31 * result + (this.brief != null ? this.brief.hashCode() : 0);
        return result;
    }
}

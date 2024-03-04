package lt.techin.andzej;

import lt.vtvpmc.Article;
import lt.vtvpmc.NewsService;
import lt.vtvpmc.NewsServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SafeNewsService implements NewsService {

    private String[] SWEAR_WORDS = new String[]{"rupūs miltai", "velniai rautų", "velnias", "velniais"};


    @Override
    public List<Article> getArticles() {
        // Take original articles
        NewsServiceImpl articles = new NewsServiceImpl();
        List<Article> list = articles.getArticles();

        // Filter bad articles depending on headings that contain swear words
        List<Article> newList = list.stream()
                .filter(a -> Arrays.stream(SWEAR_WORDS).noneMatch(s -> a.getHeading().toLowerCase().contains(s.toLowerCase())))
                .toList();

        // Check briefs for swear words, and if so, change those words to '***'
        List<Article> newestList = new ArrayList<>();

        for (Article a : newList) {
            String head = a.getHeading();
            String brief = a.getBrief();
            for (String s : SWEAR_WORDS) {
                if (brief.toLowerCase().contains(s.toLowerCase())) {
                    brief = brief.replace(s, "***");
                }
            }
            newestList.add(new MyArticle(head, brief));
        }

        return newestList;
    }
}

package lt.techin.andzej;

import lt.vtvpmc.BaseNewsServiceTest;
import lt.vtvpmc.NewsService;
import lt.vtvpmc.NewsServiceImpl;

public class MyTest extends BaseNewsServiceTest {
    @Override
    protected NewsService getNewsService() {
        return new SafeNewsService();
    }
}

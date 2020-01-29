package xyz.shiqihao.example_01;

/**
 * foreign exchange
 */
public class FXNewsProvider {
    private final IFXNewsListener newsListener;
    private final IFXNewsPersistener newsPersistener;

    public FXNewsProvider(IFXNewsListener newsListener, IFXNewsPersistener newsPersistener) {
        this.newsListener = newsListener;
        this.newsPersistener = newsPersistener;
    }

    void getAndPersistNews() {
        newsListener.listen();
        newsPersistener.persist();
    }
}

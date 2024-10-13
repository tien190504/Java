import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private List<Page> pages;

    
    public Chapter() {
        this.pages = new ArrayList<>();
    }

    public void addPage(Page page) {
        this.pages.add(page);
    }

    public int getNumberOfPages() {
        return this.pages.size();
    }
}

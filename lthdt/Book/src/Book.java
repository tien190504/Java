import java.util.ArrayList;
import java.util.List;

public class Book {
    private List<Chapter> chapters;

    public Book() {
        this.chapters = new ArrayList<>();
    }

    public void addChapter(Chapter chapter) {
        this.chapters.add(chapter);
    }

    public int getNumberOfChapters() {
        return this.chapters.size();
    }

    public int getTotalNumberOfPages() {
        int totalPages = 0;
        for (Chapter chapter : this.chapters) {
            totalPages += chapter.getNumberOfPages();
        }
        return totalPages;
    }
}

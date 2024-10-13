import java.util.*;
public class TestMain {
    public static void main(String[] args) {
        News news1 = new News(1, "Tin tuc 1", "04/04/2024", "Tac gia 1", "Noi dung 1", 4.5f);  
        News news2 = new News(2, "Tin tuc 2", "05/04/2024", "Tac gia 2", "Noi dung 2", 3.8f);
        News news3 = new News(3, "Tin tuc 3", "06/04/2024", "Tac gia 3", "Noi dung 3", 5.7f);

        List <News> listNews = new ArrayList<>();
        listNews.add(news1);
        listNews.add(news2);
        listNews.add(news3);

        Collections.sort(listNews);

        for (News news : listNews) {
            news.display();
            System.out.println();
        }
    }
}

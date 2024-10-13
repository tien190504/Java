public class News implements Inews, Comparable<News>{
    private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;

    //Contructor
    public News() {
    }
    public News(int iD, String title, String publishDate, String author, String content, float averageRate) {
        ID = iD;
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
        AverageRate = averageRate;
    }
    //Getter setter
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        Title = title;
    }
    public String getPublishDate() {
        return PublishDate;
    }
    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }
    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String author) {
        Author = author;
    }
    public String getContent() {
        return Content;
    }
    public void setContent(String content) {
        Content = content;
    }
    public float getAverageRate() {
        return AverageRate;
    }
    @Override
    public void display() {
        System.out.println("---- Tin tuc ----");
        System.out.println("ID: " + getID());
        System.out.println("Tieu đe: " + getTitle());
        System.out.println("Ngay đang: " + getPublishDate());
        System.out.println("Tac gia: " + getAuthor());
        System.out.println("Noi dung: " + getContent());
        System.out.println("Đanh gia trung binh: " + getAverageRate());
    }

    @Override
    public int compareTo(News o) {
        // TODO Auto-generated method stub
        return Float.compare(this.AverageRate, o.AverageRate);
    }
}

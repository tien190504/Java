public class Main {
    public static void main(String[] args) {
        Book book = new Book();

        // Thêm các chương vào sách
        Chapter chapter1 = new Chapter();
        chapter1.addPage(new Page()); // Thêm trang vào chương
        chapter1.addPage(new Page()); // Thêm trang vào chương

        Chapter chapter2 = new Chapter();
        chapter2.addPage(new Page()); // Thêm trang vào chương
        chapter2.addPage(new Page()); // Thêm trang vào chương

        book.addChapter(chapter1);
        book.addChapter(chapter2);

        // In ra số lượng chương và số trang của sách
        System.out.println("Số lượng chương: " + book.getNumberOfChapters());
        System.out.println("Số trang: " + book.getTotalNumberOfPages());
    }
}

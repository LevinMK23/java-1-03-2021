package lesson6.inner;

public class JournalTest {
    public static void main(String[] args) {
        Journal.Article article = new Journal().new Article();
        System.out.println(article.getClass());
    }
}

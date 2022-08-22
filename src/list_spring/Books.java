package list_spring;

/**
 * @author 高志浩
 * @version 1.0
 */
public class Books {
    private String bookName;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookName='" + bookName + '\'' +
                '}';
    }
}

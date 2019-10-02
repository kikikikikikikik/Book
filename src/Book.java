/**
 * @ClassName Book
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/9/28  17:11
 * @Veresion 1.0
 */
public class Book {
    String ISBN;
    String title;
    String author;
    int price;
    int sales;
    int comments;

    public Book(String ISBN, String title, String author, int price, int sales, int comments) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
        this.sales = sales;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", sales=" + sales +
                ", comments=" + comments +
                '}';
    }
    public  int CompareTo(Book o){
        return ISBN.compareTo(o.ISBN);
    }
}
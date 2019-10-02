import java.util.Comparator;

/**
 * @ClassName TitleComparator
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/10/2  15:32
 * @Veresion 1.0
 */
public class TitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.title.compareTo(o2.title);
    }
}

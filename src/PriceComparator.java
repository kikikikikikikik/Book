import java.util.Comparator;
import java.util.List;

/**
 * @ClassName PriceComparator
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/9/28  17:15
 * @Veresion 1.0
 */
public class PriceComparator implements Comparator<Book> {
    boolean asc;

    public PriceComparator(boolean asc) {
        this.asc = asc;
    }

    @Override
    public int compare(Book o1, Book o2) {
        if(asc){
            return o1.price-o2.price;
        }
        else
            return o2.price-o1.price;
    }
    public static void insertSort(List<Book> books, Comparator<Book> cmp){
        for(int i=1;i<books.size();i++){
            Book k=books.get(i);
            int j;
            for(j=i-1;j>=0&&cmp.compare(books.get(j),k)>0;j--){
               books.set(j+1,books.get(i));
            }
            books.set(j+1,k);
        }
    }
}

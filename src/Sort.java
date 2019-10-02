import java.util.List;
import java.util.Comparator;
/**
 * @ClassName Sort
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/10/2  15:22
 * @Veresion 1.0
 */
public class Sort {
    public static void sort(List<Book> books){
        for(int i=1;i<books.size();i++){
            int j=i-1;
            Book key=books.get(i);
            for(;j>=0&&books.get(j).CompareTo(key)>0;j--){
                books.set(j+1,books.get(j));
            }
            books.set(j+1,key);
        }
    }
    public static void sort(List<Book> books,Comparator<Book> comparator){
        for(int i=1;i<books.size();i++){
            int j=i-1;
            Book book=books.get(i);
            for(;j>=0&&comparator.compare(books.get(j),book)>0;j--){
                books.set(j+1,books.get(j));
            }
            books.set(j+1,book);
        }
    }
}

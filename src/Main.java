import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Main
   @Desc TODO
 * @Auther 28893
 * @Date 2019/9/28  17:21
 * @Veresion 1.0
 */
public class Main {
    public static void main(String[] args) {
        List<Book> books=new ArrayList<>();
        books.add(new Book("01","一号 ","一一",9,1,1));
        books.add(new Book("02","二号 ","一一",5,1,1));
        books.add(new Book("03","三号 ","一一",3,1,1));
        List<Book> copy;
        System.out.println("按自然顺序排序");
        copy=new ArrayList<>(books);
        Sort.sort(copy);
        System.out.println(copy);
        System.out.println("按价格排序");
        copy=new ArrayList<>(books);
        Sort.sort(copy,new PriceComparator(true));
        System.out.println(copy);
    }
}

import Dao.BookOptions;
import Objects.Books;

public class save_test1 {

    public static void main(String[] args){
        BookOptions bos = new BookOptions();
        Books book =new Books();
        book.setBookname("勇敢者游戏");
        book.setPrice(100);
        book.setDiscount(0.7);
        bos.saveBookInfo(book);
    }
}

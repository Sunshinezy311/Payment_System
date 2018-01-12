import Dao.BookOptions;
import Objects.Books;

public class find_test2 {
    public static void main(String[] args){
        BookOptions bof = new BookOptions();
        Books boo=new Books();
        boo.setBookname("勇敢者游戏");
        bof.getBookInfo(boo);
        System.out.println("name:"+boo.getBookname()+" price:"+boo.getPrice()+" discount:"+boo.getDiscount());
    }
}

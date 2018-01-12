package Services;

import Dao.BookOptions;
import Objects.Books;
import java.util.Scanner;

public class SaveBooks {
    public int saveBooks(){
        System.out.println("欢迎使用XX书店图书录入系统");
        System.out.println("请输入您需要录入的书籍数量：");
        Scanner s=new Scanner(System.in);
        Scanner name=new Scanner(System.in);
        Scanner price=new Scanner(System.in);
        Scanner discount=new Scanner(System.in);
        BookOptions sb=new BookOptions();
        int counts=s.nextInt();
        for(int i=1;i<=counts;i++){
            Books boo=new Books();
            System.out.println("请输入第"+i+"本书的书名：");
            boo.setBookname(name.nextLine());
            System.out.println("请输入"+boo.getBookname()+"的价格：");
            boo.setPrice(price.nextDouble());//未考虑输入有误
            System.out.println("请输入"+boo.getBookname()+"的折扣（用小数表示）：");
            boo.setDiscount(discount.nextDouble());//未考虑输入有误
            sb.saveBookInfo(boo);
            System.out.println("图书"+boo.getBookname()+"录入成功！");
        }
        Welcome wel=new Welcome();
        return wel.choose_Func();
    }
}

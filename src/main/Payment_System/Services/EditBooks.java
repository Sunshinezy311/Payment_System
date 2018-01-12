package Services;

import Dao.BookOptions;
import Objects.Books;
import java.util.Scanner;

public class EditBooks {
    public int editBooks(){
        System.out.println("欢迎使用xx书店图书信息更改系统");
        System.out.println("请选择功能：");
        System.out.println("1.删除图书信息 2.修改图书信息 \n按其他键退出");
        Scanner fun=new Scanner(System.in);
        int choose=fun.nextInt();
        Scanner s=new Scanner(System.in);
        Scanner name=new Scanner(System.in);
        Scanner price=new Scanner(System.in);
        Scanner discount=new Scanner(System.in);

        if(choose==1){
            BookOptions del=new BookOptions();
            Books book=new Books();
            System.out.println("请输入您要删除的图书数目");
            int counts = s.nextInt();
            for(int i=1;i<=counts;i++){
                System.out.println("请输入需要删除的书名：");
                book.setBookname(name.nextLine());
                del.deleteBook(book);
                System.out.println("图书"+book.getBookname()+"删除成功！");
            }
        }

        if(choose==2){
            BookOptions edit=new BookOptions();
            Books book=new Books();
            System.out.println("请输入需要修改的书的数量：");
            int count=s.nextInt();
            for(int i=1;i<=count;i++){
                System.out.println("请输入需要修改的书名：");
                book.setBookname(name.nextLine());
                System.out.println("请输入"+book.getBookname()+"新价格：");
                book.setPrice(price.nextDouble());
                System.out.println("请输入"+book.getBookname()+"新折扣：");
                book.setDiscount(discount.nextDouble());
                edit.editBookInfo(book);
                System.out.println("图书"+book.getBookname()+"信息修改成功！");
            }
        }
        Welcome wel=new Welcome();
        return wel.choose_Func();
    }
}

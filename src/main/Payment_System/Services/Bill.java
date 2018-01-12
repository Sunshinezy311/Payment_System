package Services;

import Dao.BookOptions;
import Objects.Books;

import java.util.Scanner;

public class Bill {
    public int payBooks(){
        System.out.println("欢迎使用xx书店结账系统");
        System.out.println("请输入购买图书数量：");
        Scanner s=new Scanner(System.in);
        Scanner name=new Scanner(System.in);
        BookOptions bp=new BookOptions();
        Books boo=new Books();
        double sum=0.0;
        int counts=s.nextInt();
        for(int i=1;i<=counts; i++){
            System.out.println("请输入第”+i“本书名：");
            boo.setBookname(name.nextLine());
            if(bp.getBookInfo(boo)){
                sum+=(boo.getPrice()*boo.getDiscount());
            }
            else{
                System.out.println("您输入的书名不存在，请重新输入！");
                i--;
            }
        }
        System.out.println("图书总价为："+sum+"元\n\n");
        Welcome wel=new Welcome();
        return wel.choose_Func();
    }
}

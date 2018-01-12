import Services.Bill;
import Services.EditBooks;
import Services.SaveBooks;
import Services.Welcome;

//问题1：暂时没有考虑图书重复问题；
//问题2：没有做进程锁，多进程时一个找书，一个删除书可能会出现问题
public class UI {
    public static void main(String args[]){
        //0.Objects.Books management
        Welcome wel = new Welcome();
        int choose = wel.choose_Func();
        while(choose>0&&choose<4){
            if(choose == 1){
                //1.Payment System
                Bill bil = new Bill();
                choose = bil.payBooks();
            }
            if(choose == 2){
                //2.Record the price and discount
                SaveBooks sb = new SaveBooks();
                choose = sb.saveBooks();
            }
            if(choose == 3){
                //3.renew the discount ratio
                EditBooks edb = new EditBooks();
                choose =edb.editBooks();
            }
        }
    }
}

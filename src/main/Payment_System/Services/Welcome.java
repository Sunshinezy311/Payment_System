package Services;

import java.util.Scanner;

public class Welcome {
    public int choose_Func(){
        System.out.println("欢迎使用xx书店图书管理系统");
        System.out.println("请选择功能：");
        System.out.println("1.结账 2.图书录入 3.修改/删除图书 \n按其他键退出");
        Scanner function=new Scanner(System.in);
        int num=function.nextInt();
        if(num==1){
            return 1;
        }else if(num==2){
            return 2;
        }else if(num ==3){
            return 3;
        }
        return 0;
    }
}

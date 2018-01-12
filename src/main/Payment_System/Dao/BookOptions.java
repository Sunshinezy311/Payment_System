package Dao;
import DBConnecter.DBUtils;
import Objects.Books;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookOptions {
    public boolean getBookInfo(Books bookinfo){
        Connection conn = DBUtils.getConnection();
        String find = "select * from books where bookname=?";
        try{
            PreparedStatement ps = conn.prepareStatement(find);
            ps.setString(1, bookinfo.getBookname());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){//这里不加rs.next()不会查询下一列
                bookinfo.setPrice(rs.getDouble(2));
                bookinfo.setDiscount(rs.getDouble(3));
            }
            rs.close();
            //conn.close();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public void saveBookInfo(Books book){
        Connection conn = DBUtils.getConnection();
        String insert = "insert into books(bookname,price,discount) value(?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1,book.getBookname());
            ps.setDouble(2,book.getPrice());
            ps.setDouble(3,book.getDiscount());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editBookInfo(Books book){
        Connection conn = DBUtils.getConnection();
        String update = "update books set bookname=replac(?,?,?)";
        try{
            PreparedStatement ps=conn.prepareStatement(update);
            ps.setString(1,book.getBookname());
            ps.setDouble(2,book.getPrice());
            ps.setDouble(3,book.getDiscount());
            ps.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void deleteBook(Books book){
        Connection conn = DBUtils.getConnection();
        String delete = "delete from books where bookname=?";
        try {
            PreparedStatement ps=conn.prepareStatement(delete);
            ps.setString(1,book.getBookname());
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

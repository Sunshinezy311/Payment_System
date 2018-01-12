package Dao;

import DBConnecter.DBUtils;
import Objects.Books;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookDao {


    public void findAllBooks(int id,String bookname) {
        Connection conn = DBUtils.getConnection();
        String sql = "insert into books(id,bookname) value(?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            ps.setString(2,bookname);
            ps.execute();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public void addBook(Books book){
//        Connection conn = DBUtils.getConnection();
//        String sql = "insert into books(id,bookcode,price,discount) value(?,?,?,?)";
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setInt(1,book.getId());
//            ps.setString(2,book.getBookname());
//            ps.setDouble(3,book.getPrice());
//            ps.setDouble(4,book.getDiscount());
//            ps.execute();
//            conn.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//   }

}

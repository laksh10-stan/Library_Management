/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cs
 */
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class myquery3 {
     public ArrayList<User2>BindTable(){
Connection conn;
   conn=javaconnect.ConnecrDb();
      ResultSet rs;
      PreparedStatement pst;
ArrayList<User2> list= new ArrayList<User2>();

    try{
         String sql="select Book_ID,Name,Edition,Author,Price,Pages,Image_B from Book";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
    User2 p;
    while(rs.next()){
        p= new User2(
        
            rs.getInt("Book_ID"),
        rs.getString("Name"),
     rs.getInt("Edition"),
    rs.getString("Author"),
                rs.getInt("Price"),
                rs.getInt("Pages"),
                rs.getBytes("Image_B")
             
   );
        list.add(p);
    }
    
        
    } catch (SQLException ex) {
        Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
    }
    return list;
}
}


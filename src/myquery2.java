
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cs
 */

public class myquery2 {
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akshay
 */


      
        
    public ArrayList<User1>BindTable(){
Connection conn;
   conn=javaconnect.ConnecrDb();
      ResultSet rs;
      PreparedStatement pst;
ArrayList<User1> list= new ArrayList<User1>();

    try{
         String sql="select Student_ID,Enroll_No,Branch,Year,Semester,Book_ID,BName,DOI,DORE,Image,ImageB from Renew";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
    User1 p;
    while(rs.next()){
        p= new User1(
                rs.getInt("Student_ID"),
        rs.getString("Enroll_No"),
     rs.getString("Branch"),
    rs.getInt("Year"),
                rs.getInt("Semester"),
                rs.getInt("Book_ID"),
                rs.getString("BName"),
                rs.getString("DOI"),
                rs.getString("DORE"),
                       rs.getBytes("Image"),
                rs.getBytes("ImageB")
                
   );
        list.add(p);
    }
    
        
    } catch (SQLException ex) {
        Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
    }
    return list;
}
}
    


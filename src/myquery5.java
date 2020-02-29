
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cs
 */import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class myquery5 {
    
    

     public ArrayList<User4>BindTable(){
Connection conn;
   conn=javaconnect.ConnecrDb();
      ResultSet rs;
      PreparedStatement pst;
ArrayList<User4> list= new ArrayList<User4>();
try{
         String sql="select Username,Name,Sec_Q,Answer,Image from Account";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
    User4 p;
    while(rs.next()){
        p= new User4(
                rs.getString("Username"),
        rs.getString("Name"),
     rs.getString("Sec_Q"),
    rs.getString("Answer"),
    
                rs.getBytes("Image")
             
   );
        list.add(p);
    }
    
        
    } catch (SQLException ex) {
        Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
    }
    return list;
}
}

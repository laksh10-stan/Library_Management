/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cs
 */
public class User4 {
     
  private String Username;
          private String name;
               private String sec;   
                       private String ans;

    private  byte[] image;
     public User4(){}
    
    public User4(String Username,String name,String Sec,String Ans,byte[]Image){
        
     this.Username=Username;
     this.name=name;
     this.sec=Sec;
     
      
    this.ans=Ans;
    this.image =Image;
     
    
    }
 User4(String string) {
        
    }

public String getUsername(){
    return Username;
}public void setUsername(String Username){
   this.Username=Username;
}
public String getname(){
    return name;
}public void setname(String name){
   this.name=name;
}
public String getSec(){
    return sec;
}public void setSec(String Sec ){
   this.sec=Sec;
}

public String getAns(){
    return ans;
} public void setAns(String Ans){
   this.ans=Ans;
}


public byte[] getImage(){
    return image;
     
            }    
}

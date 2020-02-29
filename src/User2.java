/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cs
 */
public class User2 {
 
     private int id1;
    private String Author;
    private int edition;
    private  byte[] Image;

    private int price;
    private int pages;
    private String Bname;
    
    public User2(){}
public User2(int id,String BName,int Edition,String Author,int Price,int Pages,byte[]Image){
        
        this.id1=id;
    this.edition=Edition;
    this.Bname=BName;
     
    this.Author =Author;
    this.Image =Image;
     
    this.pages=Pages;
    this.price =Price ;
    }
 User2(String string) {
        
    }
 public int getid(){
    return id1;
} public void setid(int id){
   this.id1=id;
}
public String getBName(){
    return Bname;
} public void setBName(String BName){
   this.Bname=BName;
}



public int getEdition(){
    return edition;
}public void setBranch(int Edition){
   this.edition=Edition;
}

public String getAuthor(){
    return Author;
}public void setAuthor(String Author){
   this.Author=Author;
}public int getPrice(){
    return price;
} public void setPrice(int Price){
   this.price=Price;
}
public int getPages(){
    return pages;
}public void setYear(int Pages){
   this.pages=Pages;
}


public byte[] getImage(){
    return Image;
}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cs
 */
public class User3 {
     private int id;
     private int id1;
  private String Enroll;
          private String Author;
    private String branch;
    private  byte[] Image;
     private  byte[] Image1;
    private int price;
    private int pages;
    private int edition;
    private String Bname;
    private String Doi;
    private String DOr;
    public User3(){}
    
    public User3(int Id,String BName,int Edition,String Author,int Price,int Pages,int id,String Enroll,String Branch,String DOI,byte[]Image,byte[] Image1){
        this.id =Id;
        this.id1=id;
     this.Enroll=Enroll;
     this.Author=Author;
     this.pages=Pages;
     this.price=Price;
     this.edition=Edition;
    this.Bname=BName;
     this.Doi =DOI;
      
    this.branch =Branch;
    this.Image =Image;
     this.Image1 =Image1;
    
    }
 User3(String string) {
        
    }
public int getId(){
    return id;
}
public void setId(int Id){
   this.id=Id;
}
public String getBName(){
    return Bname;
}public void setBName(String BName){
   this.Bname=BName;
}
public int getEdition(){
    return edition;
}public void setBName(int Edition){
   this.edition=Edition;
}
public String getAuthor(){
    return Author;
}public void setAuthor(String Author ){
   this.Author=Author;
}
public int getPrice(){
    return price;
}public void setYear(int Price){
   this.price=Price;
}
public int getPages(){
    return pages;
} public void setSemester(int Pages){
   this.pages=Pages;
}
public int getid(){
    return id1;
} public void setid(int id){
   this.id1=id;
}
public String getEnroll(){
    return Enroll;
} public void setEnroll(String Enroll){
   this.Enroll=Enroll;
}
public String getBranch(){
    return branch;
} public void setBranch(String Branch){
   this.branch=Branch;
}
public String getDOI(){
    return Doi;
} public void setDOI(String DOI){
   this.Doi=DOI;
}
public String getDOR(){
    return DOr;
} public void setDOR(String DOR){
   this.DOr=DOR;
}
public byte[] getImage(){
    return Image;
}
public byte[] getImage1(){
    return Image1;
}
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cs
 */
public class User1 {
     private int id;
     private int id1;
    private String enroll;
    private String branch;
    private  byte[] Image;
     private  byte[] Image1;
    private int year;
    private int sem;
    private String Bname;
    private String Doi;
    private String DOr;
    public User1(){}
    
    public User1(int Id,String Enroll_No,String Branch,int Year,int Semester,int id,String BName,String DOI,String DOR,byte[]Image,byte[] Image1){
        this.id =Id;
        this.id1=id;
     this.enroll =Enroll_No;
    this.Bname=BName;
     this.Doi =DOI;
      this.DOr =DOR;
    this.branch =Branch;
    this.Image =Image;
     this.Image1 =Image1;
    this.year =Year;
    this.sem =Semester ;
    }
 User1(String string) {
        
    }
public int getId(){
    return id;
}
public void setId(int Id){
   this.id=Id;
}
public String getEnroll_No(){
    return enroll;
}public void setName(String Enroll_No){
   this.enroll=Enroll_No;
}

public String getBranch(){
    return branch;
}public void setBranch(String Branch){
   this.branch=Branch;
}
public int getYear(){
    return year;
}public void setYear(int Year){
   this.year=Year;
}
public int getSemester(){
    return sem;
} public void setSemester(int Semester){
   this.sem=Semester;
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
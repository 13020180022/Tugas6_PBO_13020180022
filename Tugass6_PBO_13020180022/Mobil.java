//class Mobil sebagai sub class
public class Mobil extends overriding {
 
 //overriding method
 void bergerak(){
  System.out.println("Mobil bergerak");
 }
 
 public static void main (String args[]){
  
  //Membuat objek mobil
  Mobil mobil = new Mobil();
  
  //Objek mobil menggunakan method bergerak()
  mobil.bergerak();
 
}
}
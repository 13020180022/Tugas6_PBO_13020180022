class Binatang{ 
 void makan(){System.out.println("sedang makan...");
} 
} 

class Anjing extends Binatang{ 
 void gonggong(){System.out.println("guk guk...");
} 
}

 class Pewarisan {
 public static void main(String args[]){ 
  Anjing d=new Anjing(); 
  d.gonggong(); 
  d.makan(); 
 }
}
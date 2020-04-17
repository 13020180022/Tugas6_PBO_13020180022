public class atas {
public int a ;
protected int b;
private int c;
}

class bawah {
public static void main(String[] args) {
atas objek = new atas();
objek.a=2;
objek.b=3;
System.out.println("nilai a: "+objek.a);
System.out.println("nilai b: "+objek.b);
}
}
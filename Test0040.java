/*NIM 		: 13020210040
Nama 		: Nurmila Sari R. Usia
Hari/Tanggal	: Rabu, 29 Maret 2023*/

public class Test0040 {
    	public static void main(String[] args) {
        //a.instansi objek balok1
        Balok balok1 = new Balok();
        
        //b.instansi objek balok2
        Balok balok2 = new Balok(20, 35, 15);
        
        //c.set nilai l=5 
        balok1.setL(5);
        
        //d.set nilai p=25 
        balok1.setP(25);
        
        //e.set nilai t=10 
        balok2.setT(10);
        
        //f.Memanggil method info dari konstruktor Balok()
        balok1.info();
        
        //g.Memanggil method info dari konstruktor Balok(20,35, 15)
        balok2.info();
    	}
}

// class Balok
class Balok extends PersegiPanjang {
   	 int t;
   	 public Balok() {
        //h. nilai panjang & lebar dari konstruktor superclass PersegiPanjang dan tinggi = 15
        super();
        this.t = 15;
    } 
    public Balok(int p, int l, int t) {
        //i.nilai pada saat runtime p <- p, l <- l dari konstruktor superclass PersegiPanjang t <- t;
        super(p, l);
        this.t = t;
    }
    //j.Membuat getter setter class balok
    public int getC() {
        return t;
    }  
    public void setC(int t) {
        this.t = t;
    }
    public int volume() {
        //k.fungsi menghitung volume balok : p x l x t
  	     return getA() * getB() * t;
    }    
    public void info() {
        //l. fungsi untuk menampilkan nilai panjang, lebar, tinggi, Luas, dan volume balok
        System.out.println("Nilai panjang: " + getA());
        System.out.println("Nilai lebar: " + getB());
        System.out.println("Nilai tinggi: " + t);
        System.out.println("Nilai luas: " + luas());
        System.out.println("Nilai volume: " + volume());
    }
}
// class PersegiPanjang
class PersegiPanjang {
    int p, l;  
    public PersegiPanjang() {
        //m.nilai panjang=30 & lebar=20
        this.p = 30;
        this.l = 20;
    }

    public PersegiPanjang(int p, int l) {
        //n. nilai pada saat runtime p <- p, l <- l
        this.p = p;
        this.l = l;
    }
    
   	 // o. Membuat getter setter class PersegiPanjang
    public int getA() {
        return p;
    }
    
    public void setA(int p) {
        this.p = p;
    }
    public int getB() {
        return l;
    }
    public void setB(int l) {
        this.l = l;
    }
    public int luas() {
        //p. fungsi untuk menghitung luas persegi panjang : p x l
        return
		p*l;
	}
public int keliling(){
	//q. Fungsi menghitung keliling persegi panjang : 2x (p+l)
    return 2 * (p + l);
}
}
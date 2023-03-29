/*NIM 		: 13020210040
Nama 		: Nurmila Sari R. Usia
Hari/Tanggal	: Rabu, 08 Maret 2023*/

interface A {
    	public void aaa();
	}

interface B extends A {
    	}

class Central0040 implements B {
    public void aaa() {
        	System.out.println("aaa");
    }

    	public static void main(String arg[]) {
        	Central0040 obj = new Central0040();
        	System.out.println("main");
        	obj.aaa();
    }
}
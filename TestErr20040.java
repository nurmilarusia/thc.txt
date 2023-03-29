/*NIM 		: 13020210040
Nama 		: Nurmila Sari R. Usia
Hari/Tanggal	: Rabu, 29 Maret 2023*/

public class TestErr20040{
	public static void main(String[] args) {
     	int tot = 0;
      	int j = 0;
        for (int i = 0; i < 10; i++) {
	tot += i;
            	if (i < j) {
                	System.out.println(i);
            	} else {
                	System.out.println(j);
            	}
        }
       	 do {
            		j++;
        } while (j < 10);
        	while (j < 10) {
           		 j++;
        	}
        }
}
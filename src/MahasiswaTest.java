import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class MahasiswaTest {
	private static Mahasiswa m;
	
	@Before
	public void awalTest(){
		m = new Mahasiswa();
		System.out.println("Mengawali Testing");
	}
	
	@Test
	public void test1(){
		m.setNrp("133040294");
		assertNotNull("Seharusnya tidak null", m.getNrp());
	}
	
	@Test
	public void test2(){
		m.setNama(null);
		assertNull("Seharusnya Null", m.getNama());
	}
	
	@Test
	public void test3(){
		assertTrue("Seharusnya true", m.cekUmur(21));
	}
	
	@Test
	public void test4(){
		assertFalse("Seharusnya false", m.cekUmur(-1));
	}
	@Test
	public void test5(){
		assertTrue("Seharusnya true", m.cekUmur(101));
	}
	
	@Test
	public void test6(){
		assertSame("Harusnya","A", m.getIndex(4.0));
	}
	
	@Test
	public void test7(){
		assertSame("Harusnya","B", m.getIndex(3.5));
	}
	
	@Test
	public void test8(){
		assertSame("Harusnya","C", m.getIndex(2.3));
	}
	
	@Test
	public void test9(){
		assertNotSame("Harusnya","A", m.getIndex(5.0));
	}
	
	@Test
	public void test10(){
		assertSame("Harusnya","D", m.getIndex(-1.0));
	}
	@After
	public void akhirTest(){
		System.out.println("Mengakhiri Testing");
	}
	
}

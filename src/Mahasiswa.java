
public class Mahasiswa {
	
	private String nama, nrp;
	private int umur;
	private double ipk;
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNrp() {
		return nrp;
	}
	public void setNrp(String nrp) {
		this.nrp = nrp;
	}
	public int getUmur() {
		return umur;
	}
	public void setUmur(int umur) {
		this.umur = umur;
	}
	
	public double getIpk() {
		return ipk;
	}
	public void setIpk(double ipk) {
		this.ipk = ipk;
	}
	
	
	public boolean cekUmur(int umur){
		boolean toReturn = false;
		
		if(umur >= 0 && umur <= 100){
			toReturn = true;
		}
		
		return  toReturn;
	}
	
	public String getIndex(double ipk){
		String toReturn = null;
		
		if (ipk == 4.00) {
			toReturn = "A";
		}else if (ipk == 3.00) {
			toReturn = "B";
		}else if (ipk == 2.00) {
			toReturn = "C";
		}else if (ipk < 1.00) {
			toReturn = "D";
		}else{
			toReturn = "none";
		}
		
		return toReturn;
	}
	 
	
	 
}

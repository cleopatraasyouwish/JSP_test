package be.intec.ENTITIES;

public class TasKoffie {
	private String koffieSoort;
	private String merk;
	
	public TasKoffie(String koffieSoort, String merk) {
		
		this.koffieSoort = koffieSoort;
		this.merk = merk;
	}
	public String getKoffieSoort() {
		return koffieSoort;
	}
	public void setKoffieSoort(String koffieSoort) {
		this.koffieSoort = koffieSoort;
	}
	public String getMerk() {
		return merk;
	}
	public void setMerk(String merk) {
		this.merk = merk;
	}
	
	
	
}

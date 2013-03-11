package be.intec.ENTITIES;

public class Bookmark {
		private String naam;
		private String url;
		private String onderwerp;
		private int sterren;
		public Bookmark(String naam, String url, String onderwerp, int sterren) {
			
			this.naam = naam;
			this.url = url;
			this.onderwerp = onderwerp;
			this.sterren = sterren;
		}
		public String getNaam() {
			return naam;
		}
		public void setNaam(String naam) {
			this.naam = naam;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getOnderwerp() {
			return onderwerp;
		}
		public void setOnderwerp(String onderwerp) {
			this.onderwerp = onderwerp;
		}
		public int getSterren() {
			return sterren;
		}
		public void setSterren(int sterren) {
			this.sterren = sterren;
		}
			
		
		
		
		
		
}

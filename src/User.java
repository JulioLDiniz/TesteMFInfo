import java.text.DecimalFormat;

public class User {
	private String name,registration;
	private double t1,t2,t3,media;
	
	public User() {}
	
	public  User (String name, String registration) {
		this.name = name;
		this.registration = registration;
	}
	
	public String retorna_media(double t1, double t2, double t3) {
		this.t1 = t1;
		this.t2 = t2*2;
		this.t3 = t3*3;
		this.media = (this.t1+this.t2+this.t3)/6;
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		return df.format(media);
	}
	
	public String escreve_arquivo_saida_json() {
		return "{ \"name\" : \""+this.name+"\", \"registration\":\""+this.registration+"\", \"t1\":\""+this.t1+"\", \"t2\":\""+this.t2+
				"\", \"t3\":\""+this.t3+"\"}";
	}
	
	
	
	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getT1() {
		return t1;
	}

	public void setT1(double t1) {
		this.t1 = t1;
	}

	public double getT2() {
		return t2;
	}

	public void setT2(double t2) {
		this.t2 = t2;
	}
	

	public double getT3() {
		return t3;
	}

	public void setT3(double t3) {
		this.t3 = t3;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	@Override
	public String toString() {
		
		return "Nome:"+name;
	}
}

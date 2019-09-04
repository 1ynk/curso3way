package br.enumm;

public enum WhoIsRir {
	
	ARIN("whois.arin.net"),
	RIPE("whois.ripe.net"),
	APNIC("whois.apnic.net"),
	AFRINIC("whois.afrinic.net"),
	LACNIC("whois.lacnic.net"),
	JPNIC("whois.jpnic.net"),
	KRNIC("whois.krnic.net"),
	CNNIC("whois.cnnic.net"),
	UNKNOWN("");
	
	private String url;
	
	WhoIsRir(String url){
		this.url = url;
	}
	public String url() {
		return url;
	}

}

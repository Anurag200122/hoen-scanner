package com.skyscanner;

public class SearchResult {
	
	private String city;
	
	private String title;
	
	private String kind;
	
	public SearchResult() {
		
	}

	public SearchResult(String city,String title, String kind) {
		this.city=city;
		this.title=title;
		this.kind=kind;
	}
	
	public String getcity() {
		return city;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getKind() {
		return kind;
	}
}


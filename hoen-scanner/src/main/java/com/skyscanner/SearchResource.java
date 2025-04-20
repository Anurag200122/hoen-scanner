package com.skyscanner;

import java.util.ArrayList;
import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.*;
import jakarta.ws.rs.Produces;

@Path("/search")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class SearchResource {
	
	List<SearchResult> searchResults;
	public SearchResource(List<SearchResult> searchResult) {
		this.searchResults=searchResults;
	}
	
	@POST
	public List<SearchResult> search(@NotNull @Valid Search search){
		List<SearchResult> response= new ArrayList<>();
		for(SearchResult results: searchResults) {
		if(results.getcity().equals(search.getcity())) {
			response.add(results);
		}
		}
		return response;
	}
	
	

}

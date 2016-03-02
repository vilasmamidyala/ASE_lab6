package com.assignment.lab;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/wconvert")
public class Weight {
	@GET
	@Produces("application/xml")
	public String Wconversion(){
		 
		Double wei= 1.0;
		Double pound;
		Double ounce;
		
		pound=(wei*2.20462);
		ounce=(wei*35.274);
		
		String result="Output: Weight converted from kg to pounds and ounces \n\n" + pound +" and "+ ounce;
		return "<Weight>" + "<kg>" + wei + "</kg>" + "<pound>" + pound + "</pound>" + "<ounce>" + ounce + "</ounce>" + "<output>" + result + "</output>" + "</Weight>";
		
	}
		@Path("{k}")
		@GET
		@Produces("application/xml")
		
		public String WeightConvert(@PathParam("k") Double k) {
			Double wei = k;
			Double pound;
			Double ounce;
			
			pound=(wei*2.20462);
			ounce=(wei*35.274);
			
			String result="Output: Weight converted from kg to pounds and ounces \n\n" + pound +" and "+ ounce;
			return "<Weight>" + "<kg>" + wei + "</kg>" + "<pound>" + pound + "</pound>" + "<ounce>" + ounce + "</ounce>" + "<output>" + result + "</output>" + "</Weight>";		
		}

}


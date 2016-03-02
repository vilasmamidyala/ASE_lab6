package com.assignment.lab;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
@Path("/hconvert")
public class Height {
	@GET
	@Produces("application/xml")
	public String Hconversion(){
		 
		Double feet= 1.0;
		Double inch= 0.0;
		Double cm;
		
		cm=(feet*30.48)+(inch*2.54);
		
		String result="Output: Height converted in CM \n\n" + cm;
		return "<Height>" + "<feet>" + feet + "</feet>" + "<inch>" + inch + "</inch>" + "<Heightoutput>" + result + "</Heightoutput>" + "</Height>";
		
	}
		@Path("{f}/{i}")
		@GET
		@Produces("application/xml")
		
		public String HeightConvert(@PathParam("f") Double f,@PathParam("i") Double i) {
			Double feet = f;
			Double inch = i;
			Double cm;
			
			cm=(feet*30.48)+(inch*2.54);
	 			
			String result="Output: Height converted in CM \n\n" + cm;
			return "<Height>" + "<feet>" + feet + "</feet>" + "<inch>" + inch + "</inch>" + "<Heightoutput>" + result + "</Heightoutput>" + "</Height>";
				
		}

}


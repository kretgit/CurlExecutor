package ru.sbrf.ca.jira;

import org.apache.commons.io.IOUtils;



public class CurlExecutor {

	public static void main(String[] args) {

		
		Runtime runtime = Runtime.getRuntime();
		
		try {
			
			//Process process = runtime.exec("curl -D- -u yyyyyyyy -X GET -H \"Content-Type: application/json\" "
					//+ "https://jira.zzzzzzz.ru/rest/api/2/search?jql=project%20%3D%20OU");
			
			Process process = runtime.exec("ifconfig");
			
			
			
			int resultCode = process.waitFor();
			
			
			if (resultCode == 0) {
				System.out.println("is: " + IOUtils.toString(process.getInputStream()));


			} else {
				System.out.println(process);

			}
		} catch (Throwable cause) {
			//System.out.println("es: " + IOUtils.toString(process.getErrorStream()));
		}
		
		
		
	}

}

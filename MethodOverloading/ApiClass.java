package MethodOverloading;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ApiClass {
	public void sendRequest(String endpoint) {
		System.out.println(endpoint);
		
	}
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
		System.out.println(endpoint);
		System.out.println(requestBody);
		System.out.println(requestStatus);
		
	}

	public static void main(String[] args) {
		ApiClass obj=new ApiClass();
		obj.sendRequest("shiva");
		obj.sendRequest("pavi", "kuppusamy", false);
		

	}

}

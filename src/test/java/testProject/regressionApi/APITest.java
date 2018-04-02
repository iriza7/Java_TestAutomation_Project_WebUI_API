package testProject.regressionApi;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.lang.reflect.Array;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.commons.lang.time.StopWatch;

import static org.testng.Assert.assertEquals;

public class APITest {

	//Test1 - Response code is 200
	@Test
	public void test01Status() {

		Client client = Client.create();

		WebResource resource = client
				.resource("https://jsonplaceholder.typicode.com/photos");
		ClientResponse response = resource.accept("application/json").get(
				ClientResponse.class);

		Assert.assertEquals(response.getStatus(), 200);
	}

	// Test2 - Response time should be below 2s
	@Test
	public void test02ResponseTime() {

		Client client = Client.create();
		
		StopWatch pageLoad = new StopWatch();
		pageLoad.start();

		WebResource resource = client
				.resource("https://jsonplaceholder.typicode.com/photos");
		ClientResponse response = resource.accept("application/json").get(
				ClientResponse.class);

		pageLoad.stop();
		long pageLoadTime_ms = pageLoad.getTime();

		// Test Response Time < 2000 miliseconds
		assertTrue(pageLoadTime_ms < 2000);
	}
	
	
	// Test3 - Every photo has a “title” in it
		@Test
		public void test03Title() {

			Client client = Client.create();

			WebResource resource = client
					.resource("https://jsonplaceholder.typicode.com/photos");
			ClientResponse response = resource.accept("application/json").get(
					ClientResponse.class);
			
			JSONArray responseArray = resource.get(
					JSONArray.class);

			
			
			for (int i = 0; i < responseArray.length(); i++) {
				JSONObject photo = (JSONObject) responseArray.get(i);
				System.out.println("jsonobj");
				System.out.println(photo);
				
			}
			
			/*String output = response.getEntity(String.class);
			
			  JSONObject object1 = new JSONObject(output);
			  
			  System.out.println(object1);*/
		}
}

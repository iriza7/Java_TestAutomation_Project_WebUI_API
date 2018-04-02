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

	// Api Test1 - Response code is 200
	@Test
	public void testApi01Status() {

		Client client = Client.create();

		WebResource resource = client
				.resource("https://jsonplaceholder.typicode.com/photos");
		ClientResponse response = resource.accept("application/json").get(
				ClientResponse.class);

		Assert.assertEquals(response.getStatus(), 200);
	}

	// Api Test2 - Response time should be below 2s
	@Test
	public void testApi02ResponseTime() {

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

	// Api Test3 - has a “title” in it
	@Test
	public void testApi03Title() {

		Client client = Client.create();
		
		WebResource resource = client
				.resource("https://jsonplaceholder.typicode.com/photos");
		ClientResponse response = resource.accept("application/json").get(
				ClientResponse.class);

		String output = response.getEntity(String.class);
		assertTrue(output.contains("title"));
	}
}

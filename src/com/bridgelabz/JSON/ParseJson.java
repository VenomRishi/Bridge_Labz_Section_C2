
package com.bridgelabz.JSON;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ParseJson {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// creating JSONObject
		JSONObject jo = new JSONObject();

		// putting data to JSONObject
		jo.put("firstName", "John");
		jo.put("lastName", "Smith");
		jo.put("age", 25);

		// for address data, first create LinkedHashMap
		Map m = new LinkedHashMap(4);
		m.put("streetAddress", "21 2nd Street");
		m.put("city", "New York");
		m.put("state", "NY");
		m.put("postalCode", 10021);

		// putting address to JSONObject
		jo.put("address", m);

		// for phone numbers, first create JSONArray
		JSONArray ja = new JSONArray();

		m = new LinkedHashMap(2);
		m.put("type", "home");
		m.put("number", "212 555-1234");

		// adding map to list
		ja.add(m);

		m = new LinkedHashMap(2);
		m.put("type", "fax");
		m.put("number", "212 555-1234");

		// adding map to list
		ja.add(m);

		// putting phoneNumbers to JSONObject
		jo.put("phoneNumbers", ja);

		// writing JSON to file:"JSONExample.json" in cwd
		PrintWriter pw = new PrintWriter("/home/admin1/git/Bridge_Labz_Section_C2/src/com/bridgelabz/files/JSONExample.json");
		pw.write(jo.toJSONString());

		pw.flush();
		pw.close();
	}

}

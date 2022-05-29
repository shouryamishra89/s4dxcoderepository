package com.assignment;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

public class FinderTest {

	@Test
	public void testFind() throws FileNotFoundException, IOException, ParseException {
		List<String> expectedlist = new ArrayList<>();
		String[] input = { "asd", "asdd", "fre", "ccs", "lkm", "gdo", "ads", "sadd", "mlk", "erf", "kml" };
		Finder finder = new Finder(input);

		JSONParser parser = new JSONParser();

		File file = new File(this.getClass().getClassLoader().getResource("sample.json").getFile());

		Object obj = parser.parse(new FileReader(file));

		String inputValue = "sad";

		JSONObject jsonObject = (JSONObject) obj;

		JSONArray exp = (JSONArray) jsonObject.get(inputValue);

		for (int i = 0; i < exp.size(); i++) {

			expectedlist.add((String) exp.get(i));

		}

		assertEquals(expectedlist, finder.find(inputValue));

	}

}

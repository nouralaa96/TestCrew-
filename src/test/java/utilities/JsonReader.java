package utilities;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonReader {

    public static List<Map<String, Object>> readJsonData(String filePath, String jsonPath) throws Exception {
        // Create a JSON parser to parse the JSON file.
        JSONParser parser = new JSONParser();

        // Create a FileReader to read the JSON file from the specified path.
        FileReader reader = new FileReader(filePath);

        // Parse the JSON file into a JSONObject.
        Object obj = parser.parse(reader);
        JSONObject jsonObject = (JSONObject) obj;

        // Create a list to store the data.
        List<Map<String, Object>> data = new ArrayList<>();

        // Use a simplified JSON path to access the desired JSONArray.
        JSONArray jsonArray = (JSONArray) jsonObject.get(jsonPath);

        // Iterate through the JSON array.
        for (int i = 0; i < jsonArray.size(); i++) {
            // Get the JSON object at the current index.
            jsonObject = (JSONObject) jsonArray.get(i);

            // Create a map to store key-value pairs from the JSON object.
            Map<String, Object> map = new HashMap<>();

            // Iterate through the keys of the JSON object.
            for (Object key : jsonObject.keySet()) {
                // Add key-value pairs to the map.
                map.put((String) key, jsonObject.get(key));
            }

            // Add the map to the data list.
            data.add(map);
        }

        // Return the list of maps containing the JSON data.
        return data;
    }



}

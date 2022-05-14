package crudjson;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.*;

public class create{
	static int acc = 100;
	@SuppressWarnings("unchecked")
	public void createacc(JSONArray bank,String name,Integer bal,String type){
		JSONObject cutomerdetails = new JSONObject();
		cutomerdetails.put("name",name);
		cutomerdetails.put("bal",Integer.toString(bal));
		cutomerdetails.put("type",type);
		JSONObject cutomerobject = new JSONObject();
		cutomerobject.put(Integer.toString(acc), cutomerdetails);
		acc = acc+1;
		bank.add(cutomerobject);
		try (FileWriter file = new FileWriter("/home/sakthi/hacking/tmp/json/jsonfinalproject/src/accdetails.json")) {
            file.write(bank.toJSONString()); 
            file.flush();
            System.out.println("successfully inserted a data!");
        } catch (IOException e) {
            e.printStackTrace();
        }



	}
}
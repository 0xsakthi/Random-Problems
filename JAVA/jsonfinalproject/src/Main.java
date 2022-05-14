import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.*;
import crudjson.*;
@SuppressWarnings("Checked")

class Main{
	public static void main(String[] args) {
		try(Reader reader = new FileReader("/home/sakthi/hacking/tmp/json/jsonfinalproject/src/accdetails.json")){
			JSONParser parser = new JSONParser();
			JSONArray data = (JSONArray) parser.parse(reader);
			// create c = new create();
			// c.createacc(data,"Thariq",902,"saving");
			update u = new update();
			// u.deposit(data,"100",500);
			u.withdraw(data,"102",8);	
		}
			catch(Exception e){
			System.out.print("Error occured in main program!");
		}
	}
}
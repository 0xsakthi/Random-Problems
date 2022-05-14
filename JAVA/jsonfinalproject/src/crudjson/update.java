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

public class update{
	public void update(JSONArray bank) throws Exception{
		FileWriter file = new FileWriter("/home/sakthi/hacking/tmp/json/jsonfinalproject/src/accdetails.json");
		file.write(bank.toJSONString());
		file.flush();
	}
	public void withdraw(JSONArray bank,String acc,Integer bal){
		for(int i=0;i<4;i++){
			try{
			JSONObject newbank = (JSONObject) bank.get(i);
			JSONObject newbankobject = (JSONObject) newbank.get(acc);
			if(newbankobject!=null){
				String oldbal = (String)newbankobject.get("bal");
				Integer currbal = Integer.parseInt(oldbal);
				if(currbal>=bal){
					currbal = currbal-bal;
					JSONObject cutomerdetails = new JSONObject();
					cutomerdetails.put("name",(String)newbankobject.get("name"));
					cutomerdetails.put("bal",Integer.toString(currbal));
					cutomerdetails.put("type",(String)newbankobject.get("type"));
					JSONObject cutomerobject = new JSONObject();
					cutomerobject.put(acc, cutomerdetails);
					bank.remove(i);
					bank.add(cutomerobject);
					System.out.print(bank);
					update(bank);
				}else{
					System.out.println("we dont have that much of balance!");
					break;
				}
			}
			}catch(Exception e){
				System.out.print("something error in update!");
			}
		}
	}
	public void deposit(JSONArray bank,String acc,Integer bal){
		//identify wheather(index num(to delete)) our json object is located 
		for(int i=0;i<3;i++){
			try{
				JSONObject newbank = (JSONObject) bank.get(i);
				JSONObject newbankobject = (JSONObject) newbank.get(acc);
				if(newbankobject!=null){
					String name = (String)newbankobject.get("name");
					String oldbal = (String)newbankobject.get("bal");
					Integer newbal = (Integer.parseInt(oldbal))+bal;
					JSONObject cutomerdetails = new JSONObject();
					cutomerdetails.put("name",name);
					cutomerdetails.put("bal",Integer.toString(newbal));
					cutomerdetails.put("type",(String)newbankobject.get("type"));
					JSONObject cutomerobject = new JSONObject();
					cutomerobject.put(acc, cutomerdetails);
					bank.remove(i);
					bank.add(cutomerobject);
					update(bank);
					// System.out.print(bank);
					// FileWriter file = new FileWriter("/home/sakthi/hacking/tmp/json/jsonfinalproject/src/accdetails.json");
					// file.write(bank.toJSONString());
					// file.flush();
				}
			}catch(Exception e){
				continue;
			}
		}
	}
}
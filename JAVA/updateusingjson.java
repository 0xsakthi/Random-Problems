import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.*;
@SuppressWarnings("Checked")

class Main{
	public static void writi(JSONArray employee,String acc,String name,Integer bal){
		System.out.println("iam from writi "+employee);
		JSONObject cutomerdetails = new JSONObject();
		cutomerdetails.put("name",name);
		cutomerdetails.put("bal",bal);
		JSONObject cutomerobject = new JSONObject(); 
        cutomerobject.put(acc, cutomerdetails);
        employee.add(cutomerobject);
        System.out.print("updated+ "+employee);
        try (FileWriter file = new FileWriter("employees.json")) {
            file.write(employee.toJSONString()); 
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}

	public static boolean deposit(JSONObject bank,Integer depositamt,String id){
		try{

		JSONObject bankobject =(JSONObject)bank.get(id);
		//return true weather given id is in or out!
		if(bankobject!=null){
			System.out.println(bankobject);
			return true;
		}
		return false;
		}
		catch(Exception e){
			return false;
		}

	}
	public static boolean check(JSONObject employee,Integer withbal){
		try{
			JSONObject employeeObject = (JSONObject) employee.get("101");
			String name = (String)employeeObject.get("name");
			String bal = (String)(employeeObject.get("bal"));
			System.out.println(Integer.parseInt(bal)+20);
			if(withbal>=withbal){
				return true;
			}
			return false;
		}
		catch(Exception e){
			return false;
		}
	} 
	public static void deleteSome(JSONArray employee){
		// System.out.print(employee.get(0));
		// for(int i=0;i<2;i++){
		// 	if(check((JSONObject) employee.get(i),20)){
		// 		System.out.println(i);
		// 	}
		// }
		for(int i=0;i<2;i++){
			if(deposit((JSONObject) employee.get(i),201,"101")){
				JSONObject employee1 = (JSONObject) employee.get(i);
				JSONObject employeeObject = (JSONObject) employee1.get("101");
				String name = (String)employeeObject.get("name");
				String oldbal = (String)employeeObject.get("bal");
				Integer bal = (Integer.parseInt(oldbal))+201; //updated bal
				System.out.print(bal);
				employee.remove(i); //delete the stored value
				// System.out.print(employee);
				writi(employee,"101",name,bal);
				break;
			}
		}

	}
	public static void main(String[] args) {
		try(Reader reader = new FileReader("employees.json")){
			JSONParser parser = new JSONParser();
			JSONArray data = (JSONArray) parser.parse(reader);
			// System.out.println(data.get(1));
			deleteSome(data);
			// data.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
		}
		catch(Exception e){
			System.out.print("Error Occured!");
		}
	}
}

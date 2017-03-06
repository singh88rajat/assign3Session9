package assign3Session9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class genericDemo {
	
	public static void main(String[] args) {
		
		//Single Entry Example
				Map<String, String> map = new HashMap<>();
				
				List<Map<String, String>> mapList = new ArrayList<>();
				
				map.put("EmpCode","1");
				map.put("EmpName", "Karan");
				mapList.add(map);
				
				map = new HashMap<>();
				map.put("EmpCode","2");
				map.put("EmpName", "Raj");
				mapList.add(map);
				
				map = new HashMap<>();
				map.put("EmpCode","3");
				map.put("EmpName", "Sidharth");
				mapList.add(map);
				
				
				for(int i=0;i<mapList.size();i++)
				{
					Map<String, String> m = mapList.get(i);
					
					System.out.println(m.get("EmpName"));
					System.out.println("===================");
					
					
				}
		
	}

}

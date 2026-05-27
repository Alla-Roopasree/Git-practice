package PropertiesFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropsCLASS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties props= new Properties();
		File file=new File(".\\Application.properties");
		if(!file.exists())
			file.createNewFile();
		FileInputStream fis= new FileInputStream(file);
		FileOutputStream fos= new FileOutputStream(file);
		props.load(fis);
		props.setProperty("yu", "https:\\youtube.com");
		props.store(fos, "This is property class");
		
		
		System.out.println(props.containsKey("yu"));
		System.out.println(props.containsValue("https:\\youtube.com"));
//		System.out.println(props.contains("yu","https:\\youtube.com"));
		props.load(fis);
		props.setProperty("yu", "jkf");
		props.load(fis);
		props.put("roopa", "set");
		
//		props.store(null, null);
		Set<String> names=props.stringPropertyNames();
		Set<Object> name=props.keySet();
		Collection<Object> collect = props.values();
		Set<Entry<Object,Object>> set = props.entrySet();
		props.remove("yu");
		props.store(fos, "This is property class");
		for(Entry<Object,Object> item:set)
		{
			System.out.print(item.getKey()+" : ");
			System.out.print(props.getProperty((String)item.getKey()));
		
		}
		
	
	}

}
abstract class ca{
	
}

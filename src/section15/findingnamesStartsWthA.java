package section15;

import java.util.ArrayList;

public class findingnamesStartsWthA {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Hemanth");
		names.add("Amir");
		names.add("Sitara");
		names.add("Pavan");
		names.add("Shiv");
		int count=0;
		
		for(int i=0;i<names.size();i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
				System.out.println(names.get(i));
			}
		}
System.out.println(count);
	}

}

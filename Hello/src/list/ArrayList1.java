package list;
import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		
		
		
		List<String> g=new ArrayList<>();
		List<String> v=new ArrayList();
		g.add("Go");
		g.add("Gopro");
		g.add("Mia");
		g.size();
		
		v.add("Tomoto");
		v.add("Bataka");
		
		g.addAll(v);
		//g.clear();
		
		
		System.out.println(g);
		System.out.println(g);
		System.out.println(g.get(2));
		g.set(1,"Gova");
		g.remove(4);
		g.removeAll(v);
		System.out.println(g);
		System.out.println(g.contains("Mia"));
		
		String tem[]=new String[g.size()];
		g.toArray(tem);
		
		for(String e:tem)
			System.out.println(e);

//			Pair<String,Integer> p=new Pair("Gohel",45); //Generaric class
//			p.getDes();
		
	}

}

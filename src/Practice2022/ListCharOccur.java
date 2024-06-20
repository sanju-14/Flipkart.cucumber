package Practice2022;

import java.util.ArrayList;
import java.util.HashSet;

public class ListCharOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//ArrayList<String> al=new ArrayList<String>(Arrays.asList("India","China","Bhutan","Srilanka","India","China","Bhutan","India"));

		ArrayList<String> al = new ArrayList();
		al.add("Bhutan");
		al.add("China");
		al.add("Srilanka");
		al.add("India");
		al.add("India");
		al.add("China");
		al.add("India");

		HashSet<String> hs = new HashSet<String>();

		for (int i = 0; i < al.size(); i++) {

			hs.add(al.get(i));

		}

		for (String str : hs) {

				//System.out.println(str);

			int count = 0;

			for (int i = 0; i < al.size(); i++) {

				if (str.equals(al.get(i))) {

					count++;
				}
			}

			if (count > 1) {

				System.out.println(str + count);

			} else {

				System.out.println(str + 1);
			}

		}

	}

}

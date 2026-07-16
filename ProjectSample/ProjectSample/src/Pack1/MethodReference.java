package Pack1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;


public class MethodReference {

	public static void main(String[] args) {

		List<String> ls = new ArrayList<>();
		ls.add("Apple");
		ls.add("banana");
		ls.add("Muskmelon");
		ls.add("Grapes");
		Function<List<String>, Set<String>> lst = (listlu) -> new HashSet<>(listlu);
		System.out.println(lst.apply(ls));
		
		Function<List<String>, Set<String>> mref = HashSet::new;
		System.out.println(mref.apply(ls));
	}
}

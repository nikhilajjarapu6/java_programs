package ListInterface;

import java.util.ArrayList;
import java.util.Collections;

public class SortElements {
public static void main(String[] args) {
	ArrayList<String> names = new ArrayList<>();
    names.add("John");
    names.add("Alice");
    names.add("Bob");
    names.add("Carol");
    
    System.out.println("Original Order "+names);
    
    Collections.sort(names);
    System.out.println("sorted Order "+names);
}
}

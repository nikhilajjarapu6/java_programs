package ListInterface;

import java.util.ArrayList;
import java.util.Collections;

public class RevereseElements {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        
        System.out.println("original list "+colors);
        
        Collections.reverse(colors);
        
        System.out.println("Reversed List "+colors);
	}
}

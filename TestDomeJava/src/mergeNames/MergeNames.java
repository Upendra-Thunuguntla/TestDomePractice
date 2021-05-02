package mergeNames;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
        
    	//Using Stream.of()
    	String[] output1 = Stream.of(names1,names2).flatMap(Stream::of).distinct().toArray(String[]::new);
    	
    	//Using Stream.concat()
    	String[] output2 = Stream.concat(Arrays.stream(names1), Arrays.stream(names2)).distinct().toArray(String[]::new);
    	
    	//Using Set to remove duplicate elements
    	Set<String> op3Set = new HashSet<String>();
    	for (String str : names1) {	op3Set.add(str); }
    	for (String str : names2) { op3Set.add(str); }
    	
    	String[] output3 = op3Set.toArray(new String[0]);
    	
    	
    	//Using Collections instead of general for Loop to add elements to Set
    	Set<String> op4Set = new HashSet<String>();
    	Collections.addAll(op4Set,names1);
    	Collections.addAll(op4Set,names2);
    	String[] output4 = op3Set.toArray(new String[0]);
    	
    	return output4;
        
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
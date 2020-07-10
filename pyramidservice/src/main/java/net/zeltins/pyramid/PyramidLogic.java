package net.zeltins.pyramid;
import java.util.*;

public class PyramidLogic {

	public static boolean IsPyramidWord(String s) {
		
		int[] frequencies = BuildFrequencyMap(s).values().stream().mapToInt(v -> (int)v).toArray();
		
		Arrays.sort(frequencies);
		
		for (int i=0; i<frequencies.length; i++) {
			if ( frequencies[i] != i+1 ) {
				return false;
			}
		}
		
		return true;
		
	}
	
	private static Map<Character,Integer> BuildFrequencyMap(String s) {
		HashMap<Character,Integer> frequencyMap = new HashMap<Character,Integer>();
		
		for (char c : s.toCharArray()) {
			Integer frequency = frequencyMap.computeIfAbsent(c, f -> (Integer)0);
			frequencyMap.put(c, ++frequency);
		}
		
		return frequencyMap;
	}
	
}

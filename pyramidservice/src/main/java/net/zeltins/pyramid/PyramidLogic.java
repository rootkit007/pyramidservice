package net.zeltins.pyramid;
import java.util.*;

public class PyramidLogic {

	/*
	  Problem statement: Accept a string as input and return a response indicating whether a word is a pyramid word.  A word is a ‘pyramid’ word if you can arrange the letters in increasing frequency, starting with 1 and continuing without gaps and without duplicates.
		Examples:
		banana is a pyramid word because you have 1 'b', 2 'n's, and 3 'a's.
		bandana is not a pyramid word because you have 1 'b' and 1 'd'.
	 */
	
	/**
	 * @param s Word to be evaluated
	 * @return True if word is deemed to be "pyramid" word
	 */
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
	
	/**
	 * @param s Word to be analyzed
	 * @return Map containing frequencies of each unique character in the passed word
	 */
	private static Map<Character,Integer> BuildFrequencyMap(String s) {
		HashMap<Character,Integer> frequencyMap = new HashMap<Character,Integer>();
		
		for (char c : s.toCharArray()) {
			Integer frequency = frequencyMap.computeIfAbsent(c, f -> (Integer)0);
			frequencyMap.put(c, ++frequency);
		}
		
		return frequencyMap;
	}
	
}

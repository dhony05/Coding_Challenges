package random_challenges;

import java.util.ArrayList;
import java.util.HashMap;

public class AverageGradeForStudent {

	
	/**
	 * Given  a 2D String array where every row represents a test ->["student_name","test_score"],
	 * It's also possible that students took multiple tests.
	 * return the best Avg score
	 * 
	 * 
	 * cases 
	 * empty input best AVg score should be 0
	 * negative and positive score are valid 
	 * if avg of scores is a double, return the floor of that avg
	 * 
	 *
		 * Input :[
		 * 
		 * ["Chris"]["100"]
		 * ["Donny"]["90"]
		 * ["Chris"]["30"]
		 * 
		 * ]
		 * 
		 * Output : 90
		 */
	
	public static void main(String[] args) {
		
		String[][] stGrades = {
				{
					"Chris","100"
				},
				{
					"Donny","90"
				},
				{
					"Chris","30"
				}
		};
		
		String[][] negativeStGrades = {
				{
					"Chris","-100"
				},
				{
					"Donny","-90"
				},
				{
					"Chris","-30"
				}
		};
		
		System.out.println(getStudentsAndGrades(stGrades));
		System.out.println(getStudentsAndGrades2(stGrades));
		System.out.println("------------------------");
		System.out.println(getStudentsAndGrades(negativeStGrades));
		

	}
	
	
	public static int getStudentsAndGrades(String[][] stGrades){
		HashMap<String,Integer> graStesMap = new HashMap<String,Integer> ();
		HashMap<String,Integer> occurrencesMap = new HashMap<String,Integer> ();
		//int count = 0;
		int grade = 0;
		if(stGrades.length == 0) {
			return 0;
		}
		for (int i = 0; i < stGrades.length; i++) {
			for (int j = 0; j < stGrades[i].length-1; j++) {
				grade = Integer.parseInt((stGrades[i][j+1]));
				if(!graStesMap.containsKey(stGrades[i][j])) {
					graStesMap.put(stGrades[i][j], grade);
				//	count = 1;
					occurrencesMap.put(stGrades[i][j], 1);
				}else {
					grade += graStesMap.get(stGrades[i][j]);
					graStesMap.put(stGrades[i][j], grade);
//					count = occurrencesMap.get(stGrades[i][j]);
//					count ++;
					occurrencesMap.put(stGrades[i][j], occurrencesMap.get(stGrades[i][j])+1);
				}
			}
		}
		
		int average = Integer.MIN_VALUE;
		int MAX_AVERAGE = Integer.MIN_VALUE;
		for(String student: graStesMap.keySet()) {
			if(occurrencesMap.containsKey(student)) {
				average = graStesMap.get(student)/ occurrencesMap.get(student);
				graStesMap.put(student, average);
			}
			if(average>MAX_AVERAGE) {
				MAX_AVERAGE = average;
			}
		}
		System.out.println(graStesMap);
		return MAX_AVERAGE;
	}
	
	
	public static int getStudentsAndGrades2(String[][] stGrades){
	HashMap<String,ArrayList<Integer>> graStesMap = new HashMap<String,ArrayList<Integer>> ();
	int grade = 0;
	ArrayList<Integer> grades;
	int maxAverage = Integer.MIN_VALUE;
	int currentAverage = Integer.MIN_VALUE;
	if(stGrades.length == 0) {
		return 0;
	}
	for (int i = 0; i < stGrades.length; i++) {
		for (int j = 0; j < stGrades[i].length-1; j++) {
			grade = Integer.parseInt((stGrades[i][j+1]));
			if(!graStesMap.containsKey(stGrades[i][j])) {
				grades = new ArrayList<Integer>();
				grades.add(grade);
				graStesMap.put(stGrades[i][j], grades);
				
			}else {
				grades = graStesMap.get(stGrades[i][j]);
				grades.add(grade);
				graStesMap.put(stGrades[i][j], grades);
			
			}
		}
	}
	 for(String student: graStesMap.keySet()) {
		 currentAverage  = graStesMap.get(student).stream().reduce(0, (a,b)-> a+b)
				 / graStesMap.get(student).size();
//		 if(currentAverage> maxAverage) {
//			 maxAverage = currentAverage;
//		 }
		 maxAverage = Math.max(currentAverage, maxAverage);
	 }
	System.out.println(graStesMap);
	return maxAverage;
	
	}
	
	
}

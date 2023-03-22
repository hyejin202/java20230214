package test;

public class testClass {
	public static void main(String[] args) {
		String s = "1 2 3 4";
		String[] arr = s.split(" ");
		int max = Integer.MIN_VALUE;
        for(String s1 : arr) {
        	max = Math.max(max, Integer.parseInt(s1));
        }
        int min = Integer.MAX_VALUE;
        for(String s2 : arr) {
        	min = Math.min(min, Integer.parseInt(s2));
        }
       String answer = "";
       answer = String.valueOf(max) + " " + String.valueOf(min);
       
       System.out.println(answer);
	}
}

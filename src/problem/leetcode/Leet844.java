package problem.leetcode;

import java.util.*;

public class Leet844 {
	public boolean backspaceCompare(String s, String t) {

		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();

		//첫 번째 문자열의 각 문자를 stack1에 push
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '#') {
				if (! stack1.isEmpty()) {
					stack1.pop();
				}
				continue;
			}
			stack1.push(s.charAt(i));
		}
			
/*			switch (s.charAt(i)) {
			case '#' -> {
				if (! stack1.isEmpty()) {
					stack1.pop();
				}
			}
			default -> stack1.push(s.charAt(i));
			}
		}*/
		
		//두 번째 문자열의 각 문자를 stack2에 push
		for (int i = 0; i < t.length(); i++) {
			if (t.charAt(i) == '#') {
				if (! stack2.isEmpty()) {
					stack2.pop();
				}
				continue;
			}
			stack2.push(t.charAt(i));
		}
		
		
/*		switch (t.charAt(i)) {
		case '#' -> {
			if (! stack2.isEmpty()) {
				stack2.pop();
			}
		}
		default -> stack2.push(t.charAt(i));
		}
		}*/
		
		//stack1과 stack2 비교
		String sRes = "";
		while (!stack1.isEmpty()) {
			sRes += stack1.pop();
		}
		String tRes = "";
		while (!stack2.isEmpty()) {
			tRes += stack2.pop();
		}
		boolean res = sRes.equals(tRes);
		
		return res;
		
		
/*		while(! stack1.isEmpty() && ! stack2.isEmpty()) {
			char c1 = stack1.pop();
			char c2 = stack2.peek();
			
			if(c1 != c2) {
				return false;
			}
		}
		return stack1.size() == stack2.size();
		
		*/
		
		
		
		
	}
}

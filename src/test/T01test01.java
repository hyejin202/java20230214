package test;

import java.util.*;

public class T01test01 {
	public static void main(String[] args) {
		int age = 534;
		String answer = "";
		int one=0, two=0, three=0, four=0;
		 if (age / 100 == 10) {
	            four = 1;
	            three = 0;
	        } else {
	            three = age / 100;
	        }
	        if (age / 10 == 10) {
	            two = 0;
	        } else {
	            two = age / 10;
	        }
	       
	        one = age - (two*10) - (three*100);
	       
	        System.out.println(one);
	        System.out.println(two);
	        System.out.println(three);
	        System.out.println(four);
	        switch(four) {
	                case 0 -> answer += "";
	                case 1 -> answer += "a";
	        }
	        if (four == 0) {
	        switch(three) {
	        case 0 -> answer += "";
	        case 1 -> answer += 'b';
	        case 2 -> answer += 'c';
	        case 3 -> answer += 'd';
	        case 4 -> answer += 'e';
	        case 5 -> answer += 'f';
	        case 6 -> answer += 'g';
	        case 7 -> answer += 'h';
	        case 8 -> answer += 'i';
	        case 9 -> answer += 'j';
	        } 
	        }else {
	           switch(three) {
	        case 0 -> answer += "a";
	        case 1 -> answer += 'b';
	        case 2 -> answer += 'c';
	        case 3 -> answer += 'd';
	        case 4 -> answer += 'e';
	        case 5 -> answer += 'f';
	        case 6 -> answer += 'g';
	        case 7 -> answer += 'h';
	        case 8 -> answer += 'i';
	        case 9 -> answer += 'j';
	        }   
	        }
	       if (four == 0 && three == 0){
	           switch(two) {
	        case 0 -> answer += "";
	        case 1 -> answer += 'b';
	        case 2 -> answer += 'c';
	        case 3 -> answer += 'd';
	        case 4 -> answer += 'e';
	        case 5 -> answer += 'f';
	        case 6 -> answer += 'g';
	        case 7 -> answer += 'h';
	        case 8 -> answer += 'i';
	        case 9 -> answer += 'j';
	        }
	       }else {
	           switch(two) {
	        case 0 -> answer += 'a';
	        case 1 -> answer += 'b';
	        case 2 -> answer += 'c';
	        case 3 -> answer += 'd';
	        case 4 -> answer += 'e';
	        case 5 -> answer += 'f';
	        case 6 -> answer += 'g';
	        case 7 -> answer += 'h';
	        case 8 -> answer += 'i';
	        case 9 -> answer += 'j';
	        }
	       }
	        
	        switch(one) {
	        case 0 -> answer += 'a';
	        case 1 -> answer += 'b';
	        case 2 -> answer += 'c';
	        case 3 -> answer += 'd';
	        case 4 -> answer += 'e';
	        case 5 -> answer += 'f';
	        case 6 -> answer += 'g';
	        case 7 -> answer += 'h';
	        case 8 -> answer += 'i';
	        case 9 -> answer += 'j';
	        }
        
        System.out.println(answer);
        
	}
}

JAVA INTERVIEW QUESTIONS

import java.util.*;
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
    //reverse a String
    // String inputStr ="testing";
    // char[] charArr = inputStr.toCharArray();
    // for(int itr=charArr.length-1;itr>=0;itr--){
    //     System.out.print(charArr[itr]);
    // }
    
    //reverse each word of a a given String
    
    // String inputStr2 = "testing space";
    // String[] strarr = inputStr2.split(" ");
    // String[] outputStr = new String[strarr.length];
    // for(int i =0;i<strarr.length;i++){
        
    //     StringBuilder sb = new StringBuilder(strarr[i]);
        
    //     sb.reverse();
        
    //     outputStr[i] = sb.toString();
          
        
        
    // }
    // String output = "";
    // String space = " ";
    // for(int j=0;j<outputStr.length;j++){
    // if(j==outputStr.length-1){
    //     output = output + outputStr[j] ;
    // }else{
    //     output = output + outputStr[j] +" ";
    // }
    
    // }
    // System.out.println(output.length() + " " +inputStr2.length() );
    
    //find duplicate characters in String
    // String dup = "aabaancc";
    // Set<Character> strset = new HashSet<>();
    // List<Character> l = new ArrayList<>();
    // char[] ch = dup.toCharArray();
    
    // for(int i =0;i<ch.length;i++){
    //     if (!strset.contains(ch[i])){
    //         strset.add(ch[i]);
    //     }else{
    //         l.add(ch[i]);
    //     }
        
    // }
    
    // System.out.println(l);
    // System.out.println(strset);
    
    // count characters of a String
    // String input  = "abcndkdjkfjdkfjdkfjkdjf";
    // Map<Character,Integer> map =  new HashMap<>();
    
    // char[] ch = input.toCharArray();
    // for(int itr = 0;itr<ch.length;itr++){
    //     if(map.containsKey(ch[itr])){
    //         map.replace(ch[itr],map.get(ch[itr])+1);
    //     }else{
    //         map.put(ch[itr],1);    
    //     }
        
    // }
    // System.out.println(map);
    
    //count the words in a String
    // String s  ="testing is great";
    // String[] strarr3 = s.split(" ");
    // System.out.println(strarr3.length);
    
    
    //occurences of word in a String
    
    String s = "test automation test java";
    Map<String,Integer> map =  new HashMap<>();
    String[] str  =  s.split(" ");
    for(int i =0;i<str.length;i++){
        
        if(map.containsKey(str[i])){
            int count  = map.get(str[i]);
            // count= count+1;
            map.replace(str[i],count++);
        }else{
            map.put(str[i],1);
        }
        
    }
    
    System.out.println(map);
    //permutations combinations for a given String
    
    // String s ="abc";
    
    // s.CharAt(0)+s.substring(1);
    
	}
}

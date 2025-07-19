import java.util.HashMap;

public class CountUniqueVowelString {
  public int vowelCount(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++) 
        {
            char ch=s.charAt(i);
            if(isVowel(ch)) map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int size=map.size();
        if(size==0) return 0;
        int fact;
        if(size==1) fact=1;
        else if(size==2) fact=2;
        else if(size==3) fact=6;
        else if(size==4) fact=24;
        else fact=120;
        for(Character key:map.keySet()){
            fact*=map.get(key);
        } return fact;
    }
    private boolean isVowel(char ch){
        return ch=='a' || ch=='e' ||ch=='i' ||ch=='o' || ch=='u';
    }
}

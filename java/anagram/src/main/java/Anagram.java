
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

  private String raw;
  public Anagram(String anagram){
    raw = anagram;
  }

  public List<String> match(List<String> words) {
    
    var matchWords = new ArrayList<String>();
    
    for(var word : words){
      if(isAnagram(raw, word))
        matchWords.add(word);
    }

    return matchWords;
  }

  private boolean isAnagram(String word1, String word2){
    
    word1 = word1.toLowerCase();
    word2 = word2.toLowerCase();

    if(word1.equals(word2) || word1.length() != word2.length())
      return false;

    String[] letter1 = word1.split("");
    String[] letter2 = word2.split("");

    Arrays.sort(letter1);
    Arrays.sort(letter2);

    return Arrays.equals(letter1, letter2);    
  }
}
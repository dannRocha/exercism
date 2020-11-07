public class PangramChecker {
  
  private final static int LETTERS_IN_ALPHABET = 26;

  public boolean isPangram(String input) {
    return input.toLowerCase().chars()
            .filter(Character::isAlphabetic)
            .distinct()
            .count() == LETTERS_IN_ALPHABET;
  }
}



/*
public class PangramChecker {
    
  private final int ALPHABET_SIZE = 26;
  private final int ASCII_A = 97;
  private final int ASCII_Z = 122;
  
  public boolean isPangram(String input) {

    if( input.isEmpty() )
        return false;

    String alphabet = getOnlyAlphabetLetters(input);

  	return alphabet.length() == ALPHABET_SIZE;
  }

  private String getOnlyAlphabetLetters(String phrase) {
   
    char asciiSequence[] = phrase.toLowerCase().trim().toCharArray();
    String alphabet = "";

    for(var ascii : asciiSequence) {
      if(!alphabet.contains(String.valueOf(ascii))
        && ascii >= ASCII_A && ascii <= ASCII_Z
      )
          alphabet += ascii;
    }

    return alphabet;
  }

}

*/
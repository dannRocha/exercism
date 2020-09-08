class ReverseString {

    String reverse(String inputString) {
        String reverseWord = "";
        String[] letter = inputString.split("");
        
        for(var i = letter.length - 1; i >= 0; i--)
        		reverseWord += letter[i];

        return reverseWord;
    }
  
}

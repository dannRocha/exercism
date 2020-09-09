class Acronym {

    private String acronym = "";
    
    Acronym(String phrase) {
        
        String[] words = phrase.toUpperCase().replaceAll("[-._]", " ").split(" ");
        
        for(var word : words){
           if(!word.trim().isEmpty())
               acronym += word.split("")[0];
        }
    }

    String get() {
        return acronym;
    }

}

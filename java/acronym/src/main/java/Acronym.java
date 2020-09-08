class Acronym {

    private String acronym = "";
    
    Acronym(String phrase) {
        
        String[] words = phrase.replaceAll("[-._]", " ").split(" ");

        for(var word : words){
            acronym += word.split("")[0];
        }

        acronym	= acronym.toUpperCase();
    }

    String get() {
        return acronym;
    }

}

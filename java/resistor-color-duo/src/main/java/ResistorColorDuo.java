import java.util.HashMap;

class ResistorColorDuo {
    private final HashMap<String, String> colorScheme = new HashMap<String, String>();
    private final String[] colors = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};

    ResistorColorDuo(){
        fillColorScheme();
    }

    private void fillColorScheme(){
        for(int i = 0; i < colors.length; i++)
            colorScheme.put(colors[i], String.valueOf(i));	 
    }
    
    int value(String[] colors) {

        String concat = "";
        final int MAX = 2;
        
        for(int i = 0; i < MAX; i++){
           concat += colorScheme.get(colors[i]);
        }

        return Integer.valueOf(concat);
    }
    
}

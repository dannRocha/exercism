import java.util.HashMap;

class ResistorColor {
    private final HashMap<String, Integer> colorScheme = new HashMap<String, Integer>();
    private final String[] _colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    ResistorColor(){
        fillColorScheme();
    }

    private void fillColorScheme(){
        for(int i = 0; i < _colors.length; i++)
            colorScheme.put(_colors[i], i);
    }

    int colorCode(String color) {
        return colorScheme.get(color);
    }

    String[] colors() {
        return _colors;
    }
}

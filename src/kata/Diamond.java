package kata;

public class Diamond {

    public static final char START_CHARACTER = 'A';

    public String create(char inputs) {
        String result = "";
        String bottomLine = "";
        for(char currentAlphabet = START_CHARACTER; currentAlphabet <= inputs; currentAlphabet++) {
            String line = buildLine(inputs, currentAlphabet);
            result += line;
            bottomLine = bottomLineOfDiamond(inputs, bottomLine, currentAlphabet, line);
        }
        return result + bottomLine;
    }

    private String bottomLineOfDiamond(char inputs, String bottomLine, char currentAlphabet, String line) {
        if(currentAlphabet != inputs) {
            bottomLine = line + bottomLine;
        }
        return bottomLine;
    }

    private String buildLine(char inputs, char first) {
        String result = indentation(inputs, first);
        result += first;
        result += restOfLine(inputs, first);
        return result;
    }

    private String restOfLine(char inputs, char current) {
        if(current != START_CHARACTER){
            return addSpace((current - START_CHARACTER) * 2 - 1) + current + "\n";
        }
        return "\n";
    }

    private String indentation(char inputs, char current) {
        return addSpace(inputs-current);
    }

    private String addSpace(int count) {
        String space = "";
        for(int i=0;i<count;i++) {
            space += " ";
        }

        return space;
    }
}

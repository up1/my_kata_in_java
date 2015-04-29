package kata;

public class Range {

    private String input;

    public Range(String input) {
        this.input = input;
    }

    public Range() {

    }

    public String of(String input) {
        this.input = input;

        String result = "";
        for(int start = startNumber(); start <= endNumber(); start++) {
            result += start + ",";
        }
        return result.substring(0, result.length()-1);
    }

    public boolean startWithInclusive() {
        return input.startsWith("[") ? true : false;
    }

    public boolean endWithInclusive() {
        return input.endsWith("]") ? true : false;
    }

    public int startNumber() {
        int startNumber = Integer.valueOf(input.charAt(1) + "");
        return startWithInclusive() ? startNumber : startNumber+1;
    }

    public int endNumber() {
        int endNumber = Integer.valueOf(input.charAt(input.length()-2) + "");
        return endWithInclusive() ? endNumber : endNumber-1;
    }

    public boolean contain(int ... numbers) {
        for(int number : numbers) {
            if (number < startNumber() || number > endNumber()) {
                return false;
            }
        }
        return true;
    }
}

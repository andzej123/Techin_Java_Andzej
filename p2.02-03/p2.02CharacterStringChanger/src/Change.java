public class Change {

    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString) {
        StringBuilder s = new StringBuilder();
        char[] a  = characterString.toCharArray();
        for (char p : a) {
            if (p == fromCharacter) {
                s.append(toCharacter);
            } else {
                s.append(p);
            }
        }
        return s.toString();
    }
}

package ZadanieNaKoniec;

public class Main {

    public static String code(String text) {

        char[] textCharArray = text.toCharArray();

        for(int i=0; i < textCharArray.length; i++) {
            if((textCharArray[i] >= 65 && textCharArray[i] <= 90) || (textCharArray[i] >= 97 && textCharArray[i] <= 122)) {
            }
            if (textCharArray[i] == 'Z') {
                textCharArray[i] = 'A';
            }
            else if (textCharArray[i] == 'Y') {
                textCharArray[i] = 'B';
            }
            else if (textCharArray[i] == 'Z') {
                textCharArray[i] = 'C';
            }
            else if (textCharArray[i] == 'x') {
                textCharArray[i] = 'a';
            }
            else if (textCharArray[i] == 'y') {
                textCharArray[i] = 'b';
            }
            else if (textCharArray[i] == 'z') {
                textCharArray[i] = 'c';
            }
            else {
                return String.valueOf(i + 3);
            }

            String result = String.valueOf(textCharArray);
            return result;
        }
        return text;
    }

    public static void main(String[] args) {
        String text = "AaBbCcDd, XxYyZz, !.?<>";
        System.out.println(text);

    }
}

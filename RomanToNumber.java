public class RomanToNumber {

    private int value;

    public void setRomain(String Str) {

        for (int i=0; i < Str.length(); i++) {

            this.value += returnValue((Str.charAt(i)));
        }

            int len = Str.length() -2;
            boolean unqString = Str.substring(len).equalsIgnoreCase("IV");
            boolean unqString1 = Str.substring(len).equalsIgnoreCase("IX");
			
            if(unqString || unqString1) {
                this.value = value - 2;
            }
    }


    public int getRomain() {
        return value;
    }

    public int returnValue(char Str) {
        switch (Str) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
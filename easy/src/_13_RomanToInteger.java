public class _13_RomanToInteger {
    public int romanToInt(String s) {
        int totalNumber = 0;

        for(int i = 0; i < s.length(); i++) {
            char var = s.charAt(i);

            if(var == 'C' && i + 1 < s.length() && s.charAt(i + 1) == 'M') {
                totalNumber += 900;
                i++;
            } else if(var == 'C' && i + 1 < s.length() && s.charAt(i + 1) == 'D') {
                totalNumber += 400;
                i++;
            } else if(var == 'X' && i + 1 < s.length() && s.charAt(i + 1) == 'C') {
                totalNumber += 90;
                i++;
            } else if(var == 'X' && i + 1 < s.length() && s.charAt(i + 1) == 'L') {
                totalNumber += 40;
                i++;
            } else if(var == 'I' && i + 1 < s.length() && s.charAt(i + 1) == 'X') {
                totalNumber += 9;
                i++;
            } else if(var == 'I' && i + 1 < s.length() && s.charAt(i + 1) == 'V') {
                totalNumber += 4;
                i++;
            } else if(var == 'M')
                totalNumber += 1000;
            else if(var == 'D')
                totalNumber += 500;
            else if(var == 'C')
                totalNumber += 100;
            else if(var == 'L')
                totalNumber += 50;
            else if(var == 'X')
                totalNumber += 10;
            else if(var == 'V')
                totalNumber += 5;
            else if(var == 'I')
                totalNumber += 1;
        }
        return totalNumber;
    }
}


public class Logic {


    public static int logic(String firstString, String arithmetic, String secondString) {
        int first = 0;
        int second = 0;
        int result = 0;
        char operation;
        operation = arithmetic.charAt(0);

        boolean flag = false;

        try {
            first = Integer.parseInt(firstString);
            second = Integer.parseInt(secondString);
        } catch (Exception e) {
            try {
                first = Converter.toArabic(firstString);
                second = Converter.toArabic(secondString);
                flag = true;
            } catch (Exception e1) {
                System.out.println("Вы ввели некорректные значения");
            }
        }
        if (first<1 || first>10 || second<1|| second>10){
            System.out.println("Вы ввели некорректные значения");
            System.exit(0);
        }

        switch (operation){
            case  '-' :
                result = first - second;
                break;
            case  '*' :
                result = first * second;
                break;
            case  '/' :
                result = first / second;
                break;
            case  '+':
                result = first + second;
                break;
        }


        if (flag) {
            String roman = Converter.toRoman(result);
            System.out.println(roman);

        } else System.out.println(result);

        return result;
    }
}

package src.src.level2.lesson2;

public class Task2 {
    public static void main(String[] args) {


        String a [][] = {{"1", "1", "1", "1"}, //4
                        {"2", "2", "2", "2"}, //8
                        {"3", "3", "3", "3"}, //12
                        {"4", "4", "4", "4"} }; //16

        String b[][] = {{"1", "1", "1"},
                        {"2", "2", "2", "2"},
                        {"3", "3", "3", "3"},
                        {"4", "4", "4", "4"}};

        String c [][] = {{"A", "1", "1", "1"},
                         {"2", "2", "2", "2"},
                         {"3", "3", "3", "3"},
                         {"4", "4", "4", "4"} };

        try {
            strTOint(a);
        } catch (MyArraySizeException eASE) {
            System.out.println("arrey that you have used has wrong length");
        } catch ( MyArrayDataException eADE){
            System.out.println();
        }

        try {
            strTOint(b);
        } catch (MyArraySizeException eASE) {
            System.out.println("arrey that you have used has wrong length");
        } catch ( MyArrayDataException eADE){
            System.out.println();
        }

        try {
            strTOint(c);
        } catch (MyArraySizeException eASE) {
            System.out.println("arrey that you have used has wrong length");
        } catch ( MyArrayDataException eADE){
            System.out.println();
        }
    }

    static void strTOint (String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if(arr.length != 4){
           throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i].length != 4){
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++){
                try {
                    sum += Integer.parseInt(arr[i][j]);
                }catch (NumberFormatException e){
                    System.out.println("this is not a number: " + arr[i][j] + " in adress:  " + i + " " + j);
                    throw new MyArrayDataException();
                }
            }
        }

        System.out.println("сумма всех чисел равна = " + sum);
    }
}

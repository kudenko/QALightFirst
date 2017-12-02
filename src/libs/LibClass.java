package libs;

public class LibClass {
    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void sum(String a, String b) {
        System.out.println(a + b);
    }

    public static void sum(String var15, int var16) {
        System.out.println(Integer.parseInt(var15) + var16);
    }

    public static int sum(int varInteger, String varString) {
        int tempResult;
        try {
            tempResult = varInteger + Integer.parseInt(varString);
        } catch (NumberFormatException e) {
            System.out.println("error");
            return 88888;
        } catch (Exception e) {
            System.out.println("error");
            return 99999;
        }
        return tempResult;
    }

    public void multiplication(int a, int b) {
        System.out.println(a * b);
    }

    public int divide(int a, int b) {
        try {
            return (a / b);
        } catch (ArithmeticException e) {
            System.out.println("Error");
            return a;
        }catch (NullPointerException e){
            System.out.println("error");
            return 99999;
        }
    }

    public double divide(double a, double b) {
        try {
            return (a / b);
        }catch(NullPointerException e){
            System.out.println("Error");
            return 99999;
        }
    }

    /**
     *
     * @param a
     * @param b
     * @return
     * @throws ArithmeticException
     */
    public byte divide(byte a, byte b) throws ArithmeticException{
        return (byte) (a / b);
    }

    public void comparisonArrayWithValue(int valueForComarison, int [] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < valueForComarison){
                System.out.println(arr[i] + " less then " + valueForComarison);
            }else if(arr[i] == valueForComarison){
                System.out.println(arr[i] + " equals " + valueForComarison);

            }else{
                System.out.println(arr[i] + " more then " + valueForComarison);

            }
        }
    }

}
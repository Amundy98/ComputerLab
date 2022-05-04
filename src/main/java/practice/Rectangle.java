package practice;

public class Rectangle {
//    private int width;
//    private int height;
//
//
//    public void calcArea(){
//
//    }

    //    static int x = 10;
//
//    public static void calcArea(){
//
//    }
// create  a variable with one of those names
//    public static void main(String[] args) {
//
//    }
    public static void main(String[] args) {
        System.out.println(calcDiscount(100, 15));
//        String[] names = {"Bobby", "Ralph", "Johnny"};
//        String name = "Ralph";
//
//        System.out.println(nameCheck());
        // int[] numbers = {2, 4, 6, 8};
        // int sum = 0;
        //for (int i = 0; i < numbers.length; i++) {
        // sum = sum + numbers[i]; //
        //  System.out.println(numbers[i] * numbers[i])} square each element in an array

        // for (int i = 0; i < names.length; i++){
        // if (name.equalsIgnoreCase("ralph")){

        // }
        //}

        // System.out.println("The sum of the array is " + sum);
        // }
    }

//        public static boolean nameCheck () {
//            String[] names = {"Bobby", "Ralph", "Johnny"};
//            String name = "Ralph";
//            for (int i = 0; i < names.length; i++) {
//                if (name.equals("Ralph")) {
//                    return true;
//                }
//            }
//            return false;
//        }

///create a method that takes a price and discount amount
    /// method job is to return the final price after discount



    public static double calcDiscount(double price, double discount){
        double a = discount / 100;
        double discountAmount = a * price;
        double totalAmount = price -discountAmount;
    return totalAmount;
    }
}
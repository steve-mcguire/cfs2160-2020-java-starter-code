public class HelloWorld {

    /**
     * Declare the speed reading to work with
     * DO NOT CHANGE THIS VALUE!
     */
    private static String vehicleReading = "H56";

    //BEGIN STUDENT CODE
    /**
     * Use substring to get the letter part of the vehicleReading
     * @return the letter part of the speed reading
     */
    public static String vehicleType() {
        return vehicleReading.substring(0, 1);
    }

    /**
     * Use substring to get the number part of the vehicleReading, convert to int
     * @return the integer part of the speed reading
     */
    public static int vehicleSpeed(){
        return Integer.parseInt(vehicleReading.substring(1));
    }

    //END STUDENT CODE
}
public class ArmstrongNum {

    public static boolean isArmstrongNum(int num) {
        int hundredsPlace = num / 100;
        int tensPlace = (num / 10) % 10;
        int onesPlace = num % 10;
        if (Math.pow(hundredsPlace, 3) + Math.pow(tensPlace, 3) + Math.pow(onesPlace, 3) == num)
            return true;
        return false;
    }
}

package day02datatypesmethodcreation;

public class MethodCreation02 {
    public static void main(String[] args) {

        int rectanglearea = shortSideMultiplyLongSide(25, 50);
        System.out.println(rectanglearea);

        int rectangleperimeter = shortSideAddLongSideMultiplytwo(55,75);
        System.out.println(rectangleperimeter);

        double circlesPerimeter = circlesRadiusMultiplyTwoMultiplyPiNumber(5);
        System.out.println(circlesPerimeter);

        double circlesarea = circlesRadiusSquareMultiplyPiNumber(12);
        System.out.println(circlesarea);
        int popsss = popCityOfDark(21);
        System.out.println(popsss);

    }

    public static int shortSideMultiplyLongSide(int x, int y) {
        return x * y;

    }
    public static int shortSideAddLongSideMultiplytwo(int k, int m) {
        return (k + m) * 2;
    }
    public static double circlesRadiusMultiplyTwoMultiplyPiNumber(int r){
        return r*3.14*2;
    }
    public static double circlesRadiusSquareMultiplyPiNumber(int r) {
        return r*r*3.14;
    }
    public static int popCityOfDark(int v) {
        return v+10;
    }
}




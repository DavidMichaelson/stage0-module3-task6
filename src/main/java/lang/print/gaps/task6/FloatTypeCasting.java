package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {

        System.out.println(Math.round(numberToBeRounded));
    }

    public static void main(String[] args) {

        FloatTypeCasting casting = new FloatTypeCasting();
        casting.roundNumber(3.6f);
        casting.roundNumber(-1.6f);
    }
}

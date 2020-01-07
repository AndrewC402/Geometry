package exercises;

public class Angle {
    private int degrees;

    public Angle(int degrees) {
       setDegrees(degrees);
        }

    public int getDegrees() {
        int d;
        d = degrees % 360;
        if (d < 0) {
            d += 360;
        } return d;
    }
    private void setDegrees(int degrees) {
        this.degrees=degrees;
    }
}

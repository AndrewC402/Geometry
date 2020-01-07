package exercises;

public class Angle {
    private int degrees;

    public Angle(int degrees) {
        if (degrees < 0) {
           while (degrees < 0) {
               degrees += 360;
           }
        }
        setDegrees(degrees);
        }

    public int getDegrees() {
        return degrees;
    }
    private void setDegrees(int degrees) {
        this.degrees=degrees;
    }
}

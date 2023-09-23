package Day15;

public class Distance {
    public static void main(String[] args) {
        System.out.println(DistanceTraveled(57,5));
    }
    public static double DistanceTraveled(double Speed, double Time){
        double distance=Speed*Time;
        return distance;
    }
}

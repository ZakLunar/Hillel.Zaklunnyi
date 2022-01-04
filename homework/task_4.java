package homework;

/**
 * speed = distance / time
 */

public class task_4 {
    public static void main(String[] args) {
        double dis = 2500; //distance in meters
        double hour = 5; //hours
        double min = 56; //minutes
        double sec = 23; //seconds

        double s = (((hour * 60) + min) * 60) + sec ; //all in sec
        double h = (((sec / 60) + min) / 60) + hour; //all in hour
        double km = dis / 1000; //distance in kilometres

        float mS = (float) (dis / s);
        float kmH = (float) (km / h);
        System.out.println("Your speed in meters/second is " + mS);
        System.out.println("Your speed in km/h is " + kmH);

        System.out.println("User: Zaklunnyi, added: 30.12.2021 11:49, resolved: 4.01.2022 21:17"); //info
    }
}

package Day23;

import java.sql.Time;

public class CTask2 {
    public static void main(String[] args) {
        String Date = "10/10/2019 14:59:00";
        String Ali = "15/14/2019 19:59:00";
        TimeStamp(Date);
        TimeStamp(Ali);


    }

    public static void TimeStamp(String Time) {

        Time = Time.replace("/", "").replace(" ", "").replace(":", "");
        System.out.println(Time);
    }


}


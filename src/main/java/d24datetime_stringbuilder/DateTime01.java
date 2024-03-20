package d24datetime_stringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter frmtTime = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.printf("%s" , frmtTime.format(currentTime));
    }
}

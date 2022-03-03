package dateFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    private LocalDate localDate;

    public Date(String dateString) {
        this.localDate = dateStringToLocalDate(dateString);
    }

    private LocalDate dateStringToLocalDate(String date){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(date,format);
    }

    public String getDateString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return localDate.format(formatter);
    }
}

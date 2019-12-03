package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class DateFormatter {
    public static String formatDate(LocalDateTime date){
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy 'at' hh:mm");
        return ft.format(date);
    }
}

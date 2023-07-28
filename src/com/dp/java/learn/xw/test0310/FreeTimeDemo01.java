package com.dp.java.learn.xw.test0310;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FreeTimeDemo01 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<Date[]> interferenceDates = new ArrayList<>();
        interferenceDates.add(new Date[]{sdf.parse("2023-03-10 00:00:00"), sdf.parse("2023-03-10 00:30:00")});
        interferenceDates.add(new Date[]{sdf.parse("2023-03-10 01:00:00"), sdf.parse("2023-03-10 03:30:00")});
        interferenceDates.add(new Date[]{sdf.parse("2023-03-10 04:00:00"), sdf.parse("2023-03-10 05:30:00")});
        interferenceDates.add(new Date[]{sdf.parse("2023-03-10 06:00:00"), sdf.parse("2023-03-10 08:30:00")});
        interferenceDates.add(new Date[]{sdf.parse("2023-03-10 11:00:00"), sdf.parse("2023-03-10 13:30:00")});
        interferenceDates.add(new Date[]{sdf.parse("2023-03-10 14:00:00"), sdf.parse("2023-03-10 17:30:00")});
        interferenceDates.add(new Date[]{sdf.parse("2023-03-10 18:00:00"), sdf.parse("2023-03-10 20:30:00")});
        interferenceDates.add(new Date[]{sdf.parse("2023-03-10 21:00:00"), sdf.parse("2023-03-10 22:30:00")});

        List<Date[]> usableDates = new ArrayList<>();
        usableDates.add(new Date[]{sdf.parse("2023-03-10 02:00:00"), sdf.parse("2023-03-10 07:00:00")});
        usableDates.add(new Date[]{sdf.parse("2023-03-10 09:00:00"), sdf.parse("2023-03-10 10:00:00")});
        usableDates.add(new Date[]{sdf.parse("2023-03-10 12:00:00"), sdf.parse("2023-03-10 15:00:00")});
        usableDates.add(new Date[]{sdf.parse("2023-03-10 16:00:00"), sdf.parse("2023-03-10 19:00:00")});
        usableDates.add(new Date[]{sdf.parse("2023-03-10 19:30:00"), sdf.parse("2023-03-10 23:00:00")});

        List<Date[]> splitTimes = splitTime(usableDates, interferenceDates);
        for (Date[] date : splitTimes) {
            System.out.println("free time: " + sdf.format(date[0]) + "---" + sdf.format(date[1]));
        }
        System.out.println("free time: " + splitTimes.size());
    }

    private static List<Date[]> splitTime(List<Date[]> usableDates, List<Date[]> interferenceDates) {
        if (usableDates.size() > 0 && !usableDates.isEmpty()) {
            boolean flag;
            for (Date[] interferenceDate : interferenceDates) {
                if (usableDates.get(0)[0].after(interferenceDate[1])) {
                    continue;
                }
                flag = false;
                int h = 0;
                for (int i = 0; i < usableDates.size(); i++) {

                }

            }

        }
        return usableDates;
    }


}

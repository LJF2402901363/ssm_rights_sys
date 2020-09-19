package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.text.DateFormat;
import java.util.Date;

/**
 * Classname:DateUtil
 *
 * @description:
 * @author: 陌意随影
 * @Date: 2020-09-03 23:14
 * @Version: 1.0
 **/
public class DateUtil {
    /**
     * @param dateStr ：
     * @return java.util.Date
     * @Description :将时间字符串按照pattern的格式转换为日期Date对象
     * @Date 23:19 2020/9/3 0003
     * @Param * @param pattern
     **/
    public static Date dateStrToDate(String pattern, String dateStr) {
        DateFormat df = new SimpleDateFormat(pattern);
        try {
            return df.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            return null;
        }

    }

    /**
     * @param date ：
     * @return java.lang.String
     * @Description :将时间对象按照pattern的格式转为字符串
     * @Date 23:18 2020/9/3 0003
     * @Param * @param pattern
     **/
    public static String dateToDateStr(String pattern, Date date) {
        DateFormat df = new SimpleDateFormat(pattern);
        return df.format(date);
    }
}

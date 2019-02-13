package util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: zhounan.zn
 * @date: 2018/6/27
 */
public class DateUtil {

    public static final String PATTERN_YYYYMMDD_HHMMSS = "yyyy-MM-dd HH:mm:ss";

    /**
     * 格式化Date时间
     *
     * @param date
     * @param pattern
     * @return
     */
    public static String formatDateToString(Date date, String pattern) {
        if (null == date) {
            return null;
        }
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(date);
    }

    /**
     * 标准DateTime格式转String
     *
     * @param date
     * @return
     */
    public static String formatDateTimeToString(Date date) {
        if (null == date) {
            return null;
        }
        DateFormat dateFormat = new SimpleDateFormat(PATTERN_YYYYMMDD_HHMMSS);
        return dateFormat.format(date);
    }
}

package mas.onboard.utils;



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


/**
 * @author Precious Pearl A. Sano <pr3_cious_15@yahoo.com>
 *
 */
public class DateUtils {
	
	public static DateTimeFormatter DOMAIN_DEFAULT_DATE = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS", Locale.ENGLISH);
	
	public String getDate() {
		LocalDateTime ldt = LocalDateTime.now().plusDays(1);
		String formatter = DOMAIN_DEFAULT_DATE.format(ldt);
		return formatter;
	}
}

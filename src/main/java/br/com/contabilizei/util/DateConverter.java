package br.com.contabilizei.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * The Class DateConverter.
 */
public class DateConverter {
	
	/** The Constant BR_LOCALE. */
	private static final Locale BR_LOCALE = new Locale("pt", "BR");
	
	/** The Constant DATE_FORMAT. */
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy", BR_LOCALE);

	/**
	 * Parses the date.
	 *
	 * @param strDate the str date
	 * @return the date
	 */
	public static Date parseDate(String strDate) {
		try {
			return (strDate == null) || (strDate.length() < 10) ? null : DATE_FORMAT.parse(strDate);
		} catch (ParseException e) {
		}
		return null;
	}

	/**
	 * Format date.
	 *
	 * @param Date the date
	 * @return the string
	 */
	public static String formatDate(Date Date) {
		if (Date != null) {
			DATE_FORMAT.format(Date);
		}
		return null;
	}

}

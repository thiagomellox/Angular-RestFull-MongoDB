package br.com.contabilizei.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Locale;

/**
 * The Class NumberConverter.
 */
public class NumberConverter {
	
	
	/** The Constant format. */
	private static final DecimalFormat format = new DecimalFormat("##,###,###,##0.00", new DecimalFormatSymbols (new Locale ("pt", "BR")));  
	
	/**
	 * Instantiates a new number converter.
	 */
	public NumberConverter(){
		format.setMinimumFractionDigits(2);   
		format.setParseBigDecimal (true); 
	}
	
	/**
	 * Format.
	 *
	 * @param valor the valor
	 * @return the string
	 */
	public static String format(Double valor){
		if(valor != null){
			return format.format(valor);
		}
		return "";
	}
	
	/**
	 * Format.
	 *
	 * @param valor the valor
	 * @return the string
	 */
	public static String format(Integer valor){
		if(valor != null){
			return String.valueOf(valor);
		}
		return "";
	}
	
	/**
	 * Format.
	 *
	 * @param valor the valor
	 * @return the string
	 */
	public static String format(Long valor){
		if(valor != null){
			return String.valueOf(valor);
		}
		return "";
	}
	
	/**
	 * Parses the double.
	 *
	 * @param valor the valor
	 * @return the double
	 */
	public static Double parseDouble(String valor){
		if(valor != null){
			try {
				return format.parse(valor).doubleValue();
			} catch (ParseException e) {
				return null;
			}
		}
		return null;
	}
	
	/**
	 * Parses the int.
	 *
	 * @param valor the valor
	 * @return the integer
	 */
	public static Integer parseInt(String valor){
		if(valor != null){
			return Integer.valueOf(valor);
		}
		return null;
	}
	
	/**
	 * Parses the long.
	 *
	 * @param valor the valor
	 * @return the long
	 */
	public static Long parseLong(String valor){
		if(valor != null){
			return Long.valueOf(valor);
		}
		return null;
	}
}

/*======================================================================
 FILE: ICalValue.java
 CREATOR: gnorman 01/10/02
 (C) COPYRIGHT 2002, Critical Path
======================================================================*/

package net.cp.jlibical;

public class ICalValue 
{
	/** It's not typesafe, but it's simple to understand! */
	public interface ICalValueKind 
	{
		// icalvalue_kind
		int ICAL_ANY_VALUE=5000;
		int ICAL_BOOLEAN_VALUE=5001;
		int ICAL_UTCOFFSET_VALUE=5002;
		int ICAL_RECUR_VALUE=5003;
		int ICAL_METHOD_VALUE=5004;
		int ICAL_CALADDRESS_VALUE=5005;
		int ICAL_PERIOD_VALUE=5006;
		int ICAL_STATUS_VALUE=5007;
		int ICAL_BINARY_VALUE=5008;
		int ICAL_TEXT_VALUE=5009;
		int ICAL_DATETIMEDATE_VALUE=5010;
		int ICAL_DURATION_VALUE=5011;
		int ICAL_DATETIMEPERIOD_VALUE=5012;
		int ICAL_INTEGER_VALUE=5013;
		int ICAL_TIME_VALUE=5014;
		int ICAL_URI_VALUE=5015;
		int ICAL_TRIGGER_VALUE=5016;
		int ICAL_ATTACH_VALUE=5017;
		int ICAL_CLASS_VALUE=5018;
		int ICAL_FLOAT_VALUE=5019;
		int ICAL_QUERY_VALUE=5020;
		int ICAL_STRING_VALUE=5021;
		int ICAL_TRANSP_VALUE=5022;
		int ICAL_X_VALUE=5023;
		int ICAL_DATETIME_VALUE=5024;
		int ICAL_GEO_VALUE=5025;
		int ICAL_DATE_VALUE=5026;
		int ICAL_ACTION_VALUE=5027;
		int ICAL_NO_VALUE=5028;
	}

	/**
	* Constructor for ICalValue
	* @param obj c++ pointer
	*/
	private ICalValue(long obj)
	{
		init(obj);
	}

	public ICalValue()
	{
		init();
	}

	public ICalValue(/* ICalValueKind */ int kind)
	{
		init(kind);
	}

	public ICalValue(/* ICalValueKind */ int kind, String  str)
	{
		init(kind,str);
	}

	public native String as_ical_string();
	//public native boolean is_valid();
	public native /* ICalValueKind */ int isa();
	public native boolean isa_value(Object value);

	/* Special, non autogenerated value accessors */
	//void set_recur(struct icalrecurrencetype v);
	//struct icalrecurrencetype get_recur();

	public native void set_trigger(ICalTriggerType v);
	public native ICalTriggerType get_trigger();

	//void set_datetimeperiod(struct icaldatetimeperiodtype v);
	//struct icaldatetimeperiodtype get_datetimeperiod();

	//public native static /* ICalParameterXLicCompareType */ int compare(ICalValue a, ICalValue b);

	/* Convert enumerations */
	//public native static /* ICalValueKind */ int string_to_kind(String str);
	//public native String kind_to_string(/* ICalValueKind */ int kind);

	/* BOOLEAN */
	//public native int get_boolean();
	//public native void set_boolean(int v);

	/* UTC-OFFSET */
	//public native int get_utcoffset();
	//public native void set_utcoffset(int v);

	/* METHOD */
	public native /* ICalPropertyMethod */ int get_method();
	public native void set_method(/* ICalPropertyMethod */ int v);

	/* CAL-ADDRESS */
	//public native String get_caladdress();
	//public native void set_caladdress(String  v);

	/* PERIOD */
	//struct icalperiodtype get_period();
	//void set_period(struct icalperiodtype v);

	/* STATUS */
	//public native /* ICalPropertyStatus */ int get_status();
	//public native void set_status(/* ICalPropertyStatus */ int v);

	/* BINARY */
	//public native String get_binary();
	//public native void set_binary(String  v);

	/* TEXT */
	public native String get_text();
	public native void set_text(String  v);

	/* DATE-TIME-DATE */
	//ICalTimeType get_datetimedate();
	//void set_datetimedate(ICalTimeType v);

	/* DURATION */
	public native ICalDurationType get_duration();
	public native void set_duration(ICalDurationType v);

	/* INTEGER */
	//public native int get_integer();
	//public native void set_integer(int v);

	/* TIME */
	//ICalTimeType get_time();
	//void set_time(ICalTimeType v);

	/* URI */
	//public native String get_uri();
	//public native void set_uri(String  v);

	/* ATTACH */
	//struct icalattachtype get_attach();
	//void set_attach(struct icalattachtype v);

	/* CLASS */
	//public native /* ICalPropertyClass */ int get_class();
	//public native void set_class(/* ICalPropertyClass */ int v);

	/* FLOAT */
	//public native float get_float();
	//public native void set_float(float v);

	/* QUERY */
	public native String get_query();
	public native void set_query(String  v);

	/* STRING */
	//public native String get_string();
	//public native void set_string(String  v);

	/* TRANSP */
	//public native /* ICalPropertyTransp */ int get_transp();
	//public native void set_transp(/* ICalPropertyTransp */ int v);

	/* DATE-TIME */
	public native ICalTimeType get_datetime();
	public native void set_datetime(ICalTimeType v);

	/* GEO */
	//struct icalgeotype get_geo();
	//void set_geo(struct icalgeotype v);

	/* DATE */
	//ICalTimeType get_date();
	//void set_date(ICalTimeType v);

	/* ACTION */
	public native /* ICalPropertyAction */ int get_action();
	public native void set_action(/* ICalPropertyAction */ int v);

	/**
	 * init the native class
	 */
	private void init(long obj)
	{
		m_Obj = obj;
	}

	private native void init();
	private native void init(/* ICalValueKind */ int kind, String str);
	private native void init(/* ICalValueKind */ int kind);

	/**
	 * load the jni library for this class
	 */
	static {
		System.loadLibrary("ical_jni");
	}

	public static void main(String[] args)
	{
		System.out.println("*** ICalValue main called ok.");
	}

	/** pointer to C++ object  */
	private long	m_Obj = 0;
}

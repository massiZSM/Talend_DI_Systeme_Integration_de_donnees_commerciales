// ============================================================================
//
// Copyright (c) 2006-2015, Talend SA
//
// Ce code source a été automatiquement généré par_Talend Open Studio for Data Integration
// / Soumis à la Licence Apache, Version 2.0 (la "Licence") ;
// votre utilisation de ce fichier doit respecter les termes de la Licence.
// Vous pouvez obtenir une copie de la Licence sur
// http://www.apache.org/licenses/LICENSE-2.0
// 
// Sauf lorsqu'explicitement prévu par la loi en vigueur ou accepté par écrit, le logiciel
// distribué sous la Licence est distribué "TEL QUEL",
// SANS GARANTIE OU CONDITION D'AUCUNE SORTE, expresse ou implicite.
// Consultez la Licence pour connaître la terminologie spécifique régissant les autorisations et
// les limites prévues par la Licence.

package icommerce_reporting.jgeneratecalendar_0_2;

import routines.Numeric;
import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.StringHandling;
import routines.Relational;
import routines.TalendDate;
import routines.Mathematical;
import routines.customCode;
import routines.system.*;
import routines.system.api.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Comparator;

//the import part of tJava_1
//import java.util.List;

//the import part of tJava_3
//import java.util.List;

@SuppressWarnings("unused")

/**
 * Job: jGenerateCalendar Purpose: <br>
 * Description: <br>
 * 
 * @author user@talend.com
 * @version 8.0.1.20211109_1610
 * @status
 */
public class jGenerateCalendar implements TalendJob {

	protected static void logIgnoredError(String message, Throwable cause) {
		System.err.println(message);
		if (cause != null) {
			cause.printStackTrace();
		}

	}

	public final Object obj = new Object();

	// for transmiting parameters purpose
	private Object valueObject = null;

	public Object getValueObject() {
		return this.valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}

	private final static String defaultCharset = java.nio.charset.Charset.defaultCharset().name();

	private final static String utf8Charset = "UTF-8";

	// contains type for every context property
	public class PropertiesWithType extends java.util.Properties {
		private static final long serialVersionUID = 1L;
		private java.util.Map<String, String> propertyTypes = new java.util.HashMap<>();

		public PropertiesWithType(java.util.Properties properties) {
			super(properties);
		}

		public PropertiesWithType() {
			super();
		}

		public void setContextType(String key, String type) {
			propertyTypes.put(key, type);
		}

		public String getContextType(String key) {
			return propertyTypes.get(key);
		}
	}

	// create and load default properties
	private java.util.Properties defaultProps = new java.util.Properties();

	// create application properties with default
	public class ContextProperties extends PropertiesWithType {

		private static final long serialVersionUID = 1L;

		public ContextProperties(java.util.Properties properties) {
			super(properties);
		}

		public ContextProperties() {
			super();
		}

		public void synchronizeContext() {

			if (dtDebCalendrier != null) {

				String pattern_dtDebCalendrier = "yyyy-MM-dd HH:mm:ss";
				String value_dtDebCalendrier = "2020-01-01 00:00:00";
				String[] parts_dtDebCalendrier = value_dtDebCalendrier.split(";");
				if (parts_dtDebCalendrier.length > 1) {
					pattern_dtDebCalendrier = parts_dtDebCalendrier[0];
					this.setProperty("dtDebCalendrier", pattern_dtDebCalendrier + ";"
							+ FormatterUtils.format_Date(dtDebCalendrier, pattern_dtDebCalendrier));
				} else {
					this.setProperty("dtDebCalendrier",
							FormatterUtils.format_Date(dtDebCalendrier, pattern_dtDebCalendrier));
				}

			}

			if (dtFinCalendrier != null) {

				String pattern_dtFinCalendrier = "yyyy-MM-dd HH:mm:ss";
				String value_dtFinCalendrier = "2025-12-31 00:00:00";
				String[] parts_dtFinCalendrier = value_dtFinCalendrier.split(";");
				if (parts_dtFinCalendrier.length > 1) {
					pattern_dtFinCalendrier = parts_dtFinCalendrier[0];
					this.setProperty("dtFinCalendrier", pattern_dtFinCalendrier + ";"
							+ FormatterUtils.format_Date(dtFinCalendrier, pattern_dtFinCalendrier));
				} else {
					this.setProperty("dtFinCalendrier",
							FormatterUtils.format_Date(dtFinCalendrier, pattern_dtFinCalendrier));
				}

			}

			if (nbJoursCalendrier != null) {

				this.setProperty("nbJoursCalendrier", nbJoursCalendrier.toString());

			}

			if (additionalParam != null) {

				this.setProperty("additionalParam", additionalParam.toString());

			}

			if (database != null) {

				this.setProperty("database", database.toString());

			}

			if (password != null) {

				this.setProperty("password", password.toString());

			}

			if (port != null) {

				this.setProperty("port", port.toString());

			}

			if (schema_dwh != null) {

				this.setProperty("schema_dwh", schema_dwh.toString());

			}

			if (serverName != null) {

				this.setProperty("serverName", serverName.toString());

			}

			if (utilisateur != null) {

				this.setProperty("utilisateur", utilisateur.toString());

			}

			if (schema_param != null) {

				this.setProperty("schema_param", schema_param.toString());

			}

		}

		// if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if (NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

		public java.util.Date dtDebCalendrier;

		public java.util.Date getDtDebCalendrier() {
			return this.dtDebCalendrier;
		}

		public java.util.Date dtFinCalendrier;

		public java.util.Date getDtFinCalendrier() {
			return this.dtFinCalendrier;
		}

		public Integer nbJoursCalendrier;

		public Integer getNbJoursCalendrier() {
			return this.nbJoursCalendrier;
		}

		public String additionalParam;

		public String getAdditionalParam() {
			return this.additionalParam;
		}

		public String database;

		public String getDatabase() {
			return this.database;
		}

		public java.lang.String password;

		public java.lang.String getPassword() {
			return this.password;
		}

		public String port;

		public String getPort() {
			return this.port;
		}

		public String schema_dwh;

		public String getSchema_dwh() {
			return this.schema_dwh;
		}

		public String serverName;

		public String getServerName() {
			return this.serverName;
		}

		public String utilisateur;

		public String getUtilisateur() {
			return this.utilisateur;
		}

		public String schema_param;

		public String getSchema_param() {
			return this.schema_param;
		}
	}

	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.

	public ContextProperties getContext() {
		return this.context;
	}

	private final String jobVersion = "0.2";
	private final String jobName = "jGenerateCalendar";
	private final String projectName = "ICOMMERCE_REPORTING";
	public Integer errorCode = null;
	private String currentComponent = "";

	private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
	private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();

	private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
	private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
	private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
	public final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();

	private RunStat runStat = new RunStat();

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";

	private final static String KEY_DB_DATASOURCES_RAW = "KEY_DB_DATASOURCES_RAW";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(),
					new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}

	public void setDataSourceReferences(List serviceReferences) throws Exception {

		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		java.util.Map<String, javax.sql.DataSource> dataSources = new java.util.HashMap<String, javax.sql.DataSource>();

		for (java.util.Map.Entry<String, javax.sql.DataSource> entry : BundleUtils
				.getServices(serviceReferences, javax.sql.DataSource.class).entrySet()) {
			dataSources.put(entry.getKey(), entry.getValue());
			talendDataSources.put(entry.getKey(), new routines.system.TalendDataSource(entry.getValue()));
		}

		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}

	private final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
	private final java.io.PrintStream errorMessagePS = new java.io.PrintStream(new java.io.BufferedOutputStream(baos));

	public String getExceptionStackTrace() {
		if ("failure".equals(this.getStatus())) {
			errorMessagePS.flush();
			return baos.toString();
		}
		return null;
	}

	private Exception exception;

	public Exception getException() {
		if ("failure".equals(this.getStatus())) {
			return this.exception;
		}
		return null;
	}

	private class TalendException extends Exception {

		private static final long serialVersionUID = 1L;

		private java.util.Map<String, Object> globalMap = null;
		private Exception e = null;
		private String currentComponent = null;
		private String virtualComponentName = null;

		public void setVirtualComponentName(String virtualComponentName) {
			this.virtualComponentName = virtualComponentName;
		}

		private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
			this.currentComponent = errorComponent;
			this.globalMap = globalMap;
			this.e = e;
		}

		public Exception getException() {
			return this.e;
		}

		public String getCurrentComponent() {
			return this.currentComponent;
		}

		public String getExceptionCauseMessage(Exception e) {
			Throwable cause = e;
			String message = null;
			int i = 10;
			while (null != cause && 0 < i--) {
				message = cause.getMessage();
				if (null == message) {
					cause = cause.getCause();
				} else {
					break;
				}
			}
			if (null == message) {
				message = e.getClass().getName();
			}
			return message;
		}

		@Override
		public void printStackTrace() {
			if (!(e instanceof TalendException || e instanceof TDieException)) {
				if (virtualComponentName != null && currentComponent.indexOf(virtualComponentName + "_") == 0) {
					globalMap.put(virtualComponentName + "_ERROR_MESSAGE", getExceptionCauseMessage(e));
				}
				globalMap.put(currentComponent + "_ERROR_MESSAGE", getExceptionCauseMessage(e));
				System.err.println("Exception in component " + currentComponent + " (" + jobName + ")");
			}
			if (!(e instanceof TDieException)) {
				if (e instanceof TalendException) {
					e.printStackTrace();
				} else {
					e.printStackTrace();
					e.printStackTrace(errorMessagePS);
					jGenerateCalendar.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(jGenerateCalendar.this, new Object[] { e, currentComponent, globalMap });
							break;
						}
					}

					if (!(e instanceof TDieException)) {
					}
				} catch (Exception e) {
					this.e.printStackTrace();
				}
			}
		}
	}

	public void Implicit_Context_Database_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		Implicit_Context_Context_error(exception, errorComponent, globalMap);

	}

	public void Implicit_Context_Context_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		Implicit_Context_Database_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tPostjob_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tPostjob_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tChronometerStop_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tChronometerStop_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBCommit_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBCommit_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tJava_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tJava_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tPrejob_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tChronometerStart_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tChronometerStart_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBConnection_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBConnection_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tJava_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tJava_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tRowGenerator_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tRowGenerator_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tRowGenerator_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tMap_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tRowGenerator_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBOutput_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tRowGenerator_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileInputExcel_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tRowGenerator_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tAdvancedHash_joursFeries_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tRowGenerator_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void Implicit_Context_Database_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tPostjob_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tChronometerStop_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBCommit_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tJava_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tPrejob_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tChronometerStart_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBConnection_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tJava_3_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tRowGenerator_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public static class row_Implicit_Context_DatabaseStruct
			implements routines.system.IPersistableRow<row_Implicit_Context_DatabaseStruct> {
		final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jGenerateCalendar = new byte[0];
		static byte[] commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar = new byte[0];

		public String key;

		public String getKey() {
			return this.key;
		}

		public String value;

		public String getValue() {
			return this.value;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar.length) {
					if (length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar.length == 0) {
						commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar = new byte[1024];
					} else {
						commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar, 0, length);
				strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			String strReturn = null;
			int length = 0;
			length = unmarshaller.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar.length) {
					if (length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar.length == 0) {
						commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar = new byte[1024];
					} else {
						commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar, 0, length);
				strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private void writeString(String str, ObjectOutputStream dos) throws IOException {
			if (str == null) {
				dos.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				dos.writeInt(byteArray.length);
				dos.write(byteArray);
			}
		}

		private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (str == null) {
				marshaller.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				marshaller.writeInt(byteArray.length);
				marshaller.write(byteArray);
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_ICOMMERCE_REPORTING_jGenerateCalendar) {

				try {

					int length = 0;

					this.key = readString(dis);

					this.value = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_ICOMMERCE_REPORTING_jGenerateCalendar) {

				try {

					int length = 0;

					this.key = readString(dis);

					this.value = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.key, dos);

				// String

				writeString(this.value, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// String

				writeString(this.key, dos);

				// String

				writeString(this.value, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("key=" + key);
			sb.append(",value=" + value);
			sb.append("]");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row_Implicit_Context_DatabaseStruct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public void Implicit_Context_DatabaseProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("Implicit_Context_Database_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;
		String currentVirtualComponent = null;

		String iterateId = "";

		String currentComponent = "";
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				row_Implicit_Context_DatabaseStruct row_Implicit_Context_Database = new row_Implicit_Context_DatabaseStruct();

				/**
				 * [Implicit_Context_Context begin ] start
				 */

				ok_Hash.put("Implicit_Context_Context", false);
				start_Hash.put("Implicit_Context_Context", System.currentTimeMillis());

				currentVirtualComponent = "Implicit_Context_Context";

				currentComponent = "Implicit_Context_Context";

				if (execStat) {
					runStat.updateStatOnConnection(resourceMap, iterateId, 0, 0, "Main");
				}

				int tos_count_Implicit_Context_Context = 0;

				java.util.List<String> assignList_Implicit_Context_Context = new java.util.ArrayList<String>();
				java.util.List<String> newPropertyList_Implicit_Context_Context = new java.util.ArrayList<String>();
				java.util.List<String> noAssignList_Implicit_Context_Context = new java.util.ArrayList<String>();
				int nb_line_Implicit_Context_Context = 0;

				/**
				 * [Implicit_Context_Context begin ] stop
				 */

				/**
				 * [Implicit_Context_Database begin ] start
				 */

				ok_Hash.put("Implicit_Context_Database", false);
				start_Hash.put("Implicit_Context_Database", System.currentTimeMillis());

				currentVirtualComponent = "Implicit_Context_Database";

				currentComponent = "Implicit_Context_Database";

				int tos_count_Implicit_Context_Database = 0;

				int nb_line_Implicit_Context_Database = 0;
				java.sql.Connection conn_Implicit_Context_Database = null;
				String driverClass_Implicit_Context_Database = "org.postgresql.Driver";
				java.lang.Class jdbcclazz_Implicit_Context_Database = java.lang.Class
						.forName(driverClass_Implicit_Context_Database);
				String dbUser_Implicit_Context_Database = context.utilisateur;

				final String decryptedPassword_Implicit_Context_Database = context.password;

				String dbPwd_Implicit_Context_Database = decryptedPassword_Implicit_Context_Database;

				String url_Implicit_Context_Database = "jdbc:postgresql://" + context.serverName + ":" + context.port
						+ "/" + context.database + "?" + context.additionalParam;

				conn_Implicit_Context_Database = java.sql.DriverManager.getConnection(url_Implicit_Context_Database,
						dbUser_Implicit_Context_Database, dbPwd_Implicit_Context_Database);

				conn_Implicit_Context_Database.setAutoCommit(false);

				java.sql.Statement stmt_Implicit_Context_Database = conn_Implicit_Context_Database.createStatement();

				String dbquery_Implicit_Context_Database = "SELECT \n  \"" + context.schema_param
						+ "\".\"CONTEXTE\".\"key\", \n  \"" + context.schema_param
						+ "\".\"CONTEXTE\".\"value\"\nFROM \"" + context.schema_param + "\".\"CONTEXTE\"";

				globalMap.put("Implicit_Context_Database_QUERY", dbquery_Implicit_Context_Database);
				java.sql.ResultSet rs_Implicit_Context_Database = null;

				try {
					rs_Implicit_Context_Database = stmt_Implicit_Context_Database
							.executeQuery(dbquery_Implicit_Context_Database);
					java.sql.ResultSetMetaData rsmd_Implicit_Context_Database = rs_Implicit_Context_Database
							.getMetaData();
					int colQtyInRs_Implicit_Context_Database = rsmd_Implicit_Context_Database.getColumnCount();

					String tmpContent_Implicit_Context_Database = null;

					while (rs_Implicit_Context_Database.next()) {
						nb_line_Implicit_Context_Database++;

						if (colQtyInRs_Implicit_Context_Database < 1) {
							row_Implicit_Context_Database.key = null;
						} else {

							row_Implicit_Context_Database.key = routines.system.JDBCUtil
									.getString(rs_Implicit_Context_Database, 1, false);
						}
						if (colQtyInRs_Implicit_Context_Database < 2) {
							row_Implicit_Context_Database.value = null;
						} else {

							row_Implicit_Context_Database.value = routines.system.JDBCUtil
									.getString(rs_Implicit_Context_Database, 2, false);
						}

						/**
						 * [Implicit_Context_Database begin ] stop
						 */

						/**
						 * [Implicit_Context_Database main ] start
						 */

						currentVirtualComponent = "Implicit_Context_Database";

						currentComponent = "Implicit_Context_Database";

						tos_count_Implicit_Context_Database++;

						/**
						 * [Implicit_Context_Database main ] stop
						 */

						/**
						 * [Implicit_Context_Database process_data_begin ] start
						 */

						currentVirtualComponent = "Implicit_Context_Database";

						currentComponent = "Implicit_Context_Database";

						/**
						 * [Implicit_Context_Database process_data_begin ] stop
						 */

						/**
						 * [Implicit_Context_Context main ] start
						 */

						currentVirtualComponent = "Implicit_Context_Context";

						currentComponent = "Implicit_Context_Context";

						if (execStat) {
							runStat.updateStatOnConnection(iterateId, 1, 1

									, "Main"

							);
						}

						//////////////////////////
						String tmp_key_Implicit_Context_Context = null;
						String key_Implicit_Context_Context = null;
						if (row_Implicit_Context_Database.key != null) {
							tmp_key_Implicit_Context_Context = row_Implicit_Context_Database.key.trim();
							if ((tmp_key_Implicit_Context_Context.startsWith("#")
									|| tmp_key_Implicit_Context_Context.startsWith("!"))) {
								tmp_key_Implicit_Context_Context = null;
							} else {
								row_Implicit_Context_Database.key = tmp_key_Implicit_Context_Context;
							}
						}
						if (row_Implicit_Context_Database.key != null) {
							key_Implicit_Context_Context = row_Implicit_Context_Database.key;
						}
						String value_Implicit_Context_Context = null;
						if (row_Implicit_Context_Database.value != null) {
							value_Implicit_Context_Context = row_Implicit_Context_Database.value;
						}

						String currentValue_Implicit_Context_Context = value_Implicit_Context_Context;

						if ((key_Implicit_Context_Context != null) && ("password".equals(key_Implicit_Context_Context)))
							currentValue_Implicit_Context_Context = currentValue_Implicit_Context_Context
									.replaceAll(".", "*");

						if (tmp_key_Implicit_Context_Context != null) {
							try {
								if (key_Implicit_Context_Context != null
										&& "dtDebCalendrier".equals(key_Implicit_Context_Context)) {
									String context_dtDebCalendrier_value = context.getProperty("dtDebCalendrier");
									if (context_dtDebCalendrier_value == null)
										context_dtDebCalendrier_value = "";
									int context_dtDebCalendrier_pos = context_dtDebCalendrier_value.indexOf(";");
									String context_dtDebCalendrier_pattern = "yyyy-MM-dd HH:mm:ss";
									if (context_dtDebCalendrier_pos > -1) {
										context_dtDebCalendrier_pattern = context_dtDebCalendrier_value.substring(0,
												context_dtDebCalendrier_pos);
									}
									context.dtDebCalendrier = (java.util.Date) (new java.text.SimpleDateFormat(
											context_dtDebCalendrier_pattern).parse(value_Implicit_Context_Context));

								}

								if (key_Implicit_Context_Context != null
										&& "dtFinCalendrier".equals(key_Implicit_Context_Context)) {
									String context_dtFinCalendrier_value = context.getProperty("dtFinCalendrier");
									if (context_dtFinCalendrier_value == null)
										context_dtFinCalendrier_value = "";
									int context_dtFinCalendrier_pos = context_dtFinCalendrier_value.indexOf(";");
									String context_dtFinCalendrier_pattern = "yyyy-MM-dd HH:mm:ss";
									if (context_dtFinCalendrier_pos > -1) {
										context_dtFinCalendrier_pattern = context_dtFinCalendrier_value.substring(0,
												context_dtFinCalendrier_pos);
									}
									context.dtFinCalendrier = (java.util.Date) (new java.text.SimpleDateFormat(
											context_dtFinCalendrier_pattern).parse(value_Implicit_Context_Context));

								}

								if (key_Implicit_Context_Context != null
										&& "nbJoursCalendrier".equals(key_Implicit_Context_Context)) {

									context.nbJoursCalendrier = Integer.parseInt(value_Implicit_Context_Context);

								}

								if (key_Implicit_Context_Context != null
										&& "additionalParam".equals(key_Implicit_Context_Context)) {
									context.additionalParam = value_Implicit_Context_Context;
								}

								if (key_Implicit_Context_Context != null
										&& "database".equals(key_Implicit_Context_Context)) {
									context.database = value_Implicit_Context_Context;
								}

								if (key_Implicit_Context_Context != null
										&& "password".equals(key_Implicit_Context_Context)) {
									context.password = value_Implicit_Context_Context;
								}

								if (key_Implicit_Context_Context != null
										&& "port".equals(key_Implicit_Context_Context)) {
									context.port = value_Implicit_Context_Context;
								}

								if (key_Implicit_Context_Context != null
										&& "schema_dwh".equals(key_Implicit_Context_Context)) {
									context.schema_dwh = value_Implicit_Context_Context;
								}

								if (key_Implicit_Context_Context != null
										&& "serverName".equals(key_Implicit_Context_Context)) {
									context.serverName = value_Implicit_Context_Context;
								}

								if (key_Implicit_Context_Context != null
										&& "utilisateur".equals(key_Implicit_Context_Context)) {
									context.utilisateur = value_Implicit_Context_Context;
								}

								if (key_Implicit_Context_Context != null
										&& "schema_param".equals(key_Implicit_Context_Context)) {
									context.schema_param = value_Implicit_Context_Context;
								}

								if (context.getProperty(key_Implicit_Context_Context) != null) {
									assignList_Implicit_Context_Context.add(key_Implicit_Context_Context);
								} else {
									newPropertyList_Implicit_Context_Context.add(key_Implicit_Context_Context);
								}
								if (value_Implicit_Context_Context == null) {
									context.setProperty(key_Implicit_Context_Context, "");
								} else {
									context.setProperty(key_Implicit_Context_Context, value_Implicit_Context_Context);
								}
							} catch (java.lang.Exception e) {
								globalMap.put("Implicit_Context_Context_ERROR_MESSAGE", e.getMessage());
								System.err.println("Setting a value for the key \"" + key_Implicit_Context_Context
										+ "\" has failed. Error message: " + e.getMessage());
							}
							nb_line_Implicit_Context_Context++;
						}
						//////////////////////////

						tos_count_Implicit_Context_Context++;

						/**
						 * [Implicit_Context_Context main ] stop
						 */

						/**
						 * [Implicit_Context_Context process_data_begin ] start
						 */

						currentVirtualComponent = "Implicit_Context_Context";

						currentComponent = "Implicit_Context_Context";

						/**
						 * [Implicit_Context_Context process_data_begin ] stop
						 */

						/**
						 * [Implicit_Context_Context process_data_end ] start
						 */

						currentVirtualComponent = "Implicit_Context_Context";

						currentComponent = "Implicit_Context_Context";

						/**
						 * [Implicit_Context_Context process_data_end ] stop
						 */

						/**
						 * [Implicit_Context_Database process_data_end ] start
						 */

						currentVirtualComponent = "Implicit_Context_Database";

						currentComponent = "Implicit_Context_Database";

						/**
						 * [Implicit_Context_Database process_data_end ] stop
						 */

						/**
						 * [Implicit_Context_Database end ] start
						 */

						currentVirtualComponent = "Implicit_Context_Database";

						currentComponent = "Implicit_Context_Database";

					}
				} finally {
					if (rs_Implicit_Context_Database != null) {
						rs_Implicit_Context_Database.close();
					}
					if (stmt_Implicit_Context_Database != null) {
						stmt_Implicit_Context_Database.close();
					}
					if (conn_Implicit_Context_Database != null && !conn_Implicit_Context_Database.isClosed()) {

						conn_Implicit_Context_Database.commit();

						conn_Implicit_Context_Database.close();

						if ("com.mysql.cj.jdbc.Driver".equals((String) globalMap.get("driverClass_"))
								&& routines.system.BundleUtils.inOSGi()) {
							Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread")
									.getMethod("checkedShutdown").invoke(null, (Object[]) null);
						}

					}

				}
				globalMap.put("Implicit_Context_Database_NB_LINE", nb_line_Implicit_Context_Database);

				ok_Hash.put("Implicit_Context_Database", true);
				end_Hash.put("Implicit_Context_Database", System.currentTimeMillis());

				/**
				 * [Implicit_Context_Database end ] stop
				 */

				/**
				 * [Implicit_Context_Context end ] start
				 */

				currentVirtualComponent = "Implicit_Context_Context";

				currentComponent = "Implicit_Context_Context";

				java.util.Enumeration<?> enu_Implicit_Context_Context = context.propertyNames();
				while (enu_Implicit_Context_Context.hasMoreElements()) {
					String key_Implicit_Context_Context = (String) enu_Implicit_Context_Context.nextElement();
					if (!assignList_Implicit_Context_Context.contains(key_Implicit_Context_Context)
							&& !newPropertyList_Implicit_Context_Context.contains(key_Implicit_Context_Context)) {
						noAssignList_Implicit_Context_Context.add(key_Implicit_Context_Context);
					}
				}
				for (Object obj_Implicit_Context_Context : noAssignList_Implicit_Context_Context) {

					System.out.println("Warning: Parameter \"" + obj_Implicit_Context_Context
							+ "\" has not been set by Implicit_Context_Context");

				}

				String newPropertyStr_Implicit_Context_Context = newPropertyList_Implicit_Context_Context.toString();
				String newProperty_Implicit_Context_Context = newPropertyStr_Implicit_Context_Context.substring(1,
						newPropertyStr_Implicit_Context_Context.length() - 1);

				String noAssignStr_Implicit_Context_Context = noAssignList_Implicit_Context_Context.toString();
				String noAssign_Implicit_Context_Context = noAssignStr_Implicit_Context_Context.substring(1,
						noAssignStr_Implicit_Context_Context.length() - 1);

				globalMap.put("Implicit_Context_Context_KEY_NOT_INCONTEXT", newProperty_Implicit_Context_Context);
				globalMap.put("Implicit_Context_Context_KEY_NOT_LOADED", noAssign_Implicit_Context_Context);

				globalMap.put("Implicit_Context_Context_NB_LINE", nb_line_Implicit_Context_Context);

				List<String> parametersToEncrypt_Implicit_Context_Context = new java.util.ArrayList<String>();

				parametersToEncrypt_Implicit_Context_Context.add("password");

				resumeUtil.addLog("NODE", "NODE:Implicit_Context_Context", "", Thread.currentThread().getId() + "", "",
						"", "", "",
						resumeUtil.convertToJsonText(context, parametersToEncrypt_Implicit_Context_Context));

				if (execStat) {
					runStat.updateStat(resourceMap, iterateId, 2, 0, "Main");
				}

				ok_Hash.put("Implicit_Context_Context", true);
				end_Hash.put("Implicit_Context_Context", System.currentTimeMillis());

				/**
				 * [Implicit_Context_Context end ] stop
				 */

			} // end the resume

		} catch (java.lang.Exception e) {

			TalendException te = new TalendException(e, currentComponent, globalMap);

			te.setVirtualComponentName(currentVirtualComponent);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [Implicit_Context_Database finally ] start
				 */

				currentVirtualComponent = "Implicit_Context_Database";

				currentComponent = "Implicit_Context_Database";

				/**
				 * [Implicit_Context_Database finally ] stop
				 */

				/**
				 * [Implicit_Context_Context finally ] start
				 */

				currentVirtualComponent = "Implicit_Context_Context";

				currentComponent = "Implicit_Context_Context";

				/**
				 * [Implicit_Context_Context finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("Implicit_Context_Database_SUBPROCESS_STATE", 1);
	}

	public void tPostjob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tPostjob_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		String iterateId = "";

		String currentComponent = "";
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				/**
				 * [tPostjob_1 begin ] start
				 */

				ok_Hash.put("tPostjob_1", false);
				start_Hash.put("tPostjob_1", System.currentTimeMillis());

				currentComponent = "tPostjob_1";

				int tos_count_tPostjob_1 = 0;

				/**
				 * [tPostjob_1 begin ] stop
				 */

				/**
				 * [tPostjob_1 main ] start
				 */

				currentComponent = "tPostjob_1";

				tos_count_tPostjob_1++;

				/**
				 * [tPostjob_1 main ] stop
				 */

				/**
				 * [tPostjob_1 process_data_begin ] start
				 */

				currentComponent = "tPostjob_1";

				/**
				 * [tPostjob_1 process_data_begin ] stop
				 */

				/**
				 * [tPostjob_1 process_data_end ] start
				 */

				currentComponent = "tPostjob_1";

				/**
				 * [tPostjob_1 process_data_end ] stop
				 */

				/**
				 * [tPostjob_1 end ] start
				 */

				currentComponent = "tPostjob_1";

				ok_Hash.put("tPostjob_1", true);
				end_Hash.put("tPostjob_1", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
				}
				tChronometerStop_1Process(globalMap);

				/**
				 * [tPostjob_1 end ] stop
				 */
			} // end the resume

		} catch (java.lang.Exception e) {

			TalendException te = new TalendException(e, currentComponent, globalMap);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [tPostjob_1 finally ] start
				 */

				currentComponent = "tPostjob_1";

				/**
				 * [tPostjob_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tPostjob_1_SUBPROCESS_STATE", 1);
	}

	public void tChronometerStop_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tChronometerStop_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		String iterateId = "";

		String currentComponent = "";
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				/**
				 * [tChronometerStop_1 begin ] start
				 */

				ok_Hash.put("tChronometerStop_1", false);
				start_Hash.put("tChronometerStop_1", System.currentTimeMillis());

				currentComponent = "tChronometerStop_1";

				int tos_count_tChronometerStop_1 = 0;

				long timetChronometerStop_1;

				timetChronometerStop_1 = System.currentTimeMillis() - startTime;

				Long currentTimetChronometerStop_1 = System.currentTimeMillis();
				globalMap.put("tChronometerStop_1", currentTimetChronometerStop_1);

				globalMap.put("tChronometerStop_1_STOPTIME", currentTimetChronometerStop_1);
				globalMap.put("tChronometerStop_1_DURATION", timetChronometerStop_1);

				/**
				 * [tChronometerStop_1 begin ] stop
				 */

				/**
				 * [tChronometerStop_1 main ] start
				 */

				currentComponent = "tChronometerStop_1";

				tos_count_tChronometerStop_1++;

				/**
				 * [tChronometerStop_1 main ] stop
				 */

				/**
				 * [tChronometerStop_1 process_data_begin ] start
				 */

				currentComponent = "tChronometerStop_1";

				/**
				 * [tChronometerStop_1 process_data_begin ] stop
				 */

				/**
				 * [tChronometerStop_1 process_data_end ] start
				 */

				currentComponent = "tChronometerStop_1";

				/**
				 * [tChronometerStop_1 process_data_end ] stop
				 */

				/**
				 * [tChronometerStop_1 end ] start
				 */

				currentComponent = "tChronometerStop_1";

				ok_Hash.put("tChronometerStop_1", true);
				end_Hash.put("tChronometerStop_1", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk6", 0, "ok");
				}
				tDBCommit_1Process(globalMap);

				/**
				 * [tChronometerStop_1 end ] stop
				 */
			} // end the resume

		} catch (java.lang.Exception e) {

			TalendException te = new TalendException(e, currentComponent, globalMap);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [tChronometerStop_1 finally ] start
				 */

				currentComponent = "tChronometerStop_1";

				/**
				 * [tChronometerStop_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tChronometerStop_1_SUBPROCESS_STATE", 1);
	}

	public void tDBCommit_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBCommit_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		String iterateId = "";

		String currentComponent = "";
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				/**
				 * [tDBCommit_1 begin ] start
				 */

				ok_Hash.put("tDBCommit_1", false);
				start_Hash.put("tDBCommit_1", System.currentTimeMillis());

				currentComponent = "tDBCommit_1";

				int tos_count_tDBCommit_1 = 0;

				/**
				 * [tDBCommit_1 begin ] stop
				 */

				/**
				 * [tDBCommit_1 main ] start
				 */

				currentComponent = "tDBCommit_1";

				java.sql.Connection conn_tDBCommit_1 = (java.sql.Connection) globalMap.get("conn_tDBConnection_1");
				if (conn_tDBCommit_1 != null && !conn_tDBCommit_1.isClosed()) {

					conn_tDBCommit_1.commit();

				}

				tos_count_tDBCommit_1++;

				/**
				 * [tDBCommit_1 main ] stop
				 */

				/**
				 * [tDBCommit_1 process_data_begin ] start
				 */

				currentComponent = "tDBCommit_1";

				/**
				 * [tDBCommit_1 process_data_begin ] stop
				 */

				/**
				 * [tDBCommit_1 process_data_end ] start
				 */

				currentComponent = "tDBCommit_1";

				/**
				 * [tDBCommit_1 process_data_end ] stop
				 */

				/**
				 * [tDBCommit_1 end ] start
				 */

				currentComponent = "tDBCommit_1";

				ok_Hash.put("tDBCommit_1", true);
				end_Hash.put("tDBCommit_1", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk8", 0, "ok");
				}
				tJava_1Process(globalMap);

				/**
				 * [tDBCommit_1 end ] stop
				 */
			} // end the resume

		} catch (java.lang.Exception e) {

			TalendException te = new TalendException(e, currentComponent, globalMap);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [tDBCommit_1 finally ] start
				 */

				currentComponent = "tDBCommit_1";

				/**
				 * [tDBCommit_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBCommit_1_SUBPROCESS_STATE", 1);
	}

	public void tJava_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tJava_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		String iterateId = "";

		String currentComponent = "";
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				/**
				 * [tJava_1 begin ] start
				 */

				ok_Hash.put("tJava_1", false);
				start_Hash.put("tJava_1", System.currentTimeMillis());

				currentComponent = "tJava_1";

				int tos_count_tJava_1 = 0;

				System.out.println(
						"Fin de la génération du calendrier.  : " + TalendDate.formatDate("yyyy-MM-dd HH:mm:ss",
								new java.util.Date(((Long) globalMap.get("tChronometerStop_1_STOPTIME")))));

				System.out.println("Durée totale d'exécution             : "
						+ customCode.getFormattedTime(((Long) globalMap.get("tChronometerStop_1_DURATION"))) + "");
				System.out.println("-----------------------------------------------------------------------------");

				/**
				 * [tJava_1 begin ] stop
				 */

				/**
				 * [tJava_1 main ] start
				 */

				currentComponent = "tJava_1";

				tos_count_tJava_1++;

				/**
				 * [tJava_1 main ] stop
				 */

				/**
				 * [tJava_1 process_data_begin ] start
				 */

				currentComponent = "tJava_1";

				/**
				 * [tJava_1 process_data_begin ] stop
				 */

				/**
				 * [tJava_1 process_data_end ] start
				 */

				currentComponent = "tJava_1";

				/**
				 * [tJava_1 process_data_end ] stop
				 */

				/**
				 * [tJava_1 end ] start
				 */

				currentComponent = "tJava_1";

				ok_Hash.put("tJava_1", true);
				end_Hash.put("tJava_1", System.currentTimeMillis());

				/**
				 * [tJava_1 end ] stop
				 */
			} // end the resume

		} catch (java.lang.Exception e) {

			TalendException te = new TalendException(e, currentComponent, globalMap);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [tJava_1 finally ] start
				 */

				currentComponent = "tJava_1";

				/**
				 * [tJava_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tJava_1_SUBPROCESS_STATE", 1);
	}

	public void tPrejob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tPrejob_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		String iterateId = "";

		String currentComponent = "";
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				/**
				 * [tPrejob_1 begin ] start
				 */

				ok_Hash.put("tPrejob_1", false);
				start_Hash.put("tPrejob_1", System.currentTimeMillis());

				currentComponent = "tPrejob_1";

				int tos_count_tPrejob_1 = 0;

				/**
				 * [tPrejob_1 begin ] stop
				 */

				/**
				 * [tPrejob_1 main ] start
				 */

				currentComponent = "tPrejob_1";

				tos_count_tPrejob_1++;

				/**
				 * [tPrejob_1 main ] stop
				 */

				/**
				 * [tPrejob_1 process_data_begin ] start
				 */

				currentComponent = "tPrejob_1";

				/**
				 * [tPrejob_1 process_data_begin ] stop
				 */

				/**
				 * [tPrejob_1 process_data_end ] start
				 */

				currentComponent = "tPrejob_1";

				/**
				 * [tPrejob_1 process_data_end ] stop
				 */

				/**
				 * [tPrejob_1 end ] start
				 */

				currentComponent = "tPrejob_1";

				ok_Hash.put("tPrejob_1", true);
				end_Hash.put("tPrejob_1", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk1", 0, "ok");
				}
				tChronometerStart_1Process(globalMap);

				/**
				 * [tPrejob_1 end ] stop
				 */
			} // end the resume

		} catch (java.lang.Exception e) {

			TalendException te = new TalendException(e, currentComponent, globalMap);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [tPrejob_1 finally ] start
				 */

				currentComponent = "tPrejob_1";

				/**
				 * [tPrejob_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tPrejob_1_SUBPROCESS_STATE", 1);
	}

	public void tChronometerStart_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tChronometerStart_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		String iterateId = "";

		String currentComponent = "";
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				/**
				 * [tChronometerStart_1 begin ] start
				 */

				ok_Hash.put("tChronometerStart_1", false);
				start_Hash.put("tChronometerStart_1", System.currentTimeMillis());

				currentComponent = "tChronometerStart_1";

				int tos_count_tChronometerStart_1 = 0;

				Long currentTimetChronometerStart_1 = System.currentTimeMillis();

				globalMap.put("tChronometerStart_1", currentTimetChronometerStart_1);
				globalMap.put("tChronometerStart_1_STARTTIME", currentTimetChronometerStart_1);

				/**
				 * [tChronometerStart_1 begin ] stop
				 */

				/**
				 * [tChronometerStart_1 main ] start
				 */

				currentComponent = "tChronometerStart_1";

				tos_count_tChronometerStart_1++;

				/**
				 * [tChronometerStart_1 main ] stop
				 */

				/**
				 * [tChronometerStart_1 process_data_begin ] start
				 */

				currentComponent = "tChronometerStart_1";

				/**
				 * [tChronometerStart_1 process_data_begin ] stop
				 */

				/**
				 * [tChronometerStart_1 process_data_end ] start
				 */

				currentComponent = "tChronometerStart_1";

				/**
				 * [tChronometerStart_1 process_data_end ] stop
				 */

				/**
				 * [tChronometerStart_1 end ] start
				 */

				currentComponent = "tChronometerStart_1";

				ok_Hash.put("tChronometerStart_1", true);
				end_Hash.put("tChronometerStart_1", System.currentTimeMillis());

				/**
				 * [tChronometerStart_1 end ] stop
				 */
			} // end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tChronometerStart_1:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk1", 0, "ok");
			}

			tDBConnection_1Process(globalMap);

		} catch (java.lang.Exception e) {

			TalendException te = new TalendException(e, currentComponent, globalMap);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [tChronometerStart_1 finally ] start
				 */

				currentComponent = "tChronometerStart_1";

				/**
				 * [tChronometerStart_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tChronometerStart_1_SUBPROCESS_STATE", 1);
	}

	public void tDBConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		String iterateId = "";

		String currentComponent = "";
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				/**
				 * [tDBConnection_1 begin ] start
				 */

				ok_Hash.put("tDBConnection_1", false);
				start_Hash.put("tDBConnection_1", System.currentTimeMillis());

				currentComponent = "tDBConnection_1";

				int tos_count_tDBConnection_1 = 0;

				String dbProperties_tDBConnection_1 = context.additionalParam;
				String url_tDBConnection_1 = "jdbc:postgresql://" + context.serverName + ":" + context.port + "/"
						+ context.database;

				if (dbProperties_tDBConnection_1 != null && !"".equals(dbProperties_tDBConnection_1.trim())) {
					url_tDBConnection_1 = url_tDBConnection_1 + "?" + dbProperties_tDBConnection_1;
				}
				String dbUser_tDBConnection_1 = context.utilisateur;

				final String decryptedPassword_tDBConnection_1 = context.password;
				String dbPwd_tDBConnection_1 = decryptedPassword_tDBConnection_1;

				java.sql.Connection conn_tDBConnection_1 = null;

				java.util.Enumeration<java.sql.Driver> drivers_tDBConnection_1 = java.sql.DriverManager.getDrivers();
				java.util.Set<String> redShiftDriverNames_tDBConnection_1 = new java.util.HashSet<String>(
						java.util.Arrays.asList("com.amazon.redshift.jdbc.Driver", "com.amazon.redshift.jdbc41.Driver",
								"com.amazon.redshift.jdbc42.Driver"));
				while (drivers_tDBConnection_1.hasMoreElements()) {
					java.sql.Driver d_tDBConnection_1 = drivers_tDBConnection_1.nextElement();
					if (redShiftDriverNames_tDBConnection_1.contains(d_tDBConnection_1.getClass().getName())) {
						try {
							java.sql.DriverManager.deregisterDriver(d_tDBConnection_1);
							java.sql.DriverManager.registerDriver(d_tDBConnection_1);
						} catch (java.lang.Exception e_tDBConnection_1) {
							globalMap.put("tDBConnection_1_ERROR_MESSAGE", e_tDBConnection_1.getMessage());
							// do nothing
						}
					}
				}
				String driverClass_tDBConnection_1 = "org.postgresql.Driver";
				java.lang.Class jdbcclazz_tDBConnection_1 = java.lang.Class.forName(driverClass_tDBConnection_1);
				globalMap.put("driverClass_tDBConnection_1", driverClass_tDBConnection_1);

				conn_tDBConnection_1 = java.sql.DriverManager.getConnection(url_tDBConnection_1, dbUser_tDBConnection_1,
						dbPwd_tDBConnection_1);

				globalMap.put("conn_tDBConnection_1", conn_tDBConnection_1);
				if (null != conn_tDBConnection_1) {

					conn_tDBConnection_1.setAutoCommit(false);
				}

				globalMap.put("schema_" + "tDBConnection_1", context.schema_dwh);

				/**
				 * [tDBConnection_1 begin ] stop
				 */

				/**
				 * [tDBConnection_1 main ] start
				 */

				currentComponent = "tDBConnection_1";

				tos_count_tDBConnection_1++;

				/**
				 * [tDBConnection_1 main ] stop
				 */

				/**
				 * [tDBConnection_1 process_data_begin ] start
				 */

				currentComponent = "tDBConnection_1";

				/**
				 * [tDBConnection_1 process_data_begin ] stop
				 */

				/**
				 * [tDBConnection_1 process_data_end ] start
				 */

				currentComponent = "tDBConnection_1";

				/**
				 * [tDBConnection_1 process_data_end ] stop
				 */

				/**
				 * [tDBConnection_1 end ] start
				 */

				currentComponent = "tDBConnection_1";

				ok_Hash.put("tDBConnection_1", true);
				end_Hash.put("tDBConnection_1", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk7", 0, "ok");
				}
				tJava_3Process(globalMap);

				/**
				 * [tDBConnection_1 end ] stop
				 */
			} // end the resume

		} catch (java.lang.Exception e) {

			TalendException te = new TalendException(e, currentComponent, globalMap);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [tDBConnection_1 finally ] start
				 */

				currentComponent = "tDBConnection_1";

				/**
				 * [tDBConnection_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 1);
	}

	public void tJava_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tJava_3_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		String iterateId = "";

		String currentComponent = "";
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				/**
				 * [tJava_3 begin ] start
				 */

				ok_Hash.put("tJava_3", false);
				start_Hash.put("tJava_3", System.currentTimeMillis());

				currentComponent = "tJava_3";

				int tos_count_tJava_3 = 0;

				context.nbJoursCalendrier = (int) TalendDate.diffDate(context.dtFinCalendrier, context.dtDebCalendrier,
						"dd") + 1;
				System.out.println("-----------------------------------------------------------------------------");
				System.out.println(
						"Début de la génération du calendrier : " + TalendDate.formatDate("yyyy-MM-dd HH:mm:ss",
								new java.util.Date(((Long) globalMap.get("tChronometerStart_1_STARTTIME")))));
				System.out.println("Nombre de jours à générer            : " + context.nbJoursCalendrier);

				/**
				 * [tJava_3 begin ] stop
				 */

				/**
				 * [tJava_3 main ] start
				 */

				currentComponent = "tJava_3";

				tos_count_tJava_3++;

				/**
				 * [tJava_3 main ] stop
				 */

				/**
				 * [tJava_3 process_data_begin ] start
				 */

				currentComponent = "tJava_3";

				/**
				 * [tJava_3 process_data_begin ] stop
				 */

				/**
				 * [tJava_3 process_data_end ] start
				 */

				currentComponent = "tJava_3";

				/**
				 * [tJava_3 process_data_end ] stop
				 */

				/**
				 * [tJava_3 end ] start
				 */

				currentComponent = "tJava_3";

				ok_Hash.put("tJava_3", true);
				end_Hash.put("tJava_3", System.currentTimeMillis());

				/**
				 * [tJava_3 end ] stop
				 */
			} // end the resume

		} catch (java.lang.Exception e) {

			TalendException te = new TalendException(e, currentComponent, globalMap);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [tJava_3 finally ] start
				 */

				currentComponent = "tJava_3";

				/**
				 * [tJava_3 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tJava_3_SUBPROCESS_STATE", 1);
	}

	public static class detailCalendrierStruct implements routines.system.IPersistableRow<detailCalendrierStruct> {
		final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jGenerateCalendar = new byte[0];
		static byte[] commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar = new byte[0];
		protected static final int DEFAULT_HASHCODE = 1;
		protected static final int PRIME = 31;
		protected int hashCode = DEFAULT_HASHCODE;
		public boolean hashCodeDirty = true;

		public String loopKey;

		public int ID_DIM_CALENDRIER;

		public int getID_DIM_CALENDRIER() {
			return this.ID_DIM_CALENDRIER;
		}

		public java.util.Date DT_JOUR;

		public java.util.Date getDT_JOUR() {
			return this.DT_JOUR;
		}

		public int NB_ANNEE;

		public int getNB_ANNEE() {
			return this.NB_ANNEE;
		}

		public int NB_SEMESTRE;

		public int getNB_SEMESTRE() {
			return this.NB_SEMESTRE;
		}

		public int NB_TRIMESTRE;

		public int getNB_TRIMESTRE() {
			return this.NB_TRIMESTRE;
		}

		public int NB_MOIS;

		public int getNB_MOIS() {
			return this.NB_MOIS;
		}

		public int NB_JOUR_ANNEE;

		public int getNB_JOUR_ANNEE() {
			return this.NB_JOUR_ANNEE;
		}

		public int NB_JOUR_MOIS;

		public int getNB_JOUR_MOIS() {
			return this.NB_JOUR_MOIS;
		}

		public int NB_JOUR_SEMAINE;

		public int getNB_JOUR_SEMAINE() {
			return this.NB_JOUR_SEMAINE;
		}

		public int NB_SEMAINE_ANNEE;

		public int getNB_SEMAINE_ANNEE() {
			return this.NB_SEMAINE_ANNEE;
		}

		public String LB_MOIS;

		public String getLB_MOIS() {
			return this.LB_MOIS;
		}

		public String LB_JOUR;

		public String getLB_JOUR() {
			return this.LB_JOUR;
		}

		public int BL_DERNIER_JOUR_MOIS;

		public int getBL_DERNIER_JOUR_MOIS() {
			return this.BL_DERNIER_JOUR_MOIS;
		}

		public int BL_BISSEXTILE;

		public int getBL_BISSEXTILE() {
			return this.BL_BISSEXTILE;
		}

		public int BL_WEEK_END;

		public int getBL_WEEK_END() {
			return this.BL_WEEK_END;
		}

		public int BL_JOUR_FERIE;

		public int getBL_JOUR_FERIE() {
			return this.BL_JOUR_FERIE;
		}

		public String LB_JOUR_FERIE;

		public String getLB_JOUR_FERIE() {
			return this.LB_JOUR_FERIE;
		}

		@Override
		public int hashCode() {
			if (this.hashCodeDirty) {
				final int prime = PRIME;
				int result = DEFAULT_HASHCODE;

				result = prime * result + (int) this.ID_DIM_CALENDRIER;

				this.hashCode = result;
				this.hashCodeDirty = false;
			}
			return this.hashCode;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			final detailCalendrierStruct other = (detailCalendrierStruct) obj;

			if (this.ID_DIM_CALENDRIER != other.ID_DIM_CALENDRIER)
				return false;

			return true;
		}

		public void copyDataTo(detailCalendrierStruct other) {

			other.ID_DIM_CALENDRIER = this.ID_DIM_CALENDRIER;
			other.DT_JOUR = this.DT_JOUR;
			other.NB_ANNEE = this.NB_ANNEE;
			other.NB_SEMESTRE = this.NB_SEMESTRE;
			other.NB_TRIMESTRE = this.NB_TRIMESTRE;
			other.NB_MOIS = this.NB_MOIS;
			other.NB_JOUR_ANNEE = this.NB_JOUR_ANNEE;
			other.NB_JOUR_MOIS = this.NB_JOUR_MOIS;
			other.NB_JOUR_SEMAINE = this.NB_JOUR_SEMAINE;
			other.NB_SEMAINE_ANNEE = this.NB_SEMAINE_ANNEE;
			other.LB_MOIS = this.LB_MOIS;
			other.LB_JOUR = this.LB_JOUR;
			other.BL_DERNIER_JOUR_MOIS = this.BL_DERNIER_JOUR_MOIS;
			other.BL_BISSEXTILE = this.BL_BISSEXTILE;
			other.BL_WEEK_END = this.BL_WEEK_END;
			other.BL_JOUR_FERIE = this.BL_JOUR_FERIE;
			other.LB_JOUR_FERIE = this.LB_JOUR_FERIE;

		}

		public void copyKeysDataTo(detailCalendrierStruct other) {

			other.ID_DIM_CALENDRIER = this.ID_DIM_CALENDRIER;

		}

		private java.util.Date readDate(ObjectInputStream dis) throws IOException {
			java.util.Date dateReturn = null;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				dateReturn = null;
			} else {
				dateReturn = new Date(dis.readLong());
			}
			return dateReturn;
		}

		private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			java.util.Date dateReturn = null;
			int length = 0;
			length = unmarshaller.readByte();
			if (length == -1) {
				dateReturn = null;
			} else {
				dateReturn = new Date(unmarshaller.readLong());
			}
			return dateReturn;
		}

		private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException {
			if (date1 == null) {
				dos.writeByte(-1);
			} else {
				dos.writeByte(0);
				dos.writeLong(date1.getTime());
			}
		}

		private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (date1 == null) {
				marshaller.writeByte(-1);
			} else {
				marshaller.writeByte(0);
				marshaller.writeLong(date1.getTime());
			}
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar.length) {
					if (length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar.length == 0) {
						commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar = new byte[1024];
					} else {
						commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar, 0, length);
				strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			String strReturn = null;
			int length = 0;
			length = unmarshaller.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar.length) {
					if (length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar.length == 0) {
						commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar = new byte[1024];
					} else {
						commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar, 0, length);
				strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private void writeString(String str, ObjectOutputStream dos) throws IOException {
			if (str == null) {
				dos.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				dos.writeInt(byteArray.length);
				dos.write(byteArray);
			}
		}

		private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (str == null) {
				marshaller.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				marshaller.writeInt(byteArray.length);
				marshaller.write(byteArray);
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_ICOMMERCE_REPORTING_jGenerateCalendar) {

				try {

					int length = 0;

					this.ID_DIM_CALENDRIER = dis.readInt();

					this.DT_JOUR = readDate(dis);

					this.NB_ANNEE = dis.readInt();

					this.NB_SEMESTRE = dis.readInt();

					this.NB_TRIMESTRE = dis.readInt();

					this.NB_MOIS = dis.readInt();

					this.NB_JOUR_ANNEE = dis.readInt();

					this.NB_JOUR_MOIS = dis.readInt();

					this.NB_JOUR_SEMAINE = dis.readInt();

					this.NB_SEMAINE_ANNEE = dis.readInt();

					this.LB_MOIS = readString(dis);

					this.LB_JOUR = readString(dis);

					this.BL_DERNIER_JOUR_MOIS = dis.readInt();

					this.BL_BISSEXTILE = dis.readInt();

					this.BL_WEEK_END = dis.readInt();

					this.BL_JOUR_FERIE = dis.readInt();

					this.LB_JOUR_FERIE = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_ICOMMERCE_REPORTING_jGenerateCalendar) {

				try {

					int length = 0;

					this.ID_DIM_CALENDRIER = dis.readInt();

					this.DT_JOUR = readDate(dis);

					this.NB_ANNEE = dis.readInt();

					this.NB_SEMESTRE = dis.readInt();

					this.NB_TRIMESTRE = dis.readInt();

					this.NB_MOIS = dis.readInt();

					this.NB_JOUR_ANNEE = dis.readInt();

					this.NB_JOUR_MOIS = dis.readInt();

					this.NB_JOUR_SEMAINE = dis.readInt();

					this.NB_SEMAINE_ANNEE = dis.readInt();

					this.LB_MOIS = readString(dis);

					this.LB_JOUR = readString(dis);

					this.BL_DERNIER_JOUR_MOIS = dis.readInt();

					this.BL_BISSEXTILE = dis.readInt();

					this.BL_WEEK_END = dis.readInt();

					this.BL_JOUR_FERIE = dis.readInt();

					this.LB_JOUR_FERIE = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// int

				dos.writeInt(this.ID_DIM_CALENDRIER);

				// java.util.Date

				writeDate(this.DT_JOUR, dos);

				// int

				dos.writeInt(this.NB_ANNEE);

				// int

				dos.writeInt(this.NB_SEMESTRE);

				// int

				dos.writeInt(this.NB_TRIMESTRE);

				// int

				dos.writeInt(this.NB_MOIS);

				// int

				dos.writeInt(this.NB_JOUR_ANNEE);

				// int

				dos.writeInt(this.NB_JOUR_MOIS);

				// int

				dos.writeInt(this.NB_JOUR_SEMAINE);

				// int

				dos.writeInt(this.NB_SEMAINE_ANNEE);

				// String

				writeString(this.LB_MOIS, dos);

				// String

				writeString(this.LB_JOUR, dos);

				// int

				dos.writeInt(this.BL_DERNIER_JOUR_MOIS);

				// int

				dos.writeInt(this.BL_BISSEXTILE);

				// int

				dos.writeInt(this.BL_WEEK_END);

				// int

				dos.writeInt(this.BL_JOUR_FERIE);

				// String

				writeString(this.LB_JOUR_FERIE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// int

				dos.writeInt(this.ID_DIM_CALENDRIER);

				// java.util.Date

				writeDate(this.DT_JOUR, dos);

				// int

				dos.writeInt(this.NB_ANNEE);

				// int

				dos.writeInt(this.NB_SEMESTRE);

				// int

				dos.writeInt(this.NB_TRIMESTRE);

				// int

				dos.writeInt(this.NB_MOIS);

				// int

				dos.writeInt(this.NB_JOUR_ANNEE);

				// int

				dos.writeInt(this.NB_JOUR_MOIS);

				// int

				dos.writeInt(this.NB_JOUR_SEMAINE);

				// int

				dos.writeInt(this.NB_SEMAINE_ANNEE);

				// String

				writeString(this.LB_MOIS, dos);

				// String

				writeString(this.LB_JOUR, dos);

				// int

				dos.writeInt(this.BL_DERNIER_JOUR_MOIS);

				// int

				dos.writeInt(this.BL_BISSEXTILE);

				// int

				dos.writeInt(this.BL_WEEK_END);

				// int

				dos.writeInt(this.BL_JOUR_FERIE);

				// String

				writeString(this.LB_JOUR_FERIE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("ID_DIM_CALENDRIER=" + String.valueOf(ID_DIM_CALENDRIER));
			sb.append(",DT_JOUR=" + String.valueOf(DT_JOUR));
			sb.append(",NB_ANNEE=" + String.valueOf(NB_ANNEE));
			sb.append(",NB_SEMESTRE=" + String.valueOf(NB_SEMESTRE));
			sb.append(",NB_TRIMESTRE=" + String.valueOf(NB_TRIMESTRE));
			sb.append(",NB_MOIS=" + String.valueOf(NB_MOIS));
			sb.append(",NB_JOUR_ANNEE=" + String.valueOf(NB_JOUR_ANNEE));
			sb.append(",NB_JOUR_MOIS=" + String.valueOf(NB_JOUR_MOIS));
			sb.append(",NB_JOUR_SEMAINE=" + String.valueOf(NB_JOUR_SEMAINE));
			sb.append(",NB_SEMAINE_ANNEE=" + String.valueOf(NB_SEMAINE_ANNEE));
			sb.append(",LB_MOIS=" + LB_MOIS);
			sb.append(",LB_JOUR=" + LB_JOUR);
			sb.append(",BL_DERNIER_JOUR_MOIS=" + String.valueOf(BL_DERNIER_JOUR_MOIS));
			sb.append(",BL_BISSEXTILE=" + String.valueOf(BL_BISSEXTILE));
			sb.append(",BL_WEEK_END=" + String.valueOf(BL_WEEK_END));
			sb.append(",BL_JOUR_FERIE=" + String.valueOf(BL_JOUR_FERIE));
			sb.append(",LB_JOUR_FERIE=" + LB_JOUR_FERIE);
			sb.append("]");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(detailCalendrierStruct other) {

			int returnValue = -1;

			returnValue = checkNullsAndCompare(this.ID_DIM_CALENDRIER, other.ID_DIM_CALENDRIER);
			if (returnValue != 0) {
				return returnValue;
			}

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public static class detailDateStruct implements routines.system.IPersistableRow<detailDateStruct> {
		final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jGenerateCalendar = new byte[0];
		static byte[] commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar = new byte[0];

		public java.util.Date DT_JOUR;

		public java.util.Date getDT_JOUR() {
			return this.DT_JOUR;
		}

		private java.util.Date readDate(ObjectInputStream dis) throws IOException {
			java.util.Date dateReturn = null;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				dateReturn = null;
			} else {
				dateReturn = new Date(dis.readLong());
			}
			return dateReturn;
		}

		private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			java.util.Date dateReturn = null;
			int length = 0;
			length = unmarshaller.readByte();
			if (length == -1) {
				dateReturn = null;
			} else {
				dateReturn = new Date(unmarshaller.readLong());
			}
			return dateReturn;
		}

		private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException {
			if (date1 == null) {
				dos.writeByte(-1);
			} else {
				dos.writeByte(0);
				dos.writeLong(date1.getTime());
			}
		}

		private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (date1 == null) {
				marshaller.writeByte(-1);
			} else {
				marshaller.writeByte(0);
				marshaller.writeLong(date1.getTime());
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_ICOMMERCE_REPORTING_jGenerateCalendar) {

				try {

					int length = 0;

					this.DT_JOUR = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_ICOMMERCE_REPORTING_jGenerateCalendar) {

				try {

					int length = 0;

					this.DT_JOUR = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// java.util.Date

				writeDate(this.DT_JOUR, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// java.util.Date

				writeDate(this.DT_JOUR, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("DT_JOUR=" + String.valueOf(DT_JOUR));
			sb.append("]");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(detailDateStruct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public static class nombreDeLigneStruct implements routines.system.IPersistableRow<nombreDeLigneStruct> {
		final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jGenerateCalendar = new byte[0];
		static byte[] commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar = new byte[0];

		public Integer NUM_LIGNE;

		public Integer getNUM_LIGNE() {
			return this.NUM_LIGNE;
		}

		private Integer readInteger(ObjectInputStream dis) throws IOException {
			Integer intReturn;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				intReturn = null;
			} else {
				intReturn = dis.readInt();
			}
			return intReturn;
		}

		private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException {
			Integer intReturn;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				intReturn = null;
			} else {
				intReturn = dis.readInt();
			}
			return intReturn;
		}

		private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException {
			if (intNum == null) {
				dos.writeByte(-1);
			} else {
				dos.writeByte(0);
				dos.writeInt(intNum);
			}
		}

		private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (intNum == null) {
				marshaller.writeByte(-1);
			} else {
				marshaller.writeByte(0);
				marshaller.writeInt(intNum);
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_ICOMMERCE_REPORTING_jGenerateCalendar) {

				try {

					int length = 0;

					this.NUM_LIGNE = readInteger(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_ICOMMERCE_REPORTING_jGenerateCalendar) {

				try {

					int length = 0;

					this.NUM_LIGNE = readInteger(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// Integer

				writeInteger(this.NUM_LIGNE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// Integer

				writeInteger(this.NUM_LIGNE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("NUM_LIGNE=" + String.valueOf(NUM_LIGNE));
			sb.append("]");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(nombreDeLigneStruct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public static class after_tRowGenerator_1Struct
			implements routines.system.IPersistableRow<after_tRowGenerator_1Struct> {
		final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jGenerateCalendar = new byte[0];
		static byte[] commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar = new byte[0];

		public Integer NUM_LIGNE;

		public Integer getNUM_LIGNE() {
			return this.NUM_LIGNE;
		}

		private Integer readInteger(ObjectInputStream dis) throws IOException {
			Integer intReturn;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				intReturn = null;
			} else {
				intReturn = dis.readInt();
			}
			return intReturn;
		}

		private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException {
			Integer intReturn;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				intReturn = null;
			} else {
				intReturn = dis.readInt();
			}
			return intReturn;
		}

		private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException {
			if (intNum == null) {
				dos.writeByte(-1);
			} else {
				dos.writeByte(0);
				dos.writeInt(intNum);
			}
		}

		private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (intNum == null) {
				marshaller.writeByte(-1);
			} else {
				marshaller.writeByte(0);
				marshaller.writeInt(intNum);
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_ICOMMERCE_REPORTING_jGenerateCalendar) {

				try {

					int length = 0;

					this.NUM_LIGNE = readInteger(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_ICOMMERCE_REPORTING_jGenerateCalendar) {

				try {

					int length = 0;

					this.NUM_LIGNE = readInteger(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// Integer

				writeInteger(this.NUM_LIGNE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// Integer

				writeInteger(this.NUM_LIGNE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("NUM_LIGNE=" + String.valueOf(NUM_LIGNE));
			sb.append("]");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(after_tRowGenerator_1Struct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public void tRowGenerator_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tRowGenerator_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		String iterateId = "";

		String currentComponent = "";
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				tFileInputExcel_1Process(globalMap);

				nombreDeLigneStruct nombreDeLigne = new nombreDeLigneStruct();
				detailDateStruct detailDate = new detailDateStruct();
				detailCalendrierStruct detailCalendrier = new detailCalendrierStruct();

				/**
				 * [tDBOutput_1 begin ] start
				 */

				ok_Hash.put("tDBOutput_1", false);
				start_Hash.put("tDBOutput_1", System.currentTimeMillis());

				currentComponent = "tDBOutput_1";

				if (execStat) {
					runStat.updateStatOnConnection(resourceMap, iterateId, 0, 0, "detailCalendrier");
				}

				int tos_count_tDBOutput_1 = 0;

				String dbschema_tDBOutput_1 = null;
				dbschema_tDBOutput_1 = (String) globalMap.get("schema_" + "tDBConnection_1");

				String tableName_tDBOutput_1 = null;
				if (dbschema_tDBOutput_1 == null || dbschema_tDBOutput_1.trim().length() == 0) {
					tableName_tDBOutput_1 = ("DIM_CALENDRIER");
				} else {
					tableName_tDBOutput_1 = dbschema_tDBOutput_1 + "\".\"" + ("DIM_CALENDRIER");
				}

				int updateKeyCount_tDBOutput_1 = 1;
				if (updateKeyCount_tDBOutput_1 < 1) {
					throw new RuntimeException("For update, Schema must have a key");
				} else if (updateKeyCount_tDBOutput_1 == 17 && true) {
					System.err.println("For update, every Schema column can not be a key");
				}

				int nb_line_tDBOutput_1 = 0;
				int nb_line_update_tDBOutput_1 = 0;
				int nb_line_inserted_tDBOutput_1 = 0;
				int nb_line_deleted_tDBOutput_1 = 0;
				int nb_line_rejected_tDBOutput_1 = 0;

				int deletedCount_tDBOutput_1 = 0;
				int updatedCount_tDBOutput_1 = 0;
				int insertedCount_tDBOutput_1 = 0;
				int rowsToCommitCount_tDBOutput_1 = 0;
				int rejectedCount_tDBOutput_1 = 0;

				boolean whetherReject_tDBOutput_1 = false;

				java.sql.Connection conn_tDBOutput_1 = null;
				String dbUser_tDBOutput_1 = null;

				conn_tDBOutput_1 = (java.sql.Connection) globalMap.get("conn_tDBConnection_1");

				int count_tDBOutput_1 = 0;
				java.sql.PreparedStatement pstmt_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(
						"SELECT COUNT(1) FROM \"" + tableName_tDBOutput_1 + "\" WHERE \"ID_DIM_CALENDRIER\" = ?");
				resourceMap.put("pstmt_tDBOutput_1", pstmt_tDBOutput_1);
				String insert_tDBOutput_1 = "INSERT INTO \"" + tableName_tDBOutput_1
						+ "\" (\"ID_DIM_CALENDRIER\",\"DT_JOUR\",\"NB_ANNEE\",\"NB_SEMESTRE\",\"NB_TRIMESTRE\",\"NB_MOIS\",\"NB_JOUR_ANNEE\",\"NB_JOUR_MOIS\",\"NB_JOUR_SEMAINE\",\"NB_SEMAINE_ANNEE\",\"LB_MOIS\",\"LB_JOUR\",\"BL_DERNIER_JOUR_MOIS\",\"BL_BISSEXTILE\",\"BL_WEEK_END\",\"BL_JOUR_FERIE\",\"LB_JOUR_FERIE\") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				java.sql.PreparedStatement pstmtInsert_tDBOutput_1 = conn_tDBOutput_1
						.prepareStatement(insert_tDBOutput_1);
				resourceMap.put("pstmtInsert_tDBOutput_1", pstmtInsert_tDBOutput_1);
				String update_tDBOutput_1 = "UPDATE \"" + tableName_tDBOutput_1
						+ "\" SET \"DT_JOUR\" = ?,\"NB_ANNEE\" = ?,\"NB_SEMESTRE\" = ?,\"NB_TRIMESTRE\" = ?,\"NB_MOIS\" = ?,\"NB_JOUR_ANNEE\" = ?,\"NB_JOUR_MOIS\" = ?,\"NB_JOUR_SEMAINE\" = ?,\"NB_SEMAINE_ANNEE\" = ?,\"LB_MOIS\" = ?,\"LB_JOUR\" = ?,\"BL_DERNIER_JOUR_MOIS\" = ?,\"BL_BISSEXTILE\" = ?,\"BL_WEEK_END\" = ?,\"BL_JOUR_FERIE\" = ?,\"LB_JOUR_FERIE\" = ? WHERE \"ID_DIM_CALENDRIER\" = ?";
				java.sql.PreparedStatement pstmtUpdate_tDBOutput_1 = conn_tDBOutput_1
						.prepareStatement(update_tDBOutput_1);
				resourceMap.put("pstmtUpdate_tDBOutput_1", pstmtUpdate_tDBOutput_1);

				/**
				 * [tDBOutput_1 begin ] stop
				 */

				/**
				 * [tMap_2 begin ] start
				 */

				ok_Hash.put("tMap_2", false);
				start_Hash.put("tMap_2", System.currentTimeMillis());

				currentComponent = "tMap_2";

				if (execStat) {
					runStat.updateStatOnConnection(resourceMap, iterateId, 0, 0, "detailDate");
				}

				int tos_count_tMap_2 = 0;

// ###############################
// # Lookup's keys initialization

				org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<joursFeriesStruct> tHash_Lookup_joursFeries = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<joursFeriesStruct>) ((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<joursFeriesStruct>) globalMap
						.get("tHash_Lookup_joursFeries"));

				joursFeriesStruct joursFeriesHashKey = new joursFeriesStruct();
				joursFeriesStruct joursFeriesDefault = new joursFeriesStruct();
// ###############################        

// ###############################
// # Vars initialization
				class Var__tMap_2__Struct {
				}
				Var__tMap_2__Struct Var__tMap_2 = new Var__tMap_2__Struct();
// ###############################

// ###############################
// # Outputs initialization
				detailCalendrierStruct detailCalendrier_tmp = new detailCalendrierStruct();
// ###############################

				/**
				 * [tMap_2 begin ] stop
				 */

				/**
				 * [tMap_1 begin ] start
				 */

				ok_Hash.put("tMap_1", false);
				start_Hash.put("tMap_1", System.currentTimeMillis());

				currentComponent = "tMap_1";

				if (execStat) {
					runStat.updateStatOnConnection(resourceMap, iterateId, 0, 0, "nombreDeLigne");
				}

				int tos_count_tMap_1 = 0;

// ###############################
// # Lookup's keys initialization
// ###############################        

// ###############################
// # Vars initialization
				class Var__tMap_1__Struct {
				}
				Var__tMap_1__Struct Var__tMap_1 = new Var__tMap_1__Struct();
// ###############################

// ###############################
// # Outputs initialization
				detailDateStruct detailDate_tmp = new detailDateStruct();
// ###############################

				/**
				 * [tMap_1 begin ] stop
				 */

				/**
				 * [tRowGenerator_1 begin ] start
				 */

				ok_Hash.put("tRowGenerator_1", false);
				start_Hash.put("tRowGenerator_1", System.currentTimeMillis());

				currentComponent = "tRowGenerator_1";

				int tos_count_tRowGenerator_1 = 0;

				int nb_line_tRowGenerator_1 = 0;
				int nb_max_row_tRowGenerator_1 = context.nbJoursCalendrier;

				class tRowGenerator_1Randomizer {
					public Integer getRandomNUM_LIGNE() {

						return Numeric.sequence("s1", 0, 1);

					}
				}
				tRowGenerator_1Randomizer randtRowGenerator_1 = new tRowGenerator_1Randomizer();

				for (int itRowGenerator_1 = 0; itRowGenerator_1 < nb_max_row_tRowGenerator_1; itRowGenerator_1++) {
					nombreDeLigne.NUM_LIGNE = randtRowGenerator_1.getRandomNUM_LIGNE();
					nb_line_tRowGenerator_1++;

					/**
					 * [tRowGenerator_1 begin ] stop
					 */

					/**
					 * [tRowGenerator_1 main ] start
					 */

					currentComponent = "tRowGenerator_1";

					tos_count_tRowGenerator_1++;

					/**
					 * [tRowGenerator_1 main ] stop
					 */

					/**
					 * [tRowGenerator_1 process_data_begin ] start
					 */

					currentComponent = "tRowGenerator_1";

					/**
					 * [tRowGenerator_1 process_data_begin ] stop
					 */

					/**
					 * [tMap_1 main ] start
					 */

					currentComponent = "tMap_1";

					if (execStat) {
						runStat.updateStatOnConnection(iterateId, 1, 1

								, "nombreDeLigne"

						);
					}

					boolean hasCasePrimitiveKeyWithNull_tMap_1 = false;

					// ###############################
					// # Input tables (lookups)
					boolean rejectedInnerJoin_tMap_1 = false;
					boolean mainRowRejected_tMap_1 = false;

					// ###############################
					{ // start of Var scope

						// ###############################
						// # Vars tables

						Var__tMap_1__Struct Var = Var__tMap_1;// ###############################
						// ###############################
						// # Output tables

						detailDate = null;

// # Output table : 'detailDate'
						detailDate_tmp.DT_JOUR = TalendDate.addDate(context.dtDebCalendrier, nombreDeLigne.NUM_LIGNE,
								"dd");
						detailDate = detailDate_tmp;
// ###############################

					} // end of Var scope

					rejectedInnerJoin_tMap_1 = false;

					tos_count_tMap_1++;

					/**
					 * [tMap_1 main ] stop
					 */

					/**
					 * [tMap_1 process_data_begin ] start
					 */

					currentComponent = "tMap_1";

					/**
					 * [tMap_1 process_data_begin ] stop
					 */
// Start of branch "detailDate"
					if (detailDate != null) {

						/**
						 * [tMap_2 main ] start
						 */

						currentComponent = "tMap_2";

						if (execStat) {
							runStat.updateStatOnConnection(iterateId, 1, 1

									, "detailDate"

							);
						}

						boolean hasCasePrimitiveKeyWithNull_tMap_2 = false;

						// ###############################
						// # Input tables (lookups)
						boolean rejectedInnerJoin_tMap_2 = false;
						boolean mainRowRejected_tMap_2 = false;

						///////////////////////////////////////////////
						// Starting Lookup Table "joursFeries"
						///////////////////////////////////////////////

						boolean forceLoopjoursFeries = false;

						joursFeriesStruct joursFeriesObjectFromLookup = null;

						if (!rejectedInnerJoin_tMap_2) { // G_TM_M_020

							hasCasePrimitiveKeyWithNull_tMap_2 = false;

							joursFeriesHashKey.DT_JOUR = detailDate.DT_JOUR == null ? null
									: new java.util.Date(detailDate.DT_JOUR.getTime());

							joursFeriesHashKey.hashCodeDirty = true;

							tHash_Lookup_joursFeries.lookup(joursFeriesHashKey);

						} // G_TM_M_020

						if (tHash_Lookup_joursFeries != null
								&& tHash_Lookup_joursFeries.getCount(joursFeriesHashKey) > 1) { // G 071

							// System.out.println("WARNING: UNIQUE MATCH is configured for the lookup
							// 'joursFeries' and it contains more one result from keys : joursFeries.DT_JOUR
							// = '" + joursFeriesHashKey.DT_JOUR + "'");
						} // G 071

						joursFeriesStruct joursFeries = null;

						joursFeriesStruct fromLookup_joursFeries = null;
						joursFeries = joursFeriesDefault;

						if (tHash_Lookup_joursFeries != null && tHash_Lookup_joursFeries.hasNext()) { // G 099

							fromLookup_joursFeries = tHash_Lookup_joursFeries.next();

						} // G 099

						if (fromLookup_joursFeries != null) {
							joursFeries = fromLookup_joursFeries;
						}

						// ###############################
						{ // start of Var scope

							// ###############################
							// # Vars tables

							Var__tMap_2__Struct Var = Var__tMap_2;// ###############################
							// ###############################
							// # Output tables

							detailCalendrier = null;

// # Output table : 'detailCalendrier'
							detailCalendrier_tmp.ID_DIM_CALENDRIER = Integer
									.parseInt(TalendDate.formatDate("yyyyMMdd", detailDate.DT_JOUR));
							detailCalendrier_tmp.DT_JOUR = detailDate.DT_JOUR;
							detailCalendrier_tmp.NB_ANNEE = TalendDate.getPartOfDate("YEAR", detailDate.DT_JOUR);
							detailCalendrier_tmp.NB_SEMESTRE = TalendDate.getPartOfDate("MONTH", detailDate.DT_JOUR) < 6
									? 1
									: 2;
							detailCalendrier_tmp.NB_TRIMESTRE = TalendDate.getPartOfDate("MONTH",
									detailDate.DT_JOUR) < 3 ? 1
											: TalendDate.getPartOfDate("MONTH", detailDate.DT_JOUR) < 6 ? 2
													: TalendDate.getPartOfDate("MONTH", detailDate.DT_JOUR) < 9 ? 3 : 4;
							detailCalendrier_tmp.NB_MOIS = TalendDate.getPartOfDate("MONTH", detailDate.DT_JOUR) + 1;
							detailCalendrier_tmp.NB_JOUR_ANNEE = TalendDate.getPartOfDate("DAY_OF_YEAR",
									detailDate.DT_JOUR);
							detailCalendrier_tmp.NB_JOUR_MOIS = TalendDate.getPartOfDate("DAY_OF_MONTH",
									detailDate.DT_JOUR);
							detailCalendrier_tmp.NB_JOUR_SEMAINE = TalendDate.getPartOfDate("DAY_OF_WEEK",
									detailDate.DT_JOUR) - 1 == 0 ? 7
											: TalendDate.getPartOfDate("DAY_OF_WEEK", detailDate.DT_JOUR) - 1;
							detailCalendrier_tmp.NB_SEMAINE_ANNEE = TalendDate.getPartOfDate("WEEK_OF_YEAR",
									detailDate.DT_JOUR);
							detailCalendrier_tmp.LB_MOIS = TalendDate.formatDate("MMMM", detailDate.DT_JOUR)
									.substring(0, 1).toUpperCase() +

									TalendDate.formatDate("MMMM", detailDate.DT_JOUR).substring(1,
											TalendDate.formatDate("MMMM", detailDate.DT_JOUR).length());
							detailCalendrier_tmp.LB_JOUR = TalendDate.getPartOfDate("DAY_OF_WEEK",
									detailDate.DT_JOUR) == 2
											? "Lundi"
											: TalendDate.getPartOfDate("DAY_OF_WEEK", detailDate.DT_JOUR) == 3 ? "Mardi"
													: TalendDate.getPartOfDate("DAY_OF_WEEK", detailDate.DT_JOUR) == 4
															? "Mercredi"
															: TalendDate.getPartOfDate("DAY_OF_WEEK",
																	detailDate.DT_JOUR) == 5
																			? "Jeudi"
																			: TalendDate.getPartOfDate("DAY_OF_WEEK",
																					detailDate.DT_JOUR) == 6
																							? "Vendredi"
																							: TalendDate.getPartOfDate(
																									"DAY_OF_WEEK",
																									detailDate.DT_JOUR) == 7
																											? "Samedi"
																											: "Dimanche";
							detailCalendrier_tmp.BL_DERNIER_JOUR_MOIS = TalendDate.compareDate(
									TalendDate.getLastDayOfMonth(detailDate.DT_JOUR), detailDate.DT_JOUR,
									"yyyy-MM-dd") == 0 ? 1 : 0;
							detailCalendrier_tmp.BL_BISSEXTILE = ((double) TalendDate.getPartOfDate("YEAR",
									detailDate.DT_JOUR) / 4) == Math
											.floor(TalendDate.getPartOfDate("YEAR", detailDate.DT_JOUR) / 4) ? 1 : 0;
							detailCalendrier_tmp.BL_WEEK_END = TalendDate.getPartOfDate("DAY_OF_WEEK",
									detailDate.DT_JOUR) == 7
									|| TalendDate.getPartOfDate("DAY_OF_WEEK", detailDate.DT_JOUR) == 1 ? 1 : 0;
							detailCalendrier_tmp.BL_JOUR_FERIE = joursFeries.DT_JOUR == null ? 0 : 1;
							detailCalendrier_tmp.LB_JOUR_FERIE = joursFeries.DT_JOUR == null ? ""
									: joursFeries.LB_JOUR_FERIE;
							detailCalendrier = detailCalendrier_tmp;
// ###############################

						} // end of Var scope

						rejectedInnerJoin_tMap_2 = false;

						tos_count_tMap_2++;

						/**
						 * [tMap_2 main ] stop
						 */

						/**
						 * [tMap_2 process_data_begin ] start
						 */

						currentComponent = "tMap_2";

						/**
						 * [tMap_2 process_data_begin ] stop
						 */
// Start of branch "detailCalendrier"
						if (detailCalendrier != null) {

							/**
							 * [tDBOutput_1 main ] start
							 */

							currentComponent = "tDBOutput_1";

							if (execStat) {
								runStat.updateStatOnConnection(iterateId, 1, 1

										, "detailCalendrier"

								);
							}

							whetherReject_tDBOutput_1 = false;
							pstmt_tDBOutput_1.setInt(1, detailCalendrier.ID_DIM_CALENDRIER);

							int checkCount_tDBOutput_1 = -1;
							try (java.sql.ResultSet rs_tDBOutput_1 = pstmt_tDBOutput_1.executeQuery()) {
								while (rs_tDBOutput_1.next()) {
									checkCount_tDBOutput_1 = rs_tDBOutput_1.getInt(1);
								}
							}
							if (checkCount_tDBOutput_1 > 0) {
								if (detailCalendrier.DT_JOUR != null) {
									pstmtUpdate_tDBOutput_1.setTimestamp(1,
											new java.sql.Timestamp(detailCalendrier.DT_JOUR.getTime()));
								} else {
									pstmtUpdate_tDBOutput_1.setNull(1, java.sql.Types.TIMESTAMP);
								}

								pstmtUpdate_tDBOutput_1.setInt(2, detailCalendrier.NB_ANNEE);

								pstmtUpdate_tDBOutput_1.setInt(3, detailCalendrier.NB_SEMESTRE);

								pstmtUpdate_tDBOutput_1.setInt(4, detailCalendrier.NB_TRIMESTRE);

								pstmtUpdate_tDBOutput_1.setInt(5, detailCalendrier.NB_MOIS);

								pstmtUpdate_tDBOutput_1.setInt(6, detailCalendrier.NB_JOUR_ANNEE);

								pstmtUpdate_tDBOutput_1.setInt(7, detailCalendrier.NB_JOUR_MOIS);

								pstmtUpdate_tDBOutput_1.setInt(8, detailCalendrier.NB_JOUR_SEMAINE);

								pstmtUpdate_tDBOutput_1.setInt(9, detailCalendrier.NB_SEMAINE_ANNEE);

								if (detailCalendrier.LB_MOIS == null) {
									pstmtUpdate_tDBOutput_1.setNull(10, java.sql.Types.VARCHAR);
								} else {
									pstmtUpdate_tDBOutput_1.setString(10, detailCalendrier.LB_MOIS);
								}

								if (detailCalendrier.LB_JOUR == null) {
									pstmtUpdate_tDBOutput_1.setNull(11, java.sql.Types.VARCHAR);
								} else {
									pstmtUpdate_tDBOutput_1.setString(11, detailCalendrier.LB_JOUR);
								}

								pstmtUpdate_tDBOutput_1.setInt(12, detailCalendrier.BL_DERNIER_JOUR_MOIS);

								pstmtUpdate_tDBOutput_1.setInt(13, detailCalendrier.BL_BISSEXTILE);

								pstmtUpdate_tDBOutput_1.setInt(14, detailCalendrier.BL_WEEK_END);

								pstmtUpdate_tDBOutput_1.setInt(15, detailCalendrier.BL_JOUR_FERIE);

								if (detailCalendrier.LB_JOUR_FERIE == null) {
									pstmtUpdate_tDBOutput_1.setNull(16, java.sql.Types.VARCHAR);
								} else {
									pstmtUpdate_tDBOutput_1.setString(16, detailCalendrier.LB_JOUR_FERIE);
								}

								pstmtUpdate_tDBOutput_1.setInt(17 + count_tDBOutput_1,
										detailCalendrier.ID_DIM_CALENDRIER);

								try {

									int processedCount_tDBOutput_1 = pstmtUpdate_tDBOutput_1.executeUpdate();
									updatedCount_tDBOutput_1 += processedCount_tDBOutput_1;
									rowsToCommitCount_tDBOutput_1 += processedCount_tDBOutput_1;
									nb_line_tDBOutput_1++;

								} catch (java.lang.Exception e) {
									globalMap.put("tDBOutput_1_ERROR_MESSAGE", e.getMessage());

									whetherReject_tDBOutput_1 = true;
									nb_line_tDBOutput_1++;
									System.err.print(e.getMessage());
								}
							} else {
								pstmtInsert_tDBOutput_1.setInt(1, detailCalendrier.ID_DIM_CALENDRIER);

								if (detailCalendrier.DT_JOUR != null) {
									pstmtInsert_tDBOutput_1.setTimestamp(2,
											new java.sql.Timestamp(detailCalendrier.DT_JOUR.getTime()));
								} else {
									pstmtInsert_tDBOutput_1.setNull(2, java.sql.Types.TIMESTAMP);
								}

								pstmtInsert_tDBOutput_1.setInt(3, detailCalendrier.NB_ANNEE);

								pstmtInsert_tDBOutput_1.setInt(4, detailCalendrier.NB_SEMESTRE);

								pstmtInsert_tDBOutput_1.setInt(5, detailCalendrier.NB_TRIMESTRE);

								pstmtInsert_tDBOutput_1.setInt(6, detailCalendrier.NB_MOIS);

								pstmtInsert_tDBOutput_1.setInt(7, detailCalendrier.NB_JOUR_ANNEE);

								pstmtInsert_tDBOutput_1.setInt(8, detailCalendrier.NB_JOUR_MOIS);

								pstmtInsert_tDBOutput_1.setInt(9, detailCalendrier.NB_JOUR_SEMAINE);

								pstmtInsert_tDBOutput_1.setInt(10, detailCalendrier.NB_SEMAINE_ANNEE);

								if (detailCalendrier.LB_MOIS == null) {
									pstmtInsert_tDBOutput_1.setNull(11, java.sql.Types.VARCHAR);
								} else {
									pstmtInsert_tDBOutput_1.setString(11, detailCalendrier.LB_MOIS);
								}

								if (detailCalendrier.LB_JOUR == null) {
									pstmtInsert_tDBOutput_1.setNull(12, java.sql.Types.VARCHAR);
								} else {
									pstmtInsert_tDBOutput_1.setString(12, detailCalendrier.LB_JOUR);
								}

								pstmtInsert_tDBOutput_1.setInt(13, detailCalendrier.BL_DERNIER_JOUR_MOIS);

								pstmtInsert_tDBOutput_1.setInt(14, detailCalendrier.BL_BISSEXTILE);

								pstmtInsert_tDBOutput_1.setInt(15, detailCalendrier.BL_WEEK_END);

								pstmtInsert_tDBOutput_1.setInt(16, detailCalendrier.BL_JOUR_FERIE);

								if (detailCalendrier.LB_JOUR_FERIE == null) {
									pstmtInsert_tDBOutput_1.setNull(17, java.sql.Types.VARCHAR);
								} else {
									pstmtInsert_tDBOutput_1.setString(17, detailCalendrier.LB_JOUR_FERIE);
								}

								try {

									int processedCount_tDBOutput_1 = pstmtInsert_tDBOutput_1.executeUpdate();
									insertedCount_tDBOutput_1 += processedCount_tDBOutput_1;
									rowsToCommitCount_tDBOutput_1 += processedCount_tDBOutput_1;
									nb_line_tDBOutput_1++;

								} catch (java.lang.Exception e) {
									globalMap.put("tDBOutput_1_ERROR_MESSAGE", e.getMessage());

									whetherReject_tDBOutput_1 = true;
									nb_line_tDBOutput_1++;
									System.err.print(e.getMessage());
								}
							}

							tos_count_tDBOutput_1++;

							/**
							 * [tDBOutput_1 main ] stop
							 */

							/**
							 * [tDBOutput_1 process_data_begin ] start
							 */

							currentComponent = "tDBOutput_1";

							/**
							 * [tDBOutput_1 process_data_begin ] stop
							 */

							/**
							 * [tDBOutput_1 process_data_end ] start
							 */

							currentComponent = "tDBOutput_1";

							/**
							 * [tDBOutput_1 process_data_end ] stop
							 */

						} // End of branch "detailCalendrier"

						/**
						 * [tMap_2 process_data_end ] start
						 */

						currentComponent = "tMap_2";

						/**
						 * [tMap_2 process_data_end ] stop
						 */

					} // End of branch "detailDate"

					/**
					 * [tMap_1 process_data_end ] start
					 */

					currentComponent = "tMap_1";

					/**
					 * [tMap_1 process_data_end ] stop
					 */

					/**
					 * [tRowGenerator_1 process_data_end ] start
					 */

					currentComponent = "tRowGenerator_1";

					/**
					 * [tRowGenerator_1 process_data_end ] stop
					 */

					/**
					 * [tRowGenerator_1 end ] start
					 */

					currentComponent = "tRowGenerator_1";

				}
				globalMap.put("tRowGenerator_1_NB_LINE", nb_line_tRowGenerator_1);

				ok_Hash.put("tRowGenerator_1", true);
				end_Hash.put("tRowGenerator_1", System.currentTimeMillis());

				/**
				 * [tRowGenerator_1 end ] stop
				 */

				/**
				 * [tMap_1 end ] start
				 */

				currentComponent = "tMap_1";

// ###############################
// # Lookup hashes releasing
// ###############################      

				if (execStat) {
					runStat.updateStat(resourceMap, iterateId, 2, 0, "nombreDeLigne");
				}

				ok_Hash.put("tMap_1", true);
				end_Hash.put("tMap_1", System.currentTimeMillis());

				/**
				 * [tMap_1 end ] stop
				 */

				/**
				 * [tMap_2 end ] start
				 */

				currentComponent = "tMap_2";

// ###############################
// # Lookup hashes releasing
				if (tHash_Lookup_joursFeries != null) {
					tHash_Lookup_joursFeries.endGet();
				}
				globalMap.remove("tHash_Lookup_joursFeries");

// ###############################      

				if (execStat) {
					runStat.updateStat(resourceMap, iterateId, 2, 0, "detailDate");
				}

				ok_Hash.put("tMap_2", true);
				end_Hash.put("tMap_2", System.currentTimeMillis());

				/**
				 * [tMap_2 end ] stop
				 */

				/**
				 * [tDBOutput_1 end ] start
				 */

				currentComponent = "tDBOutput_1";

				if (pstmtUpdate_tDBOutput_1 != null) {
					pstmtUpdate_tDBOutput_1.close();
					resourceMap.remove("pstmtUpdate_tDBOutput_1");
				}
				if (pstmtInsert_tDBOutput_1 != null) {
					pstmtInsert_tDBOutput_1.close();
					resourceMap.remove("pstmtInsert_tDBOutput_1");
				}
				if (pstmt_tDBOutput_1 != null) {
					pstmt_tDBOutput_1.close();
					resourceMap.remove("pstmt_tDBOutput_1");
				}
				resourceMap.put("statementClosed_tDBOutput_1", true);

				nb_line_deleted_tDBOutput_1 = nb_line_deleted_tDBOutput_1 + deletedCount_tDBOutput_1;
				nb_line_update_tDBOutput_1 = nb_line_update_tDBOutput_1 + updatedCount_tDBOutput_1;
				nb_line_inserted_tDBOutput_1 = nb_line_inserted_tDBOutput_1 + insertedCount_tDBOutput_1;
				nb_line_rejected_tDBOutput_1 = nb_line_rejected_tDBOutput_1 + rejectedCount_tDBOutput_1;

				globalMap.put("tDBOutput_1_NB_LINE", nb_line_tDBOutput_1);
				globalMap.put("tDBOutput_1_NB_LINE_UPDATED", nb_line_update_tDBOutput_1);
				globalMap.put("tDBOutput_1_NB_LINE_INSERTED", nb_line_inserted_tDBOutput_1);
				globalMap.put("tDBOutput_1_NB_LINE_DELETED", nb_line_deleted_tDBOutput_1);
				globalMap.put("tDBOutput_1_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_1);

				if (execStat) {
					runStat.updateStat(resourceMap, iterateId, 2, 0, "detailCalendrier");
				}

				ok_Hash.put("tDBOutput_1", true);
				end_Hash.put("tDBOutput_1", System.currentTimeMillis());

				/**
				 * [tDBOutput_1 end ] stop
				 */

			} // end the resume

		} catch (java.lang.Exception e) {

			TalendException te = new TalendException(e, currentComponent, globalMap);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			// free memory for "tMap_2"
			globalMap.remove("tHash_Lookup_joursFeries");

			try {

				/**
				 * [tRowGenerator_1 finally ] start
				 */

				currentComponent = "tRowGenerator_1";

				/**
				 * [tRowGenerator_1 finally ] stop
				 */

				/**
				 * [tMap_1 finally ] start
				 */

				currentComponent = "tMap_1";

				/**
				 * [tMap_1 finally ] stop
				 */

				/**
				 * [tMap_2 finally ] start
				 */

				currentComponent = "tMap_2";

				/**
				 * [tMap_2 finally ] stop
				 */

				/**
				 * [tDBOutput_1 finally ] start
				 */

				currentComponent = "tDBOutput_1";

				if (resourceMap.get("statementClosed_tDBOutput_1") == null) {
					java.sql.PreparedStatement pstmtUpdateToClose_tDBOutput_1 = null;
					if ((pstmtUpdateToClose_tDBOutput_1 = (java.sql.PreparedStatement) resourceMap
							.remove("pstmtUpdate_tDBOutput_1")) != null) {
						pstmtUpdateToClose_tDBOutput_1.close();
					}
					java.sql.PreparedStatement pstmtInsertToClose_tDBOutput_1 = null;
					if ((pstmtInsertToClose_tDBOutput_1 = (java.sql.PreparedStatement) resourceMap
							.remove("pstmtInsert_tDBOutput_1")) != null) {
						pstmtInsertToClose_tDBOutput_1.close();
					}
					java.sql.PreparedStatement pstmtToClose_tDBOutput_1 = null;
					if ((pstmtToClose_tDBOutput_1 = (java.sql.PreparedStatement) resourceMap
							.remove("pstmt_tDBOutput_1")) != null) {
						pstmtToClose_tDBOutput_1.close();
					}
				}

				/**
				 * [tDBOutput_1 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tRowGenerator_1_SUBPROCESS_STATE", 1);
	}

	public static class joursFeriesStruct
			implements routines.system.IPersistableComparableLookupRow<joursFeriesStruct> {
		final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jGenerateCalendar = new byte[0];
		static byte[] commonByteArray_ICOMMERCE_REPORTING_jGenerateCalendar = new byte[0];
		protected static final int DEFAULT_HASHCODE = 1;
		protected static final int PRIME = 31;
		protected int hashCode = DEFAULT_HASHCODE;
		public boolean hashCodeDirty = true;

		public String loopKey;

		public java.util.Date DT_JOUR;

		public java.util.Date getDT_JOUR() {
			return this.DT_JOUR;
		}

		public String LB_JOUR_FERIE;

		public String getLB_JOUR_FERIE() {
			return this.LB_JOUR_FERIE;
		}

		@Override
		public int hashCode() {
			if (this.hashCodeDirty) {
				final int prime = PRIME;
				int result = DEFAULT_HASHCODE;

				result = prime * result + ((this.DT_JOUR == null) ? 0 : this.DT_JOUR.hashCode());

				this.hashCode = result;
				this.hashCodeDirty = false;
			}
			return this.hashCode;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			final joursFeriesStruct other = (joursFeriesStruct) obj;

			if (this.DT_JOUR == null) {
				if (other.DT_JOUR != null)
					return false;

			} else if (!this.DT_JOUR.equals(other.DT_JOUR))

				return false;

			return true;
		}

		public void copyDataTo(joursFeriesStruct other) {

			other.DT_JOUR = this.DT_JOUR;
			other.LB_JOUR_FERIE = this.LB_JOUR_FERIE;

		}

		public void copyKeysDataTo(joursFeriesStruct other) {

			other.DT_JOUR = this.DT_JOUR;

		}

		private java.util.Date readDate(ObjectInputStream dis) throws IOException {
			java.util.Date dateReturn = null;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				dateReturn = null;
			} else {
				dateReturn = new Date(dis.readLong());
			}
			return dateReturn;
		}

		private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			java.util.Date dateReturn = null;
			int length = 0;
			length = unmarshaller.readByte();
			if (length == -1) {
				dateReturn = null;
			} else {
				dateReturn = new Date(unmarshaller.readLong());
			}
			return dateReturn;
		}

		private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException {
			if (date1 == null) {
				dos.writeByte(-1);
			} else {
				dos.writeByte(0);
				dos.writeLong(date1.getTime());
			}
		}

		private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (date1 == null) {
				marshaller.writeByte(-1);
			} else {
				marshaller.writeByte(0);
				marshaller.writeLong(date1.getTime());
			}
		}

		private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				byte[] byteArray = new byte[length];
				dis.read(byteArray);
				strReturn = new String(byteArray, utf8Charset);
			}
			return strReturn;
		}

		private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller)
				throws IOException {
			String strReturn = null;
			int length = 0;
			length = unmarshaller.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				byte[] byteArray = new byte[length];
				unmarshaller.read(byteArray);
				strReturn = new String(byteArray, utf8Charset);
			}
			return strReturn;
		}

		private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller)
				throws IOException {
			if (str == null) {
				marshaller.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				marshaller.writeInt(byteArray.length);
				marshaller.write(byteArray);
			}
		}

		private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException {
			if (str == null) {
				dos.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				dos.writeInt(byteArray.length);
				dos.write(byteArray);
			}
		}

		public void readKeysData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_ICOMMERCE_REPORTING_jGenerateCalendar) {

				try {

					int length = 0;

					this.DT_JOUR = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_ICOMMERCE_REPORTING_jGenerateCalendar) {

				try {

					int length = 0;

					this.DT_JOUR = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeKeysData(ObjectOutputStream dos) {
			try {

				// java.util.Date

				writeDate(this.DT_JOUR, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
			try {

				// java.util.Date

				writeDate(this.DT_JOUR, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		/**
		 * Fill Values data by reading ObjectInputStream.
		 */
		public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
			try {

				int length = 0;

				this.LB_JOUR_FERIE = readString(dis, ois);

			} catch (IOException e) {
				throw new RuntimeException(e);

			}

		}

		public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
			try {
				int length = 0;

				this.LB_JOUR_FERIE = readString(dis, objectIn);

			} catch (IOException e) {
				throw new RuntimeException(e);

			}

		}

		/**
		 * Return a byte array which represents Values data.
		 */
		public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
			try {

				writeString(this.LB_JOUR_FERIE, dos, oos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut) {
			try {

				writeString(this.LB_JOUR_FERIE, dos, objectOut);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}

		public boolean supportMarshaller() {
			return true;
		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("DT_JOUR=" + String.valueOf(DT_JOUR));
			sb.append(",LB_JOUR_FERIE=" + LB_JOUR_FERIE);
			sb.append("]");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(joursFeriesStruct other) {

			int returnValue = -1;

			returnValue = checkNullsAndCompare(this.DT_JOUR, other.DT_JOUR);
			if (returnValue != 0) {
				return returnValue;
			}

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public void tFileInputExcel_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tFileInputExcel_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		String iterateId = "";

		String currentComponent = "";
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				joursFeriesStruct joursFeries = new joursFeriesStruct();

				/**
				 * [tAdvancedHash_joursFeries begin ] start
				 */

				ok_Hash.put("tAdvancedHash_joursFeries", false);
				start_Hash.put("tAdvancedHash_joursFeries", System.currentTimeMillis());

				currentComponent = "tAdvancedHash_joursFeries";

				if (execStat) {
					runStat.updateStatOnConnection(resourceMap, iterateId, 0, 0, "joursFeries");
				}

				int tos_count_tAdvancedHash_joursFeries = 0;

				// connection name:joursFeries
				// source node:tFileInputExcel_1 - inputs:(after_tRowGenerator_1)
				// outputs:(joursFeries,joursFeries) | target node:tAdvancedHash_joursFeries -
				// inputs:(joursFeries) outputs:()
				// linked node: tMap_2 - inputs:(detailDate,joursFeries)
				// outputs:(detailCalendrier)

				org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_joursFeries = org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;

				org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<joursFeriesStruct> tHash_Lookup_joursFeries = org.talend.designer.components.lookup.memory.AdvancedMemoryLookup
						.<joursFeriesStruct>getLookup(matchingModeEnum_joursFeries);

				globalMap.put("tHash_Lookup_joursFeries", tHash_Lookup_joursFeries);

				/**
				 * [tAdvancedHash_joursFeries begin ] stop
				 */

				/**
				 * [tFileInputExcel_1 begin ] start
				 */

				ok_Hash.put("tFileInputExcel_1", false);
				start_Hash.put("tFileInputExcel_1", System.currentTimeMillis());

				currentComponent = "tFileInputExcel_1";

				int tos_count_tFileInputExcel_1 = 0;

				final String decryptedPassword_tFileInputExcel_1 = routines.system.PasswordEncryptUtil
						.decryptPassword("enc:routine.encryption.key.v1:GLNwn9VTIEnAKe7ZgJRvlDIpAgf/IFLq/jXsug==");
				String password_tFileInputExcel_1 = decryptedPassword_tFileInputExcel_1;
				if (password_tFileInputExcel_1.isEmpty()) {
					password_tFileInputExcel_1 = null;
				}
				class RegexUtil_tFileInputExcel_1 {

					public java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> getSheets(
							org.apache.poi.xssf.usermodel.XSSFWorkbook workbook, String oneSheetName,
							boolean useRegex) {

						java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> list = new java.util.ArrayList<org.apache.poi.xssf.usermodel.XSSFSheet>();

						if (useRegex) {// this part process the regex issue

							java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(oneSheetName);
							for (org.apache.poi.ss.usermodel.Sheet sheet : workbook) {
								String sheetName = sheet.getSheetName();
								java.util.regex.Matcher matcher = pattern.matcher(sheetName);
								if (matcher.matches()) {
									if (sheet != null) {
										list.add((org.apache.poi.xssf.usermodel.XSSFSheet) sheet);
									}
								}
							}

						} else {
							org.apache.poi.xssf.usermodel.XSSFSheet sheet = (org.apache.poi.xssf.usermodel.XSSFSheet) workbook
									.getSheet(oneSheetName);
							if (sheet != null) {
								list.add(sheet);
							}

						}

						return list;
					}

					public java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> getSheets(
							org.apache.poi.xssf.usermodel.XSSFWorkbook workbook, int index, boolean useRegex) {
						java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> list = new java.util.ArrayList<org.apache.poi.xssf.usermodel.XSSFSheet>();
						org.apache.poi.xssf.usermodel.XSSFSheet sheet = (org.apache.poi.xssf.usermodel.XSSFSheet) workbook
								.getSheetAt(index);
						if (sheet != null) {
							list.add(sheet);
						}
						return list;
					}

				}
				RegexUtil_tFileInputExcel_1 regexUtil_tFileInputExcel_1 = new RegexUtil_tFileInputExcel_1();

				Object source_tFileInputExcel_1 = "C:/Formation Talend/Section 10/Mini Projet1 Partie2/joursFeries.xlsx";
				org.apache.poi.xssf.usermodel.XSSFWorkbook workbook_tFileInputExcel_1 = null;

				if (source_tFileInputExcel_1 instanceof String) {
					workbook_tFileInputExcel_1 = (org.apache.poi.xssf.usermodel.XSSFWorkbook) org.apache.poi.ss.usermodel.WorkbookFactory
							.create(new java.io.File((String) source_tFileInputExcel_1), password_tFileInputExcel_1,
									true);
				} else if (source_tFileInputExcel_1 instanceof java.io.InputStream) {
					workbook_tFileInputExcel_1 = (org.apache.poi.xssf.usermodel.XSSFWorkbook) org.apache.poi.ss.usermodel.WorkbookFactory
							.create((java.io.InputStream) source_tFileInputExcel_1, password_tFileInputExcel_1);
				} else {
					workbook_tFileInputExcel_1 = null;
					throw new java.lang.Exception("The data source should be specified as Inputstream or File Path!");
				}
				try {

					java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> sheetList_tFileInputExcel_1 = new java.util.ArrayList<org.apache.poi.xssf.usermodel.XSSFSheet>();
					for (org.apache.poi.ss.usermodel.Sheet sheet_tFileInputExcel_1 : workbook_tFileInputExcel_1) {
						sheetList_tFileInputExcel_1
								.add((org.apache.poi.xssf.usermodel.XSSFSheet) sheet_tFileInputExcel_1);
					}
					if (sheetList_tFileInputExcel_1.size() <= 0) {
						throw new RuntimeException("Special sheets not exist!");
					}

					java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> sheetList_FilterNull_tFileInputExcel_1 = new java.util.ArrayList<org.apache.poi.xssf.usermodel.XSSFSheet>();
					for (org.apache.poi.xssf.usermodel.XSSFSheet sheet_FilterNull_tFileInputExcel_1 : sheetList_tFileInputExcel_1) {
						if (sheet_FilterNull_tFileInputExcel_1 != null
								&& sheetList_FilterNull_tFileInputExcel_1.iterator() != null
								&& sheet_FilterNull_tFileInputExcel_1.iterator().hasNext()) {
							sheetList_FilterNull_tFileInputExcel_1.add(sheet_FilterNull_tFileInputExcel_1);
						}
					}
					sheetList_tFileInputExcel_1 = sheetList_FilterNull_tFileInputExcel_1;
					if (sheetList_tFileInputExcel_1.size() > 0) {
						int nb_line_tFileInputExcel_1 = 0;

						int begin_line_tFileInputExcel_1 = 1;

						int footer_input_tFileInputExcel_1 = 0;

						int end_line_tFileInputExcel_1 = 0;
						for (org.apache.poi.xssf.usermodel.XSSFSheet sheet_tFileInputExcel_1 : sheetList_tFileInputExcel_1) {
							end_line_tFileInputExcel_1 += (sheet_tFileInputExcel_1.getLastRowNum() + 1);
						}
						end_line_tFileInputExcel_1 -= footer_input_tFileInputExcel_1;
						int limit_tFileInputExcel_1 = -1;
						int start_column_tFileInputExcel_1 = 1 - 1;
						int end_column_tFileInputExcel_1 = -1;

						org.apache.poi.xssf.usermodel.XSSFRow row_tFileInputExcel_1 = null;
						org.apache.poi.xssf.usermodel.XSSFSheet sheet_tFileInputExcel_1 = sheetList_tFileInputExcel_1
								.get(0);
						int rowCount_tFileInputExcel_1 = 0;
						int sheetIndex_tFileInputExcel_1 = 0;
						int currentRows_tFileInputExcel_1 = (sheetList_tFileInputExcel_1.get(0).getLastRowNum() + 1);

						// for the number format
						java.text.DecimalFormat df_tFileInputExcel_1 = new java.text.DecimalFormat(
								"#.####################################");
						char decimalChar_tFileInputExcel_1 = df_tFileInputExcel_1.getDecimalFormatSymbols()
								.getDecimalSeparator();

						for (int i_tFileInputExcel_1 = begin_line_tFileInputExcel_1; i_tFileInputExcel_1 < end_line_tFileInputExcel_1; i_tFileInputExcel_1++) {

							int emptyColumnCount_tFileInputExcel_1 = 0;

							if (limit_tFileInputExcel_1 != -1 && nb_line_tFileInputExcel_1 >= limit_tFileInputExcel_1) {
								break;
							}

							while (i_tFileInputExcel_1 >= rowCount_tFileInputExcel_1 + currentRows_tFileInputExcel_1) {
								rowCount_tFileInputExcel_1 += currentRows_tFileInputExcel_1;
								sheet_tFileInputExcel_1 = sheetList_tFileInputExcel_1
										.get(++sheetIndex_tFileInputExcel_1);
								currentRows_tFileInputExcel_1 = (sheet_tFileInputExcel_1.getLastRowNum() + 1);
							}
							globalMap.put("tFileInputExcel_1_CURRENT_SHEET", sheet_tFileInputExcel_1.getSheetName());
							if (rowCount_tFileInputExcel_1 <= i_tFileInputExcel_1) {
								row_tFileInputExcel_1 = sheet_tFileInputExcel_1
										.getRow(i_tFileInputExcel_1 - rowCount_tFileInputExcel_1);
							}
							joursFeries = null;
							joursFeries = null;
							int tempRowLength_tFileInputExcel_1 = 2;

							int columnIndex_tFileInputExcel_1 = 0;

							String[] temp_row_tFileInputExcel_1 = new String[tempRowLength_tFileInputExcel_1];
							int excel_end_column_tFileInputExcel_1;
							if (row_tFileInputExcel_1 == null) {
								excel_end_column_tFileInputExcel_1 = 0;
							} else {
								excel_end_column_tFileInputExcel_1 = row_tFileInputExcel_1.getLastCellNum();
							}
							int actual_end_column_tFileInputExcel_1;
							if (end_column_tFileInputExcel_1 == -1) {
								actual_end_column_tFileInputExcel_1 = excel_end_column_tFileInputExcel_1;
							} else {
								actual_end_column_tFileInputExcel_1 = end_column_tFileInputExcel_1 > excel_end_column_tFileInputExcel_1
										? excel_end_column_tFileInputExcel_1
										: end_column_tFileInputExcel_1;
							}
							org.apache.poi.ss.formula.eval.NumberEval ne_tFileInputExcel_1 = null;
							for (int i = 0; i < tempRowLength_tFileInputExcel_1; i++) {
								if (i + start_column_tFileInputExcel_1 < actual_end_column_tFileInputExcel_1) {
									org.apache.poi.ss.usermodel.Cell cell_tFileInputExcel_1 = row_tFileInputExcel_1
											.getCell(i + start_column_tFileInputExcel_1);
									if (cell_tFileInputExcel_1 != null) {
										switch (cell_tFileInputExcel_1.getCellType()) {
										case STRING:
											temp_row_tFileInputExcel_1[i] = cell_tFileInputExcel_1
													.getRichStringCellValue().getString();
											break;
										case NUMERIC:
											if (org.apache.poi.ss.usermodel.DateUtil
													.isCellDateFormatted(cell_tFileInputExcel_1)) {
												temp_row_tFileInputExcel_1[i] = cell_tFileInputExcel_1
														.getDateCellValue().toString();
											} else {
												temp_row_tFileInputExcel_1[i] = df_tFileInputExcel_1
														.format(cell_tFileInputExcel_1.getNumericCellValue());
											}
											break;
										case BOOLEAN:
											temp_row_tFileInputExcel_1[i] = String
													.valueOf(cell_tFileInputExcel_1.getBooleanCellValue());
											break;
										case FORMULA:
											switch (cell_tFileInputExcel_1.getCachedFormulaResultType()) {
											case STRING:
												temp_row_tFileInputExcel_1[i] = cell_tFileInputExcel_1
														.getRichStringCellValue().getString();
												break;
											case NUMERIC:
												if (org.apache.poi.ss.usermodel.DateUtil
														.isCellDateFormatted(cell_tFileInputExcel_1)) {
													temp_row_tFileInputExcel_1[i] = cell_tFileInputExcel_1
															.getDateCellValue().toString();
												} else {
													ne_tFileInputExcel_1 = new org.apache.poi.ss.formula.eval.NumberEval(
															cell_tFileInputExcel_1.getNumericCellValue());
													temp_row_tFileInputExcel_1[i] = ne_tFileInputExcel_1
															.getStringValue();
												}
												break;
											case BOOLEAN:
												temp_row_tFileInputExcel_1[i] = String
														.valueOf(cell_tFileInputExcel_1.getBooleanCellValue());
												break;
											default:
												temp_row_tFileInputExcel_1[i] = "";
											}
											break;
										default:
											temp_row_tFileInputExcel_1[i] = "";
										}
									} else {
										temp_row_tFileInputExcel_1[i] = "";
									}

								} else {
									temp_row_tFileInputExcel_1[i] = "";
								}
							}
							boolean whetherReject_tFileInputExcel_1 = false;
							joursFeries = new joursFeriesStruct();
							int curColNum_tFileInputExcel_1 = -1;
							String curColName_tFileInputExcel_1 = "";
							try {
								columnIndex_tFileInputExcel_1 = 0;

								if (temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
									curColNum_tFileInputExcel_1 = columnIndex_tFileInputExcel_1
											+ start_column_tFileInputExcel_1 + 1;
									curColName_tFileInputExcel_1 = "DT_JOUR";

									if (0 < actual_end_column_tFileInputExcel_1) {
										try {
											if (row_tFileInputExcel_1
													.getCell(columnIndex_tFileInputExcel_1
															+ start_column_tFileInputExcel_1)
													.getCellType() == org.apache.poi.ss.usermodel.CellType.NUMERIC
													&& org.apache.poi.ss.usermodel.DateUtil.isCellDateFormatted(
															row_tFileInputExcel_1.getCell(columnIndex_tFileInputExcel_1
																	+ start_column_tFileInputExcel_1))) {
												joursFeries.DT_JOUR = row_tFileInputExcel_1.getCell(
														columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1)
														.getDateCellValue();
											} else {
												java.util.Date tempDate_tFileInputExcel_1 = ParserUtils.parseTo_Date(
														temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1],
														"yyyy-MM-dd");
												if (tempDate_tFileInputExcel_1
														.after((new SimpleDateFormat("yyyy/MM/dd hh:mm:ss.SSS"))
																.parse("9999/12/31 23:59:59.999"))
														|| tempDate_tFileInputExcel_1
																.before((new SimpleDateFormat("yyyy/MM/dd"))
																		.parse("1900/01/01"))) {
													throw new RuntimeException("The cell format is not Date in ( Row. "
															+ (nb_line_tFileInputExcel_1 + 1) + " and ColumnNum. "
															+ curColNum_tFileInputExcel_1 + " )");
												} else {
													joursFeries.DT_JOUR = tempDate_tFileInputExcel_1;
												}
											}
										} catch (java.lang.Exception e) {
											globalMap.put("tFileInputExcel_1_ERROR_MESSAGE", e.getMessage());

											throw new RuntimeException("The cell format is not Date in ( Row. "
													+ (nb_line_tFileInputExcel_1 + 1) + " and ColumnNum. "
													+ curColNum_tFileInputExcel_1 + " )");
										}
									}

								} else {
									joursFeries.DT_JOUR = null;
									emptyColumnCount_tFileInputExcel_1++;
								}
								columnIndex_tFileInputExcel_1 = 1;

								if (temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
									curColNum_tFileInputExcel_1 = columnIndex_tFileInputExcel_1
											+ start_column_tFileInputExcel_1 + 1;
									curColName_tFileInputExcel_1 = "LB_JOUR_FERIE";

									joursFeries.LB_JOUR_FERIE = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
								} else {
									joursFeries.LB_JOUR_FERIE = null;
									emptyColumnCount_tFileInputExcel_1++;
								}

								nb_line_tFileInputExcel_1++;

							} catch (java.lang.Exception e) {
								globalMap.put("tFileInputExcel_1_ERROR_MESSAGE", e.getMessage());
								whetherReject_tFileInputExcel_1 = true;
								System.err.println(e.getMessage());
								joursFeries = null;
							}

							/**
							 * [tFileInputExcel_1 begin ] stop
							 */

							/**
							 * [tFileInputExcel_1 main ] start
							 */

							currentComponent = "tFileInputExcel_1";

							tos_count_tFileInputExcel_1++;

							/**
							 * [tFileInputExcel_1 main ] stop
							 */

							/**
							 * [tFileInputExcel_1 process_data_begin ] start
							 */

							currentComponent = "tFileInputExcel_1";

							/**
							 * [tFileInputExcel_1 process_data_begin ] stop
							 */
// Start of branch "joursFeries"
							if (joursFeries != null) {

								/**
								 * [tAdvancedHash_joursFeries main ] start
								 */

								currentComponent = "tAdvancedHash_joursFeries";

								if (execStat) {
									runStat.updateStatOnConnection(iterateId, 1, 1

											, "joursFeries"

									);
								}

								joursFeriesStruct joursFeries_HashRow = new joursFeriesStruct();

								joursFeries_HashRow.DT_JOUR = joursFeries.DT_JOUR;

								joursFeries_HashRow.LB_JOUR_FERIE = joursFeries.LB_JOUR_FERIE;

								tHash_Lookup_joursFeries.put(joursFeries_HashRow);

								tos_count_tAdvancedHash_joursFeries++;

								/**
								 * [tAdvancedHash_joursFeries main ] stop
								 */

								/**
								 * [tAdvancedHash_joursFeries process_data_begin ] start
								 */

								currentComponent = "tAdvancedHash_joursFeries";

								/**
								 * [tAdvancedHash_joursFeries process_data_begin ] stop
								 */

								/**
								 * [tAdvancedHash_joursFeries process_data_end ] start
								 */

								currentComponent = "tAdvancedHash_joursFeries";

								/**
								 * [tAdvancedHash_joursFeries process_data_end ] stop
								 */

							} // End of branch "joursFeries"

							/**
							 * [tFileInputExcel_1 process_data_end ] start
							 */

							currentComponent = "tFileInputExcel_1";

							/**
							 * [tFileInputExcel_1 process_data_end ] stop
							 */

							/**
							 * [tFileInputExcel_1 end ] start
							 */

							currentComponent = "tFileInputExcel_1";

						}

						globalMap.put("tFileInputExcel_1_NB_LINE", nb_line_tFileInputExcel_1);

					}

				} finally {

					if (!(source_tFileInputExcel_1 instanceof java.io.InputStream)) {
						workbook_tFileInputExcel_1.getPackage().revert();
					}

				}

				ok_Hash.put("tFileInputExcel_1", true);
				end_Hash.put("tFileInputExcel_1", System.currentTimeMillis());

				/**
				 * [tFileInputExcel_1 end ] stop
				 */

				/**
				 * [tAdvancedHash_joursFeries end ] start
				 */

				currentComponent = "tAdvancedHash_joursFeries";

				tHash_Lookup_joursFeries.endPut();

				if (execStat) {
					runStat.updateStat(resourceMap, iterateId, 2, 0, "joursFeries");
				}

				ok_Hash.put("tAdvancedHash_joursFeries", true);
				end_Hash.put("tAdvancedHash_joursFeries", System.currentTimeMillis());

				/**
				 * [tAdvancedHash_joursFeries end ] stop
				 */

			} // end the resume

		} catch (java.lang.Exception e) {

			TalendException te = new TalendException(e, currentComponent, globalMap);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [tFileInputExcel_1 finally ] start
				 */

				currentComponent = "tFileInputExcel_1";

				/**
				 * [tFileInputExcel_1 finally ] stop
				 */

				/**
				 * [tAdvancedHash_joursFeries finally ] start
				 */

				currentComponent = "tAdvancedHash_joursFeries";

				/**
				 * [tAdvancedHash_joursFeries finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileInputExcel_1_SUBPROCESS_STATE", 1);
	}

	public String resuming_logs_dir_path = null;
	public String resuming_checkpoint_path = null;
	public String parent_part_launcher = null;
	private String resumeEntryMethodName = null;
	private boolean globalResumeTicket = false;

	public boolean watch = false;
	// portStats is null, it means don't execute the statistics
	public Integer portStats = null;
	public int portTraces = 4334;
	public String clientHost;
	public String defaultClientHost = "localhost";
	public String contextStr = "Default";
	public boolean isDefaultContext = true;
	public String pid = "0";
	public String rootPid = null;
	public String fatherPid = null;
	public String fatherNode = null;
	public long startTime = 0;
	public boolean isChildJob = false;
	public String log4jLevel = "";

	private boolean enableLogStash;

	private boolean execStat = true;

	private ThreadLocal<java.util.Map<String, String>> threadLocal = new ThreadLocal<java.util.Map<String, String>>() {
		protected java.util.Map<String, String> initialValue() {
			java.util.Map<String, String> threadRunResultMap = new java.util.HashMap<String, String>();
			threadRunResultMap.put("errorCode", null);
			threadRunResultMap.put("status", "");
			return threadRunResultMap;
		};
	};

	protected PropertiesWithType context_param = new PropertiesWithType();
	public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

	public String status = "";

	public static void main(String[] args) {
		final jGenerateCalendar jGenerateCalendarClass = new jGenerateCalendar();

		int exitCode = jGenerateCalendarClass.runJobInTOS(args);

		System.exit(exitCode);
	}

	public String[][] runJob(String[] args) {

		int exitCode = runJobInTOS(args);
		String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

		return bufferValue;
	}

	public boolean hastBufferOutputComponent() {
		boolean hastBufferOutput = false;

		return hastBufferOutput;
	}

	public int runJobInTOS(String[] args) {
		// reset status
		status = "";

		String lastStr = "";
		for (String arg : args) {
			if (arg.equalsIgnoreCase("--context_param")) {
				lastStr = arg;
			} else if (lastStr.equals("")) {
				evalParam(arg);
			} else {
				evalParam(lastStr + " " + arg);
				lastStr = "";
			}
		}
		enableLogStash = "true".equalsIgnoreCase(System.getProperty("audit.enabled"));

		if (clientHost == null) {
			clientHost = defaultClientHost;
		}

		if (pid == null || "0".equals(pid)) {
			pid = TalendString.getAsciiRandomString(6);
		}

		if (rootPid == null) {
			rootPid = pid;
		}
		if (fatherPid == null) {
			fatherPid = pid;
		} else {
			isChildJob = true;
		}

		if (portStats != null) {
			// portStats = -1; //for testing
			if (portStats < 0 || portStats > 65535) {
				// issue:10869, the portStats is invalid, so this client socket can't open
				System.err.println("The statistics socket port " + portStats + " is invalid.");
				execStat = false;
			}
		} else {
			execStat = false;
		}
		boolean inOSGi = routines.system.BundleUtils.inOSGi();

		if (inOSGi) {
			java.util.Dictionary<String, Object> jobProperties = routines.system.BundleUtils.getJobProperties(jobName);

			if (jobProperties != null && jobProperties.get("context") != null) {
				contextStr = (String) jobProperties.get("context");
			}
		}

		try {
			// call job/subjob with an existing context, like: --context=production. if
			// without this parameter, there will use the default context instead.
			java.io.InputStream inContext = jGenerateCalendar.class.getClassLoader().getResourceAsStream(
					"icommerce_reporting/jgeneratecalendar_0_2/contexts/" + contextStr + ".properties");
			if (inContext == null) {
				inContext = jGenerateCalendar.class.getClassLoader()
						.getResourceAsStream("config/contexts/" + contextStr + ".properties");
			}
			if (inContext != null) {
				try {
					// defaultProps is in order to keep the original context value
					if (context != null && context.isEmpty()) {
						defaultProps.load(inContext);
						context = new ContextProperties(defaultProps);
					}
				} finally {
					inContext.close();
				}
			} else if (!isDefaultContext) {
				// print info and job continue to run, for case: context_param is not empty.
				System.err.println("Could not find the context " + contextStr);
			}

			if (!context_param.isEmpty()) {
				context.putAll(context_param);
				// set types for params from parentJobs
				for (Object key : context_param.keySet()) {
					String context_key = key.toString();
					String context_type = context_param.getContextType(context_key);
					context.setContextType(context_key, context_type);

				}
			}
			class ContextProcessing {
				private void processContext_0() {
					context.setContextType("dtDebCalendrier", "id_Date");
					if (context.getStringValue("dtDebCalendrier") == null) {
						context.dtDebCalendrier = null;
					} else {
						String context_dtDebCalendrier_value = context.getProperty("dtDebCalendrier");
						try {
							if (context_dtDebCalendrier_value == null) {
								context_dtDebCalendrier_value = "";
							}
							int context_dtDebCalendrier_pos = context_dtDebCalendrier_value.indexOf(";");
							String context_dtDebCalendrier_pattern = "yyyy-MM-dd HH:mm:ss";
							if (context_dtDebCalendrier_pos > -1) {
								context_dtDebCalendrier_pattern = context_dtDebCalendrier_value.substring(0,
										context_dtDebCalendrier_pos);
								context_dtDebCalendrier_value = context_dtDebCalendrier_value
										.substring(context_dtDebCalendrier_pos + 1);
							}

							context.dtDebCalendrier = (java.util.Date) (new java.text.SimpleDateFormat(
									context_dtDebCalendrier_pattern).parse(context_dtDebCalendrier_value));

						} catch (ParseException e) {
							try {
								long context_dtDebCalendrier_longValue = Long.valueOf(context_dtDebCalendrier_value);
								context.dtDebCalendrier = new java.util.Date(context_dtDebCalendrier_longValue);
							} catch (NumberFormatException cantParseToLongException) {
								System.err.println(String.format("Null value will be used for context parameter %s: %s",
										"dtDebCalendrier", "Can't parse date string: " + e.getMessage() + " and long: "
												+ cantParseToLongException.getMessage()));
								context.dtDebCalendrier = null;
							}
						}
					}
					context.setContextType("dtFinCalendrier", "id_Date");
					if (context.getStringValue("dtFinCalendrier") == null) {
						context.dtFinCalendrier = null;
					} else {
						String context_dtFinCalendrier_value = context.getProperty("dtFinCalendrier");
						try {
							if (context_dtFinCalendrier_value == null) {
								context_dtFinCalendrier_value = "";
							}
							int context_dtFinCalendrier_pos = context_dtFinCalendrier_value.indexOf(";");
							String context_dtFinCalendrier_pattern = "yyyy-MM-dd HH:mm:ss";
							if (context_dtFinCalendrier_pos > -1) {
								context_dtFinCalendrier_pattern = context_dtFinCalendrier_value.substring(0,
										context_dtFinCalendrier_pos);
								context_dtFinCalendrier_value = context_dtFinCalendrier_value
										.substring(context_dtFinCalendrier_pos + 1);
							}

							context.dtFinCalendrier = (java.util.Date) (new java.text.SimpleDateFormat(
									context_dtFinCalendrier_pattern).parse(context_dtFinCalendrier_value));

						} catch (ParseException e) {
							try {
								long context_dtFinCalendrier_longValue = Long.valueOf(context_dtFinCalendrier_value);
								context.dtFinCalendrier = new java.util.Date(context_dtFinCalendrier_longValue);
							} catch (NumberFormatException cantParseToLongException) {
								System.err.println(String.format("Null value will be used for context parameter %s: %s",
										"dtFinCalendrier", "Can't parse date string: " + e.getMessage() + " and long: "
												+ cantParseToLongException.getMessage()));
								context.dtFinCalendrier = null;
							}
						}
					}
					context.setContextType("nbJoursCalendrier", "id_Integer");
					if (context.getStringValue("nbJoursCalendrier") == null) {
						context.nbJoursCalendrier = null;
					} else {
						try {
							context.nbJoursCalendrier = routines.system.ParserUtils
									.parseTo_Integer(context.getProperty("nbJoursCalendrier"));
						} catch (NumberFormatException e) {
							System.err.println(String.format("Null value will be used for context parameter %s: %s",
									"nbJoursCalendrier", e.getMessage()));
							context.nbJoursCalendrier = null;
						}
					}
					context.setContextType("additionalParam", "id_String");
					if (context.getStringValue("additionalParam") == null) {
						context.additionalParam = null;
					} else {
						context.additionalParam = (String) context.getProperty("additionalParam");
					}
					context.setContextType("database", "id_String");
					if (context.getStringValue("database") == null) {
						context.database = null;
					} else {
						context.database = (String) context.getProperty("database");
					}
					context.setContextType("password", "id_Password");
					if (context.getStringValue("password") == null) {
						context.password = null;
					} else {
						String pwd_password_value = context.getProperty("password");
						context.password = null;
						if (pwd_password_value != null) {
							if (context_param.containsKey("password")) {// no need to decrypt if it come from program
																		// argument or parent job runtime
								context.password = pwd_password_value;
							} else if (!pwd_password_value.isEmpty()) {
								try {
									context.password = routines.system.PasswordEncryptUtil
											.decryptPassword(pwd_password_value);
									context.put("password", context.password);
								} catch (java.lang.RuntimeException e) {
									// do nothing
								}
							}
						}
					}
					context.setContextType("port", "id_String");
					if (context.getStringValue("port") == null) {
						context.port = null;
					} else {
						context.port = (String) context.getProperty("port");
					}
					context.setContextType("schema_dwh", "id_String");
					if (context.getStringValue("schema_dwh") == null) {
						context.schema_dwh = null;
					} else {
						context.schema_dwh = (String) context.getProperty("schema_dwh");
					}
					context.setContextType("serverName", "id_String");
					if (context.getStringValue("serverName") == null) {
						context.serverName = null;
					} else {
						context.serverName = (String) context.getProperty("serverName");
					}
					context.setContextType("utilisateur", "id_String");
					if (context.getStringValue("utilisateur") == null) {
						context.utilisateur = null;
					} else {
						context.utilisateur = (String) context.getProperty("utilisateur");
					}
					context.setContextType("schema_param", "id_String");
					if (context.getStringValue("schema_param") == null) {
						context.schema_param = null;
					} else {
						context.schema_param = (String) context.getProperty("schema_param");
					}
				}

				public void processAllContext() {
					processContext_0();
				}
			}

			new ContextProcessing().processAllContext();
		} catch (java.io.IOException ie) {
			System.err.println("Could not load context " + contextStr);
			ie.printStackTrace();
		}

		// get context value from parent directly
		if (parentContextMap != null && !parentContextMap.isEmpty()) {
			if (parentContextMap.containsKey("dtDebCalendrier")) {
				context.dtDebCalendrier = (java.util.Date) parentContextMap.get("dtDebCalendrier");
			}
			if (parentContextMap.containsKey("dtFinCalendrier")) {
				context.dtFinCalendrier = (java.util.Date) parentContextMap.get("dtFinCalendrier");
			}
			if (parentContextMap.containsKey("nbJoursCalendrier")) {
				context.nbJoursCalendrier = (Integer) parentContextMap.get("nbJoursCalendrier");
			}
			if (parentContextMap.containsKey("additionalParam")) {
				context.additionalParam = (String) parentContextMap.get("additionalParam");
			}
			if (parentContextMap.containsKey("database")) {
				context.database = (String) parentContextMap.get("database");
			}
			if (parentContextMap.containsKey("password")) {
				context.password = (java.lang.String) parentContextMap.get("password");
			}
			if (parentContextMap.containsKey("port")) {
				context.port = (String) parentContextMap.get("port");
			}
			if (parentContextMap.containsKey("schema_dwh")) {
				context.schema_dwh = (String) parentContextMap.get("schema_dwh");
			}
			if (parentContextMap.containsKey("serverName")) {
				context.serverName = (String) parentContextMap.get("serverName");
			}
			if (parentContextMap.containsKey("utilisateur")) {
				context.utilisateur = (String) parentContextMap.get("utilisateur");
			}
			if (parentContextMap.containsKey("schema_param")) {
				context.schema_param = (String) parentContextMap.get("schema_param");
			}
		}

		// Resume: init the resumeUtil
		resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
		resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
		resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
		parametersToEncrypt.add("password");
		// Resume: jobStart
		resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "",
				"", "", "", "", resumeUtil.convertToJsonText(context, parametersToEncrypt));

		if (execStat) {
			try {
				runStat.openSocket(!isChildJob);
				runStat.setAllPID(rootPid, fatherPid, pid, jobName);
				runStat.startThreadStat(clientHost, portStats);
				runStat.updateStatOnJob(RunStat.JOBSTART, fatherNode);
			} catch (java.io.IOException ioException) {
				ioException.printStackTrace();
			}
		}

		java.util.concurrent.ConcurrentHashMap<Object, Object> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<Object, Object>();
		globalMap.put("concurrentHashMap", concurrentHashMap);

		long startUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		long endUsedMemory = 0;
		long end = 0;

		startTime = System.currentTimeMillis();

		try {
			errorCode = null;
			Implicit_Context_DatabaseProcess(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_Implicit_Context_Database) {
			globalMap.put("Implicit_Context_Database_SUBPROCESS_STATE", -1);

			e_Implicit_Context_Database.printStackTrace();

		}

		this.globalResumeTicket = true;// to run tPreJob

		try {
			errorCode = null;
			tPrejob_1Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_tPrejob_1) {
			globalMap.put("tPrejob_1_SUBPROCESS_STATE", -1);

			e_tPrejob_1.printStackTrace();

		}

		this.globalResumeTicket = false;// to run others jobs

		try {
			errorCode = null;
			tRowGenerator_1Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_tRowGenerator_1) {
			globalMap.put("tRowGenerator_1_SUBPROCESS_STATE", -1);

			e_tRowGenerator_1.printStackTrace();

		}

		this.globalResumeTicket = true;// to run tPostJob

		try {
			errorCode = null;
			tPostjob_1Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_tPostjob_1) {
			globalMap.put("tPostjob_1_SUBPROCESS_STATE", -1);

			e_tPostjob_1.printStackTrace();

		}

		end = System.currentTimeMillis();

		if (watch) {
			System.out.println((end - startTime) + " milliseconds");
		}

		endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		if (false) {
			System.out.println(
					(endUsedMemory - startUsedMemory) + " bytes memory increase when running : jGenerateCalendar");
		}

		if (execStat) {
			runStat.updateStatOnJob(RunStat.JOBEND, fatherNode);
			runStat.stopThreadStat();
		}
		int returnCode = 0;

		if (errorCode == null) {
			returnCode = status != null && status.equals("failure") ? 1 : 0;
		} else {
			returnCode = errorCode.intValue();
		}
		resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "",
				"" + returnCode, "", "", "");

		return returnCode;

	}

	// only for OSGi env
	public void destroy() {
		closeSqlDbConnections();

	}

	private void closeSqlDbConnections() {
		try {
			Object obj_conn;
			obj_conn = globalMap.remove("conn_tDBConnection_1");
			if (null != obj_conn) {
				((java.sql.Connection) obj_conn).close();
			}
		} catch (java.lang.Exception e) {
		}
	}

	private java.util.Map<String, Object> getSharedConnections4REST() {
		java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
		connections.put("conn_tDBConnection_1", globalMap.get("conn_tDBConnection_1"));

		return connections;
	}

	private void evalParam(String arg) {
		if (arg.startsWith("--resuming_logs_dir_path")) {
			resuming_logs_dir_path = arg.substring(25);
		} else if (arg.startsWith("--resuming_checkpoint_path")) {
			resuming_checkpoint_path = arg.substring(27);
		} else if (arg.startsWith("--parent_part_launcher")) {
			parent_part_launcher = arg.substring(23);
		} else if (arg.startsWith("--watch")) {
			watch = true;
		} else if (arg.startsWith("--stat_port=")) {
			String portStatsStr = arg.substring(12);
			if (portStatsStr != null && !portStatsStr.equals("null")) {
				portStats = Integer.parseInt(portStatsStr);
			}
		} else if (arg.startsWith("--trace_port=")) {
			portTraces = Integer.parseInt(arg.substring(13));
		} else if (arg.startsWith("--client_host=")) {
			clientHost = arg.substring(14);
		} else if (arg.startsWith("--context=")) {
			contextStr = arg.substring(10);
			isDefaultContext = false;
		} else if (arg.startsWith("--father_pid=")) {
			fatherPid = arg.substring(13);
		} else if (arg.startsWith("--root_pid=")) {
			rootPid = arg.substring(11);
		} else if (arg.startsWith("--father_node=")) {
			fatherNode = arg.substring(14);
		} else if (arg.startsWith("--pid=")) {
			pid = arg.substring(6);
		} else if (arg.startsWith("--context_type")) {
			String keyValue = arg.substring(15);
			int index = -1;
			if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
				if (fatherPid == null) {
					context_param.setContextType(keyValue.substring(0, index),
							replaceEscapeChars(keyValue.substring(index + 1)));
				} else { // the subjob won't escape the especial chars
					context_param.setContextType(keyValue.substring(0, index), keyValue.substring(index + 1));
				}

			}

		} else if (arg.startsWith("--context_param")) {
			String keyValue = arg.substring(16);
			int index = -1;
			if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
				if (fatherPid == null) {
					context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
				} else { // the subjob won't escape the especial chars
					context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1));
				}
			}
		} else if (arg.startsWith("--log4jLevel=")) {
			log4jLevel = arg.substring(13);
		} else if (arg.startsWith("--audit.enabled") && arg.contains("=")) {// for trunjob call
			final int equal = arg.indexOf('=');
			final String key = arg.substring("--".length(), equal);
			System.setProperty(key, arg.substring(equal + 1));
		}
	}

	private static final String NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY = "<TALEND_NULL>";

	private final String[][] escapeChars = { { "\\\\", "\\" }, { "\\n", "\n" }, { "\\'", "\'" }, { "\\r", "\r" },
			{ "\\f", "\f" }, { "\\b", "\b" }, { "\\t", "\t" } };

	private String replaceEscapeChars(String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0], currIndex);
				if (index >= 0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0],
							strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the
			// result
			if (index < 0) {
				result.append(keyValue.substring(currIndex));
				currIndex = currIndex + keyValue.length();
			}
		}

		return result.toString();
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public String getStatus() {
		return status;
	}

	ResumeUtil resumeUtil = null;
}
/************************************************************************************************
 * 179998 characters generated by Talend Open Studio for Data Integration on the
 * 7 septembre 2023 à 23:16:08 WAT
 ************************************************************************************************/
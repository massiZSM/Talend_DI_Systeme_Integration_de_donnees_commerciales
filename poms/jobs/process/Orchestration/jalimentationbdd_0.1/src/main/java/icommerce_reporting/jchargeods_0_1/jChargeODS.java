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


package icommerce_reporting.jchargeods_0_1;

import routines.Numeric;
import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.StringHandling;
import routines.Relational;
import routines.TalendDate;
import routines.Mathematical;
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

	//the import part of tJava_2
	//import java.util.List;


@SuppressWarnings("unused")

/**
 * Job: jChargeODS Purpose: jChargeODS<br>
 * Description: jChargeODS <br>
 * @author user@talend.com
 * @version 8.0.1.20211109_1610
 * @status 
 */
public class jChargeODS implements TalendJob {

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
	//contains type for every context property
	public class PropertiesWithType extends java.util.Properties {
		private static final long serialVersionUID = 1L;
		private java.util.Map<String,String> propertyTypes = new java.util.HashMap<>();
		
		public PropertiesWithType(java.util.Properties properties){
			super(properties);
		}
		public PropertiesWithType(){
			super();
		}
		
		public void setContextType(String key, String type) {
			propertyTypes.put(key,type);
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

		public ContextProperties(java.util.Properties properties){
			super(properties);
		}
		public ContextProperties(){
			super();
		}

		public void synchronizeContext(){
			
			if(schema_ods != null){
				
					this.setProperty("schema_ods", schema_ods.toString());
				
			}
			
			if(additionalParam != null){
				
					this.setProperty("additionalParam", additionalParam.toString());
				
			}
			
			if(database != null){
				
					this.setProperty("database", database.toString());
				
			}
			
			if(password != null){
				
					this.setProperty("password", password.toString());
				
			}
			
			if(port != null){
				
					this.setProperty("port", port.toString());
				
			}
			
			if(schema_param != null){
				
					this.setProperty("schema_param", schema_param.toString());
				
			}
			
			if(serverName != null){
				
					this.setProperty("serverName", serverName.toString());
				
			}
			
			if(utilisateur != null){
				
					this.setProperty("utilisateur", utilisateur.toString());
				
			}
			
			if(encodage != null){
				
					this.setProperty("encodage", encodage.toString());
				
			}
			
			if(fieldSeparator != null){
				
					this.setProperty("fieldSeparator", fieldSeparator.toString());
				
			}
			
			if(projectFolder != null){
				
					this.setProperty("projectFolder", projectFolder.toString());
				
			}
			
		}
		
		//if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if(NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

public String schema_ods;
public String getSchema_ods(){
	return this.schema_ods;
}
public String additionalParam;
public String getAdditionalParam(){
	return this.additionalParam;
}
public String database;
public String getDatabase(){
	return this.database;
}
public java.lang.String password;
public java.lang.String getPassword(){
	return this.password;
}
public String port;
public String getPort(){
	return this.port;
}
public String schema_param;
public String getSchema_param(){
	return this.schema_param;
}
public String serverName;
public String getServerName(){
	return this.serverName;
}
public String utilisateur;
public String getUtilisateur(){
	return this.utilisateur;
}
public String encodage;
public String getEncodage(){
	return this.encodage;
}
public String fieldSeparator;
public String getFieldSeparator(){
	return this.fieldSeparator;
}
		public String projectFolder;
		public String getProjectFolder(){
			return this.projectFolder;
		}
		
	}
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "jChargeODS";
	private final String projectName = "ICOMMERCE_REPORTING";
	public Integer errorCode = null;
	private String currentComponent = "";
	
		private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
        private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();
	
		private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
		public  final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();
	

private RunStat runStat = new RunStat();

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";
	
	private final static String KEY_DB_DATASOURCES_RAW = "KEY_DB_DATASOURCES_RAW";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(), new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}
	
	public void setDataSourceReferences(List serviceReferences) throws Exception{
		
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		java.util.Map<String, javax.sql.DataSource> dataSources = new java.util.HashMap<String, javax.sql.DataSource>();
		
		for (java.util.Map.Entry<String, javax.sql.DataSource> entry : BundleUtils.getServices(serviceReferences,  javax.sql.DataSource.class).entrySet()) {
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
	
	public void setVirtualComponentName (String virtualComponentName){
		this.virtualComponentName = virtualComponentName;
	}

	private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
		this.currentComponent= errorComponent;
		this.globalMap = globalMap;
		this.e = e;
	}

	public Exception getException() {
		return this.e;
	}

	public String getCurrentComponent() {
		return this.currentComponent;
	}

	
    public String getExceptionCauseMessage(Exception e){
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
			if(virtualComponentName!=null && currentComponent.indexOf(virtualComponentName+"_")==0){
				globalMap.put(virtualComponentName+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			}
			globalMap.put(currentComponent+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			System.err.println("Exception in component " + currentComponent + " (" + jobName + ")");
		}
		if (!(e instanceof TDieException)) {
			if(e instanceof TalendException){
				e.printStackTrace();
			} else {
				e.printStackTrace();
				e.printStackTrace(errorMessagePS);
				jChargeODS.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(jChargeODS.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
			}
		} catch (Exception e) {
			this.e.printStackTrace();
		}
		}
	}
}

			public void Implicit_Context_Database_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							Implicit_Context_Context_error(exception, errorComponent, globalMap);
						
						}
					
			public void Implicit_Context_Context_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					Implicit_Context_Database_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPrejob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tChronometerStart_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tChronometerStart_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileList_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
						try {
							
								if(this.execStat){
									runStat.updateStatOnConnection("OnComponentError1", 0, "error");
								}
							
							
								errorCode = null;
								tDie_1Process(globalMap);
								if (!"failure".equals(status)) {
									status = "end";
								}
								

						} catch (Exception e) {
							e.printStackTrace();
						}
						
					tFileList_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDie_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDie_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tRunJob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tRunJob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tRunJob_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tRunJob_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tRunJob_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tRunJob_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tRunJob_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tRunJob_4_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tRunJob_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tRunJob_5_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tRunJob_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tRunJob_6_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPostjob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPostjob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBClose_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBClose_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tChronometerStop_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tChronometerStop_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void Implicit_Context_Database_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPrejob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tChronometerStart_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileList_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJava_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tRunJob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tRunJob_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tRunJob_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tRunJob_4_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tRunJob_5_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tRunJob_6_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPostjob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBClose_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tChronometerStop_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJava_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	






public static class row_Implicit_Context_DatabaseStruct implements routines.system.IPersistableRow<row_Implicit_Context_DatabaseStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jChargeODS = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jChargeODS = new byte[0];

	
			    public String key;

				public String getKey () {
					return this.key;
				}
				
			    public String value;

				public String getValue () {
					return this.value;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jChargeODS.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jChargeODS.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jChargeODS = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jChargeODS = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jChargeODS, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jChargeODS, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jChargeODS.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jChargeODS.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jChargeODS = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jChargeODS = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jChargeODS, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jChargeODS, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jChargeODS) {

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

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jChargeODS) {

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
				
						writeString(this.key,dos);
					
					// String
				
						writeString(this.value,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.key,dos);
					
					// String
				
						writeString(this.value,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("key="+key);
		sb.append(",value="+value);
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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row_Implicit_Context_DatabaseStruct row_Implicit_Context_Database = new row_Implicit_Context_DatabaseStruct();




	
	/**
	 * [Implicit_Context_Context begin ] start
	 */

	

	
		
		ok_Hash.put("Implicit_Context_Context", false);
		start_Hash.put("Implicit_Context_Context", System.currentTimeMillis());
		
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Main");
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
	
	currentComponent="Implicit_Context_Database";

	
		int tos_count_Implicit_Context_Database = 0;
		
	
    
	
		    int nb_line_Implicit_Context_Database = 0;
		    java.sql.Connection conn_Implicit_Context_Database = null;
				String driverClass_Implicit_Context_Database = "org.postgresql.Driver";
			    java.lang.Class jdbcclazz_Implicit_Context_Database = java.lang.Class.forName(driverClass_Implicit_Context_Database);
				String dbUser_Implicit_Context_Database = context.utilisateur;
				
				
	final String decryptedPassword_Implicit_Context_Database = context.password; 
				
				String dbPwd_Implicit_Context_Database = decryptedPassword_Implicit_Context_Database;
				
				String url_Implicit_Context_Database = "jdbc:postgresql://" + context.serverName + ":" + context.port + "/" + context.database + "?" + context.additionalParam;
				
				conn_Implicit_Context_Database = java.sql.DriverManager.getConnection(url_Implicit_Context_Database,dbUser_Implicit_Context_Database,dbPwd_Implicit_Context_Database);
		        
				conn_Implicit_Context_Database.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_Implicit_Context_Database = conn_Implicit_Context_Database.createStatement();

		    String dbquery_Implicit_Context_Database = "SELECT \n  \""+context.schema_param+"\".\"CONTEXTE\".\"key\", \n  \""+context.schema_param+"\".\"CONTEXTE\".\"value\"\nFROM \""+context.schema_param+"\".\"CONTEXTE\"";
		    

            	globalMap.put("Implicit_Context_Database_QUERY",dbquery_Implicit_Context_Database);
		    java.sql.ResultSet rs_Implicit_Context_Database = null;

		    try {
		    	rs_Implicit_Context_Database = stmt_Implicit_Context_Database.executeQuery(dbquery_Implicit_Context_Database);
		    	java.sql.ResultSetMetaData rsmd_Implicit_Context_Database = rs_Implicit_Context_Database.getMetaData();
		    	int colQtyInRs_Implicit_Context_Database = rsmd_Implicit_Context_Database.getColumnCount();

		    String tmpContent_Implicit_Context_Database = null;
		    
		    
		    while (rs_Implicit_Context_Database.next()) {
		        nb_line_Implicit_Context_Database++;
		        
							if(colQtyInRs_Implicit_Context_Database < 1) {
								row_Implicit_Context_Database.key = null;
							} else {
	                         		
        	row_Implicit_Context_Database.key = routines.system.JDBCUtil.getString(rs_Implicit_Context_Database, 1, false);
		                    }
							if(colQtyInRs_Implicit_Context_Database < 2) {
								row_Implicit_Context_Database.value = null;
							} else {
	                         		
        	row_Implicit_Context_Database.value = routines.system.JDBCUtil.getString(rs_Implicit_Context_Database, 2, false);
		                    }
					


 



/**
 * [Implicit_Context_Database begin ] stop
 */
	
	/**
	 * [Implicit_Context_Database main ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Database";
	
	currentComponent="Implicit_Context_Database";

	

 


	tos_count_Implicit_Context_Database++;

/**
 * [Implicit_Context_Database main ] stop
 */
	
	/**
	 * [Implicit_Context_Database process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Database";
	
	currentComponent="Implicit_Context_Database";

	

 



/**
 * [Implicit_Context_Database process_data_begin ] stop
 */

	
	/**
	 * [Implicit_Context_Context main ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Main"
						
						);
					}
					
        //////////////////////////
        String tmp_key_Implicit_Context_Context = null;
                    String key_Implicit_Context_Context = null;
                      if (row_Implicit_Context_Database.key != null){
                          tmp_key_Implicit_Context_Context = row_Implicit_Context_Database.key.trim();
                        if ((tmp_key_Implicit_Context_Context.startsWith("#") || tmp_key_Implicit_Context_Context.startsWith("!") )){
                          tmp_key_Implicit_Context_Context = null;
                        } else {
                          row_Implicit_Context_Database.key = tmp_key_Implicit_Context_Context;
                        }
                      }
                        if(row_Implicit_Context_Database.key != null) {
                    key_Implicit_Context_Context =
                        row_Implicit_Context_Database.key;
                        }
                    String value_Implicit_Context_Context = null;
                        if(row_Implicit_Context_Database.value != null) {
                    value_Implicit_Context_Context =
                        row_Implicit_Context_Database.value;
                        }
				
				String currentValue_Implicit_Context_Context = value_Implicit_Context_Context;
										
						if ((key_Implicit_Context_Context != null) && ("password".equals(key_Implicit_Context_Context)) ) currentValue_Implicit_Context_Context = currentValue_Implicit_Context_Context.replaceAll(".", "*");

  if (tmp_key_Implicit_Context_Context != null){
  try{
        if(key_Implicit_Context_Context!=null && "schema_ods".equals(key_Implicit_Context_Context))
        {
           context.schema_ods=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "additionalParam".equals(key_Implicit_Context_Context))
        {
           context.additionalParam=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "database".equals(key_Implicit_Context_Context))
        {
           context.database=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "password".equals(key_Implicit_Context_Context))
        {
           context.password=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "port".equals(key_Implicit_Context_Context))
        {
           context.port=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "schema_param".equals(key_Implicit_Context_Context))
        {
           context.schema_param=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "serverName".equals(key_Implicit_Context_Context))
        {
           context.serverName=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "utilisateur".equals(key_Implicit_Context_Context))
        {
           context.utilisateur=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "encodage".equals(key_Implicit_Context_Context))
        {
           context.encodage=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "fieldSeparator".equals(key_Implicit_Context_Context))
        {
           context.fieldSeparator=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "projectFolder".equals(key_Implicit_Context_Context))
        {
           context.projectFolder=value_Implicit_Context_Context;
        }


        if (context.getProperty(key_Implicit_Context_Context)!=null)
        {
            assignList_Implicit_Context_Context.add(key_Implicit_Context_Context);
        }else  {
            newPropertyList_Implicit_Context_Context.add(key_Implicit_Context_Context);
        }
        if(value_Implicit_Context_Context == null){
            context.setProperty(key_Implicit_Context_Context, "");
        }else{
            context.setProperty(key_Implicit_Context_Context,value_Implicit_Context_Context);
        }
    }catch(java.lang.Exception e){
globalMap.put("Implicit_Context_Context_ERROR_MESSAGE",e.getMessage());
        System.err.println("Setting a value for the key \"" + key_Implicit_Context_Context + "\" has failed. Error message: " + e.getMessage());
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
	
	currentComponent="Implicit_Context_Context";

	

 



/**
 * [Implicit_Context_Context process_data_begin ] stop
 */
	
	/**
	 * [Implicit_Context_Context process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";

	

 



/**
 * [Implicit_Context_Context process_data_end ] stop
 */



	
	/**
	 * [Implicit_Context_Database process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Database";
	
	currentComponent="Implicit_Context_Database";

	

 



/**
 * [Implicit_Context_Database process_data_end ] stop
 */
	
	/**
	 * [Implicit_Context_Database end ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Database";
	
	currentComponent="Implicit_Context_Database";

	

	}
}finally{
	if (rs_Implicit_Context_Database != null) {
		rs_Implicit_Context_Database.close();
	}
	if (stmt_Implicit_Context_Database != null) {
		stmt_Implicit_Context_Database.close();
	}
	if(conn_Implicit_Context_Database != null && !conn_Implicit_Context_Database.isClosed()) {
		
			conn_Implicit_Context_Database.commit();
			
		
			conn_Implicit_Context_Database.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	}
	
}
globalMap.put("Implicit_Context_Database_NB_LINE",nb_line_Implicit_Context_Database);
 

ok_Hash.put("Implicit_Context_Database", true);
end_Hash.put("Implicit_Context_Database", System.currentTimeMillis());




/**
 * [Implicit_Context_Database end ] stop
 */

	
	/**
	 * [Implicit_Context_Context end ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";

	
	
	java.util.Enumeration<?> enu_Implicit_Context_Context = context.propertyNames();
    while(enu_Implicit_Context_Context.hasMoreElements())
    {           
    	String key_Implicit_Context_Context = (String)enu_Implicit_Context_Context.nextElement();
        if(!assignList_Implicit_Context_Context.contains(key_Implicit_Context_Context) && !newPropertyList_Implicit_Context_Context.contains(key_Implicit_Context_Context))
        {
            noAssignList_Implicit_Context_Context.add(key_Implicit_Context_Context);
        }          
    }
	for(Object obj_Implicit_Context_Context :noAssignList_Implicit_Context_Context){
		
		System.out.println("Warning: Parameter \"" + obj_Implicit_Context_Context + "\" has not been set by Implicit_Context_Context");
		
	} 

    String newPropertyStr_Implicit_Context_Context = newPropertyList_Implicit_Context_Context.toString();
    String newProperty_Implicit_Context_Context = newPropertyStr_Implicit_Context_Context.substring(1, newPropertyStr_Implicit_Context_Context.length() - 1);
    
    String noAssignStr_Implicit_Context_Context = noAssignList_Implicit_Context_Context.toString();
    String noAssign_Implicit_Context_Context = noAssignStr_Implicit_Context_Context.substring(1, noAssignStr_Implicit_Context_Context.length() - 1);
    
    globalMap.put("Implicit_Context_Context_KEY_NOT_INCONTEXT", newProperty_Implicit_Context_Context);
    globalMap.put("Implicit_Context_Context_KEY_NOT_LOADED", noAssign_Implicit_Context_Context);

    globalMap.put("Implicit_Context_Context_NB_LINE",nb_line_Implicit_Context_Context);

	List<String> parametersToEncrypt_Implicit_Context_Context = new java.util.ArrayList<String>();
	
		parametersToEncrypt_Implicit_Context_Context.add("password");
		
	
	resumeUtil.addLog("NODE", "NODE:Implicit_Context_Context", "", Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt_Implicit_Context_Context));    
    
				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Main");
			  	}
			  	
 

ok_Hash.put("Implicit_Context_Context", true);
end_Hash.put("Implicit_Context_Context", System.currentTimeMillis());




/**
 * [Implicit_Context_Context end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
					te.setVirtualComponentName(currentVirtualComponent);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [Implicit_Context_Database finally ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Database";
	
	currentComponent="Implicit_Context_Database";

	

 



/**
 * [Implicit_Context_Database finally ] stop
 */

	
	/**
	 * [Implicit_Context_Context finally ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";

	

 



/**
 * [Implicit_Context_Context finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("Implicit_Context_Database_SUBPROCESS_STATE", 1);
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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tPrejob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPrejob_1", false);
		start_Hash.put("tPrejob_1", System.currentTimeMillis());
		
	
	currentComponent="tPrejob_1";

	
		int tos_count_tPrejob_1 = 0;
		

 



/**
 * [tPrejob_1 begin ] stop
 */
	
	/**
	 * [tPrejob_1 main ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 


	tos_count_tPrejob_1++;

/**
 * [tPrejob_1 main ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 process_data_end ] stop
 */
	
	/**
	 * [tPrejob_1 end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 

ok_Hash.put("tPrejob_1", true);
end_Hash.put("tPrejob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk1", 0, "ok");
				}
				tChronometerStart_1Process(globalMap);



/**
 * [tPrejob_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tPrejob_1 finally ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tChronometerStart_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tChronometerStart_1", false);
		start_Hash.put("tChronometerStart_1", System.currentTimeMillis());
		
	
	currentComponent="tChronometerStart_1";

	
		int tos_count_tChronometerStart_1 = 0;
		

	
	
	Long currentTimetChronometerStart_1 = System.currentTimeMillis();
	
	globalMap.put("tChronometerStart_1",currentTimetChronometerStart_1);
	globalMap.put("tChronometerStart_1_STARTTIME", currentTimetChronometerStart_1);
 



/**
 * [tChronometerStart_1 begin ] stop
 */
	
	/**
	 * [tChronometerStart_1 main ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 


	tos_count_tChronometerStart_1++;

/**
 * [tChronometerStart_1 main ] stop
 */
	
	/**
	 * [tChronometerStart_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 



/**
 * [tChronometerStart_1 process_data_begin ] stop
 */
	
	/**
	 * [tChronometerStart_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 



/**
 * [tChronometerStart_1 process_data_end ] stop
 */
	
	/**
	 * [tChronometerStart_1 end ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 

ok_Hash.put("tChronometerStart_1", true);
end_Hash.put("tChronometerStart_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
				}
				tFileList_1Process(globalMap);



/**
 * [tChronometerStart_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tChronometerStart_1 finally ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 



/**
 * [tChronometerStart_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tChronometerStart_1_SUBPROCESS_STATE", 1);
	}
	

public void tFileList_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileList_1_SUBPROCESS_STATE", 0);

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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tFileList_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileList_1", false);
		start_Hash.put("tFileList_1", System.currentTimeMillis());
		
	
	currentComponent="tFileList_1";

	
		int tos_count_tFileList_1 = 0;
		
	
 
     
    
  String directory_tFileList_1 = context.projectFolder;
  final java.util.List<String> maskList_tFileList_1 = new java.util.ArrayList<String>();
  final java.util.List<java.util.regex.Pattern> patternList_tFileList_1 = new java.util.ArrayList<java.util.regex.Pattern>(); 
    maskList_tFileList_1.add(TalendDate.getDate("YYYYMMDD"));  
  for (final String filemask_tFileList_1 : maskList_tFileList_1) {
	String filemask_compile_tFileList_1 = filemask_tFileList_1;
	
		filemask_compile_tFileList_1 = org.apache.oro.text.GlobCompiler.globToPerl5(filemask_tFileList_1.toCharArray(), org.apache.oro.text.GlobCompiler.DEFAULT_MASK);
	
		java.util.regex.Pattern fileNamePattern_tFileList_1 = java.util.regex.Pattern.compile(filemask_compile_tFileList_1);
	patternList_tFileList_1.add(fileNamePattern_tFileList_1);
  }
  int NB_FILEtFileList_1 = 0;

  final boolean case_sensitive_tFileList_1 = true;
	
	
	
    final java.util.List<java.io.File> list_tFileList_1 = new java.util.ArrayList<java.io.File>();
    final java.util.Set<String> filePath_tFileList_1 = new java.util.HashSet<String>();
	java.io.File file_tFileList_1 = new java.io.File(directory_tFileList_1);
     
		file_tFileList_1.listFiles(new java.io.FilenameFilter() {
			public boolean accept(java.io.File dir, String name) {
				java.io.File file = new java.io.File(dir, name);
                if (!file.isDirectory()) {
                	
    	String fileName_tFileList_1 = file.getName();
		for (final java.util.regex.Pattern fileNamePattern_tFileList_1 : patternList_tFileList_1) {
          	if (fileNamePattern_tFileList_1.matcher(fileName_tFileList_1).matches()){
					if(!filePath_tFileList_1.contains(file.getAbsolutePath())) {
			          list_tFileList_1.add(file);
			          filePath_tFileList_1.add(file.getAbsolutePath());
			        }
			}
		}
                }
              return true;
            }
          }
      ); 
      java.util.Collections.sort(list_tFileList_1);
    
    for (int i_tFileList_1 = 0; i_tFileList_1 < list_tFileList_1.size(); i_tFileList_1++){
      java.io.File files_tFileList_1 = list_tFileList_1.get(i_tFileList_1);
      String fileName_tFileList_1 = files_tFileList_1.getName();
      
      String currentFileName_tFileList_1 = files_tFileList_1.getName(); 
      String currentFilePath_tFileList_1 = files_tFileList_1.getAbsolutePath();
      String currentFileDirectory_tFileList_1 = files_tFileList_1.getParent();
      String currentFileExtension_tFileList_1 = null;
      
      if (files_tFileList_1.getName().contains(".") && files_tFileList_1.isFile()){
        currentFileExtension_tFileList_1 = files_tFileList_1.getName().substring(files_tFileList_1.getName().lastIndexOf(".") + 1);
      } else{
        currentFileExtension_tFileList_1 = "";
      }
      
      NB_FILEtFileList_1 ++;
      globalMap.put("tFileList_1_CURRENT_FILE", currentFileName_tFileList_1);
      globalMap.put("tFileList_1_CURRENT_FILEPATH", currentFilePath_tFileList_1);
      globalMap.put("tFileList_1_CURRENT_FILEDIRECTORY", currentFileDirectory_tFileList_1);
      globalMap.put("tFileList_1_CURRENT_FILEEXTENSION", currentFileExtension_tFileList_1);
      globalMap.put("tFileList_1_NB_FILE", NB_FILEtFileList_1);
      
 



/**
 * [tFileList_1 begin ] stop
 */
	
	/**
	 * [tFileList_1 main ] start
	 */

	

	
	
	currentComponent="tFileList_1";

	

 


	tos_count_tFileList_1++;

/**
 * [tFileList_1 main ] stop
 */
	
	/**
	 * [tFileList_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileList_1";

	

 



/**
 * [tFileList_1 process_data_begin ] stop
 */
	
	/**
	 * [tFileList_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileList_1";

	

 



/**
 * [tFileList_1 process_data_end ] stop
 */
	
	/**
	 * [tFileList_1 end ] start
	 */

	

	
	
	currentComponent="tFileList_1";

	

  
    }
  globalMap.put("tFileList_1_NB_FILE", NB_FILEtFileList_1);
  

  
 

 

ok_Hash.put("tFileList_1", true);
end_Hash.put("tFileList_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
				}
				tDBConnection_1Process(globalMap);



/**
 * [tFileList_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFileList_1 finally ] start
	 */

	

	
	
	currentComponent="tFileList_1";

	

 



/**
 * [tFileList_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileList_1_SUBPROCESS_STATE", 1);
	}
	

public void tDie_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDie_1_SUBPROCESS_STATE", 0);

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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDie_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDie_1", false);
		start_Hash.put("tDie_1", System.currentTimeMillis());
		
	
	currentComponent="tDie_1";

	
		int tos_count_tDie_1 = 0;
		

 



/**
 * [tDie_1 begin ] stop
 */
	
	/**
	 * [tDie_1 main ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

	try {
	globalMap.put("tDie_1_DIE_PRIORITY", 5);
	System.err.println("Le répertoire du jour" + TalendDate.getDate("YYYYMMDD") + "n'existe pas");
	
	globalMap.put("tDie_1_DIE_MESSAGE", "Le répertoire du jour" + TalendDate.getDate("YYYYMMDD") + "n'existe pas");
	globalMap.put("tDie_1_DIE_MESSAGES", "Le répertoire du jour" + TalendDate.getDate("YYYYMMDD") + "n'existe pas");
	
	} catch (Exception | Error e_tDie_1) {
	    globalMap.put("tDie_1_ERROR_MESSAGE",e_tDie_1.getMessage());
		logIgnoredError(String.format("tDie_1 - tDie failed to log message due to internal error: %s", e_tDie_1), e_tDie_1);
	}
	
	currentComponent = "tDie_1";
	status = "failure";
        errorCode = new Integer(4);
        globalMap.put("tDie_1_DIE_CODE", errorCode);        
    
	
	System.exit(4);

 


	tos_count_tDie_1++;

/**
 * [tDie_1 main ] stop
 */
	
	/**
	 * [tDie_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 



/**
 * [tDie_1 process_data_begin ] stop
 */
	
	/**
	 * [tDie_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 



/**
 * [tDie_1 process_data_end ] stop
 */
	
	/**
	 * [tDie_1 end ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 

ok_Hash.put("tDie_1", true);
end_Hash.put("tDie_1", System.currentTimeMillis());




/**
 * [tDie_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDie_1 finally ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 



/**
 * [tDie_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDie_1_SUBPROCESS_STATE", 1);
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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBConnection_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBConnection_1", false);
		start_Hash.put("tDBConnection_1", System.currentTimeMillis());
		
	
	currentComponent="tDBConnection_1";

	
		int tos_count_tDBConnection_1 = 0;
		


	
            String dbProperties_tDBConnection_1 = context.additionalParam;
            String url_tDBConnection_1 = "jdbc:postgresql://"+context.serverName+":"+context.port+"/"+context.database;
            
            if(dbProperties_tDBConnection_1 != null && !"".equals(dbProperties_tDBConnection_1.trim())) {
                url_tDBConnection_1 = url_tDBConnection_1 + "?" + dbProperties_tDBConnection_1;
            }
	String dbUser_tDBConnection_1 = context.utilisateur;
	
	
		
	final String decryptedPassword_tDBConnection_1 = context.password; 
		String dbPwd_tDBConnection_1 = decryptedPassword_tDBConnection_1;
	
	
	java.sql.Connection conn_tDBConnection_1 = null;
	
        java.util.Enumeration<java.sql.Driver> drivers_tDBConnection_1 =  java.sql.DriverManager.getDrivers();
        java.util.Set<String> redShiftDriverNames_tDBConnection_1 = new java.util.HashSet<String>(java.util.Arrays
                .asList("com.amazon.redshift.jdbc.Driver","com.amazon.redshift.jdbc41.Driver","com.amazon.redshift.jdbc42.Driver"));
    while (drivers_tDBConnection_1.hasMoreElements()) {
        java.sql.Driver d_tDBConnection_1 = drivers_tDBConnection_1.nextElement();
        if (redShiftDriverNames_tDBConnection_1.contains(d_tDBConnection_1.getClass().getName())) {
            try {
                java.sql.DriverManager.deregisterDriver(d_tDBConnection_1);
                java.sql.DriverManager.registerDriver(d_tDBConnection_1);
            } catch (java.lang.Exception e_tDBConnection_1) {
globalMap.put("tDBConnection_1_ERROR_MESSAGE",e_tDBConnection_1.getMessage());
                    //do nothing
            }
        }
    }
	
			String sharedConnectionName_tDBConnection_1 = "VENTE_ODS";
			conn_tDBConnection_1 = SharedDBConnection.getDBConnection("org.postgresql.Driver",url_tDBConnection_1,dbUser_tDBConnection_1 , dbPwd_tDBConnection_1 , sharedConnectionName_tDBConnection_1);
			globalMap.put("conn_tDBConnection_1", conn_tDBConnection_1);
	if (null != conn_tDBConnection_1) {
		
			conn_tDBConnection_1.setAutoCommit(false);
	}

	globalMap.put("schema_" + "tDBConnection_1",context.schema_ods);

 



/**
 * [tDBConnection_1 begin ] stop
 */
	
	/**
	 * [tDBConnection_1 main ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 


	tos_count_tDBConnection_1++;

/**
 * [tDBConnection_1 main ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 



/**
 * [tDBConnection_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 



/**
 * [tDBConnection_1 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_1 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 

ok_Hash.put("tDBConnection_1", true);
end_Hash.put("tDBConnection_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
				}
				tJava_1Process(globalMap);



/**
 * [tDBConnection_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBConnection_1 finally ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 



/**
 * [tDBConnection_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 1);
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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tJava_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tJava_1", false);
		start_Hash.put("tJava_1", System.currentTimeMillis());
		
	
	currentComponent="tJava_1";

	
		int tos_count_tJava_1 = 0;
		


System.out.println("-----------------------------------------------------------------------------");
System.out.println("Début d'exécution du job "+jobName+ "        : " + 
TalendDate.formatDate("yyyy-MM-dd HH:mm:ss",new java.util.Date(((Long)globalMap.get("tChronometerStart_1_STARTTIME"))))
);
System.out.println("-----------------------------------------------------------------------------");

 



/**
 * [tJava_1 begin ] stop
 */
	
	/**
	 * [tJava_1 main ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 


	tos_count_tJava_1++;

/**
 * [tJava_1 main ] stop
 */
	
	/**
	 * [tJava_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 process_data_begin ] stop
 */
	
	/**
	 * [tJava_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 process_data_end ] stop
 */
	
	/**
	 * [tJava_1 end ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 

ok_Hash.put("tJava_1", true);
end_Hash.put("tJava_1", System.currentTimeMillis());




/**
 * [tJava_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tJava_1 finally ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJava_1_SUBPROCESS_STATE", 1);
	}
	

public void tRunJob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tRunJob_1_SUBPROCESS_STATE", 0);

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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tRunJob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tRunJob_1", false);
		start_Hash.put("tRunJob_1", System.currentTimeMillis());
		
	
	currentComponent="tRunJob_1";

	
		int tos_count_tRunJob_1 = 0;
		


 



/**
 * [tRunJob_1 begin ] stop
 */
	
	/**
	 * [tRunJob_1 main ] start
	 */

	

	
	
	currentComponent="tRunJob_1";

	
	java.util.List<String> paraList_tRunJob_1 = new java.util.ArrayList<String>();
	
	        				paraList_tRunJob_1.add("--father_pid="+pid);
	      			
	        				paraList_tRunJob_1.add("--root_pid="+rootPid);
	      			
	        				paraList_tRunJob_1.add("--father_node=tRunJob_1");
	      			
	        				paraList_tRunJob_1.add("--context=Default");
	      			
		if(enableLogStash){
			paraList_tRunJob_1.add("--audit.enabled="+enableLogStash);
		}
		
	//for feature:10589
	
		paraList_tRunJob_1.add("--stat_port=" + portStats);
	

	if(resuming_logs_dir_path != null){
		paraList_tRunJob_1.add("--resuming_logs_dir_path=" + resuming_logs_dir_path);
	}
	String childResumePath_tRunJob_1 = ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path);
	String tRunJobName_tRunJob_1 = ResumeUtil.getRighttRunJob(resuming_checkpoint_path);
	if("tRunJob_1".equals(tRunJobName_tRunJob_1) && childResumePath_tRunJob_1 != null){
		paraList_tRunJob_1.add("--resuming_checkpoint_path=" + ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path));
	}
	paraList_tRunJob_1.add("--parent_part_launcher=JOB:" + jobName + "/NODE:tRunJob_1");
	
	java.util.Map<String, Object> parentContextMap_tRunJob_1 = new java.util.HashMap<String, Object>();

	
		
		context.synchronizeContext();
            class ContextProcessor_tRunJob_1 {
                    private void transmitContext_0() {
                    parentContextMap_tRunJob_1.put("schema_ods", context.schema_ods);
                    paraList_tRunJob_1.add("--context_type " + "schema_ods" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("additionalParam", context.additionalParam);
                    paraList_tRunJob_1.add("--context_type " + "additionalParam" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("database", context.database);
                    paraList_tRunJob_1.add("--context_type " + "database" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("password", context.password);
                    paraList_tRunJob_1.add("--context_type " + "password" + "=" + "id_Password");
                    parentContextMap_tRunJob_1.put("port", context.port);
                    paraList_tRunJob_1.add("--context_type " + "port" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("schema_param", context.schema_param);
                    paraList_tRunJob_1.add("--context_type " + "schema_param" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("serverName", context.serverName);
                    paraList_tRunJob_1.add("--context_type " + "serverName" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("utilisateur", context.utilisateur);
                    paraList_tRunJob_1.add("--context_type " + "utilisateur" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("encodage", context.encodage);
                    paraList_tRunJob_1.add("--context_type " + "encodage" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("fieldSeparator", context.fieldSeparator);
                    paraList_tRunJob_1.add("--context_type " + "fieldSeparator" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("projectFolder", context.projectFolder);
                    paraList_tRunJob_1.add("--context_type " + "projectFolder" + "=" + "id_Directory");
                        }
                    public void transmitAllContext() {
                        transmitContext_0();
                    }
            }
            new ContextProcessor_tRunJob_1().transmitAllContext();
		java.util.Enumeration<?> propertyNames_tRunJob_1 = context.propertyNames();
		while (propertyNames_tRunJob_1.hasMoreElements()) {
			String key_tRunJob_1 = (String) propertyNames_tRunJob_1.nextElement();
			Object value_tRunJob_1 = (Object) context.get(key_tRunJob_1);
			if(value_tRunJob_1!=null) {  
				paraList_tRunJob_1.add("--context_param " + key_tRunJob_1 + "=" + value_tRunJob_1);
			} else {
				paraList_tRunJob_1.add("--context_param " + key_tRunJob_1 + "=" + NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY);
			}
			
		}
		

	Object obj_tRunJob_1 = null;

	
	
		icommerce_reporting.jodscategorie_0_1.jOdsCategorie childJob_tRunJob_1 = new icommerce_reporting.jodscategorie_0_1.jOdsCategorie();
	    // pass DataSources
	    java.util.Map<String, routines.system.TalendDataSource> talendDataSources_tRunJob_1 = (java.util.Map<String, routines.system.TalendDataSource>) globalMap
	            .get(KEY_DB_DATASOURCES);
	    if (null != talendDataSources_tRunJob_1) {
	        java.util.Map<String, javax.sql.DataSource> dataSources_tRunJob_1 = new java.util.HashMap<String, javax.sql.DataSource>();
	        for (java.util.Map.Entry<String, routines.system.TalendDataSource> talendDataSourceEntry_tRunJob_1 : talendDataSources_tRunJob_1
			        .entrySet()) {
	            dataSources_tRunJob_1.put(talendDataSourceEntry_tRunJob_1.getKey(),
	                    talendDataSourceEntry_tRunJob_1.getValue().getRawDataSource());
	        }
	        childJob_tRunJob_1.setDataSources(dataSources_tRunJob_1);
	    }
		  
			childJob_tRunJob_1.parentContextMap = parentContextMap_tRunJob_1;
		  
		
		String[][] childReturn_tRunJob_1 = childJob_tRunJob_1.runJob((String[]) paraList_tRunJob_1.toArray(new String[paraList_tRunJob_1.size()]));
		
            if(childJob_tRunJob_1.getErrorCode() == null){
                globalMap.put("tRunJob_1_CHILD_RETURN_CODE", childJob_tRunJob_1.getStatus() != null && ("failure").equals(childJob_tRunJob_1.getStatus()) ? 1 : 0);
            }else{
                globalMap.put("tRunJob_1_CHILD_RETURN_CODE", childJob_tRunJob_1.getErrorCode());
            }
            if (childJob_tRunJob_1.getExceptionStackTrace() != null) {
                globalMap.put("tRunJob_1_CHILD_EXCEPTION_STACKTRACE", childJob_tRunJob_1.getExceptionStackTrace());
            }
                    errorCode = childJob_tRunJob_1.getErrorCode();
                if (childJob_tRunJob_1.getErrorCode() != null || ("failure").equals(childJob_tRunJob_1.getStatus())) {
                    java.lang.Exception ce_tRunJob_1 = childJob_tRunJob_1.getException();
                    throw new RuntimeException("Child job running failed.\n" + ((ce_tRunJob_1!=null) ? (ce_tRunJob_1.getClass().getName() + ": " + ce_tRunJob_1.getMessage()) : ""));
                }

 


	tos_count_tRunJob_1++;

/**
 * [tRunJob_1 main ] stop
 */
	
	/**
	 * [tRunJob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tRunJob_1";

	

 



/**
 * [tRunJob_1 process_data_begin ] stop
 */
	
	/**
	 * [tRunJob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tRunJob_1";

	

 



/**
 * [tRunJob_1 process_data_end ] stop
 */
	
	/**
	 * [tRunJob_1 end ] start
	 */

	

	
	
	currentComponent="tRunJob_1";

	

 

ok_Hash.put("tRunJob_1", true);
end_Hash.put("tRunJob_1", System.currentTimeMillis());




/**
 * [tRunJob_1 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tRunJob_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk1", 0, "ok");
								} 
							
							tRunJob_2Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tRunJob_1 finally ] start
	 */

	

	
	
	currentComponent="tRunJob_1";

	

 



/**
 * [tRunJob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tRunJob_1_SUBPROCESS_STATE", 1);
	}
	

public void tRunJob_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tRunJob_2_SUBPROCESS_STATE", 0);

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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tRunJob_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tRunJob_2", false);
		start_Hash.put("tRunJob_2", System.currentTimeMillis());
		
	
	currentComponent="tRunJob_2";

	
		int tos_count_tRunJob_2 = 0;
		


 



/**
 * [tRunJob_2 begin ] stop
 */
	
	/**
	 * [tRunJob_2 main ] start
	 */

	

	
	
	currentComponent="tRunJob_2";

	
	java.util.List<String> paraList_tRunJob_2 = new java.util.ArrayList<String>();
	
	        				paraList_tRunJob_2.add("--father_pid="+pid);
	      			
	        				paraList_tRunJob_2.add("--root_pid="+rootPid);
	      			
	        				paraList_tRunJob_2.add("--father_node=tRunJob_2");
	      			
	        				paraList_tRunJob_2.add("--context=Default");
	      			
		if(enableLogStash){
			paraList_tRunJob_2.add("--audit.enabled="+enableLogStash);
		}
		
	//for feature:10589
	
		paraList_tRunJob_2.add("--stat_port=" + portStats);
	

	if(resuming_logs_dir_path != null){
		paraList_tRunJob_2.add("--resuming_logs_dir_path=" + resuming_logs_dir_path);
	}
	String childResumePath_tRunJob_2 = ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path);
	String tRunJobName_tRunJob_2 = ResumeUtil.getRighttRunJob(resuming_checkpoint_path);
	if("tRunJob_2".equals(tRunJobName_tRunJob_2) && childResumePath_tRunJob_2 != null){
		paraList_tRunJob_2.add("--resuming_checkpoint_path=" + ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path));
	}
	paraList_tRunJob_2.add("--parent_part_launcher=JOB:" + jobName + "/NODE:tRunJob_2");
	
	java.util.Map<String, Object> parentContextMap_tRunJob_2 = new java.util.HashMap<String, Object>();

	
		
		context.synchronizeContext();
            class ContextProcessor_tRunJob_2 {
                    private void transmitContext_0() {
                    parentContextMap_tRunJob_2.put("schema_ods", context.schema_ods);
                    paraList_tRunJob_2.add("--context_type " + "schema_ods" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("additionalParam", context.additionalParam);
                    paraList_tRunJob_2.add("--context_type " + "additionalParam" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("database", context.database);
                    paraList_tRunJob_2.add("--context_type " + "database" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("password", context.password);
                    paraList_tRunJob_2.add("--context_type " + "password" + "=" + "id_Password");
                    parentContextMap_tRunJob_2.put("port", context.port);
                    paraList_tRunJob_2.add("--context_type " + "port" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("schema_param", context.schema_param);
                    paraList_tRunJob_2.add("--context_type " + "schema_param" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("serverName", context.serverName);
                    paraList_tRunJob_2.add("--context_type " + "serverName" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("utilisateur", context.utilisateur);
                    paraList_tRunJob_2.add("--context_type " + "utilisateur" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("encodage", context.encodage);
                    paraList_tRunJob_2.add("--context_type " + "encodage" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("fieldSeparator", context.fieldSeparator);
                    paraList_tRunJob_2.add("--context_type " + "fieldSeparator" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("projectFolder", context.projectFolder);
                    paraList_tRunJob_2.add("--context_type " + "projectFolder" + "=" + "id_Directory");
                        }
                    public void transmitAllContext() {
                        transmitContext_0();
                    }
            }
            new ContextProcessor_tRunJob_2().transmitAllContext();
		java.util.Enumeration<?> propertyNames_tRunJob_2 = context.propertyNames();
		while (propertyNames_tRunJob_2.hasMoreElements()) {
			String key_tRunJob_2 = (String) propertyNames_tRunJob_2.nextElement();
			Object value_tRunJob_2 = (Object) context.get(key_tRunJob_2);
			if(value_tRunJob_2!=null) {  
				paraList_tRunJob_2.add("--context_param " + key_tRunJob_2 + "=" + value_tRunJob_2);
			} else {
				paraList_tRunJob_2.add("--context_param " + key_tRunJob_2 + "=" + NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY);
			}
			
		}
		

	Object obj_tRunJob_2 = null;

	
	
		icommerce_reporting.jodssouscategorie_0_1.jOdsSousCategorie childJob_tRunJob_2 = new icommerce_reporting.jodssouscategorie_0_1.jOdsSousCategorie();
	    // pass DataSources
	    java.util.Map<String, routines.system.TalendDataSource> talendDataSources_tRunJob_2 = (java.util.Map<String, routines.system.TalendDataSource>) globalMap
	            .get(KEY_DB_DATASOURCES);
	    if (null != talendDataSources_tRunJob_2) {
	        java.util.Map<String, javax.sql.DataSource> dataSources_tRunJob_2 = new java.util.HashMap<String, javax.sql.DataSource>();
	        for (java.util.Map.Entry<String, routines.system.TalendDataSource> talendDataSourceEntry_tRunJob_2 : talendDataSources_tRunJob_2
			        .entrySet()) {
	            dataSources_tRunJob_2.put(talendDataSourceEntry_tRunJob_2.getKey(),
	                    talendDataSourceEntry_tRunJob_2.getValue().getRawDataSource());
	        }
	        childJob_tRunJob_2.setDataSources(dataSources_tRunJob_2);
	    }
		  
			childJob_tRunJob_2.parentContextMap = parentContextMap_tRunJob_2;
		  
		
		String[][] childReturn_tRunJob_2 = childJob_tRunJob_2.runJob((String[]) paraList_tRunJob_2.toArray(new String[paraList_tRunJob_2.size()]));
		
            if(childJob_tRunJob_2.getErrorCode() == null){
                globalMap.put("tRunJob_2_CHILD_RETURN_CODE", childJob_tRunJob_2.getStatus() != null && ("failure").equals(childJob_tRunJob_2.getStatus()) ? 1 : 0);
            }else{
                globalMap.put("tRunJob_2_CHILD_RETURN_CODE", childJob_tRunJob_2.getErrorCode());
            }
            if (childJob_tRunJob_2.getExceptionStackTrace() != null) {
                globalMap.put("tRunJob_2_CHILD_EXCEPTION_STACKTRACE", childJob_tRunJob_2.getExceptionStackTrace());
            }
                    errorCode = childJob_tRunJob_2.getErrorCode();
                if (childJob_tRunJob_2.getErrorCode() != null || ("failure").equals(childJob_tRunJob_2.getStatus())) {
                    java.lang.Exception ce_tRunJob_2 = childJob_tRunJob_2.getException();
                    throw new RuntimeException("Child job running failed.\n" + ((ce_tRunJob_2!=null) ? (ce_tRunJob_2.getClass().getName() + ": " + ce_tRunJob_2.getMessage()) : ""));
                }

 


	tos_count_tRunJob_2++;

/**
 * [tRunJob_2 main ] stop
 */
	
	/**
	 * [tRunJob_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tRunJob_2";

	

 



/**
 * [tRunJob_2 process_data_begin ] stop
 */
	
	/**
	 * [tRunJob_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tRunJob_2";

	

 



/**
 * [tRunJob_2 process_data_end ] stop
 */
	
	/**
	 * [tRunJob_2 end ] start
	 */

	

	
	
	currentComponent="tRunJob_2";

	

 

ok_Hash.put("tRunJob_2", true);
end_Hash.put("tRunJob_2", System.currentTimeMillis());




/**
 * [tRunJob_2 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tRunJob_2:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk2", 0, "ok");
								} 
							
							tRunJob_3Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tRunJob_2 finally ] start
	 */

	

	
	
	currentComponent="tRunJob_2";

	

 



/**
 * [tRunJob_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tRunJob_2_SUBPROCESS_STATE", 1);
	}
	

public void tRunJob_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tRunJob_3_SUBPROCESS_STATE", 0);

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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tRunJob_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tRunJob_3", false);
		start_Hash.put("tRunJob_3", System.currentTimeMillis());
		
	
	currentComponent="tRunJob_3";

	
		int tos_count_tRunJob_3 = 0;
		


 



/**
 * [tRunJob_3 begin ] stop
 */
	
	/**
	 * [tRunJob_3 main ] start
	 */

	

	
	
	currentComponent="tRunJob_3";

	
	java.util.List<String> paraList_tRunJob_3 = new java.util.ArrayList<String>();
	
	        				paraList_tRunJob_3.add("--father_pid="+pid);
	      			
	        				paraList_tRunJob_3.add("--root_pid="+rootPid);
	      			
	        				paraList_tRunJob_3.add("--father_node=tRunJob_3");
	      			
	        				paraList_tRunJob_3.add("--context=Default");
	      			
		if(enableLogStash){
			paraList_tRunJob_3.add("--audit.enabled="+enableLogStash);
		}
		
	//for feature:10589
	
		paraList_tRunJob_3.add("--stat_port=" + portStats);
	

	if(resuming_logs_dir_path != null){
		paraList_tRunJob_3.add("--resuming_logs_dir_path=" + resuming_logs_dir_path);
	}
	String childResumePath_tRunJob_3 = ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path);
	String tRunJobName_tRunJob_3 = ResumeUtil.getRighttRunJob(resuming_checkpoint_path);
	if("tRunJob_3".equals(tRunJobName_tRunJob_3) && childResumePath_tRunJob_3 != null){
		paraList_tRunJob_3.add("--resuming_checkpoint_path=" + ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path));
	}
	paraList_tRunJob_3.add("--parent_part_launcher=JOB:" + jobName + "/NODE:tRunJob_3");
	
	java.util.Map<String, Object> parentContextMap_tRunJob_3 = new java.util.HashMap<String, Object>();

	
		
		context.synchronizeContext();
            class ContextProcessor_tRunJob_3 {
                    private void transmitContext_0() {
                    parentContextMap_tRunJob_3.put("schema_ods", context.schema_ods);
                    paraList_tRunJob_3.add("--context_type " + "schema_ods" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("additionalParam", context.additionalParam);
                    paraList_tRunJob_3.add("--context_type " + "additionalParam" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("database", context.database);
                    paraList_tRunJob_3.add("--context_type " + "database" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("password", context.password);
                    paraList_tRunJob_3.add("--context_type " + "password" + "=" + "id_Password");
                    parentContextMap_tRunJob_3.put("port", context.port);
                    paraList_tRunJob_3.add("--context_type " + "port" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("schema_param", context.schema_param);
                    paraList_tRunJob_3.add("--context_type " + "schema_param" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("serverName", context.serverName);
                    paraList_tRunJob_3.add("--context_type " + "serverName" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("utilisateur", context.utilisateur);
                    paraList_tRunJob_3.add("--context_type " + "utilisateur" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("encodage", context.encodage);
                    paraList_tRunJob_3.add("--context_type " + "encodage" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("fieldSeparator", context.fieldSeparator);
                    paraList_tRunJob_3.add("--context_type " + "fieldSeparator" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("projectFolder", context.projectFolder);
                    paraList_tRunJob_3.add("--context_type " + "projectFolder" + "=" + "id_Directory");
                        }
                    public void transmitAllContext() {
                        transmitContext_0();
                    }
            }
            new ContextProcessor_tRunJob_3().transmitAllContext();
		java.util.Enumeration<?> propertyNames_tRunJob_3 = context.propertyNames();
		while (propertyNames_tRunJob_3.hasMoreElements()) {
			String key_tRunJob_3 = (String) propertyNames_tRunJob_3.nextElement();
			Object value_tRunJob_3 = (Object) context.get(key_tRunJob_3);
			if(value_tRunJob_3!=null) {  
				paraList_tRunJob_3.add("--context_param " + key_tRunJob_3 + "=" + value_tRunJob_3);
			} else {
				paraList_tRunJob_3.add("--context_param " + key_tRunJob_3 + "=" + NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY);
			}
			
		}
		

	Object obj_tRunJob_3 = null;

	
	
		icommerce_reporting.jodsproduit_0_1.jOdsProduit childJob_tRunJob_3 = new icommerce_reporting.jodsproduit_0_1.jOdsProduit();
	    // pass DataSources
	    java.util.Map<String, routines.system.TalendDataSource> talendDataSources_tRunJob_3 = (java.util.Map<String, routines.system.TalendDataSource>) globalMap
	            .get(KEY_DB_DATASOURCES);
	    if (null != talendDataSources_tRunJob_3) {
	        java.util.Map<String, javax.sql.DataSource> dataSources_tRunJob_3 = new java.util.HashMap<String, javax.sql.DataSource>();
	        for (java.util.Map.Entry<String, routines.system.TalendDataSource> talendDataSourceEntry_tRunJob_3 : talendDataSources_tRunJob_3
			        .entrySet()) {
	            dataSources_tRunJob_3.put(talendDataSourceEntry_tRunJob_3.getKey(),
	                    talendDataSourceEntry_tRunJob_3.getValue().getRawDataSource());
	        }
	        childJob_tRunJob_3.setDataSources(dataSources_tRunJob_3);
	    }
		  
			childJob_tRunJob_3.parentContextMap = parentContextMap_tRunJob_3;
		  
		
		String[][] childReturn_tRunJob_3 = childJob_tRunJob_3.runJob((String[]) paraList_tRunJob_3.toArray(new String[paraList_tRunJob_3.size()]));
		
            if(childJob_tRunJob_3.getErrorCode() == null){
                globalMap.put("tRunJob_3_CHILD_RETURN_CODE", childJob_tRunJob_3.getStatus() != null && ("failure").equals(childJob_tRunJob_3.getStatus()) ? 1 : 0);
            }else{
                globalMap.put("tRunJob_3_CHILD_RETURN_CODE", childJob_tRunJob_3.getErrorCode());
            }
            if (childJob_tRunJob_3.getExceptionStackTrace() != null) {
                globalMap.put("tRunJob_3_CHILD_EXCEPTION_STACKTRACE", childJob_tRunJob_3.getExceptionStackTrace());
            }
                    errorCode = childJob_tRunJob_3.getErrorCode();
                if (childJob_tRunJob_3.getErrorCode() != null || ("failure").equals(childJob_tRunJob_3.getStatus())) {
                    java.lang.Exception ce_tRunJob_3 = childJob_tRunJob_3.getException();
                    throw new RuntimeException("Child job running failed.\n" + ((ce_tRunJob_3!=null) ? (ce_tRunJob_3.getClass().getName() + ": " + ce_tRunJob_3.getMessage()) : ""));
                }

 


	tos_count_tRunJob_3++;

/**
 * [tRunJob_3 main ] stop
 */
	
	/**
	 * [tRunJob_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tRunJob_3";

	

 



/**
 * [tRunJob_3 process_data_begin ] stop
 */
	
	/**
	 * [tRunJob_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tRunJob_3";

	

 



/**
 * [tRunJob_3 process_data_end ] stop
 */
	
	/**
	 * [tRunJob_3 end ] start
	 */

	

	
	
	currentComponent="tRunJob_3";

	

 

ok_Hash.put("tRunJob_3", true);
end_Hash.put("tRunJob_3", System.currentTimeMillis());




/**
 * [tRunJob_3 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tRunJob_3:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk3", 0, "ok");
								} 
							
							tRunJob_4Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tRunJob_3 finally ] start
	 */

	

	
	
	currentComponent="tRunJob_3";

	

 



/**
 * [tRunJob_3 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tRunJob_3_SUBPROCESS_STATE", 1);
	}
	

public void tRunJob_4Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tRunJob_4_SUBPROCESS_STATE", 0);

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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tRunJob_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tRunJob_4", false);
		start_Hash.put("tRunJob_4", System.currentTimeMillis());
		
	
	currentComponent="tRunJob_4";

	
		int tos_count_tRunJob_4 = 0;
		


 



/**
 * [tRunJob_4 begin ] stop
 */
	
	/**
	 * [tRunJob_4 main ] start
	 */

	

	
	
	currentComponent="tRunJob_4";

	
	java.util.List<String> paraList_tRunJob_4 = new java.util.ArrayList<String>();
	
	        				paraList_tRunJob_4.add("--father_pid="+pid);
	      			
	        				paraList_tRunJob_4.add("--root_pid="+rootPid);
	      			
	        				paraList_tRunJob_4.add("--father_node=tRunJob_4");
	      			
	        				paraList_tRunJob_4.add("--context=Default");
	      			
		if(enableLogStash){
			paraList_tRunJob_4.add("--audit.enabled="+enableLogStash);
		}
		
	//for feature:10589
	
		paraList_tRunJob_4.add("--stat_port=" + portStats);
	

	if(resuming_logs_dir_path != null){
		paraList_tRunJob_4.add("--resuming_logs_dir_path=" + resuming_logs_dir_path);
	}
	String childResumePath_tRunJob_4 = ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path);
	String tRunJobName_tRunJob_4 = ResumeUtil.getRighttRunJob(resuming_checkpoint_path);
	if("tRunJob_4".equals(tRunJobName_tRunJob_4) && childResumePath_tRunJob_4 != null){
		paraList_tRunJob_4.add("--resuming_checkpoint_path=" + ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path));
	}
	paraList_tRunJob_4.add("--parent_part_launcher=JOB:" + jobName + "/NODE:tRunJob_4");
	
	java.util.Map<String, Object> parentContextMap_tRunJob_4 = new java.util.HashMap<String, Object>();

	
		
		context.synchronizeContext();
            class ContextProcessor_tRunJob_4 {
                    private void transmitContext_0() {
                    parentContextMap_tRunJob_4.put("schema_ods", context.schema_ods);
                    paraList_tRunJob_4.add("--context_type " + "schema_ods" + "=" + "id_String");
                    parentContextMap_tRunJob_4.put("additionalParam", context.additionalParam);
                    paraList_tRunJob_4.add("--context_type " + "additionalParam" + "=" + "id_String");
                    parentContextMap_tRunJob_4.put("database", context.database);
                    paraList_tRunJob_4.add("--context_type " + "database" + "=" + "id_String");
                    parentContextMap_tRunJob_4.put("password", context.password);
                    paraList_tRunJob_4.add("--context_type " + "password" + "=" + "id_Password");
                    parentContextMap_tRunJob_4.put("port", context.port);
                    paraList_tRunJob_4.add("--context_type " + "port" + "=" + "id_String");
                    parentContextMap_tRunJob_4.put("schema_param", context.schema_param);
                    paraList_tRunJob_4.add("--context_type " + "schema_param" + "=" + "id_String");
                    parentContextMap_tRunJob_4.put("serverName", context.serverName);
                    paraList_tRunJob_4.add("--context_type " + "serverName" + "=" + "id_String");
                    parentContextMap_tRunJob_4.put("utilisateur", context.utilisateur);
                    paraList_tRunJob_4.add("--context_type " + "utilisateur" + "=" + "id_String");
                    parentContextMap_tRunJob_4.put("encodage", context.encodage);
                    paraList_tRunJob_4.add("--context_type " + "encodage" + "=" + "id_String");
                    parentContextMap_tRunJob_4.put("fieldSeparator", context.fieldSeparator);
                    paraList_tRunJob_4.add("--context_type " + "fieldSeparator" + "=" + "id_String");
                    parentContextMap_tRunJob_4.put("projectFolder", context.projectFolder);
                    paraList_tRunJob_4.add("--context_type " + "projectFolder" + "=" + "id_Directory");
                        }
                    public void transmitAllContext() {
                        transmitContext_0();
                    }
            }
            new ContextProcessor_tRunJob_4().transmitAllContext();
		java.util.Enumeration<?> propertyNames_tRunJob_4 = context.propertyNames();
		while (propertyNames_tRunJob_4.hasMoreElements()) {
			String key_tRunJob_4 = (String) propertyNames_tRunJob_4.nextElement();
			Object value_tRunJob_4 = (Object) context.get(key_tRunJob_4);
			if(value_tRunJob_4!=null) {  
				paraList_tRunJob_4.add("--context_param " + key_tRunJob_4 + "=" + value_tRunJob_4);
			} else {
				paraList_tRunJob_4.add("--context_param " + key_tRunJob_4 + "=" + NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY);
			}
			
		}
		

	Object obj_tRunJob_4 = null;

	
	
		icommerce_reporting.jodstypeclient_0_1.jOdsTypeClient childJob_tRunJob_4 = new icommerce_reporting.jodstypeclient_0_1.jOdsTypeClient();
	    // pass DataSources
	    java.util.Map<String, routines.system.TalendDataSource> talendDataSources_tRunJob_4 = (java.util.Map<String, routines.system.TalendDataSource>) globalMap
	            .get(KEY_DB_DATASOURCES);
	    if (null != talendDataSources_tRunJob_4) {
	        java.util.Map<String, javax.sql.DataSource> dataSources_tRunJob_4 = new java.util.HashMap<String, javax.sql.DataSource>();
	        for (java.util.Map.Entry<String, routines.system.TalendDataSource> talendDataSourceEntry_tRunJob_4 : talendDataSources_tRunJob_4
			        .entrySet()) {
	            dataSources_tRunJob_4.put(talendDataSourceEntry_tRunJob_4.getKey(),
	                    talendDataSourceEntry_tRunJob_4.getValue().getRawDataSource());
	        }
	        childJob_tRunJob_4.setDataSources(dataSources_tRunJob_4);
	    }
		  
			childJob_tRunJob_4.parentContextMap = parentContextMap_tRunJob_4;
		  
		
		String[][] childReturn_tRunJob_4 = childJob_tRunJob_4.runJob((String[]) paraList_tRunJob_4.toArray(new String[paraList_tRunJob_4.size()]));
		
            if(childJob_tRunJob_4.getErrorCode() == null){
                globalMap.put("tRunJob_4_CHILD_RETURN_CODE", childJob_tRunJob_4.getStatus() != null && ("failure").equals(childJob_tRunJob_4.getStatus()) ? 1 : 0);
            }else{
                globalMap.put("tRunJob_4_CHILD_RETURN_CODE", childJob_tRunJob_4.getErrorCode());
            }
            if (childJob_tRunJob_4.getExceptionStackTrace() != null) {
                globalMap.put("tRunJob_4_CHILD_EXCEPTION_STACKTRACE", childJob_tRunJob_4.getExceptionStackTrace());
            }
                    errorCode = childJob_tRunJob_4.getErrorCode();
                if (childJob_tRunJob_4.getErrorCode() != null || ("failure").equals(childJob_tRunJob_4.getStatus())) {
                    java.lang.Exception ce_tRunJob_4 = childJob_tRunJob_4.getException();
                    throw new RuntimeException("Child job running failed.\n" + ((ce_tRunJob_4!=null) ? (ce_tRunJob_4.getClass().getName() + ": " + ce_tRunJob_4.getMessage()) : ""));
                }

 


	tos_count_tRunJob_4++;

/**
 * [tRunJob_4 main ] stop
 */
	
	/**
	 * [tRunJob_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tRunJob_4";

	

 



/**
 * [tRunJob_4 process_data_begin ] stop
 */
	
	/**
	 * [tRunJob_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tRunJob_4";

	

 



/**
 * [tRunJob_4 process_data_end ] stop
 */
	
	/**
	 * [tRunJob_4 end ] start
	 */

	

	
	
	currentComponent="tRunJob_4";

	

 

ok_Hash.put("tRunJob_4", true);
end_Hash.put("tRunJob_4", System.currentTimeMillis());




/**
 * [tRunJob_4 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tRunJob_4:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk4", 0, "ok");
								} 
							
							tRunJob_5Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tRunJob_4 finally ] start
	 */

	

	
	
	currentComponent="tRunJob_4";

	

 



/**
 * [tRunJob_4 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tRunJob_4_SUBPROCESS_STATE", 1);
	}
	

public void tRunJob_5Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tRunJob_5_SUBPROCESS_STATE", 0);

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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tRunJob_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tRunJob_5", false);
		start_Hash.put("tRunJob_5", System.currentTimeMillis());
		
	
	currentComponent="tRunJob_5";

	
		int tos_count_tRunJob_5 = 0;
		


 



/**
 * [tRunJob_5 begin ] stop
 */
	
	/**
	 * [tRunJob_5 main ] start
	 */

	

	
	
	currentComponent="tRunJob_5";

	
	java.util.List<String> paraList_tRunJob_5 = new java.util.ArrayList<String>();
	
	        				paraList_tRunJob_5.add("--father_pid="+pid);
	      			
	        				paraList_tRunJob_5.add("--root_pid="+rootPid);
	      			
	        				paraList_tRunJob_5.add("--father_node=tRunJob_5");
	      			
	        				paraList_tRunJob_5.add("--context=Default");
	      			
		if(enableLogStash){
			paraList_tRunJob_5.add("--audit.enabled="+enableLogStash);
		}
		
	//for feature:10589
	
		paraList_tRunJob_5.add("--stat_port=" + portStats);
	

	if(resuming_logs_dir_path != null){
		paraList_tRunJob_5.add("--resuming_logs_dir_path=" + resuming_logs_dir_path);
	}
	String childResumePath_tRunJob_5 = ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path);
	String tRunJobName_tRunJob_5 = ResumeUtil.getRighttRunJob(resuming_checkpoint_path);
	if("tRunJob_5".equals(tRunJobName_tRunJob_5) && childResumePath_tRunJob_5 != null){
		paraList_tRunJob_5.add("--resuming_checkpoint_path=" + ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path));
	}
	paraList_tRunJob_5.add("--parent_part_launcher=JOB:" + jobName + "/NODE:tRunJob_5");
	
	java.util.Map<String, Object> parentContextMap_tRunJob_5 = new java.util.HashMap<String, Object>();

	
		
		context.synchronizeContext();
            class ContextProcessor_tRunJob_5 {
                    private void transmitContext_0() {
                    parentContextMap_tRunJob_5.put("schema_ods", context.schema_ods);
                    paraList_tRunJob_5.add("--context_type " + "schema_ods" + "=" + "id_String");
                    parentContextMap_tRunJob_5.put("additionalParam", context.additionalParam);
                    paraList_tRunJob_5.add("--context_type " + "additionalParam" + "=" + "id_String");
                    parentContextMap_tRunJob_5.put("database", context.database);
                    paraList_tRunJob_5.add("--context_type " + "database" + "=" + "id_String");
                    parentContextMap_tRunJob_5.put("password", context.password);
                    paraList_tRunJob_5.add("--context_type " + "password" + "=" + "id_Password");
                    parentContextMap_tRunJob_5.put("port", context.port);
                    paraList_tRunJob_5.add("--context_type " + "port" + "=" + "id_String");
                    parentContextMap_tRunJob_5.put("schema_param", context.schema_param);
                    paraList_tRunJob_5.add("--context_type " + "schema_param" + "=" + "id_String");
                    parentContextMap_tRunJob_5.put("serverName", context.serverName);
                    paraList_tRunJob_5.add("--context_type " + "serverName" + "=" + "id_String");
                    parentContextMap_tRunJob_5.put("utilisateur", context.utilisateur);
                    paraList_tRunJob_5.add("--context_type " + "utilisateur" + "=" + "id_String");
                    parentContextMap_tRunJob_5.put("encodage", context.encodage);
                    paraList_tRunJob_5.add("--context_type " + "encodage" + "=" + "id_String");
                    parentContextMap_tRunJob_5.put("fieldSeparator", context.fieldSeparator);
                    paraList_tRunJob_5.add("--context_type " + "fieldSeparator" + "=" + "id_String");
                    parentContextMap_tRunJob_5.put("projectFolder", context.projectFolder);
                    paraList_tRunJob_5.add("--context_type " + "projectFolder" + "=" + "id_Directory");
                        }
                    public void transmitAllContext() {
                        transmitContext_0();
                    }
            }
            new ContextProcessor_tRunJob_5().transmitAllContext();
		java.util.Enumeration<?> propertyNames_tRunJob_5 = context.propertyNames();
		while (propertyNames_tRunJob_5.hasMoreElements()) {
			String key_tRunJob_5 = (String) propertyNames_tRunJob_5.nextElement();
			Object value_tRunJob_5 = (Object) context.get(key_tRunJob_5);
			if(value_tRunJob_5!=null) {  
				paraList_tRunJob_5.add("--context_param " + key_tRunJob_5 + "=" + value_tRunJob_5);
			} else {
				paraList_tRunJob_5.add("--context_param " + key_tRunJob_5 + "=" + NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY);
			}
			
		}
		

	Object obj_tRunJob_5 = null;

	
	
		icommerce_reporting.jodsclient_0_1.jOdsClient childJob_tRunJob_5 = new icommerce_reporting.jodsclient_0_1.jOdsClient();
	    // pass DataSources
	    java.util.Map<String, routines.system.TalendDataSource> talendDataSources_tRunJob_5 = (java.util.Map<String, routines.system.TalendDataSource>) globalMap
	            .get(KEY_DB_DATASOURCES);
	    if (null != talendDataSources_tRunJob_5) {
	        java.util.Map<String, javax.sql.DataSource> dataSources_tRunJob_5 = new java.util.HashMap<String, javax.sql.DataSource>();
	        for (java.util.Map.Entry<String, routines.system.TalendDataSource> talendDataSourceEntry_tRunJob_5 : talendDataSources_tRunJob_5
			        .entrySet()) {
	            dataSources_tRunJob_5.put(talendDataSourceEntry_tRunJob_5.getKey(),
	                    talendDataSourceEntry_tRunJob_5.getValue().getRawDataSource());
	        }
	        childJob_tRunJob_5.setDataSources(dataSources_tRunJob_5);
	    }
		  
			childJob_tRunJob_5.parentContextMap = parentContextMap_tRunJob_5;
		  
		
		String[][] childReturn_tRunJob_5 = childJob_tRunJob_5.runJob((String[]) paraList_tRunJob_5.toArray(new String[paraList_tRunJob_5.size()]));
		
            if(childJob_tRunJob_5.getErrorCode() == null){
                globalMap.put("tRunJob_5_CHILD_RETURN_CODE", childJob_tRunJob_5.getStatus() != null && ("failure").equals(childJob_tRunJob_5.getStatus()) ? 1 : 0);
            }else{
                globalMap.put("tRunJob_5_CHILD_RETURN_CODE", childJob_tRunJob_5.getErrorCode());
            }
            if (childJob_tRunJob_5.getExceptionStackTrace() != null) {
                globalMap.put("tRunJob_5_CHILD_EXCEPTION_STACKTRACE", childJob_tRunJob_5.getExceptionStackTrace());
            }
                    errorCode = childJob_tRunJob_5.getErrorCode();
                if (childJob_tRunJob_5.getErrorCode() != null || ("failure").equals(childJob_tRunJob_5.getStatus())) {
                    java.lang.Exception ce_tRunJob_5 = childJob_tRunJob_5.getException();
                    throw new RuntimeException("Child job running failed.\n" + ((ce_tRunJob_5!=null) ? (ce_tRunJob_5.getClass().getName() + ": " + ce_tRunJob_5.getMessage()) : ""));
                }

 


	tos_count_tRunJob_5++;

/**
 * [tRunJob_5 main ] stop
 */
	
	/**
	 * [tRunJob_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tRunJob_5";

	

 



/**
 * [tRunJob_5 process_data_begin ] stop
 */
	
	/**
	 * [tRunJob_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tRunJob_5";

	

 



/**
 * [tRunJob_5 process_data_end ] stop
 */
	
	/**
	 * [tRunJob_5 end ] start
	 */

	

	
	
	currentComponent="tRunJob_5";

	

 

ok_Hash.put("tRunJob_5", true);
end_Hash.put("tRunJob_5", System.currentTimeMillis());




/**
 * [tRunJob_5 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tRunJob_5:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk5", 0, "ok");
								} 
							
							tRunJob_6Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tRunJob_5 finally ] start
	 */

	

	
	
	currentComponent="tRunJob_5";

	

 



/**
 * [tRunJob_5 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tRunJob_5_SUBPROCESS_STATE", 1);
	}
	

public void tRunJob_6Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tRunJob_6_SUBPROCESS_STATE", 0);

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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tRunJob_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tRunJob_6", false);
		start_Hash.put("tRunJob_6", System.currentTimeMillis());
		
	
	currentComponent="tRunJob_6";

	
		int tos_count_tRunJob_6 = 0;
		


 



/**
 * [tRunJob_6 begin ] stop
 */
	
	/**
	 * [tRunJob_6 main ] start
	 */

	

	
	
	currentComponent="tRunJob_6";

	
	java.util.List<String> paraList_tRunJob_6 = new java.util.ArrayList<String>();
	
	        				paraList_tRunJob_6.add("--father_pid="+pid);
	      			
	        				paraList_tRunJob_6.add("--root_pid="+rootPid);
	      			
	        				paraList_tRunJob_6.add("--father_node=tRunJob_6");
	      			
	        				paraList_tRunJob_6.add("--context=Default");
	      			
		if(enableLogStash){
			paraList_tRunJob_6.add("--audit.enabled="+enableLogStash);
		}
		
	//for feature:10589
	
		paraList_tRunJob_6.add("--stat_port=" + portStats);
	

	if(resuming_logs_dir_path != null){
		paraList_tRunJob_6.add("--resuming_logs_dir_path=" + resuming_logs_dir_path);
	}
	String childResumePath_tRunJob_6 = ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path);
	String tRunJobName_tRunJob_6 = ResumeUtil.getRighttRunJob(resuming_checkpoint_path);
	if("tRunJob_6".equals(tRunJobName_tRunJob_6) && childResumePath_tRunJob_6 != null){
		paraList_tRunJob_6.add("--resuming_checkpoint_path=" + ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path));
	}
	paraList_tRunJob_6.add("--parent_part_launcher=JOB:" + jobName + "/NODE:tRunJob_6");
	
	java.util.Map<String, Object> parentContextMap_tRunJob_6 = new java.util.HashMap<String, Object>();

	
		
		context.synchronizeContext();
            class ContextProcessor_tRunJob_6 {
                    private void transmitContext_0() {
                    parentContextMap_tRunJob_6.put("schema_ods", context.schema_ods);
                    paraList_tRunJob_6.add("--context_type " + "schema_ods" + "=" + "id_String");
                    parentContextMap_tRunJob_6.put("additionalParam", context.additionalParam);
                    paraList_tRunJob_6.add("--context_type " + "additionalParam" + "=" + "id_String");
                    parentContextMap_tRunJob_6.put("database", context.database);
                    paraList_tRunJob_6.add("--context_type " + "database" + "=" + "id_String");
                    parentContextMap_tRunJob_6.put("password", context.password);
                    paraList_tRunJob_6.add("--context_type " + "password" + "=" + "id_Password");
                    parentContextMap_tRunJob_6.put("port", context.port);
                    paraList_tRunJob_6.add("--context_type " + "port" + "=" + "id_String");
                    parentContextMap_tRunJob_6.put("schema_param", context.schema_param);
                    paraList_tRunJob_6.add("--context_type " + "schema_param" + "=" + "id_String");
                    parentContextMap_tRunJob_6.put("serverName", context.serverName);
                    paraList_tRunJob_6.add("--context_type " + "serverName" + "=" + "id_String");
                    parentContextMap_tRunJob_6.put("utilisateur", context.utilisateur);
                    paraList_tRunJob_6.add("--context_type " + "utilisateur" + "=" + "id_String");
                    parentContextMap_tRunJob_6.put("encodage", context.encodage);
                    paraList_tRunJob_6.add("--context_type " + "encodage" + "=" + "id_String");
                    parentContextMap_tRunJob_6.put("fieldSeparator", context.fieldSeparator);
                    paraList_tRunJob_6.add("--context_type " + "fieldSeparator" + "=" + "id_String");
                    parentContextMap_tRunJob_6.put("projectFolder", context.projectFolder);
                    paraList_tRunJob_6.add("--context_type " + "projectFolder" + "=" + "id_Directory");
                        }
                    public void transmitAllContext() {
                        transmitContext_0();
                    }
            }
            new ContextProcessor_tRunJob_6().transmitAllContext();
		java.util.Enumeration<?> propertyNames_tRunJob_6 = context.propertyNames();
		while (propertyNames_tRunJob_6.hasMoreElements()) {
			String key_tRunJob_6 = (String) propertyNames_tRunJob_6.nextElement();
			Object value_tRunJob_6 = (Object) context.get(key_tRunJob_6);
			if(value_tRunJob_6!=null) {  
				paraList_tRunJob_6.add("--context_param " + key_tRunJob_6 + "=" + value_tRunJob_6);
			} else {
				paraList_tRunJob_6.add("--context_param " + key_tRunJob_6 + "=" + NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY);
			}
			
		}
		

	Object obj_tRunJob_6 = null;

	
	
		icommerce_reporting.jodsvente_0_1.jOdsVente childJob_tRunJob_6 = new icommerce_reporting.jodsvente_0_1.jOdsVente();
	    // pass DataSources
	    java.util.Map<String, routines.system.TalendDataSource> talendDataSources_tRunJob_6 = (java.util.Map<String, routines.system.TalendDataSource>) globalMap
	            .get(KEY_DB_DATASOURCES);
	    if (null != talendDataSources_tRunJob_6) {
	        java.util.Map<String, javax.sql.DataSource> dataSources_tRunJob_6 = new java.util.HashMap<String, javax.sql.DataSource>();
	        for (java.util.Map.Entry<String, routines.system.TalendDataSource> talendDataSourceEntry_tRunJob_6 : talendDataSources_tRunJob_6
			        .entrySet()) {
	            dataSources_tRunJob_6.put(talendDataSourceEntry_tRunJob_6.getKey(),
	                    talendDataSourceEntry_tRunJob_6.getValue().getRawDataSource());
	        }
	        childJob_tRunJob_6.setDataSources(dataSources_tRunJob_6);
	    }
		  
			childJob_tRunJob_6.parentContextMap = parentContextMap_tRunJob_6;
		  
		
		String[][] childReturn_tRunJob_6 = childJob_tRunJob_6.runJob((String[]) paraList_tRunJob_6.toArray(new String[paraList_tRunJob_6.size()]));
		
            if(childJob_tRunJob_6.getErrorCode() == null){
                globalMap.put("tRunJob_6_CHILD_RETURN_CODE", childJob_tRunJob_6.getStatus() != null && ("failure").equals(childJob_tRunJob_6.getStatus()) ? 1 : 0);
            }else{
                globalMap.put("tRunJob_6_CHILD_RETURN_CODE", childJob_tRunJob_6.getErrorCode());
            }
            if (childJob_tRunJob_6.getExceptionStackTrace() != null) {
                globalMap.put("tRunJob_6_CHILD_EXCEPTION_STACKTRACE", childJob_tRunJob_6.getExceptionStackTrace());
            }
                    errorCode = childJob_tRunJob_6.getErrorCode();
                if (childJob_tRunJob_6.getErrorCode() != null || ("failure").equals(childJob_tRunJob_6.getStatus())) {
                    java.lang.Exception ce_tRunJob_6 = childJob_tRunJob_6.getException();
                    throw new RuntimeException("Child job running failed.\n" + ((ce_tRunJob_6!=null) ? (ce_tRunJob_6.getClass().getName() + ": " + ce_tRunJob_6.getMessage()) : ""));
                }

 


	tos_count_tRunJob_6++;

/**
 * [tRunJob_6 main ] stop
 */
	
	/**
	 * [tRunJob_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tRunJob_6";

	

 



/**
 * [tRunJob_6 process_data_begin ] stop
 */
	
	/**
	 * [tRunJob_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tRunJob_6";

	

 



/**
 * [tRunJob_6 process_data_end ] stop
 */
	
	/**
	 * [tRunJob_6 end ] start
	 */

	

	
	
	currentComponent="tRunJob_6";

	

 

ok_Hash.put("tRunJob_6", true);
end_Hash.put("tRunJob_6", System.currentTimeMillis());




/**
 * [tRunJob_6 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tRunJob_6 finally ] start
	 */

	

	
	
	currentComponent="tRunJob_6";

	

 



/**
 * [tRunJob_6 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tRunJob_6_SUBPROCESS_STATE", 1);
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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tPostjob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPostjob_1", false);
		start_Hash.put("tPostjob_1", System.currentTimeMillis());
		
	
	currentComponent="tPostjob_1";

	
		int tos_count_tPostjob_1 = 0;
		

 



/**
 * [tPostjob_1 begin ] stop
 */
	
	/**
	 * [tPostjob_1 main ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 


	tos_count_tPostjob_1++;

/**
 * [tPostjob_1 main ] stop
 */
	
	/**
	 * [tPostjob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPostjob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 process_data_end ] stop
 */
	
	/**
	 * [tPostjob_1 end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 

ok_Hash.put("tPostjob_1", true);
end_Hash.put("tPostjob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk5", 0, "ok");
				}
				tDBClose_1Process(globalMap);



/**
 * [tPostjob_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tPostjob_1 finally ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPostjob_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBClose_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBClose_1_SUBPROCESS_STATE", 0);

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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBClose_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBClose_1", false);
		start_Hash.put("tDBClose_1", System.currentTimeMillis());
		
	
	currentComponent="tDBClose_1";

	
		int tos_count_tDBClose_1 = 0;
		

 



/**
 * [tDBClose_1 begin ] stop
 */
	
	/**
	 * [tDBClose_1 main ] start
	 */

	

	
	
	currentComponent="tDBClose_1";

	



	java.sql.Connection conn_tDBClose_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	if(conn_tDBClose_1 != null && !conn_tDBClose_1.isClosed())
	{
        conn_tDBClose_1.close();
	}

 


	tos_count_tDBClose_1++;

/**
 * [tDBClose_1 main ] stop
 */
	
	/**
	 * [tDBClose_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBClose_1";

	

 



/**
 * [tDBClose_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBClose_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBClose_1";

	

 



/**
 * [tDBClose_1 process_data_end ] stop
 */
	
	/**
	 * [tDBClose_1 end ] start
	 */

	

	
	
	currentComponent="tDBClose_1";

	

 

ok_Hash.put("tDBClose_1", true);
end_Hash.put("tDBClose_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk6", 0, "ok");
				}
				tChronometerStop_1Process(globalMap);



/**
 * [tDBClose_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBClose_1 finally ] start
	 */

	

	
	
	currentComponent="tDBClose_1";

	

 



/**
 * [tDBClose_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBClose_1_SUBPROCESS_STATE", 1);
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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tChronometerStop_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tChronometerStop_1", false);
		start_Hash.put("tChronometerStop_1", System.currentTimeMillis());
		
	
	currentComponent="tChronometerStop_1";

	
		int tos_count_tChronometerStop_1 = 0;
		
	
	long timetChronometerStop_1;
	
		timetChronometerStop_1 = System.currentTimeMillis() - startTime;
		
	   		System.out.print("[ tChronometerStop_1 ]  ");
		
	  	System.out.println("" + "  " + timetChronometerStop_1 + " milliseconds");
	  	 
	
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

	

	
	
	currentComponent="tChronometerStop_1";

	

 


	tos_count_tChronometerStop_1++;

/**
 * [tChronometerStop_1 main ] stop
 */
	
	/**
	 * [tChronometerStop_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 



/**
 * [tChronometerStop_1 process_data_begin ] stop
 */
	
	/**
	 * [tChronometerStop_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 



/**
 * [tChronometerStop_1 process_data_end ] stop
 */
	
	/**
	 * [tChronometerStop_1 end ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 

ok_Hash.put("tChronometerStop_1", true);
end_Hash.put("tChronometerStop_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk7", 0, "ok");
				}
				tJava_2Process(globalMap);



/**
 * [tChronometerStop_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tChronometerStop_1 finally ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 



/**
 * [tChronometerStop_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tChronometerStop_1_SUBPROCESS_STATE", 1);
	}
	

public void tJava_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJava_2_SUBPROCESS_STATE", 0);

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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tJava_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tJava_2", false);
		start_Hash.put("tJava_2", System.currentTimeMillis());
		
	
	currentComponent="tJava_2";

	
		int tos_count_tJava_2 = 0;
		


System.out.println("-----------------------------------------------------------------------------");
System.out.println("Fin d'exécution du job "+jobName+ "   :"+ 
TalendDate.formatDate("yyyy-MM-dd HH:mm:ss",new java.util.Date(((Long)globalMap.get("tChronometerStop_1_STOPTIME")))
));



 



/**
 * [tJava_2 begin ] stop
 */
	
	/**
	 * [tJava_2 main ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 


	tos_count_tJava_2++;

/**
 * [tJava_2 main ] stop
 */
	
	/**
	 * [tJava_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 



/**
 * [tJava_2 process_data_begin ] stop
 */
	
	/**
	 * [tJava_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 



/**
 * [tJava_2 process_data_end ] stop
 */
	
	/**
	 * [tJava_2 end ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 

ok_Hash.put("tJava_2", true);
end_Hash.put("tJava_2", System.currentTimeMillis());




/**
 * [tJava_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tJava_2 finally ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 



/**
 * [tJava_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJava_2_SUBPROCESS_STATE", 1);
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
            java.util.Map<String,String> threadRunResultMap = new java.util.HashMap<String, String>();
            threadRunResultMap.put("errorCode", null);
            threadRunResultMap.put("status", "");
            return threadRunResultMap;
        };
    };


    protected PropertiesWithType context_param = new PropertiesWithType();
    public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

    public String status= "";
    

    public static void main(String[] args){
        final jChargeODS jChargeODSClass = new jChargeODS();

        int exitCode = jChargeODSClass.runJobInTOS(args);

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

    	
    	

        if(clientHost == null) {
            clientHost = defaultClientHost;
        }

        if(pid == null || "0".equals(pid)) {
            pid = TalendString.getAsciiRandomString(6);
        }

        if (rootPid==null) {
            rootPid = pid;
        }
        if (fatherPid==null) {
            fatherPid = pid;
        }else{
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
                contextStr = (String)jobProperties.get("context");
            }
        }

        try {
            //call job/subjob with an existing context, like: --context=production. if without this parameter, there will use the default context instead.
            java.io.InputStream inContext = jChargeODS.class.getClassLoader().getResourceAsStream("icommerce_reporting/jchargeods_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = jChargeODS.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
            }
            if (inContext != null) {
                try {
                    //defaultProps is in order to keep the original context value
                    if(context != null && context.isEmpty()) {
	                defaultProps.load(inContext);
	                context = new ContextProperties(defaultProps);
                    }
                } finally {
                    inContext.close();
                }
            } else if (!isDefaultContext) {
                //print info and job continue to run, for case: context_param is not empty.
                System.err.println("Could not find the context " + contextStr);
            }

            if(!context_param.isEmpty()) {
                context.putAll(context_param);
				//set types for params from parentJobs
				for (Object key: context_param.keySet()){
					String context_key = key.toString();
					String context_type = context_param.getContextType(context_key);
					context.setContextType(context_key, context_type);

				}
            }
            class ContextProcessing {
                private void processContext_0() {
                        context.setContextType("schema_ods", "id_String");
                        if(context.getStringValue("schema_ods") == null) {
                            context.schema_ods = null;
                        } else {
                            context.schema_ods=(String) context.getProperty("schema_ods");
                        }
                        context.setContextType("additionalParam", "id_String");
                        if(context.getStringValue("additionalParam") == null) {
                            context.additionalParam = null;
                        } else {
                            context.additionalParam=(String) context.getProperty("additionalParam");
                        }
                        context.setContextType("database", "id_String");
                        if(context.getStringValue("database") == null) {
                            context.database = null;
                        } else {
                            context.database=(String) context.getProperty("database");
                        }
                        context.setContextType("password", "id_Password");
                        if(context.getStringValue("password") == null) {
                            context.password = null;
                        } else {
                            String pwd_password_value = context.getProperty("password");
                            context.password = null;
                            if(pwd_password_value!=null) {
                                if(context_param.containsKey("password")) {//no need to decrypt if it come from program argument or parent job runtime
                                    context.password = pwd_password_value;
                                } else if (!pwd_password_value.isEmpty()) {
                                    try {
                                        context.password = routines.system.PasswordEncryptUtil.decryptPassword(pwd_password_value);
                                        context.put("password",context.password);
                                    } catch (java.lang.RuntimeException e) {
                                        //do nothing
                                    }
                                }
                            }
                        }
                        context.setContextType("port", "id_String");
                        if(context.getStringValue("port") == null) {
                            context.port = null;
                        } else {
                            context.port=(String) context.getProperty("port");
                        }
                        context.setContextType("schema_param", "id_String");
                        if(context.getStringValue("schema_param") == null) {
                            context.schema_param = null;
                        } else {
                            context.schema_param=(String) context.getProperty("schema_param");
                        }
                        context.setContextType("serverName", "id_String");
                        if(context.getStringValue("serverName") == null) {
                            context.serverName = null;
                        } else {
                            context.serverName=(String) context.getProperty("serverName");
                        }
                        context.setContextType("utilisateur", "id_String");
                        if(context.getStringValue("utilisateur") == null) {
                            context.utilisateur = null;
                        } else {
                            context.utilisateur=(String) context.getProperty("utilisateur");
                        }
                        context.setContextType("encodage", "id_String");
                        if(context.getStringValue("encodage") == null) {
                            context.encodage = null;
                        } else {
                            context.encodage=(String) context.getProperty("encodage");
                        }
                        context.setContextType("fieldSeparator", "id_String");
                        if(context.getStringValue("fieldSeparator") == null) {
                            context.fieldSeparator = null;
                        } else {
                            context.fieldSeparator=(String) context.getProperty("fieldSeparator");
                        }
                        context.setContextType("projectFolder", "id_Directory");
                        if(context.getStringValue("projectFolder") == null) {
                            context.projectFolder = null;
                        } else {
                            context.projectFolder=(String) context.getProperty("projectFolder");
                        }
                } 
                public void processAllContext() {
                        processContext_0();
                }
            }

            new ContextProcessing().processAllContext();
        } catch (java.io.IOException ie) {
            System.err.println("Could not load context "+contextStr);
            ie.printStackTrace();
        }

        // get context value from parent directly
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("schema_ods")) {
                context.schema_ods = (String) parentContextMap.get("schema_ods");
            }if (parentContextMap.containsKey("additionalParam")) {
                context.additionalParam = (String) parentContextMap.get("additionalParam");
            }if (parentContextMap.containsKey("database")) {
                context.database = (String) parentContextMap.get("database");
            }if (parentContextMap.containsKey("password")) {
                context.password = (java.lang.String) parentContextMap.get("password");
            }if (parentContextMap.containsKey("port")) {
                context.port = (String) parentContextMap.get("port");
            }if (parentContextMap.containsKey("schema_param")) {
                context.schema_param = (String) parentContextMap.get("schema_param");
            }if (parentContextMap.containsKey("serverName")) {
                context.serverName = (String) parentContextMap.get("serverName");
            }if (parentContextMap.containsKey("utilisateur")) {
                context.utilisateur = (String) parentContextMap.get("utilisateur");
            }if (parentContextMap.containsKey("encodage")) {
                context.encodage = (String) parentContextMap.get("encodage");
            }if (parentContextMap.containsKey("fieldSeparator")) {
                context.fieldSeparator = (String) parentContextMap.get("fieldSeparator");
            }if (parentContextMap.containsKey("projectFolder")) {
                context.projectFolder = (String) parentContextMap.get("projectFolder");
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
			parametersToEncrypt.add("password");
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt));

if(execStat) {
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
errorCode = null;Implicit_Context_DatabaseProcess(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_Implicit_Context_Database) {
globalMap.put("Implicit_Context_Database_SUBPROCESS_STATE", -1);

e_Implicit_Context_Database.printStackTrace();

}

this.globalResumeTicket = true;//to run tPreJob

try {
errorCode = null;tPrejob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPrejob_1) {
globalMap.put("tPrejob_1_SUBPROCESS_STATE", -1);

e_tPrejob_1.printStackTrace();

}




this.globalResumeTicket = false;//to run others jobs

try {
errorCode = null;tRunJob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tRunJob_1) {
globalMap.put("tRunJob_1_SUBPROCESS_STATE", -1);

e_tRunJob_1.printStackTrace();

}

this.globalResumeTicket = true;//to run tPostJob

try {
errorCode = null;tPostjob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPostjob_1) {
globalMap.put("tPostjob_1_SUBPROCESS_STATE", -1);

e_tPostjob_1.printStackTrace();

}



        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : jChargeODS");
        }



if (execStat) {
    runStat.updateStatOnJob(RunStat.JOBEND, fatherNode);
    runStat.stopThreadStat();
}
    int returnCode = 0;


    if(errorCode == null) {
         returnCode = status != null && status.equals("failure") ? 1 : 0;
    } else {
         returnCode = errorCode.intValue();
    }
    resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","" + returnCode,"","","");

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
                if (fatherPid==null) {
                    context_param.setContextType(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.setContextType(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }

            }

		} else if (arg.startsWith("--context_param")) {
            String keyValue = arg.substring(16);
            int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }
            }
        } else if (arg.startsWith("--log4jLevel=")) {
            log4jLevel = arg.substring(13);
		} else if (arg.startsWith("--audit.enabled") && arg.contains("=")) {//for trunjob call
		    final int equal = arg.indexOf('=');
			final String key = arg.substring("--".length(), equal);
			System.setProperty(key, arg.substring(equal + 1));
		}
    }
    
    private static final String NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY = "<TALEND_NULL>";

    private final String[][] escapeChars = {
        {"\\\\","\\"},{"\\n","\n"},{"\\'","\'"},{"\\r","\r"},
        {"\\f","\f"},{"\\b","\b"},{"\\t","\t"}
        };
    private String replaceEscapeChars (String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0],currIndex);
				if (index>=0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0], strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the result
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
 *     157755 characters generated by Talend Open Studio for Data Integration 
 *     on the 8 septembre 2023 à 12:44:01 WAT
 ************************************************************************************************/
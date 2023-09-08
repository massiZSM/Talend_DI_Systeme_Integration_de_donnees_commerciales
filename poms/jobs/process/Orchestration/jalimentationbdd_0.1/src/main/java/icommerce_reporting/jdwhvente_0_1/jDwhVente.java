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


package icommerce_reporting.jdwhvente_0_1;

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
 * Job: jDwhVente Purpose: Alimentation de la table DIM_VENTE<br>
 * Description: Alimentation de la table DIM_VENTE <br>
 * @author 
 * @version 8.0.1.20211109_1610
 * @status 
 */
public class jDwhVente implements TalendJob {

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
			
			if(schema_dwh != null){
				
					this.setProperty("schema_dwh", schema_dwh.toString());
				
			}
			
			if(serverName != null){
				
					this.setProperty("serverName", serverName.toString());
				
			}
			
			if(utilisateur != null){
				
					this.setProperty("utilisateur", utilisateur.toString());
				
			}
			
			if(schema_ods != null){
				
					this.setProperty("schema_ods", schema_ods.toString());
				
			}
			
			if(schema_param != null){
				
					this.setProperty("schema_param", schema_param.toString());
				
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
public String schema_dwh;
public String getSchema_dwh(){
	return this.schema_dwh;
}
public String serverName;
public String getServerName(){
	return this.serverName;
}
public String utilisateur;
public String getUtilisateur(){
	return this.utilisateur;
}
public String schema_ods;
public String getSchema_ods(){
	return this.schema_ods;
}
public String schema_param;
public String getSchema_param(){
	return this.schema_param;
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
	private final String jobName = "jDwhVente";
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
				jDwhVente.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(jDwhVente.this, new Object[] { e , currentComponent, globalMap});
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
			
			public void tDBInput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tHashOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tHashInput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tHashInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tHashInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tHashInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tHashInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tHashInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tHashInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tHashInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
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
			
			public void tDBConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPostjob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPostjob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBCommit_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBCommit_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBCommit_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBCommit_1_onSubJobError(exception, errorComponent, globalMap);
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
			
			public void tAdvancedHash_produit_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_client_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_calendrier_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAggregateRow_1_AGGOUT_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							tAggregateRow_1_AGGIN_error(exception, errorComponent, globalMap);
						
						}
					
			public void tAggregateRow_1_AGGIN_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tHashInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void Implicit_Context_Database_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tHashInput_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tHashInput_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPrejob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tChronometerStart_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJava_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPostjob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBCommit_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBCommit_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tChronometerStop_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJava_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	






public static class row_Implicit_Context_DatabaseStruct implements routines.system.IPersistableRow<row_Implicit_Context_DatabaseStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];

	
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
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

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

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

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

        if(key_Implicit_Context_Context!=null && "schema_dwh".equals(key_Implicit_Context_Context))
        {
           context.schema_dwh=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "serverName".equals(key_Implicit_Context_Context))
        {
           context.serverName=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "utilisateur".equals(key_Implicit_Context_Context))
        {
           context.utilisateur=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "schema_ods".equals(key_Implicit_Context_Context))
        {
           context.schema_ods=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "schema_param".equals(key_Implicit_Context_Context))
        {
           context.schema_param=value_Implicit_Context_Context;
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
	


public static class venteToInsertStruct implements routines.system.IPersistableRow<venteToInsertStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int ID_DIM_PRODUIT;

				public int getID_DIM_PRODUIT () {
					return this.ID_DIM_PRODUIT;
				}
				
			    public int ID_DIM_CLIENT;

				public int getID_DIM_CLIENT () {
					return this.ID_DIM_CLIENT;
				}
				
			    public int ID_DIM_CALENDRIER;

				public int getID_DIM_CALENDRIER () {
					return this.ID_DIM_CALENDRIER;
				}
				
			    public String ID_VENTE;

				public String getID_VENTE () {
					return this.ID_VENTE;
				}
				
			    public int QTE_VENTE;

				public int getQTE_VENTE () {
					return this.QTE_VENTE;
				}
				
			    public Double MT_ACHAT;

				public Double getMT_ACHAT () {
					return this.MT_ACHAT;
				}
				
			    public Double MT_VENTE;

				public Double getMT_VENTE () {
					return this.MT_VENTE;
				}
				
			    public String CD_PRODUIT;

				public String getCD_PRODUIT () {
					return this.CD_PRODUIT;
				}
				
			    public String ID_CLIENT;

				public String getID_CLIENT () {
					return this.ID_CLIENT;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.ID_DIM_PRODUIT;
						
							result = prime * result + (int) this.ID_DIM_CLIENT;
						
							result = prime * result + (int) this.ID_DIM_CALENDRIER;
						
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final venteToInsertStruct other = (venteToInsertStruct) obj;
		
						if (this.ID_DIM_PRODUIT != other.ID_DIM_PRODUIT)
							return false;
					
						if (this.ID_DIM_CLIENT != other.ID_DIM_CLIENT)
							return false;
					
						if (this.ID_DIM_CALENDRIER != other.ID_DIM_CALENDRIER)
							return false;
					

		return true;
    }

	public void copyDataTo(venteToInsertStruct other) {

		other.ID_DIM_PRODUIT = this.ID_DIM_PRODUIT;
	            other.ID_DIM_CLIENT = this.ID_DIM_CLIENT;
	            other.ID_DIM_CALENDRIER = this.ID_DIM_CALENDRIER;
	            other.ID_VENTE = this.ID_VENTE;
	            other.QTE_VENTE = this.QTE_VENTE;
	            other.MT_ACHAT = this.MT_ACHAT;
	            other.MT_VENTE = this.MT_VENTE;
	            other.CD_PRODUIT = this.CD_PRODUIT;
	            other.ID_CLIENT = this.ID_CLIENT;
	            
	}

	public void copyKeysDataTo(venteToInsertStruct other) {

		other.ID_DIM_PRODUIT = this.ID_DIM_PRODUIT;
	            	other.ID_DIM_CLIENT = this.ID_DIM_CLIENT;
	            	other.ID_DIM_CALENDRIER = this.ID_DIM_CALENDRIER;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
			        this.ID_DIM_PRODUIT = dis.readInt();
					
			        this.ID_DIM_CLIENT = dis.readInt();
					
			        this.ID_DIM_CALENDRIER = dis.readInt();
					
					this.ID_VENTE = readString(dis);
					
			        this.QTE_VENTE = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MT_ACHAT = null;
           				} else {
           			    	this.MT_ACHAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MT_VENTE = null;
           				} else {
           			    	this.MT_VENTE = dis.readDouble();
           				}
					
					this.CD_PRODUIT = readString(dis);
					
					this.ID_CLIENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
			        this.ID_DIM_PRODUIT = dis.readInt();
					
			        this.ID_DIM_CLIENT = dis.readInt();
					
			        this.ID_DIM_CALENDRIER = dis.readInt();
					
					this.ID_VENTE = readString(dis);
					
			        this.QTE_VENTE = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MT_ACHAT = null;
           				} else {
           			    	this.MT_ACHAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MT_VENTE = null;
           				} else {
           			    	this.MT_VENTE = dis.readDouble();
           				}
					
					this.CD_PRODUIT = readString(dis);
					
					this.ID_CLIENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.ID_DIM_PRODUIT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CLIENT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CALENDRIER);
					
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// int
				
		            	dos.writeInt(this.QTE_VENTE);
					
					// Double
				
						if(this.MT_ACHAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.MT_ACHAT);
		            	}
					
					// Double
				
						if(this.MT_VENTE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.MT_VENTE);
		            	}
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.ID_DIM_PRODUIT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CLIENT);
					
					// int
				
		            	dos.writeInt(this.ID_DIM_CALENDRIER);
					
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// int
				
		            	dos.writeInt(this.QTE_VENTE);
					
					// Double
				
						if(this.MT_ACHAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.MT_ACHAT);
		            	}
					
					// Double
				
						if(this.MT_VENTE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.MT_VENTE);
		            	}
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_DIM_PRODUIT="+String.valueOf(ID_DIM_PRODUIT));
		sb.append(",ID_DIM_CLIENT="+String.valueOf(ID_DIM_CLIENT));
		sb.append(",ID_DIM_CALENDRIER="+String.valueOf(ID_DIM_CALENDRIER));
		sb.append(",ID_VENTE="+ID_VENTE);
		sb.append(",QTE_VENTE="+String.valueOf(QTE_VENTE));
		sb.append(",MT_ACHAT="+String.valueOf(MT_ACHAT));
		sb.append(",MT_VENTE="+String.valueOf(MT_VENTE));
		sb.append(",CD_PRODUIT="+CD_PRODUIT);
		sb.append(",ID_CLIENT="+ID_CLIENT);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(venteToInsertStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.ID_DIM_PRODUIT, other.ID_DIM_PRODUIT);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.ID_DIM_CLIENT, other.ID_DIM_CLIENT);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.ID_DIM_CALENDRIER, other.ID_DIM_CALENDRIER);
						if(returnValue != 0) {
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

public static class venteStruct implements routines.system.IPersistableRow<venteStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];

	
			    public String ID_VENTE;

				public String getID_VENTE () {
					return this.ID_VENTE;
				}
				
			    public String CD_PRODUIT;

				public String getCD_PRODUIT () {
					return this.CD_PRODUIT;
				}
				
			    public java.util.Date DT_VENTE;

				public java.util.Date getDT_VENTE () {
					return this.DT_VENTE;
				}
				
			    public String ID_CLIENT;

				public String getID_CLIENT () {
					return this.ID_CLIENT;
				}
				
			    public int QTE_VENTE;

				public int getQTE_VENTE () {
					return this.QTE_VENTE;
				}
				
			    public double PRIX_ACHAT;

				public double getPRIX_ACHAT () {
					return this.PRIX_ACHAT;
				}
				
			    public double PRIX_VENTE;

				public double getPRIX_VENTE () {
					return this.PRIX_VENTE;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				
			    public boolean BL_LIGNE_IN_DWH;

				public boolean getBL_LIGNE_IN_DWH () {
					return this.BL_LIGNE_IN_DWH;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
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
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
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

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
			        this.QTE_VENTE = dis.readInt();
					
			        this.PRIX_ACHAT = dis.readDouble();
					
			        this.PRIX_VENTE = dis.readDouble();
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
			        this.BL_LIGNE_IN_DWH = dis.readBoolean();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
			        this.QTE_VENTE = dis.readInt();
					
			        this.PRIX_ACHAT = dis.readDouble();
					
			        this.PRIX_VENTE = dis.readDouble();
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
			        this.BL_LIGNE_IN_DWH = dis.readBoolean();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// java.util.Date
				
						writeDate(this.DT_VENTE,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
					// int
				
		            	dos.writeInt(this.QTE_VENTE);
					
					// double
				
		            	dos.writeDouble(this.PRIX_ACHAT);
					
					// double
				
		            	dos.writeDouble(this.PRIX_VENTE);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
					// boolean
				
		            	dos.writeBoolean(this.BL_LIGNE_IN_DWH);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// java.util.Date
				
						writeDate(this.DT_VENTE,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
					// int
				
		            	dos.writeInt(this.QTE_VENTE);
					
					// double
				
		            	dos.writeDouble(this.PRIX_ACHAT);
					
					// double
				
		            	dos.writeDouble(this.PRIX_VENTE);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
					// boolean
				
		            	dos.writeBoolean(this.BL_LIGNE_IN_DWH);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_VENTE="+ID_VENTE);
		sb.append(",CD_PRODUIT="+CD_PRODUIT);
		sb.append(",DT_VENTE="+String.valueOf(DT_VENTE));
		sb.append(",ID_CLIENT="+ID_CLIENT);
		sb.append(",QTE_VENTE="+String.valueOf(QTE_VENTE));
		sb.append(",PRIX_ACHAT="+String.valueOf(PRIX_ACHAT));
		sb.append(",PRIX_VENTE="+String.valueOf(PRIX_VENTE));
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
		sb.append(",BL_LIGNE_IN_DWH="+String.valueOf(BL_LIGNE_IN_DWH));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(venteStruct other) {

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

public static class after_tDBInput_1Struct implements routines.system.IPersistableRow<after_tDBInput_1Struct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];

	
			    public String ID_VENTE;

				public String getID_VENTE () {
					return this.ID_VENTE;
				}
				
			    public String CD_PRODUIT;

				public String getCD_PRODUIT () {
					return this.CD_PRODUIT;
				}
				
			    public java.util.Date DT_VENTE;

				public java.util.Date getDT_VENTE () {
					return this.DT_VENTE;
				}
				
			    public String ID_CLIENT;

				public String getID_CLIENT () {
					return this.ID_CLIENT;
				}
				
			    public int QTE_VENTE;

				public int getQTE_VENTE () {
					return this.QTE_VENTE;
				}
				
			    public double PRIX_ACHAT;

				public double getPRIX_ACHAT () {
					return this.PRIX_ACHAT;
				}
				
			    public double PRIX_VENTE;

				public double getPRIX_VENTE () {
					return this.PRIX_VENTE;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				
			    public boolean BL_LIGNE_IN_DWH;

				public boolean getBL_LIGNE_IN_DWH () {
					return this.BL_LIGNE_IN_DWH;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
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
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
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

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
			        this.QTE_VENTE = dis.readInt();
					
			        this.PRIX_ACHAT = dis.readDouble();
					
			        this.PRIX_VENTE = dis.readDouble();
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
			        this.BL_LIGNE_IN_DWH = dis.readBoolean();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
					this.DT_VENTE = readDate(dis);
					
					this.ID_CLIENT = readString(dis);
					
			        this.QTE_VENTE = dis.readInt();
					
			        this.PRIX_ACHAT = dis.readDouble();
					
			        this.PRIX_VENTE = dis.readDouble();
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
			        this.BL_LIGNE_IN_DWH = dis.readBoolean();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// java.util.Date
				
						writeDate(this.DT_VENTE,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
					// int
				
		            	dos.writeInt(this.QTE_VENTE);
					
					// double
				
		            	dos.writeDouble(this.PRIX_ACHAT);
					
					// double
				
		            	dos.writeDouble(this.PRIX_VENTE);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
					// boolean
				
		            	dos.writeBoolean(this.BL_LIGNE_IN_DWH);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// java.util.Date
				
						writeDate(this.DT_VENTE,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
					// int
				
		            	dos.writeInt(this.QTE_VENTE);
					
					// double
				
		            	dos.writeDouble(this.PRIX_ACHAT);
					
					// double
				
		            	dos.writeDouble(this.PRIX_VENTE);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
					// boolean
				
		            	dos.writeBoolean(this.BL_LIGNE_IN_DWH);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_VENTE="+ID_VENTE);
		sb.append(",CD_PRODUIT="+CD_PRODUIT);
		sb.append(",DT_VENTE="+String.valueOf(DT_VENTE));
		sb.append(",ID_CLIENT="+ID_CLIENT);
		sb.append(",QTE_VENTE="+String.valueOf(QTE_VENTE));
		sb.append(",PRIX_ACHAT="+String.valueOf(PRIX_ACHAT));
		sb.append(",PRIX_VENTE="+String.valueOf(PRIX_VENTE));
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
		sb.append(",BL_LIGNE_IN_DWH="+String.valueOf(BL_LIGNE_IN_DWH));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(after_tDBInput_1Struct other) {

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
public void tDBInput_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_1_SUBPROCESS_STATE", 0);

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


		tDBInput_2Process(globalMap);
		tDBInput_4Process(globalMap);
		tDBInput_5Process(globalMap);

		venteStruct vente = new venteStruct();
venteToInsertStruct venteToInsert = new venteToInsertStruct();





	
	/**
	 * [tHashOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tHashOutput_1", false);
		start_Hash.put("tHashOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tHashOutput_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"venteToInsert");
					}
				
		int tos_count_tHashOutput_1 = 0;
		



org.talend.designer.components.hashfile.common.MapHashFile mf_tHashOutput_1=org.talend.designer.components.hashfile.common.MapHashFile.getMapHashFile();    
		org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<venteToInsertStruct> tHashFile_tHashOutput_1 = null;
		String hashKey_tHashOutput_1 = "tHashFile_jDwhVente_" + pid + "_tHashOutput_1";
			synchronized(org.talend.designer.components.hashfile.common.MapHashFile.resourceLockMap.get(hashKey_tHashOutput_1)){
			    if(mf_tHashOutput_1.getResourceMap().get(hashKey_tHashOutput_1) == null){
	      		    mf_tHashOutput_1.getResourceMap().put(hashKey_tHashOutput_1, new org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<venteToInsertStruct>(org.talend.designer.components.hashfile.common.MATCHING_MODE.KEEP_ALL));
	      		    tHashFile_tHashOutput_1 = mf_tHashOutput_1.getResourceMap().get(hashKey_tHashOutput_1);
			    }else{
			    	tHashFile_tHashOutput_1 = mf_tHashOutput_1.getResourceMap().get(hashKey_tHashOutput_1);
			    }
			}
        int nb_line_tHashOutput_1 = 0;

 



/**
 * [tHashOutput_1 begin ] stop
 */



	
	/**
	 * [tMap_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_1", false);
		start_Hash.put("tMap_1", System.currentTimeMillis());
		
	
	currentComponent="tMap_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"vente");
					}
				
		int tos_count_tMap_1 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<produitStruct> tHash_Lookup_produit = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<produitStruct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<produitStruct>) 
					globalMap.get( "tHash_Lookup_produit" ))
					;					
					
	

produitStruct produitHashKey = new produitStruct();
produitStruct produitDefault = new produitStruct();
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<clientStruct> tHash_Lookup_client = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<clientStruct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<clientStruct>) 
					globalMap.get( "tHash_Lookup_client" ))
					;					
					
	

clientStruct clientHashKey = new clientStruct();
clientStruct clientDefault = new clientStruct();
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<calendrierStruct> tHash_Lookup_calendrier = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<calendrierStruct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<calendrierStruct>) 
					globalMap.get( "tHash_Lookup_calendrier" ))
					;					
					
	

calendrierStruct calendrierHashKey = new calendrierStruct();
calendrierStruct calendrierDefault = new calendrierStruct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_1__Struct  {
}
Var__tMap_1__Struct Var__tMap_1 = new Var__tMap_1__Struct();
// ###############################

// ###############################
// # Outputs initialization
venteToInsertStruct venteToInsert_tmp = new venteToInsertStruct();
// ###############################

        
        



        









 



/**
 * [tMap_1 begin ] stop
 */



	
	/**
	 * [tDBInput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_1", false);
		start_Hash.put("tDBInput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_1";

	
		int tos_count_tDBInput_1 = 0;
		
	
    
	
		    int nb_line_tDBInput_1 = 0;
		    java.sql.Connection conn_tDBInput_1 = null;
				conn_tDBInput_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
				
		    
			java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

		    String dbquery_tDBInput_1 = "SELECT \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"ID_VENTE\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"CD_PRODUIT\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"DT_VENTE\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"ID_CLIENT\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"QTE_VENTE\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"PRIX_ACHAT\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"PRIX_VENTE\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"LB_NOM_FICHIER\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"DT_INSERTION\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"LB_JOB_NAME\", \n  \""+context.schema_ods+"\".\"ODS_VENTE\".\"BL_LIGNE_IN_DWH\"\nFROM \""+context.schema_ods+"\".\"ODS_VENTE\"\nWHERE \"BL_LIGNE_IN_DWH\" = false;\n";
		    

            	globalMap.put("tDBInput_1_QUERY",dbquery_tDBInput_1);
		    java.sql.ResultSet rs_tDBInput_1 = null;

		    try {
		    	rs_tDBInput_1 = stmt_tDBInput_1.executeQuery(dbquery_tDBInput_1);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_1 = rs_tDBInput_1.getMetaData();
		    	int colQtyInRs_tDBInput_1 = rsmd_tDBInput_1.getColumnCount();

		    String tmpContent_tDBInput_1 = null;
		    
		    
		    while (rs_tDBInput_1.next()) {
		        nb_line_tDBInput_1++;
		        
							if(colQtyInRs_tDBInput_1 < 1) {
								vente.ID_VENTE = null;
							} else {
	                         		
        	vente.ID_VENTE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 1, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 2) {
								vente.CD_PRODUIT = null;
							} else {
	                         		
        	vente.CD_PRODUIT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 2, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								vente.DT_VENTE = null;
							} else {
										
			vente.DT_VENTE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 3);
		                    }
							if(colQtyInRs_tDBInput_1 < 4) {
								vente.ID_CLIENT = null;
							} else {
	                         		
        	vente.ID_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 4, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 5) {
								vente.QTE_VENTE = 0;
							} else {
		                          
            vente.QTE_VENTE = rs_tDBInput_1.getInt(5);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 6) {
								vente.PRIX_ACHAT = 0;
							} else {
	                         		
            vente.PRIX_ACHAT = rs_tDBInput_1.getDouble(6);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 7) {
								vente.PRIX_VENTE = 0;
							} else {
	                         		
            vente.PRIX_VENTE = rs_tDBInput_1.getDouble(7);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 8) {
								vente.LB_NOM_FICHIER = null;
							} else {
	                         		
        	vente.LB_NOM_FICHIER = routines.system.JDBCUtil.getString(rs_tDBInput_1, 8, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 9) {
								vente.DT_INSERTION = null;
							} else {
										
			vente.DT_INSERTION = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 9);
		                    }
							if(colQtyInRs_tDBInput_1 < 10) {
								vente.LB_JOB_NAME = null;
							} else {
	                         		
        	vente.LB_JOB_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_1, 10, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 11) {
								vente.BL_LIGNE_IN_DWH = false;
							} else {
	                         		
            vente.BL_LIGNE_IN_DWH = rs_tDBInput_1.getBoolean(11);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
					


 



/**
 * [tDBInput_1 begin ] stop
 */
	
	/**
	 * [tDBInput_1 main ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 


	tos_count_tDBInput_1++;

/**
 * [tDBInput_1 main ] stop
 */
	
	/**
	 * [tDBInput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 



/**
 * [tDBInput_1 process_data_begin ] stop
 */

	
	/**
	 * [tMap_1 main ] start
	 */

	

	
	
	currentComponent="tMap_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"vente"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_1 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_1 = false;
		  boolean mainRowRejected_tMap_1 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "produit" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLoopproduit = false;
       		  	    	
       		  	    	
 							produitStruct produitObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_1) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_1 = false;
								
                        		    		    produitHashKey.CD_PRODUIT = vente.CD_PRODUIT ;
                        		    		

								
		                        	produitHashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_produit.lookup( produitHashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_produit.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_1 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_produit != null && tHash_Lookup_produit.getCount(produitHashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'produit' and it contains more one result from keys :  produit.CD_PRODUIT = '" + produitHashKey.CD_PRODUIT + "'");
								} // G 071
							

							produitStruct produit = null;
                    		  	 
							   
                    		  	 
	       		  	    	produitStruct fromLookup_produit = null;
							produit = produitDefault;
										 
							
								 
							
							
								if (tHash_Lookup_produit !=null && tHash_Lookup_produit.hasNext()) { // G 099
								
							
								
								fromLookup_produit = tHash_Lookup_produit.next();

							
							
								} // G 099
							
							

							if(fromLookup_produit != null) {
								produit = fromLookup_produit;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "client" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLoopclient = false;
       		  	    	
       		  	    	
 							clientStruct clientObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_1) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_1 = false;
								
                        		    		    clientHashKey.ID_CLIENT = vente.ID_CLIENT ;
                        		    		

								
		                        	clientHashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_client.lookup( clientHashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_client.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_1 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_client != null && tHash_Lookup_client.getCount(clientHashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'client' and it contains more one result from keys :  client.ID_CLIENT = '" + clientHashKey.ID_CLIENT + "'");
								} // G 071
							

							clientStruct client = null;
                    		  	 
							   
                    		  	 
	       		  	    	clientStruct fromLookup_client = null;
							client = clientDefault;
										 
							
								 
							
							
								if (tHash_Lookup_client !=null && tHash_Lookup_client.hasNext()) { // G 099
								
							
								
								fromLookup_client = tHash_Lookup_client.next();

							
							
								} // G 099
							
							

							if(fromLookup_client != null) {
								client = fromLookup_client;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "calendrier" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLoopcalendrier = false;
       		  	    	
       		  	    	
 							calendrierStruct calendrierObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_1) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_1 = false;
								
                        		    		    calendrierHashKey.DT_JOUR = vente.DT_VENTE  == null ? null : new java.util.Date(vente.DT_VENTE .getTime());
                        		    		

								
		                        	calendrierHashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_calendrier.lookup( calendrierHashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_calendrier.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_1 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_calendrier != null && tHash_Lookup_calendrier.getCount(calendrierHashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'calendrier' and it contains more one result from keys :  calendrier.DT_JOUR = '" + calendrierHashKey.DT_JOUR + "'");
								} // G 071
							

							calendrierStruct calendrier = null;
                    		  	 
							   
                    		  	 
	       		  	    	calendrierStruct fromLookup_calendrier = null;
							calendrier = calendrierDefault;
										 
							
								 
							
							
								if (tHash_Lookup_calendrier !=null && tHash_Lookup_calendrier.hasNext()) { // G 099
								
							
								
								fromLookup_calendrier = tHash_Lookup_calendrier.next();

							
							
								} // G 099
							
							

							if(fromLookup_calendrier != null) {
								calendrier = fromLookup_calendrier;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_1__Struct Var = Var__tMap_1;// ###############################
        // ###############################
        // # Output tables

venteToInsert = null;

if(!rejectedInnerJoin_tMap_1 ) {

// # Output table : 'venteToInsert'
venteToInsert_tmp.ID_DIM_PRODUIT = produit.ID_DIM_PRODUIT ;
venteToInsert_tmp.ID_DIM_CLIENT = client.ID_DIM_CLIENT ;
venteToInsert_tmp.ID_DIM_CALENDRIER = calendrier.ID_DIM_CALENDRIER ;
venteToInsert_tmp.ID_VENTE = vente.ID_VENTE ;
venteToInsert_tmp.QTE_VENTE = vente.QTE_VENTE ;
venteToInsert_tmp.MT_ACHAT = vente.QTE_VENTE*vente.PRIX_VENTE ;
venteToInsert_tmp.MT_VENTE = vente.QTE_VENTE*vente.PRIX_VENTE ;
venteToInsert_tmp.CD_PRODUIT = vente.CD_PRODUIT ;
venteToInsert_tmp.ID_CLIENT = vente.ID_CLIENT ;
venteToInsert = venteToInsert_tmp;
}  // closing inner join bracket (2)
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

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 process_data_begin ] stop
 */
// Start of branch "venteToInsert"
if(venteToInsert != null) { 



	
	/**
	 * [tHashOutput_1 main ] start
	 */

	

	
	
	currentComponent="tHashOutput_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"venteToInsert"
						
						);
					}
					



    
		venteToInsertStruct oneRow_tHashOutput_1 = new venteToInsertStruct();
				
					oneRow_tHashOutput_1.ID_DIM_PRODUIT = venteToInsert.ID_DIM_PRODUIT;
					oneRow_tHashOutput_1.ID_DIM_CLIENT = venteToInsert.ID_DIM_CLIENT;
					oneRow_tHashOutput_1.ID_DIM_CALENDRIER = venteToInsert.ID_DIM_CALENDRIER;
					oneRow_tHashOutput_1.ID_VENTE = venteToInsert.ID_VENTE;
					oneRow_tHashOutput_1.QTE_VENTE = venteToInsert.QTE_VENTE;
					oneRow_tHashOutput_1.MT_ACHAT = venteToInsert.MT_ACHAT;
					oneRow_tHashOutput_1.MT_VENTE = venteToInsert.MT_VENTE;
					oneRow_tHashOutput_1.CD_PRODUIT = venteToInsert.CD_PRODUIT;
					oneRow_tHashOutput_1.ID_CLIENT = venteToInsert.ID_CLIENT;
		
        tHashFile_tHashOutput_1.put(oneRow_tHashOutput_1);
        nb_line_tHashOutput_1 ++;

 


	tos_count_tHashOutput_1++;

/**
 * [tHashOutput_1 main ] stop
 */
	
	/**
	 * [tHashOutput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tHashOutput_1";

	

 



/**
 * [tHashOutput_1 process_data_begin ] stop
 */
	
	/**
	 * [tHashOutput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tHashOutput_1";

	

 



/**
 * [tHashOutput_1 process_data_end ] stop
 */

} // End of branch "venteToInsert"




	
	/**
	 * [tMap_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 



/**
 * [tDBInput_1 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_1 end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

	}
}finally{
	if (rs_tDBInput_1 != null) {
		rs_tDBInput_1.close();
	}
	if (stmt_tDBInput_1 != null) {
		stmt_tDBInput_1.close();
	}
}
globalMap.put("tDBInput_1_NB_LINE",nb_line_tDBInput_1);
 

ok_Hash.put("tDBInput_1", true);
end_Hash.put("tDBInput_1", System.currentTimeMillis());




/**
 * [tDBInput_1 end ] stop
 */

	
	/**
	 * [tMap_1 end ] start
	 */

	

	
	
	currentComponent="tMap_1";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_produit != null) {
						tHash_Lookup_produit.endGet();
					}
					globalMap.remove( "tHash_Lookup_produit" );

					
					
				
					if(tHash_Lookup_client != null) {
						tHash_Lookup_client.endGet();
					}
					globalMap.remove( "tHash_Lookup_client" );

					
					
				
					if(tHash_Lookup_calendrier != null) {
						tHash_Lookup_calendrier.endGet();
					}
					globalMap.remove( "tHash_Lookup_calendrier" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"vente");
			  	}
			  	
 

ok_Hash.put("tMap_1", true);
end_Hash.put("tMap_1", System.currentTimeMillis());




/**
 * [tMap_1 end ] stop
 */

	
	/**
	 * [tHashOutput_1 end ] start
	 */

	

	
	
	currentComponent="tHashOutput_1";

	
globalMap.put("tHashOutput_1_NB_LINE", nb_line_tHashOutput_1);
				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"venteToInsert");
			  	}
			  	
 

ok_Hash.put("tHashOutput_1", true);
end_Hash.put("tHashOutput_1", System.currentTimeMillis());




/**
 * [tHashOutput_1 end ] stop
 */






				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk1", 0, "ok");
								} 
							
							tHashInput_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
					     			//free memory for "tMap_1"
					     			globalMap.remove("tHash_Lookup_produit"); 
				     			
					     			//free memory for "tMap_1"
					     			globalMap.remove("tHash_Lookup_client"); 
				     			
					     			//free memory for "tMap_1"
					     			globalMap.remove("tHash_Lookup_calendrier"); 
				     			
				try{
					
	
	/**
	 * [tDBInput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 



/**
 * [tDBInput_1 finally ] stop
 */

	
	/**
	 * [tMap_1 finally ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 finally ] stop
 */

	
	/**
	 * [tHashOutput_1 finally ] start
	 */

	

	
	
	currentComponent="tHashOutput_1";

	

 



/**
 * [tHashOutput_1 finally ] stop
 */






				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_1_SUBPROCESS_STATE", 1);
	}
	


public static class insertVenteStruct implements routines.system.IPersistableRow<insertVenteStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];

	
			    public Integer ID_DIM_PRODUIT;

				public Integer getID_DIM_PRODUIT () {
					return this.ID_DIM_PRODUIT;
				}
				
			    public Integer ID_DIM_CLIENT;

				public Integer getID_DIM_CLIENT () {
					return this.ID_DIM_CLIENT;
				}
				
			    public Integer ID_DIM_CALENDRIER;

				public Integer getID_DIM_CALENDRIER () {
					return this.ID_DIM_CALENDRIER;
				}
				
			    public Integer NB_VENTE;

				public Integer getNB_VENTE () {
					return this.NB_VENTE;
				}
				
			    public Integer NB_QTE_VENTE;

				public Integer getNB_QTE_VENTE () {
					return this.NB_QTE_VENTE;
				}
				
			    public Double NB_MT_ACHAT;

				public Double getNB_MT_ACHAT () {
					return this.NB_MT_ACHAT;
				}
				
			    public Double NB_MT_VENTE;

				public Double getNB_MT_VENTE () {
					return this.NB_MT_VENTE;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
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
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
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

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
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
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
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

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
						this.ID_DIM_PRODUIT = readInteger(dis);
					
						this.ID_DIM_CLIENT = readInteger(dis);
					
						this.ID_DIM_CALENDRIER = readInteger(dis);
					
						this.NB_VENTE = readInteger(dis);
					
						this.NB_QTE_VENTE = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.NB_MT_ACHAT = null;
           				} else {
           			    	this.NB_MT_ACHAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.NB_MT_VENTE = null;
           				} else {
           			    	this.NB_MT_VENTE = dis.readDouble();
           				}
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
						this.ID_DIM_PRODUIT = readInteger(dis);
					
						this.ID_DIM_CLIENT = readInteger(dis);
					
						this.ID_DIM_CALENDRIER = readInteger(dis);
					
						this.NB_VENTE = readInteger(dis);
					
						this.NB_QTE_VENTE = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.NB_MT_ACHAT = null;
           				} else {
           			    	this.NB_MT_ACHAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.NB_MT_VENTE = null;
           				} else {
           			    	this.NB_MT_VENTE = dis.readDouble();
           				}
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Integer
				
						writeInteger(this.ID_DIM_PRODUIT,dos);
					
					// Integer
				
						writeInteger(this.ID_DIM_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.ID_DIM_CALENDRIER,dos);
					
					// Integer
				
						writeInteger(this.NB_VENTE,dos);
					
					// Integer
				
						writeInteger(this.NB_QTE_VENTE,dos);
					
					// Double
				
						if(this.NB_MT_ACHAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.NB_MT_ACHAT);
		            	}
					
					// Double
				
						if(this.NB_MT_VENTE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.NB_MT_VENTE);
		            	}
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Integer
				
						writeInteger(this.ID_DIM_PRODUIT,dos);
					
					// Integer
				
						writeInteger(this.ID_DIM_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.ID_DIM_CALENDRIER,dos);
					
					// Integer
				
						writeInteger(this.NB_VENTE,dos);
					
					// Integer
				
						writeInteger(this.NB_QTE_VENTE,dos);
					
					// Double
				
						if(this.NB_MT_ACHAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.NB_MT_ACHAT);
		            	}
					
					// Double
				
						if(this.NB_MT_VENTE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.NB_MT_VENTE);
		            	}
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_DIM_PRODUIT="+String.valueOf(ID_DIM_PRODUIT));
		sb.append(",ID_DIM_CLIENT="+String.valueOf(ID_DIM_CLIENT));
		sb.append(",ID_DIM_CALENDRIER="+String.valueOf(ID_DIM_CALENDRIER));
		sb.append(",NB_VENTE="+String.valueOf(NB_VENTE));
		sb.append(",NB_QTE_VENTE="+String.valueOf(NB_QTE_VENTE));
		sb.append(",NB_MT_ACHAT="+String.valueOf(NB_MT_ACHAT));
		sb.append(",NB_MT_VENTE="+String.valueOf(NB_MT_VENTE));
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(insertVenteStruct other) {

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

public static class row2Struct implements routines.system.IPersistableRow<row2Struct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];

	
			    public Integer ID_DIM_PRODUIT;

				public Integer getID_DIM_PRODUIT () {
					return this.ID_DIM_PRODUIT;
				}
				
			    public Integer ID_DIM_CLIENT;

				public Integer getID_DIM_CLIENT () {
					return this.ID_DIM_CLIENT;
				}
				
			    public Integer ID_DIM_CALENDRIER;

				public Integer getID_DIM_CALENDRIER () {
					return this.ID_DIM_CALENDRIER;
				}
				
			    public Integer NB_VENTE;

				public Integer getNB_VENTE () {
					return this.NB_VENTE;
				}
				
			    public Integer NB_QTE_VENTE;

				public Integer getNB_QTE_VENTE () {
					return this.NB_QTE_VENTE;
				}
				
			    public Double NB_MT_ACHAT;

				public Double getNB_MT_ACHAT () {
					return this.NB_MT_ACHAT;
				}
				
			    public Double NB_MT_VENTE;

				public Double getNB_MT_VENTE () {
					return this.NB_MT_VENTE;
				}
				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
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
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
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

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
						this.ID_DIM_PRODUIT = readInteger(dis);
					
						this.ID_DIM_CLIENT = readInteger(dis);
					
						this.ID_DIM_CALENDRIER = readInteger(dis);
					
						this.NB_VENTE = readInteger(dis);
					
						this.NB_QTE_VENTE = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.NB_MT_ACHAT = null;
           				} else {
           			    	this.NB_MT_ACHAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.NB_MT_VENTE = null;
           				} else {
           			    	this.NB_MT_VENTE = dis.readDouble();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
						this.ID_DIM_PRODUIT = readInteger(dis);
					
						this.ID_DIM_CLIENT = readInteger(dis);
					
						this.ID_DIM_CALENDRIER = readInteger(dis);
					
						this.NB_VENTE = readInteger(dis);
					
						this.NB_QTE_VENTE = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.NB_MT_ACHAT = null;
           				} else {
           			    	this.NB_MT_ACHAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.NB_MT_VENTE = null;
           				} else {
           			    	this.NB_MT_VENTE = dis.readDouble();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Integer
				
						writeInteger(this.ID_DIM_PRODUIT,dos);
					
					// Integer
				
						writeInteger(this.ID_DIM_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.ID_DIM_CALENDRIER,dos);
					
					// Integer
				
						writeInteger(this.NB_VENTE,dos);
					
					// Integer
				
						writeInteger(this.NB_QTE_VENTE,dos);
					
					// Double
				
						if(this.NB_MT_ACHAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.NB_MT_ACHAT);
		            	}
					
					// Double
				
						if(this.NB_MT_VENTE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.NB_MT_VENTE);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Integer
				
						writeInteger(this.ID_DIM_PRODUIT,dos);
					
					// Integer
				
						writeInteger(this.ID_DIM_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.ID_DIM_CALENDRIER,dos);
					
					// Integer
				
						writeInteger(this.NB_VENTE,dos);
					
					// Integer
				
						writeInteger(this.NB_QTE_VENTE,dos);
					
					// Double
				
						if(this.NB_MT_ACHAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.NB_MT_ACHAT);
		            	}
					
					// Double
				
						if(this.NB_MT_VENTE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.NB_MT_VENTE);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_DIM_PRODUIT="+String.valueOf(ID_DIM_PRODUIT));
		sb.append(",ID_DIM_CLIENT="+String.valueOf(ID_DIM_CLIENT));
		sb.append(",ID_DIM_CALENDRIER="+String.valueOf(ID_DIM_CALENDRIER));
		sb.append(",NB_VENTE="+String.valueOf(NB_VENTE));
		sb.append(",NB_QTE_VENTE="+String.valueOf(NB_QTE_VENTE));
		sb.append(",NB_MT_ACHAT="+String.valueOf(NB_MT_ACHAT));
		sb.append(",NB_MT_VENTE="+String.valueOf(NB_MT_VENTE));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row2Struct other) {

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

public static class OnRowsEndStructtAggregateRow_1 implements routines.system.IPersistableRow<OnRowsEndStructtAggregateRow_1> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];

	
			    public Integer ID_DIM_PRODUIT;

				public Integer getID_DIM_PRODUIT () {
					return this.ID_DIM_PRODUIT;
				}
				
			    public Integer ID_DIM_CLIENT;

				public Integer getID_DIM_CLIENT () {
					return this.ID_DIM_CLIENT;
				}
				
			    public Integer ID_DIM_CALENDRIER;

				public Integer getID_DIM_CALENDRIER () {
					return this.ID_DIM_CALENDRIER;
				}
				
			    public Integer NB_VENTE;

				public Integer getNB_VENTE () {
					return this.NB_VENTE;
				}
				
			    public Integer NB_QTE_VENTE;

				public Integer getNB_QTE_VENTE () {
					return this.NB_QTE_VENTE;
				}
				
			    public Double NB_MT_ACHAT;

				public Double getNB_MT_ACHAT () {
					return this.NB_MT_ACHAT;
				}
				
			    public Double NB_MT_VENTE;

				public Double getNB_MT_VENTE () {
					return this.NB_MT_VENTE;
				}
				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
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
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
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

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
						this.ID_DIM_PRODUIT = readInteger(dis);
					
						this.ID_DIM_CLIENT = readInteger(dis);
					
						this.ID_DIM_CALENDRIER = readInteger(dis);
					
						this.NB_VENTE = readInteger(dis);
					
						this.NB_QTE_VENTE = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.NB_MT_ACHAT = null;
           				} else {
           			    	this.NB_MT_ACHAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.NB_MT_VENTE = null;
           				} else {
           			    	this.NB_MT_VENTE = dis.readDouble();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
						this.ID_DIM_PRODUIT = readInteger(dis);
					
						this.ID_DIM_CLIENT = readInteger(dis);
					
						this.ID_DIM_CALENDRIER = readInteger(dis);
					
						this.NB_VENTE = readInteger(dis);
					
						this.NB_QTE_VENTE = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.NB_MT_ACHAT = null;
           				} else {
           			    	this.NB_MT_ACHAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.NB_MT_VENTE = null;
           				} else {
           			    	this.NB_MT_VENTE = dis.readDouble();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Integer
				
						writeInteger(this.ID_DIM_PRODUIT,dos);
					
					// Integer
				
						writeInteger(this.ID_DIM_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.ID_DIM_CALENDRIER,dos);
					
					// Integer
				
						writeInteger(this.NB_VENTE,dos);
					
					// Integer
				
						writeInteger(this.NB_QTE_VENTE,dos);
					
					// Double
				
						if(this.NB_MT_ACHAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.NB_MT_ACHAT);
		            	}
					
					// Double
				
						if(this.NB_MT_VENTE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.NB_MT_VENTE);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Integer
				
						writeInteger(this.ID_DIM_PRODUIT,dos);
					
					// Integer
				
						writeInteger(this.ID_DIM_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.ID_DIM_CALENDRIER,dos);
					
					// Integer
				
						writeInteger(this.NB_VENTE,dos);
					
					// Integer
				
						writeInteger(this.NB_QTE_VENTE,dos);
					
					// Double
				
						if(this.NB_MT_ACHAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.NB_MT_ACHAT);
		            	}
					
					// Double
				
						if(this.NB_MT_VENTE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.NB_MT_VENTE);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_DIM_PRODUIT="+String.valueOf(ID_DIM_PRODUIT));
		sb.append(",ID_DIM_CLIENT="+String.valueOf(ID_DIM_CLIENT));
		sb.append(",ID_DIM_CALENDRIER="+String.valueOf(ID_DIM_CALENDRIER));
		sb.append(",NB_VENTE="+String.valueOf(NB_VENTE));
		sb.append(",NB_QTE_VENTE="+String.valueOf(NB_QTE_VENTE));
		sb.append(",NB_MT_ACHAT="+String.valueOf(NB_MT_ACHAT));
		sb.append(",NB_MT_VENTE="+String.valueOf(NB_MT_VENTE));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(OnRowsEndStructtAggregateRow_1 other) {

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

public static class row1Struct implements routines.system.IPersistableRow<row1Struct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];

	
			    public Integer ID_DIM_PRODUIT;

				public Integer getID_DIM_PRODUIT () {
					return this.ID_DIM_PRODUIT;
				}
				
			    public Integer ID_DIM_CLIENT;

				public Integer getID_DIM_CLIENT () {
					return this.ID_DIM_CLIENT;
				}
				
			    public Integer ID_DIM_CALENDRIER;

				public Integer getID_DIM_CALENDRIER () {
					return this.ID_DIM_CALENDRIER;
				}
				
			    public String ID_VENTE;

				public String getID_VENTE () {
					return this.ID_VENTE;
				}
				
			    public Integer QTE_VENTE;

				public Integer getQTE_VENTE () {
					return this.QTE_VENTE;
				}
				
			    public Double MT_ACHAT;

				public Double getMT_ACHAT () {
					return this.MT_ACHAT;
				}
				
			    public Double MT_VENTE;

				public Double getMT_VENTE () {
					return this.MT_VENTE;
				}
				
			    public String CD_PRODUIT;

				public String getCD_PRODUIT () {
					return this.CD_PRODUIT;
				}
				
			    public String ID_CLIENT;

				public String getID_CLIENT () {
					return this.ID_CLIENT;
				}
				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
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
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
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

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
						this.ID_DIM_PRODUIT = readInteger(dis);
					
						this.ID_DIM_CLIENT = readInteger(dis);
					
						this.ID_DIM_CALENDRIER = readInteger(dis);
					
					this.ID_VENTE = readString(dis);
					
						this.QTE_VENTE = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MT_ACHAT = null;
           				} else {
           			    	this.MT_ACHAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MT_VENTE = null;
           				} else {
           			    	this.MT_VENTE = dis.readDouble();
           				}
					
					this.CD_PRODUIT = readString(dis);
					
					this.ID_CLIENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
						this.ID_DIM_PRODUIT = readInteger(dis);
					
						this.ID_DIM_CLIENT = readInteger(dis);
					
						this.ID_DIM_CALENDRIER = readInteger(dis);
					
					this.ID_VENTE = readString(dis);
					
						this.QTE_VENTE = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MT_ACHAT = null;
           				} else {
           			    	this.MT_ACHAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MT_VENTE = null;
           				} else {
           			    	this.MT_VENTE = dis.readDouble();
           				}
					
					this.CD_PRODUIT = readString(dis);
					
					this.ID_CLIENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Integer
				
						writeInteger(this.ID_DIM_PRODUIT,dos);
					
					// Integer
				
						writeInteger(this.ID_DIM_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.ID_DIM_CALENDRIER,dos);
					
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// Integer
				
						writeInteger(this.QTE_VENTE,dos);
					
					// Double
				
						if(this.MT_ACHAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.MT_ACHAT);
		            	}
					
					// Double
				
						if(this.MT_VENTE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.MT_VENTE);
		            	}
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Integer
				
						writeInteger(this.ID_DIM_PRODUIT,dos);
					
					// Integer
				
						writeInteger(this.ID_DIM_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.ID_DIM_CALENDRIER,dos);
					
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// Integer
				
						writeInteger(this.QTE_VENTE,dos);
					
					// Double
				
						if(this.MT_ACHAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.MT_ACHAT);
		            	}
					
					// Double
				
						if(this.MT_VENTE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.MT_VENTE);
		            	}
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_DIM_PRODUIT="+String.valueOf(ID_DIM_PRODUIT));
		sb.append(",ID_DIM_CLIENT="+String.valueOf(ID_DIM_CLIENT));
		sb.append(",ID_DIM_CALENDRIER="+String.valueOf(ID_DIM_CALENDRIER));
		sb.append(",ID_VENTE="+ID_VENTE);
		sb.append(",QTE_VENTE="+String.valueOf(QTE_VENTE));
		sb.append(",MT_ACHAT="+String.valueOf(MT_ACHAT));
		sb.append(",MT_VENTE="+String.valueOf(MT_VENTE));
		sb.append(",CD_PRODUIT="+CD_PRODUIT);
		sb.append(",ID_CLIENT="+ID_CLIENT);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row1Struct other) {

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
public void tHashInput_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tHashInput_1_SUBPROCESS_STATE", 0);

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



		row1Struct row1 = new row1Struct();
row2Struct row2 = new row2Struct();
insertVenteStruct insertVente = new insertVenteStruct();




	
	/**
	 * [tAggregateRow_1_AGGOUT begin ] start
	 */

	

	
		
		ok_Hash.put("tAggregateRow_1_AGGOUT", false);
		start_Hash.put("tAggregateRow_1_AGGOUT", System.currentTimeMillis());
		
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row1");
					}
				
		int tos_count_tAggregateRow_1_AGGOUT = 0;
		

// ------------ Seems it is not used

java.util.Map hashAggreg_tAggregateRow_1 = new java.util.HashMap(); 

// ------------

	class UtilClass_tAggregateRow_1 { // G_OutBegin_AggR_144

		public double sd(Double[] data) {
	        final int n = data.length;
        	if (n < 2) {
	            return Double.NaN;
        	}
        	double d1 = 0d;
        	double d2 =0d;
	        
	        for (int i = 0; i < data.length; i++) {
            	d1 += (data[i]*data[i]);
            	d2 += data[i];
        	}
        
	        return Math.sqrt((n*d1 - d2*d2)/n/(n-1));
	    }
	    
		public void checkedIADD(byte a, byte b, boolean checkTypeOverFlow, boolean checkUlp) {
		    byte r = (byte) (a + b);
		    if (checkTypeOverFlow && ((a ^ r) & (b ^ r)) < 0) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'short/Short'", "'byte/Byte'"));
		    }
		}
		
		public void checkedIADD(short a, short b, boolean checkTypeOverFlow, boolean checkUlp) {
		    short r = (short) (a + b);
		    if (checkTypeOverFlow && ((a ^ r) & (b ^ r)) < 0) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'int/Integer'", "'short/Short'"));
		    }
		}
		
		public void checkedIADD(int a, int b, boolean checkTypeOverFlow, boolean checkUlp) {
		    int r = a + b;
		    if (checkTypeOverFlow && ((a ^ r) & (b ^ r)) < 0) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'long/Long'", "'int/Integer'"));
		    }
		}
		
		public void checkedIADD(long a, long b, boolean checkTypeOverFlow, boolean checkUlp) {
		    long r = a + b;
		    if (checkTypeOverFlow && ((a ^ r) & (b ^ r)) < 0) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'BigDecimal'", "'long/Long'"));
		    }
		}
		
		public void checkedIADD(float a, float b, boolean checkTypeOverFlow, boolean checkUlp) {
		
			if(checkUlp) {
			    float minAddedValue = Math.ulp(a);
			    if (minAddedValue > Math.abs(b)) {
			        throw new RuntimeException(buildPrecisionMessage(String.valueOf(a), String.valueOf(b), "'double' or 'BigDecimal'", "'float/Float'"));
			    }
			}
			
		    if (checkTypeOverFlow && ((double) a + (double) b > (double) Float.MAX_VALUE) || ((double) a + (double) b < (double) -Float.MAX_VALUE)) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'double' or 'BigDecimal'", "'float/Float'"));
		    }
		}
		
		public void checkedIADD(double a, double b, boolean checkTypeOverFlow, boolean checkUlp) {
		
			if(checkUlp) {
			    double minAddedValue = Math.ulp(a);
			    if (minAddedValue > Math.abs(b)) {
			        throw new RuntimeException(buildPrecisionMessage(String.valueOf(a), String.valueOf(a), "'BigDecimal'", "'double/Double'"));
			    }
			}
		
		    if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE )) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'BigDecimal'", "'double/Double'"));
		    }
		}
		
		public void checkedIADD(double a, byte b, boolean checkTypeOverFlow, boolean checkUlp) {
		
		    if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE )) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'BigDecimal'", "'double/Double'"));
		    }
		}
		
		public void checkedIADD(double a, short b, boolean checkTypeOverFlow, boolean checkUlp) {
		
		    if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE )) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'BigDecimal'", "'double/Double'"));
		    }
		}
		
		public void checkedIADD(double a, int b, boolean checkTypeOverFlow, boolean checkUlp) {
		
		    if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE )) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'BigDecimal'", "'double/Double'"));
		    }
		}
		
		public void checkedIADD(double a, float b, boolean checkTypeOverFlow, boolean checkUlp) {
		
			if(checkUlp) {
			    double minAddedValue = Math.ulp(a);
			    if (minAddedValue > Math.abs(b)) {
			        throw new RuntimeException(buildPrecisionMessage(String.valueOf(a), String.valueOf(a), "'BigDecimal'", "'double/Double'"));
			    }
			}
		
		    if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE )) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'BigDecimal'", "'double/Double'"));
		    }
		}
		
		private String buildOverflowMessage(String a, String b, String advicedTypes, String originalType) {
		    return "Type overflow when adding " + b + " to " + a
		    + ", to resolve this problem, increase the precision by using "+ advicedTypes +" type in place of "+ originalType +".";
		}
		
		private String buildPrecisionMessage(String a, String b, String advicedTypes, String originalType) {
		    return "The double precision is unsufficient to add the value " + b + " to " + a
		    + ", to resolve this problem, increase the precision by using "+ advicedTypes +" type in place of "+ originalType +".";
		}

	} // G_OutBegin_AggR_144

	UtilClass_tAggregateRow_1 utilClass_tAggregateRow_1 = new UtilClass_tAggregateRow_1();

	

	class AggOperationStruct_tAggregateRow_1 { // G_OutBegin_AggR_100

		private static final int DEFAULT_HASHCODE = 1;
	    private static final int PRIME = 31;
	    private int hashCode = DEFAULT_HASHCODE;
	    public boolean hashCodeDirty = true;

    				Integer ID_DIM_PRODUIT;
    				Integer ID_DIM_CLIENT;
    				Integer ID_DIM_CALENDRIER;int count = 0;
       			int NB_VENTE_clmCount = 0;
           			
         			Integer NB_QTE_VENTE_sum;BigDecimal NB_MT_ACHAT_sum;
           			BigDecimal NB_MT_VENTE_sum;
           			
        
	    @Override
		public int hashCode() {
			if (this.hashCodeDirty) {
				final int prime = PRIME;
				int result = DEFAULT_HASHCODE;
		
							result = prime * result + ((this.ID_DIM_PRODUIT == null) ? 0 : this.ID_DIM_PRODUIT.hashCode());
							
							result = prime * result + ((this.ID_DIM_CLIENT == null) ? 0 : this.ID_DIM_CLIENT.hashCode());
							
							result = prime * result + ((this.ID_DIM_CALENDRIER == null) ? 0 : this.ID_DIM_CALENDRIER.hashCode());
							
	    		this.hashCode = result;
	    		this.hashCodeDirty = false;		
			}
			return this.hashCode;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj) return true;
			if (obj == null) return false;
			if (getClass() != obj.getClass()) return false;
			final AggOperationStruct_tAggregateRow_1 other = (AggOperationStruct_tAggregateRow_1) obj;
			
							if (this.ID_DIM_PRODUIT == null) {
								if (other.ID_DIM_PRODUIT != null) 
									return false;
							} else if (!this.ID_DIM_PRODUIT.equals(other.ID_DIM_PRODUIT)) 
								return false;
						
							if (this.ID_DIM_CLIENT == null) {
								if (other.ID_DIM_CLIENT != null) 
									return false;
							} else if (!this.ID_DIM_CLIENT.equals(other.ID_DIM_CLIENT)) 
								return false;
						
							if (this.ID_DIM_CALENDRIER == null) {
								if (other.ID_DIM_CALENDRIER != null) 
									return false;
							} else if (!this.ID_DIM_CALENDRIER.equals(other.ID_DIM_CALENDRIER)) 
								return false;
						
			
			return true;
		}
  
        
	} // G_OutBegin_AggR_100

	AggOperationStruct_tAggregateRow_1 operation_result_tAggregateRow_1 = null;
	AggOperationStruct_tAggregateRow_1 operation_finder_tAggregateRow_1 = new AggOperationStruct_tAggregateRow_1();
	java.util.Map<AggOperationStruct_tAggregateRow_1,AggOperationStruct_tAggregateRow_1> hash_tAggregateRow_1 = new java.util.HashMap<AggOperationStruct_tAggregateRow_1,AggOperationStruct_tAggregateRow_1>();
	

 



/**
 * [tAggregateRow_1_AGGOUT begin ] stop
 */



	
	/**
	 * [tHashInput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tHashInput_1", false);
		start_Hash.put("tHashInput_1", System.currentTimeMillis());
		
	
	currentComponent="tHashInput_1";

	
		int tos_count_tHashInput_1 = 0;
		


int nb_line_tHashInput_1 = 0;
	
org.talend.designer.components.hashfile.common.MapHashFile mf_tHashInput_1=org.talend.designer.components.hashfile.common.MapHashFile.getMapHashFile();
org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<venteToInsertStruct> tHashFile_tHashInput_1 = mf_tHashInput_1.getAdvancedMemoryHashFile("tHashFile_jDwhVente_" + pid +"_tHashOutput_1");
if(tHashFile_tHashInput_1==null) {
	throw new RuntimeException("The hash is not initialized : The hash must exist before you read from it");
}
java.util.Iterator<venteToInsertStruct> iterator_tHashInput_1 = tHashFile_tHashInput_1.iterator();
while (iterator_tHashInput_1.hasNext()) {
    venteToInsertStruct next_tHashInput_1 = iterator_tHashInput_1.next();

	row1.ID_DIM_PRODUIT = next_tHashInput_1.ID_DIM_PRODUIT;
	row1.ID_DIM_CLIENT = next_tHashInput_1.ID_DIM_CLIENT;
	row1.ID_DIM_CALENDRIER = next_tHashInput_1.ID_DIM_CALENDRIER;
	row1.ID_VENTE = next_tHashInput_1.ID_VENTE;
	row1.QTE_VENTE = next_tHashInput_1.QTE_VENTE;
	row1.MT_ACHAT = next_tHashInput_1.MT_ACHAT;
	row1.MT_VENTE = next_tHashInput_1.MT_VENTE;
	row1.CD_PRODUIT = next_tHashInput_1.CD_PRODUIT;
	row1.ID_CLIENT = next_tHashInput_1.ID_CLIENT;

 



/**
 * [tHashInput_1 begin ] stop
 */
	
	/**
	 * [tHashInput_1 main ] start
	 */

	

	
	
	currentComponent="tHashInput_1";

	

 


	tos_count_tHashInput_1++;

/**
 * [tHashInput_1 main ] stop
 */
	
	/**
	 * [tHashInput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tHashInput_1";

	

 



/**
 * [tHashInput_1 process_data_begin ] stop
 */

	
	/**
	 * [tAggregateRow_1_AGGOUT main ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row1"
						
						);
					}
					
	
operation_finder_tAggregateRow_1.ID_DIM_PRODUIT = row1.ID_DIM_PRODUIT;
			operation_finder_tAggregateRow_1.ID_DIM_CLIENT = row1.ID_DIM_CLIENT;
			operation_finder_tAggregateRow_1.ID_DIM_CALENDRIER = row1.ID_DIM_CALENDRIER;
			

	operation_finder_tAggregateRow_1.hashCodeDirty = true;
	
	operation_result_tAggregateRow_1 = hash_tAggregateRow_1.get(operation_finder_tAggregateRow_1);

	

	if(operation_result_tAggregateRow_1 == null) { // G_OutMain_AggR_001

		operation_result_tAggregateRow_1 = new AggOperationStruct_tAggregateRow_1();

		operation_result_tAggregateRow_1.ID_DIM_PRODUIT = operation_finder_tAggregateRow_1.ID_DIM_PRODUIT;
				operation_result_tAggregateRow_1.ID_DIM_CLIENT = operation_finder_tAggregateRow_1.ID_DIM_CLIENT;
				operation_result_tAggregateRow_1.ID_DIM_CALENDRIER = operation_finder_tAggregateRow_1.ID_DIM_CALENDRIER;
				
		
		

		hash_tAggregateRow_1.put(operation_result_tAggregateRow_1, operation_result_tAggregateRow_1);
	
	} // G_OutMain_AggR_001


	
				operation_result_tAggregateRow_1.NB_VENTE_clmCount++;
				operation_result_tAggregateRow_1.count++;
				
					if(operation_result_tAggregateRow_1.NB_QTE_VENTE_sum == null) {
						operation_result_tAggregateRow_1.NB_QTE_VENTE_sum = (int) 0;
					}
					
					if( row1.QTE_VENTE != null)
						operation_result_tAggregateRow_1.NB_QTE_VENTE_sum += row1.QTE_VENTE;
					if(operation_result_tAggregateRow_1.NB_MT_ACHAT_sum == null) {
						operation_result_tAggregateRow_1.NB_MT_ACHAT_sum = new BigDecimal(0);
					}
					operation_result_tAggregateRow_1.NB_MT_ACHAT_sum = operation_result_tAggregateRow_1.NB_MT_ACHAT_sum.add(
						new BigDecimal(
							String.valueOf(
								row1.MT_ACHAT
							)
						)
					);
					
					if(operation_result_tAggregateRow_1.NB_MT_VENTE_sum == null) {
						operation_result_tAggregateRow_1.NB_MT_VENTE_sum = new BigDecimal(0);
					}
					operation_result_tAggregateRow_1.NB_MT_VENTE_sum = operation_result_tAggregateRow_1.NB_MT_VENTE_sum.add(
						new BigDecimal(
							String.valueOf(
								row1.MT_VENTE
							)
						)
					);
					


 


	tos_count_tAggregateRow_1_AGGOUT++;

/**
 * [tAggregateRow_1_AGGOUT main ] stop
 */
	
	/**
	 * [tAggregateRow_1_AGGOUT process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";

	

 



/**
 * [tAggregateRow_1_AGGOUT process_data_begin ] stop
 */
	
	/**
	 * [tAggregateRow_1_AGGOUT process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";

	

 



/**
 * [tAggregateRow_1_AGGOUT process_data_end ] stop
 */



	
	/**
	 * [tHashInput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tHashInput_1";

	

 



/**
 * [tHashInput_1 process_data_end ] stop
 */
	
	/**
	 * [tHashInput_1 end ] start
	 */

	

	
	
	currentComponent="tHashInput_1";

	
    

		
			nb_line_tHashInput_1++;
		}	
    	
		org.talend.designer.components.hashfile.common.MapHashFile.resourceLockMap.remove("tHashFile_jDwhVente_" + pid +"_tHashOutput_1");
	


	globalMap.put("tHashInput_1_NB_LINE", nb_line_tHashInput_1);       

 

ok_Hash.put("tHashInput_1", true);
end_Hash.put("tHashInput_1", System.currentTimeMillis());




/**
 * [tHashInput_1 end ] stop
 */

	
	/**
	 * [tAggregateRow_1_AGGOUT end ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";

	

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row1");
			  	}
			  	
 

ok_Hash.put("tAggregateRow_1_AGGOUT", true);
end_Hash.put("tAggregateRow_1_AGGOUT", System.currentTimeMillis());




/**
 * [tAggregateRow_1_AGGOUT end ] stop
 */



	
	/**
	 * [tDBOutput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_2", false);
		start_Hash.put("tDBOutput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"insertVente");
					}
				
		int tos_count_tDBOutput_2 = 0;
		





String dbschema_tDBOutput_2 = null;
	dbschema_tDBOutput_2 = (String)globalMap.get("schema_" + "tDBConnection_2");
	

String tableName_tDBOutput_2 = null;
if(dbschema_tDBOutput_2 == null || dbschema_tDBOutput_2.trim().length() == 0) {
	tableName_tDBOutput_2 = ("FAIT_VENTE");
} else {
	tableName_tDBOutput_2 = dbschema_tDBOutput_2 + "\".\"" + ("FAIT_VENTE");
}


int nb_line_tDBOutput_2 = 0;
int nb_line_update_tDBOutput_2 = 0;
int nb_line_inserted_tDBOutput_2 = 0;
int nb_line_deleted_tDBOutput_2 = 0;
int nb_line_rejected_tDBOutput_2 = 0;

int deletedCount_tDBOutput_2=0;
int updatedCount_tDBOutput_2=0;
int insertedCount_tDBOutput_2=0;
int rowsToCommitCount_tDBOutput_2=0;
int rejectedCount_tDBOutput_2=0;

boolean whetherReject_tDBOutput_2 = false;

java.sql.Connection conn_tDBOutput_2 = null;
String dbUser_tDBOutput_2 = null;

	conn_tDBOutput_2 = (java.sql.Connection)globalMap.get("conn_tDBConnection_2");
	
	


   int batchSize_tDBOutput_2 = 10000;
   int batchSizeCounter_tDBOutput_2=0;

int count_tDBOutput_2=0;
	    String insert_tDBOutput_2 = "INSERT INTO \"" + tableName_tDBOutput_2 + "\" (\"ID_DIM_PRODUIT\",\"ID_DIM_CLIENT\",\"ID_DIM_CALENDRIER\",\"NB_VENTE\",\"NB_QTE_VENTE\",\"NB_MT_ACHAT\",\"NB_MT_VENTE\",\"DT_INSERTION\",\"LB_JOB_NAME\") VALUES (?,?,?,?,?,?,?,?,?)";
	    
	    java.sql.PreparedStatement pstmt_tDBOutput_2 = conn_tDBOutput_2.prepareStatement(insert_tDBOutput_2);
	    resourceMap.put("pstmt_tDBOutput_2", pstmt_tDBOutput_2);
	    

 



/**
 * [tDBOutput_2 begin ] stop
 */



	
	/**
	 * [tMap_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_2", false);
		start_Hash.put("tMap_2", System.currentTimeMillis());
		
	
	currentComponent="tMap_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row2");
					}
				
		int tos_count_tMap_2 = 0;
		




// ###############################
// # Lookup's keys initialization
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_2__Struct  {
}
Var__tMap_2__Struct Var__tMap_2 = new Var__tMap_2__Struct();
// ###############################

// ###############################
// # Outputs initialization
insertVenteStruct insertVente_tmp = new insertVenteStruct();
// ###############################

        
        



        









 



/**
 * [tMap_2 begin ] stop
 */



	
	/**
	 * [tAggregateRow_1_AGGIN begin ] start
	 */

	

	
		
		ok_Hash.put("tAggregateRow_1_AGGIN", false);
		start_Hash.put("tAggregateRow_1_AGGIN", System.currentTimeMillis());
		
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGIN";

	
		int tos_count_tAggregateRow_1_AGGIN = 0;
		

java.util.Collection<AggOperationStruct_tAggregateRow_1> values_tAggregateRow_1 = hash_tAggregateRow_1.values();

globalMap.put("tAggregateRow_1_NB_LINE", values_tAggregateRow_1.size());

for(AggOperationStruct_tAggregateRow_1 aggregated_row_tAggregateRow_1 : values_tAggregateRow_1) { // G_AggR_600



 



/**
 * [tAggregateRow_1_AGGIN begin ] stop
 */
	
	/**
	 * [tAggregateRow_1_AGGIN main ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGIN";

	

            				    row2.ID_DIM_PRODUIT = aggregated_row_tAggregateRow_1.ID_DIM_PRODUIT;
            				    
            				    row2.ID_DIM_CLIENT = aggregated_row_tAggregateRow_1.ID_DIM_CLIENT;
            				    
            				    row2.ID_DIM_CALENDRIER = aggregated_row_tAggregateRow_1.ID_DIM_CALENDRIER;
            				    row2.NB_VENTE = (int) aggregated_row_tAggregateRow_1.count;
	                                	row2.NB_VENTE = (int) aggregated_row_tAggregateRow_1.NB_VENTE_clmCount;
	                                	row2.NB_QTE_VENTE = aggregated_row_tAggregateRow_1.NB_QTE_VENTE_sum;
                                	
    								if(aggregated_row_tAggregateRow_1.NB_MT_ACHAT_sum != null) {
    								row2.NB_MT_ACHAT = aggregated_row_tAggregateRow_1.NB_MT_ACHAT_sum.doubleValue();
										
    								}else{
    								
    									row2.NB_MT_ACHAT = null;
    									
    								}
    								
    								if(aggregated_row_tAggregateRow_1.NB_MT_VENTE_sum != null) {
    								row2.NB_MT_VENTE = aggregated_row_tAggregateRow_1.NB_MT_VENTE_sum.doubleValue();
										
    								}else{
    								
    									row2.NB_MT_VENTE = null;
    									
    								}
    								

 


	tos_count_tAggregateRow_1_AGGIN++;

/**
 * [tAggregateRow_1_AGGIN main ] stop
 */
	
	/**
	 * [tAggregateRow_1_AGGIN process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGIN";

	

 



/**
 * [tAggregateRow_1_AGGIN process_data_begin ] stop
 */

	
	/**
	 * [tMap_2 main ] start
	 */

	

	
	
	currentComponent="tMap_2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row2"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_2 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_2 = false;
		  boolean mainRowRejected_tMap_2 = false;
            				    								  
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_2__Struct Var = Var__tMap_2;// ###############################
        // ###############################
        // # Output tables

insertVente = null;


// # Output table : 'insertVente'
insertVente_tmp.ID_DIM_PRODUIT = row2.ID_DIM_PRODUIT ;
insertVente_tmp.ID_DIM_CLIENT = row2.ID_DIM_CLIENT ;
insertVente_tmp.ID_DIM_CALENDRIER = row2.ID_DIM_CALENDRIER ;
insertVente_tmp.NB_VENTE = row2.NB_VENTE ;
insertVente_tmp.NB_QTE_VENTE = row2.NB_QTE_VENTE ;
insertVente_tmp.NB_MT_ACHAT = row2.NB_MT_ACHAT ;
insertVente_tmp.NB_MT_VENTE = row2.NB_MT_VENTE ;
insertVente_tmp.DT_INSERTION = TalendDate.getCurrentDate();
insertVente_tmp.LB_JOB_NAME = jobName;
insertVente = insertVente_tmp;
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

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 process_data_begin ] stop
 */
// Start of branch "insertVente"
if(insertVente != null) { 



	
	/**
	 * [tDBOutput_2 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"insertVente"
						
						);
					}
					



        whetherReject_tDBOutput_2 = false;
                    if(insertVente.ID_DIM_PRODUIT == null) {
pstmt_tDBOutput_2.setNull(1, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setInt(1, insertVente.ID_DIM_PRODUIT);
}

                    if(insertVente.ID_DIM_CLIENT == null) {
pstmt_tDBOutput_2.setNull(2, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setInt(2, insertVente.ID_DIM_CLIENT);
}

                    if(insertVente.ID_DIM_CALENDRIER == null) {
pstmt_tDBOutput_2.setNull(3, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setInt(3, insertVente.ID_DIM_CALENDRIER);
}

                    if(insertVente.NB_VENTE == null) {
pstmt_tDBOutput_2.setNull(4, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setInt(4, insertVente.NB_VENTE);
}

                    if(insertVente.NB_QTE_VENTE == null) {
pstmt_tDBOutput_2.setNull(5, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setInt(5, insertVente.NB_QTE_VENTE);
}

                    if(insertVente.NB_MT_ACHAT == null) {
pstmt_tDBOutput_2.setNull(6, java.sql.Types.DOUBLE);
} else {pstmt_tDBOutput_2.setDouble(6, insertVente.NB_MT_ACHAT);
}

                    if(insertVente.NB_MT_VENTE == null) {
pstmt_tDBOutput_2.setNull(7, java.sql.Types.DOUBLE);
} else {pstmt_tDBOutput_2.setDouble(7, insertVente.NB_MT_VENTE);
}

                    if(insertVente.DT_INSERTION != null) {
pstmt_tDBOutput_2.setTimestamp(8, new java.sql.Timestamp(insertVente.DT_INSERTION.getTime()));
} else {
pstmt_tDBOutput_2.setNull(8, java.sql.Types.TIMESTAMP);
}

                    if(insertVente.LB_JOB_NAME == null) {
pstmt_tDBOutput_2.setNull(9, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(9, insertVente.LB_JOB_NAME);
}

			
    		pstmt_tDBOutput_2.addBatch();
    		nb_line_tDBOutput_2++;
    		  
    		  
    		  batchSizeCounter_tDBOutput_2++;
    		  
    			if ((batchSize_tDBOutput_2 > 0) && (batchSize_tDBOutput_2 <= batchSizeCounter_tDBOutput_2)) {
                try {
						int countSum_tDBOutput_2 = 0;
						    
						for(int countEach_tDBOutput_2: pstmt_tDBOutput_2.executeBatch()) {
							countSum_tDBOutput_2 += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
						}
				    	rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;
				    	
				    		insertedCount_tDBOutput_2 += countSum_tDBOutput_2;
				    	
            	    	batchSizeCounter_tDBOutput_2 = 0;
                }catch (java.sql.BatchUpdateException e_tDBOutput_2){
globalMap.put("tDBOutput_2_ERROR_MESSAGE",e_tDBOutput_2.getMessage());
				    	java.sql.SQLException ne_tDBOutput_2 = e_tDBOutput_2.getNextException(),sqle_tDBOutput_2=null;
				    	String errormessage_tDBOutput_2;
						if (ne_tDBOutput_2 != null) {
							// build new exception to provide the original cause
							sqle_tDBOutput_2 = new java.sql.SQLException(e_tDBOutput_2.getMessage() + "\ncaused by: " + ne_tDBOutput_2.getMessage(), ne_tDBOutput_2.getSQLState(), ne_tDBOutput_2.getErrorCode(), ne_tDBOutput_2);
							errormessage_tDBOutput_2 = sqle_tDBOutput_2.getMessage();
						}else{
							errormessage_tDBOutput_2 = e_tDBOutput_2.getMessage();
						}
				    	
				    	int countSum_tDBOutput_2 = 0;
						for(int countEach_tDBOutput_2: e_tDBOutput_2.getUpdateCounts()) {
							countSum_tDBOutput_2 += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
						}
						rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;
						
				    		insertedCount_tDBOutput_2 += countSum_tDBOutput_2;
				    	
				    	System.err.println(errormessage_tDBOutput_2);
				    	
					}
    			}
    		

 


	tos_count_tDBOutput_2++;

/**
 * [tDBOutput_2 main ] stop
 */
	
	/**
	 * [tDBOutput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	

 



/**
 * [tDBOutput_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	

 



/**
 * [tDBOutput_2 process_data_end ] stop
 */

} // End of branch "insertVente"




	
	/**
	 * [tMap_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 process_data_end ] stop
 */



	
	/**
	 * [tAggregateRow_1_AGGIN process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGIN";

	

 



/**
 * [tAggregateRow_1_AGGIN process_data_end ] stop
 */
	
	/**
	 * [tAggregateRow_1_AGGIN end ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGIN";

	

} // G_AggR_600

 

ok_Hash.put("tAggregateRow_1_AGGIN", true);
end_Hash.put("tAggregateRow_1_AGGIN", System.currentTimeMillis());




/**
 * [tAggregateRow_1_AGGIN end ] stop
 */

	
	/**
	 * [tMap_2 end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	


// ###############################
// # Lookup hashes releasing
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row2");
			  	}
			  	
 

ok_Hash.put("tMap_2", true);
end_Hash.put("tMap_2", System.currentTimeMillis());




/**
 * [tMap_2 end ] stop
 */

	
	/**
	 * [tDBOutput_2 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	



	    try {
				int countSum_tDBOutput_2 = 0;
				if (pstmt_tDBOutput_2 != null && batchSizeCounter_tDBOutput_2 > 0) {
						
					for(int countEach_tDBOutput_2: pstmt_tDBOutput_2.executeBatch()) {
						countSum_tDBOutput_2 += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
					}
					rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;
						
				}
		    	
		    		insertedCount_tDBOutput_2 += countSum_tDBOutput_2;
		    	
	    }catch (java.sql.BatchUpdateException e_tDBOutput_2){
globalMap.put("tDBOutput_2_ERROR_MESSAGE",e_tDBOutput_2.getMessage());
	    	java.sql.SQLException ne_tDBOutput_2 = e_tDBOutput_2.getNextException(),sqle_tDBOutput_2=null;
	    	String errormessage_tDBOutput_2;
			if (ne_tDBOutput_2 != null) {
				// build new exception to provide the original cause
				sqle_tDBOutput_2 = new java.sql.SQLException(e_tDBOutput_2.getMessage() + "\ncaused by: " + ne_tDBOutput_2.getMessage(), ne_tDBOutput_2.getSQLState(), ne_tDBOutput_2.getErrorCode(), ne_tDBOutput_2);
				errormessage_tDBOutput_2 = sqle_tDBOutput_2.getMessage();
			}else{
				errormessage_tDBOutput_2 = e_tDBOutput_2.getMessage();
			}
	    	
	    	int countSum_tDBOutput_2 = 0;
			for(int countEach_tDBOutput_2: e_tDBOutput_2.getUpdateCounts()) {
				countSum_tDBOutput_2 += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
			}
			rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;
			
	    		insertedCount_tDBOutput_2 += countSum_tDBOutput_2;
	    	
	    	System.err.println(errormessage_tDBOutput_2);
	    	
		}
	    
        if(pstmt_tDBOutput_2 != null) {
        		
            pstmt_tDBOutput_2.close();
            resourceMap.remove("pstmt_tDBOutput_2");
        }
    resourceMap.put("statementClosed_tDBOutput_2", true);

	nb_line_deleted_tDBOutput_2=nb_line_deleted_tDBOutput_2+ deletedCount_tDBOutput_2;
	nb_line_update_tDBOutput_2=nb_line_update_tDBOutput_2 + updatedCount_tDBOutput_2;
	nb_line_inserted_tDBOutput_2=nb_line_inserted_tDBOutput_2 + insertedCount_tDBOutput_2;
	nb_line_rejected_tDBOutput_2=nb_line_rejected_tDBOutput_2 + rejectedCount_tDBOutput_2;
	
        globalMap.put("tDBOutput_2_NB_LINE",nb_line_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_UPDATED",nb_line_update_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_DELETED",nb_line_deleted_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_2);
    

	


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"insertVente");
			  	}
			  	
 

ok_Hash.put("tDBOutput_2", true);
end_Hash.put("tDBOutput_2", System.currentTimeMillis());




/**
 * [tDBOutput_2 end ] stop
 */












				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tHashInput_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk2", 0, "ok");
								} 
							
							tHashInput_2Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
					te.setVirtualComponentName(currentVirtualComponent);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
							//free memory for "tAggregateRow_1_AGGIN"
							globalMap.remove("tAggregateRow_1");
						
				try{
					
	
	/**
	 * [tHashInput_1 finally ] start
	 */

	

	
	
	currentComponent="tHashInput_1";

	

 



/**
 * [tHashInput_1 finally ] stop
 */

	
	/**
	 * [tAggregateRow_1_AGGOUT finally ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";

	

 



/**
 * [tAggregateRow_1_AGGOUT finally ] stop
 */

	
	/**
	 * [tAggregateRow_1_AGGIN finally ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGIN";

	

 



/**
 * [tAggregateRow_1_AGGIN finally ] stop
 */

	
	/**
	 * [tMap_2 finally ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 finally ] stop
 */

	
	/**
	 * [tDBOutput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	



    if (resourceMap.get("statementClosed_tDBOutput_2") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_2 = null;
                if ((pstmtToClose_tDBOutput_2 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_2")) != null) {
                    pstmtToClose_tDBOutput_2.close();
                }
    }
 



/**
 * [tDBOutput_2 finally ] stop
 */












				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tHashInput_1_SUBPROCESS_STATE", 1);
	}
	


public static class venteToUpdateStruct implements routines.system.IPersistableRow<venteToUpdateStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String ID_VENTE;

				public String getID_VENTE () {
					return this.ID_VENTE;
				}
				
			    public String CD_PRODUIT;

				public String getCD_PRODUIT () {
					return this.CD_PRODUIT;
				}
				
			    public boolean BL_LIGNE_IN_DWH;

				public boolean getBL_LIGNE_IN_DWH () {
					return this.BL_LIGNE_IN_DWH;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.ID_VENTE == null) ? 0 : this.ID_VENTE.hashCode());
					
						result = prime * result + ((this.CD_PRODUIT == null) ? 0 : this.CD_PRODUIT.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final venteToUpdateStruct other = (venteToUpdateStruct) obj;
		
						if (this.ID_VENTE == null) {
							if (other.ID_VENTE != null)
								return false;
						
						} else if (!this.ID_VENTE.equals(other.ID_VENTE))
						
							return false;
					
						if (this.CD_PRODUIT == null) {
							if (other.CD_PRODUIT != null)
								return false;
						
						} else if (!this.CD_PRODUIT.equals(other.CD_PRODUIT))
						
							return false;
					

		return true;
    }

	public void copyDataTo(venteToUpdateStruct other) {

		other.ID_VENTE = this.ID_VENTE;
	            other.CD_PRODUIT = this.CD_PRODUIT;
	            other.BL_LIGNE_IN_DWH = this.BL_LIGNE_IN_DWH;
	            
	}

	public void copyKeysDataTo(venteToUpdateStruct other) {

		other.ID_VENTE = this.ID_VENTE;
	            	other.CD_PRODUIT = this.CD_PRODUIT;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
			        this.BL_LIGNE_IN_DWH = dis.readBoolean();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
					this.ID_VENTE = readString(dis);
					
					this.CD_PRODUIT = readString(dis);
					
			        this.BL_LIGNE_IN_DWH = dis.readBoolean();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// boolean
				
		            	dos.writeBoolean(this.BL_LIGNE_IN_DWH);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// boolean
				
		            	dos.writeBoolean(this.BL_LIGNE_IN_DWH);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_VENTE="+ID_VENTE);
		sb.append(",CD_PRODUIT="+CD_PRODUIT);
		sb.append(",BL_LIGNE_IN_DWH="+String.valueOf(BL_LIGNE_IN_DWH));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(venteToUpdateStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.ID_VENTE, other.ID_VENTE);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.CD_PRODUIT, other.CD_PRODUIT);
						if(returnValue != 0) {
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

public static class row3Struct implements routines.system.IPersistableRow<row3Struct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];

	
			    public Integer ID_DIM_PRODUIT;

				public Integer getID_DIM_PRODUIT () {
					return this.ID_DIM_PRODUIT;
				}
				
			    public Integer ID_DIM_CLIENT;

				public Integer getID_DIM_CLIENT () {
					return this.ID_DIM_CLIENT;
				}
				
			    public Integer ID_DIM_CALENDRIER;

				public Integer getID_DIM_CALENDRIER () {
					return this.ID_DIM_CALENDRIER;
				}
				
			    public String ID_VENTE;

				public String getID_VENTE () {
					return this.ID_VENTE;
				}
				
			    public Integer QTE_VENTE;

				public Integer getQTE_VENTE () {
					return this.QTE_VENTE;
				}
				
			    public Double MT_ACHAT;

				public Double getMT_ACHAT () {
					return this.MT_ACHAT;
				}
				
			    public Double MT_VENTE;

				public Double getMT_VENTE () {
					return this.MT_VENTE;
				}
				
			    public String CD_PRODUIT;

				public String getCD_PRODUIT () {
					return this.CD_PRODUIT;
				}
				
			    public String ID_CLIENT;

				public String getID_CLIENT () {
					return this.ID_CLIENT;
				}
				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
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
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
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

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
						this.ID_DIM_PRODUIT = readInteger(dis);
					
						this.ID_DIM_CLIENT = readInteger(dis);
					
						this.ID_DIM_CALENDRIER = readInteger(dis);
					
					this.ID_VENTE = readString(dis);
					
						this.QTE_VENTE = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MT_ACHAT = null;
           				} else {
           			    	this.MT_ACHAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MT_VENTE = null;
           				} else {
           			    	this.MT_VENTE = dis.readDouble();
           				}
					
					this.CD_PRODUIT = readString(dis);
					
					this.ID_CLIENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
						this.ID_DIM_PRODUIT = readInteger(dis);
					
						this.ID_DIM_CLIENT = readInteger(dis);
					
						this.ID_DIM_CALENDRIER = readInteger(dis);
					
					this.ID_VENTE = readString(dis);
					
						this.QTE_VENTE = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MT_ACHAT = null;
           				} else {
           			    	this.MT_ACHAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MT_VENTE = null;
           				} else {
           			    	this.MT_VENTE = dis.readDouble();
           				}
					
					this.CD_PRODUIT = readString(dis);
					
					this.ID_CLIENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Integer
				
						writeInteger(this.ID_DIM_PRODUIT,dos);
					
					// Integer
				
						writeInteger(this.ID_DIM_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.ID_DIM_CALENDRIER,dos);
					
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// Integer
				
						writeInteger(this.QTE_VENTE,dos);
					
					// Double
				
						if(this.MT_ACHAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.MT_ACHAT);
		            	}
					
					// Double
				
						if(this.MT_VENTE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.MT_VENTE);
		            	}
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Integer
				
						writeInteger(this.ID_DIM_PRODUIT,dos);
					
					// Integer
				
						writeInteger(this.ID_DIM_CLIENT,dos);
					
					// Integer
				
						writeInteger(this.ID_DIM_CALENDRIER,dos);
					
					// String
				
						writeString(this.ID_VENTE,dos);
					
					// Integer
				
						writeInteger(this.QTE_VENTE,dos);
					
					// Double
				
						if(this.MT_ACHAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.MT_ACHAT);
		            	}
					
					// Double
				
						if(this.MT_VENTE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.MT_VENTE);
		            	}
					
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
					// String
				
						writeString(this.ID_CLIENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_DIM_PRODUIT="+String.valueOf(ID_DIM_PRODUIT));
		sb.append(",ID_DIM_CLIENT="+String.valueOf(ID_DIM_CLIENT));
		sb.append(",ID_DIM_CALENDRIER="+String.valueOf(ID_DIM_CALENDRIER));
		sb.append(",ID_VENTE="+ID_VENTE);
		sb.append(",QTE_VENTE="+String.valueOf(QTE_VENTE));
		sb.append(",MT_ACHAT="+String.valueOf(MT_ACHAT));
		sb.append(",MT_VENTE="+String.valueOf(MT_VENTE));
		sb.append(",CD_PRODUIT="+CD_PRODUIT);
		sb.append(",ID_CLIENT="+ID_CLIENT);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row3Struct other) {

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
public void tHashInput_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tHashInput_2_SUBPROCESS_STATE", 0);

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



		row3Struct row3 = new row3Struct();
venteToUpdateStruct venteToUpdate = new venteToUpdateStruct();





	
	/**
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"venteToUpdate");
					}
				
		int tos_count_tDBOutput_1 = 0;
		





String dbschema_tDBOutput_1 = null;
	dbschema_tDBOutput_1 = (String)globalMap.get("schema_" + "tDBConnection_1");
	

String tableName_tDBOutput_1 = null;
if(dbschema_tDBOutput_1 == null || dbschema_tDBOutput_1.trim().length() == 0) {
	tableName_tDBOutput_1 = ("ODS_VENTE");
} else {
	tableName_tDBOutput_1 = dbschema_tDBOutput_1 + "\".\"" + ("ODS_VENTE");
}

        int updateKeyCount_tDBOutput_1 = 2;
        if(updateKeyCount_tDBOutput_1 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_1 == 3 && true) {        
                throw new RuntimeException("For update, every Schema column can not be a key");
        }

int nb_line_tDBOutput_1 = 0;
int nb_line_update_tDBOutput_1 = 0;
int nb_line_inserted_tDBOutput_1 = 0;
int nb_line_deleted_tDBOutput_1 = 0;
int nb_line_rejected_tDBOutput_1 = 0;

int deletedCount_tDBOutput_1=0;
int updatedCount_tDBOutput_1=0;
int insertedCount_tDBOutput_1=0;
int rowsToCommitCount_tDBOutput_1=0;
int rejectedCount_tDBOutput_1=0;

boolean whetherReject_tDBOutput_1 = false;

java.sql.Connection conn_tDBOutput_1 = null;
String dbUser_tDBOutput_1 = null;

	conn_tDBOutput_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	
	


   int batchSize_tDBOutput_1 = 10000;
   int batchSizeCounter_tDBOutput_1=0;

int count_tDBOutput_1=0;
	    String update_tDBOutput_1 = "UPDATE \"" + tableName_tDBOutput_1 + "\" SET \"BL_LIGNE_IN_DWH\" = ? WHERE \"ID_VENTE\" = ? AND \"CD_PRODUIT\" = ?";
	    java.sql.PreparedStatement pstmt_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(update_tDBOutput_1);
	    resourceMap.put("pstmt_tDBOutput_1", pstmt_tDBOutput_1);
	    

 



/**
 * [tDBOutput_1 begin ] stop
 */



	
	/**
	 * [tMap_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_3", false);
		start_Hash.put("tMap_3", System.currentTimeMillis());
		
	
	currentComponent="tMap_3";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row3");
					}
				
		int tos_count_tMap_3 = 0;
		




// ###############################
// # Lookup's keys initialization
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_3__Struct  {
}
Var__tMap_3__Struct Var__tMap_3 = new Var__tMap_3__Struct();
// ###############################

// ###############################
// # Outputs initialization
venteToUpdateStruct venteToUpdate_tmp = new venteToUpdateStruct();
// ###############################

        
        



        









 



/**
 * [tMap_3 begin ] stop
 */



	
	/**
	 * [tHashInput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tHashInput_2", false);
		start_Hash.put("tHashInput_2", System.currentTimeMillis());
		
	
	currentComponent="tHashInput_2";

	
		int tos_count_tHashInput_2 = 0;
		


int nb_line_tHashInput_2 = 0;
	
org.talend.designer.components.hashfile.common.MapHashFile mf_tHashInput_2=org.talend.designer.components.hashfile.common.MapHashFile.getMapHashFile();
org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<venteToInsertStruct> tHashFile_tHashInput_2 = mf_tHashInput_2.getAdvancedMemoryHashFile("tHashFile_jDwhVente_" + pid +"_tHashOutput_1");
if(tHashFile_tHashInput_2==null) {
	throw new RuntimeException("The hash is not initialized : The hash must exist before you read from it");
}
java.util.Iterator<venteToInsertStruct> iterator_tHashInput_2 = tHashFile_tHashInput_2.iterator();
while (iterator_tHashInput_2.hasNext()) {
    venteToInsertStruct next_tHashInput_2 = iterator_tHashInput_2.next();

	row3.ID_DIM_PRODUIT = next_tHashInput_2.ID_DIM_PRODUIT;
	row3.ID_DIM_CLIENT = next_tHashInput_2.ID_DIM_CLIENT;
	row3.ID_DIM_CALENDRIER = next_tHashInput_2.ID_DIM_CALENDRIER;
	row3.ID_VENTE = next_tHashInput_2.ID_VENTE;
	row3.QTE_VENTE = next_tHashInput_2.QTE_VENTE;
	row3.MT_ACHAT = next_tHashInput_2.MT_ACHAT;
	row3.MT_VENTE = next_tHashInput_2.MT_VENTE;
	row3.CD_PRODUIT = next_tHashInput_2.CD_PRODUIT;
	row3.ID_CLIENT = next_tHashInput_2.ID_CLIENT;

 



/**
 * [tHashInput_2 begin ] stop
 */
	
	/**
	 * [tHashInput_2 main ] start
	 */

	

	
	
	currentComponent="tHashInput_2";

	

 


	tos_count_tHashInput_2++;

/**
 * [tHashInput_2 main ] stop
 */
	
	/**
	 * [tHashInput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tHashInput_2";

	

 



/**
 * [tHashInput_2 process_data_begin ] stop
 */

	
	/**
	 * [tMap_3 main ] start
	 */

	

	
	
	currentComponent="tMap_3";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row3"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_3 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_3 = false;
		  boolean mainRowRejected_tMap_3 = false;
            				    								  
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_3__Struct Var = Var__tMap_3;// ###############################
        // ###############################
        // # Output tables

venteToUpdate = null;


// # Output table : 'venteToUpdate'
venteToUpdate_tmp.ID_VENTE = row3.ID_VENTE ;
venteToUpdate_tmp.CD_PRODUIT = row3.CD_PRODUIT ;
venteToUpdate_tmp.BL_LIGNE_IN_DWH = true;
venteToUpdate = venteToUpdate_tmp;
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_3 = false;










 


	tos_count_tMap_3++;

/**
 * [tMap_3 main ] stop
 */
	
	/**
	 * [tMap_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 process_data_begin ] stop
 */
// Start of branch "venteToUpdate"
if(venteToUpdate != null) { 



	
	/**
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"venteToUpdate"
						
						);
					}
					



        whetherReject_tDBOutput_1 = false;
                    pstmt_tDBOutput_1.setBoolean(1, venteToUpdate.BL_LIGNE_IN_DWH);

                    if(venteToUpdate.ID_VENTE == null) {
pstmt_tDBOutput_1.setNull(2 + count_tDBOutput_1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(2 + count_tDBOutput_1, venteToUpdate.ID_VENTE);
}


                    if(venteToUpdate.CD_PRODUIT == null) {
pstmt_tDBOutput_1.setNull(3 + count_tDBOutput_1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(3 + count_tDBOutput_1, venteToUpdate.CD_PRODUIT);
}


    		pstmt_tDBOutput_1.addBatch();
    		nb_line_tDBOutput_1++;
    		  
    		  
    		  batchSizeCounter_tDBOutput_1++;
    		  
    			if ((batchSize_tDBOutput_1 > 0) && (batchSize_tDBOutput_1 <= batchSizeCounter_tDBOutput_1)) {
                try {
						int countSum_tDBOutput_1 = 0;
						    
						for(int countEach_tDBOutput_1: pstmt_tDBOutput_1.executeBatch()) {
							countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
						}
				    	rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
				    	
				    		updatedCount_tDBOutput_1 += countSum_tDBOutput_1;
				    	
            	    	batchSizeCounter_tDBOutput_1 = 0;
                }catch (java.sql.BatchUpdateException e_tDBOutput_1){
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e_tDBOutput_1.getMessage());
				    	java.sql.SQLException ne_tDBOutput_1 = e_tDBOutput_1.getNextException(),sqle_tDBOutput_1=null;
				    	String errormessage_tDBOutput_1;
						if (ne_tDBOutput_1 != null) {
							// build new exception to provide the original cause
							sqle_tDBOutput_1 = new java.sql.SQLException(e_tDBOutput_1.getMessage() + "\ncaused by: " + ne_tDBOutput_1.getMessage(), ne_tDBOutput_1.getSQLState(), ne_tDBOutput_1.getErrorCode(), ne_tDBOutput_1);
							errormessage_tDBOutput_1 = sqle_tDBOutput_1.getMessage();
						}else{
							errormessage_tDBOutput_1 = e_tDBOutput_1.getMessage();
						}
				    	
				    	int countSum_tDBOutput_1 = 0;
						for(int countEach_tDBOutput_1: e_tDBOutput_1.getUpdateCounts()) {
							countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
						}
						rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
						
				    		updatedCount_tDBOutput_1 += countSum_tDBOutput_1;
				    	
				    	System.err.println(errormessage_tDBOutput_1);
				    	
					}
    			}
    		

 


	tos_count_tDBOutput_1++;

/**
 * [tDBOutput_1 main ] stop
 */
	
	/**
	 * [tDBOutput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	

 



/**
 * [tDBOutput_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	

 



/**
 * [tDBOutput_1 process_data_end ] stop
 */

} // End of branch "venteToUpdate"




	
	/**
	 * [tMap_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 process_data_end ] stop
 */



	
	/**
	 * [tHashInput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tHashInput_2";

	

 



/**
 * [tHashInput_2 process_data_end ] stop
 */
	
	/**
	 * [tHashInput_2 end ] start
	 */

	

	
	
	currentComponent="tHashInput_2";

	
    

		
			nb_line_tHashInput_2++;
		}	
    	
		org.talend.designer.components.hashfile.common.MapHashFile.resourceLockMap.remove("tHashFile_jDwhVente_" + pid +"_tHashOutput_1");
	


	globalMap.put("tHashInput_2_NB_LINE", nb_line_tHashInput_2);       

 

ok_Hash.put("tHashInput_2", true);
end_Hash.put("tHashInput_2", System.currentTimeMillis());




/**
 * [tHashInput_2 end ] stop
 */

	
	/**
	 * [tMap_3 end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	


// ###############################
// # Lookup hashes releasing
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row3");
			  	}
			  	
 

ok_Hash.put("tMap_3", true);
end_Hash.put("tMap_3", System.currentTimeMillis());




/**
 * [tMap_3 end ] stop
 */

	
	/**
	 * [tDBOutput_1 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	



	    try {
				int countSum_tDBOutput_1 = 0;
				if (pstmt_tDBOutput_1 != null && batchSizeCounter_tDBOutput_1 > 0) {
						
					for(int countEach_tDBOutput_1: pstmt_tDBOutput_1.executeBatch()) {
						countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
					}
					rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
						
				}
		    	
		    		updatedCount_tDBOutput_1 += countSum_tDBOutput_1;
		    	
	    }catch (java.sql.BatchUpdateException e_tDBOutput_1){
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e_tDBOutput_1.getMessage());
	    	java.sql.SQLException ne_tDBOutput_1 = e_tDBOutput_1.getNextException(),sqle_tDBOutput_1=null;
	    	String errormessage_tDBOutput_1;
			if (ne_tDBOutput_1 != null) {
				// build new exception to provide the original cause
				sqle_tDBOutput_1 = new java.sql.SQLException(e_tDBOutput_1.getMessage() + "\ncaused by: " + ne_tDBOutput_1.getMessage(), ne_tDBOutput_1.getSQLState(), ne_tDBOutput_1.getErrorCode(), ne_tDBOutput_1);
				errormessage_tDBOutput_1 = sqle_tDBOutput_1.getMessage();
			}else{
				errormessage_tDBOutput_1 = e_tDBOutput_1.getMessage();
			}
	    	
	    	int countSum_tDBOutput_1 = 0;
			for(int countEach_tDBOutput_1: e_tDBOutput_1.getUpdateCounts()) {
				countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
			}
			rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
			
	    		updatedCount_tDBOutput_1 += countSum_tDBOutput_1;
	    	
	    	System.err.println(errormessage_tDBOutput_1);
	    	
		}
	    
        if(pstmt_tDBOutput_1 != null) {
        		
            pstmt_tDBOutput_1.close();
            resourceMap.remove("pstmt_tDBOutput_1");
        }
    resourceMap.put("statementClosed_tDBOutput_1", true);

	nb_line_deleted_tDBOutput_1=nb_line_deleted_tDBOutput_1+ deletedCount_tDBOutput_1;
	nb_line_update_tDBOutput_1=nb_line_update_tDBOutput_1 + updatedCount_tDBOutput_1;
	nb_line_inserted_tDBOutput_1=nb_line_inserted_tDBOutput_1 + insertedCount_tDBOutput_1;
	nb_line_rejected_tDBOutput_1=nb_line_rejected_tDBOutput_1 + rejectedCount_tDBOutput_1;
	
        globalMap.put("tDBOutput_1_NB_LINE",nb_line_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_UPDATED",nb_line_update_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_DELETED",nb_line_deleted_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_1);
    

	


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"venteToUpdate");
			  	}
			  	
 

ok_Hash.put("tDBOutput_1", true);
end_Hash.put("tDBOutput_1", System.currentTimeMillis());




/**
 * [tDBOutput_1 end ] stop
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
	 * [tHashInput_2 finally ] start
	 */

	

	
	
	currentComponent="tHashInput_2";

	

 



/**
 * [tHashInput_2 finally ] stop
 */

	
	/**
	 * [tMap_3 finally ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 finally ] stop
 */

	
	/**
	 * [tDBOutput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	



    if (resourceMap.get("statementClosed_tDBOutput_1") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_1 = null;
                if ((pstmtToClose_tDBOutput_1 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_1")) != null) {
                    pstmtToClose_tDBOutput_1.close();
                }
    }
 



/**
 * [tDBOutput_1 finally ] stop
 */






				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tHashInput_2_SUBPROCESS_STATE", 1);
	}
	


public static class produitStruct implements routines.system.IPersistableComparableLookupRow<produitStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public Integer ID_DIM_PRODUIT;

				public Integer getID_DIM_PRODUIT () {
					return this.ID_DIM_PRODUIT;
				}
				
			    public String CD_PRODUIT;

				public String getCD_PRODUIT () {
					return this.CD_PRODUIT;
				}
				
			    public String NOM_PRODUIT;

				public String getNOM_PRODUIT () {
					return this.NOM_PRODUIT;
				}
				
			    public BigDecimal PRIX_ACHAT_PRODUIT;

				public BigDecimal getPRIX_ACHAT_PRODUIT () {
					return this.PRIX_ACHAT_PRODUIT;
				}
				
			    public BigDecimal PRIX_VENTE_PRODUIT;

				public BigDecimal getPRIX_VENTE_PRODUIT () {
					return this.PRIX_VENTE_PRODUIT;
				}
				
			    public String CD_SOUS_CATEGORIE;

				public String getCD_SOUS_CATEGORIE () {
					return this.CD_SOUS_CATEGORIE;
				}
				
			    public String LB_SOUS_CATEGORIE;

				public String getLB_SOUS_CATEGORIE () {
					return this.LB_SOUS_CATEGORIE;
				}
				
			    public String CD_CATEGORIE;

				public String getCD_CATEGORIE () {
					return this.CD_CATEGORIE;
				}
				
			    public String LB_CATEGORIE;

				public String getLB_CATEGORIE () {
					return this.LB_CATEGORIE;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public java.util.Date DT_MISE_A_JOUR;

				public java.util.Date getDT_MISE_A_JOUR () {
					return this.DT_MISE_A_JOUR;
				}
				
			    public Integer BL_LIGNE_ACTIVE;

				public Integer getBL_LIGNE_ACTIVE () {
					return this.BL_LIGNE_ACTIVE;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.CD_PRODUIT == null) ? 0 : this.CD_PRODUIT.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final produitStruct other = (produitStruct) obj;
		
						if (this.CD_PRODUIT == null) {
							if (other.CD_PRODUIT != null)
								return false;
						
						} else if (!this.CD_PRODUIT.equals(other.CD_PRODUIT))
						
							return false;
					

		return true;
    }

	public void copyDataTo(produitStruct other) {

		other.ID_DIM_PRODUIT = this.ID_DIM_PRODUIT;
	            other.CD_PRODUIT = this.CD_PRODUIT;
	            other.NOM_PRODUIT = this.NOM_PRODUIT;
	            other.PRIX_ACHAT_PRODUIT = this.PRIX_ACHAT_PRODUIT;
	            other.PRIX_VENTE_PRODUIT = this.PRIX_VENTE_PRODUIT;
	            other.CD_SOUS_CATEGORIE = this.CD_SOUS_CATEGORIE;
	            other.LB_SOUS_CATEGORIE = this.LB_SOUS_CATEGORIE;
	            other.CD_CATEGORIE = this.CD_CATEGORIE;
	            other.LB_CATEGORIE = this.LB_CATEGORIE;
	            other.DT_INSERTION = this.DT_INSERTION;
	            other.DT_MISE_A_JOUR = this.DT_MISE_A_JOUR;
	            other.BL_LIGNE_ACTIVE = this.BL_LIGNE_ACTIVE;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(produitStruct other) {

		other.CD_PRODUIT = this.CD_PRODUIT;
	            	
	}



	private Integer readInteger(DataInputStream dis, ObjectInputStream ois) throws IOException{
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
	
	private Integer readInteger(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		Integer intReturn;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
			intReturn = unmarshaller.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, DataOutputStream dos,org.jboss.marshalling.Marshaller marshaller ) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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
	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
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
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
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
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}

	private java.util.Date readDate(DataInputStream dis, ObjectInputStream ois) throws IOException{
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
	
	private java.util.Date readDate(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller ) throws IOException{
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

	private void writeDate(java.util.Date date1, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
	}
	
	private void writeDate(java.util.Date date1, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
					this.CD_PRODUIT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
					this.CD_PRODUIT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CD_PRODUIT,dos);
					
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
		
						this.ID_DIM_PRODUIT = readInteger(dis,ois);
					
						this.NOM_PRODUIT = readString(dis,ois);
					
       			    	this.PRIX_ACHAT_PRODUIT = (BigDecimal) ois.readObject();
					
       			    	this.PRIX_VENTE_PRODUIT = (BigDecimal) ois.readObject();
					
						this.CD_SOUS_CATEGORIE = readString(dis,ois);
					
						this.LB_SOUS_CATEGORIE = readString(dis,ois);
					
						this.CD_CATEGORIE = readString(dis,ois);
					
						this.LB_CATEGORIE = readString(dis,ois);
					
						this.DT_INSERTION = readDate(dis,ois);
					
						this.DT_MISE_A_JOUR = readDate(dis,ois);
					
						this.BL_LIGNE_ACTIVE = readInteger(dis,ois);
					
						this.LB_JOB_NAME = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.ID_DIM_PRODUIT = readInteger(dis,objectIn);
					
						this.NOM_PRODUIT = readString(dis,objectIn);
					
       			    	this.PRIX_ACHAT_PRODUIT = (BigDecimal) objectIn.readObject();
					
       			    	this.PRIX_VENTE_PRODUIT = (BigDecimal) objectIn.readObject();
					
						this.CD_SOUS_CATEGORIE = readString(dis,objectIn);
					
						this.LB_SOUS_CATEGORIE = readString(dis,objectIn);
					
						this.CD_CATEGORIE = readString(dis,objectIn);
					
						this.LB_CATEGORIE = readString(dis,objectIn);
					
						this.DT_INSERTION = readDate(dis,objectIn);
					
						this.DT_MISE_A_JOUR = readDate(dis,objectIn);
					
						this.BL_LIGNE_ACTIVE = readInteger(dis,objectIn);
					
						this.LB_JOB_NAME = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
					writeInteger(this.ID_DIM_PRODUIT, dos, oos);
					
						writeString(this.NOM_PRODUIT, dos, oos);
					
       			    	oos.writeObject(this.PRIX_ACHAT_PRODUIT);
					
       			    	oos.writeObject(this.PRIX_VENTE_PRODUIT);
					
						writeString(this.CD_SOUS_CATEGORIE, dos, oos);
					
						writeString(this.LB_SOUS_CATEGORIE, dos, oos);
					
						writeString(this.CD_CATEGORIE, dos, oos);
					
						writeString(this.LB_CATEGORIE, dos, oos);
					
						writeDate(this.DT_INSERTION, dos, oos);
					
						writeDate(this.DT_MISE_A_JOUR, dos, oos);
					
					writeInteger(this.BL_LIGNE_ACTIVE, dos, oos);
					
						writeString(this.LB_JOB_NAME, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					writeInteger(this.ID_DIM_PRODUIT, dos, objectOut);
					
						writeString(this.NOM_PRODUIT, dos, objectOut);
					
       			    	objectOut.writeObject(this.PRIX_ACHAT_PRODUIT);
					
       			    	objectOut.writeObject(this.PRIX_VENTE_PRODUIT);
					
						writeString(this.CD_SOUS_CATEGORIE, dos, objectOut);
					
						writeString(this.LB_SOUS_CATEGORIE, dos, objectOut);
					
						writeString(this.CD_CATEGORIE, dos, objectOut);
					
						writeString(this.LB_CATEGORIE, dos, objectOut);
					
						writeDate(this.DT_INSERTION, dos, objectOut);
					
						writeDate(this.DT_MISE_A_JOUR, dos, objectOut);
					
					writeInteger(this.BL_LIGNE_ACTIVE, dos, objectOut);
					
						writeString(this.LB_JOB_NAME, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_DIM_PRODUIT="+String.valueOf(ID_DIM_PRODUIT));
		sb.append(",CD_PRODUIT="+CD_PRODUIT);
		sb.append(",NOM_PRODUIT="+NOM_PRODUIT);
		sb.append(",PRIX_ACHAT_PRODUIT="+String.valueOf(PRIX_ACHAT_PRODUIT));
		sb.append(",PRIX_VENTE_PRODUIT="+String.valueOf(PRIX_VENTE_PRODUIT));
		sb.append(",CD_SOUS_CATEGORIE="+CD_SOUS_CATEGORIE);
		sb.append(",LB_SOUS_CATEGORIE="+LB_SOUS_CATEGORIE);
		sb.append(",CD_CATEGORIE="+CD_CATEGORIE);
		sb.append(",LB_CATEGORIE="+LB_CATEGORIE);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",DT_MISE_A_JOUR="+String.valueOf(DT_MISE_A_JOUR));
		sb.append(",BL_LIGNE_ACTIVE="+String.valueOf(BL_LIGNE_ACTIVE));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(produitStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.CD_PRODUIT, other.CD_PRODUIT);
						if(returnValue != 0) {
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
public void tDBInput_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_2_SUBPROCESS_STATE", 0);

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



		produitStruct produit = new produitStruct();




	
	/**
	 * [tAdvancedHash_produit begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_produit", false);
		start_Hash.put("tAdvancedHash_produit", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_produit";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"produit");
					}
				
		int tos_count_tAdvancedHash_produit = 0;
		

			   		// connection name:produit
			   		// source node:tDBInput_2 - inputs:(after_tDBInput_1) outputs:(produit,produit) | target node:tAdvancedHash_produit - inputs:(produit) outputs:()
			   		// linked node: tMap_1 - inputs:(vente,produit,client,calendrier) outputs:(venteToInsert)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_produit = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<produitStruct> tHash_Lookup_produit =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<produitStruct>getLookup(matchingModeEnum_produit);
	   						   
		   	   	   globalMap.put("tHash_Lookup_produit", tHash_Lookup_produit);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_produit begin ] stop
 */



	
	/**
	 * [tDBInput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_2", false);
		start_Hash.put("tDBInput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_2";

	
		int tos_count_tDBInput_2 = 0;
		
	
    
	
		    int nb_line_tDBInput_2 = 0;
		    java.sql.Connection conn_tDBInput_2 = null;
				conn_tDBInput_2 = (java.sql.Connection)globalMap.get("conn_tDBConnection_2");
				
		    
			java.sql.Statement stmt_tDBInput_2 = conn_tDBInput_2.createStatement();

		    String dbquery_tDBInput_2 = "SELECT \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"ID_DIM_PRODUIT\", \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"CD_PRODUIT\", \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"NOM_PRODUIT\", \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"PRIX_ACHAT_PRODUIT\", \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"PRIX_VENTE_PRODUIT\", \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"CD_SOUS_CATEGORIE\", \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"LB_SOUS_CATEGORIE\", \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"CD_CATEGORIE\", \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"LB_CATEGORIE\", \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"DT_INSERTION\", \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"DT_MISE_A_JOUR\", \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"BL_LIGNE_ACTIVE\", \n  \""+context.schema_dwh+"\".\"DIM_PRODUIT\".\"LB_JOB_NAME\"\nFROM \""+context.schema_dwh+"\".\"DIM_PRODUIT\"\nWHERE \"BL_LIGNE_ACTIVE\"=1;\n";
		    

            	globalMap.put("tDBInput_2_QUERY",dbquery_tDBInput_2);
		    java.sql.ResultSet rs_tDBInput_2 = null;

		    try {
		    	rs_tDBInput_2 = stmt_tDBInput_2.executeQuery(dbquery_tDBInput_2);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_2 = rs_tDBInput_2.getMetaData();
		    	int colQtyInRs_tDBInput_2 = rsmd_tDBInput_2.getColumnCount();

		    String tmpContent_tDBInput_2 = null;
		    
		    
		    while (rs_tDBInput_2.next()) {
		        nb_line_tDBInput_2++;
		        
							if(colQtyInRs_tDBInput_2 < 1) {
								produit.ID_DIM_PRODUIT = null;
							} else {
		                          
            produit.ID_DIM_PRODUIT = rs_tDBInput_2.getInt(1);
            if(rs_tDBInput_2.wasNull()){
                    produit.ID_DIM_PRODUIT = null;
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 2) {
								produit.CD_PRODUIT = null;
							} else {
	                         		
        	produit.CD_PRODUIT = routines.system.JDBCUtil.getString(rs_tDBInput_2, 2, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 3) {
								produit.NOM_PRODUIT = null;
							} else {
	                         		
        	produit.NOM_PRODUIT = routines.system.JDBCUtil.getString(rs_tDBInput_2, 3, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 4) {
								produit.PRIX_ACHAT_PRODUIT = null;
							} else {
		                          
            produit.PRIX_ACHAT_PRODUIT = rs_tDBInput_2.getBigDecimal(4);
            if(rs_tDBInput_2.wasNull()){
                    produit.PRIX_ACHAT_PRODUIT = null;
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 5) {
								produit.PRIX_VENTE_PRODUIT = null;
							} else {
		                          
            produit.PRIX_VENTE_PRODUIT = rs_tDBInput_2.getBigDecimal(5);
            if(rs_tDBInput_2.wasNull()){
                    produit.PRIX_VENTE_PRODUIT = null;
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 6) {
								produit.CD_SOUS_CATEGORIE = null;
							} else {
	                         		
        	produit.CD_SOUS_CATEGORIE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 6, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 7) {
								produit.LB_SOUS_CATEGORIE = null;
							} else {
	                         		
        	produit.LB_SOUS_CATEGORIE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 7, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 8) {
								produit.CD_CATEGORIE = null;
							} else {
	                         		
        	produit.CD_CATEGORIE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 8, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 9) {
								produit.LB_CATEGORIE = null;
							} else {
	                         		
        	produit.LB_CATEGORIE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 9, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 10) {
								produit.DT_INSERTION = null;
							} else {
										
			produit.DT_INSERTION = routines.system.JDBCUtil.getDate(rs_tDBInput_2, 10);
		                    }
							if(colQtyInRs_tDBInput_2 < 11) {
								produit.DT_MISE_A_JOUR = null;
							} else {
										
			produit.DT_MISE_A_JOUR = routines.system.JDBCUtil.getDate(rs_tDBInput_2, 11);
		                    }
							if(colQtyInRs_tDBInput_2 < 12) {
								produit.BL_LIGNE_ACTIVE = null;
							} else {
		                          
            produit.BL_LIGNE_ACTIVE = rs_tDBInput_2.getInt(12);
            if(rs_tDBInput_2.wasNull()){
                    produit.BL_LIGNE_ACTIVE = null;
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 13) {
								produit.LB_JOB_NAME = null;
							} else {
	                         		
        	produit.LB_JOB_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_2, 13, false);
		                    }
					


 



/**
 * [tDBInput_2 begin ] stop
 */
	
	/**
	 * [tDBInput_2 main ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

 


	tos_count_tDBInput_2++;

/**
 * [tDBInput_2 main ] stop
 */
	
	/**
	 * [tDBInput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

 



/**
 * [tDBInput_2 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_produit main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_produit";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"produit"
						
						);
					}
					


			   
			   

					produitStruct produit_HashRow = new produitStruct();
		   	   	   
				
				produit_HashRow.ID_DIM_PRODUIT = produit.ID_DIM_PRODUIT;
				
				produit_HashRow.CD_PRODUIT = produit.CD_PRODUIT;
				
				produit_HashRow.NOM_PRODUIT = produit.NOM_PRODUIT;
				
				produit_HashRow.PRIX_ACHAT_PRODUIT = produit.PRIX_ACHAT_PRODUIT;
				
				produit_HashRow.PRIX_VENTE_PRODUIT = produit.PRIX_VENTE_PRODUIT;
				
				produit_HashRow.CD_SOUS_CATEGORIE = produit.CD_SOUS_CATEGORIE;
				
				produit_HashRow.LB_SOUS_CATEGORIE = produit.LB_SOUS_CATEGORIE;
				
				produit_HashRow.CD_CATEGORIE = produit.CD_CATEGORIE;
				
				produit_HashRow.LB_CATEGORIE = produit.LB_CATEGORIE;
				
				produit_HashRow.DT_INSERTION = produit.DT_INSERTION;
				
				produit_HashRow.DT_MISE_A_JOUR = produit.DT_MISE_A_JOUR;
				
				produit_HashRow.BL_LIGNE_ACTIVE = produit.BL_LIGNE_ACTIVE;
				
				produit_HashRow.LB_JOB_NAME = produit.LB_JOB_NAME;
				
			tHash_Lookup_produit.put(produit_HashRow);
			
            




 


	tos_count_tAdvancedHash_produit++;

/**
 * [tAdvancedHash_produit main ] stop
 */
	
	/**
	 * [tAdvancedHash_produit process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_produit";

	

 



/**
 * [tAdvancedHash_produit process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_produit process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_produit";

	

 



/**
 * [tAdvancedHash_produit process_data_end ] stop
 */



	
	/**
	 * [tDBInput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

 



/**
 * [tDBInput_2 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_2 end ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

	}
}finally{
	if (rs_tDBInput_2 != null) {
		rs_tDBInput_2.close();
	}
	if (stmt_tDBInput_2 != null) {
		stmt_tDBInput_2.close();
	}
}
globalMap.put("tDBInput_2_NB_LINE",nb_line_tDBInput_2);
 

ok_Hash.put("tDBInput_2", true);
end_Hash.put("tDBInput_2", System.currentTimeMillis());




/**
 * [tDBInput_2 end ] stop
 */

	
	/**
	 * [tAdvancedHash_produit end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_produit";

	

tHash_Lookup_produit.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"produit");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_produit", true);
end_Hash.put("tAdvancedHash_produit", System.currentTimeMillis());




/**
 * [tAdvancedHash_produit end ] stop
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
	 * [tDBInput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

 



/**
 * [tDBInput_2 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_produit finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_produit";

	

 



/**
 * [tAdvancedHash_produit finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_2_SUBPROCESS_STATE", 1);
	}
	


public static class clientStruct implements routines.system.IPersistableComparableLookupRow<clientStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int ID_DIM_CLIENT;

				public int getID_DIM_CLIENT () {
					return this.ID_DIM_CLIENT;
				}
				
			    public String ID_CLIENT;

				public String getID_CLIENT () {
					return this.ID_CLIENT;
				}
				
			    public String NOM_CLIENT;

				public String getNOM_CLIENT () {
					return this.NOM_CLIENT;
				}
				
			    public String PREN_CLIENT;

				public String getPREN_CLIENT () {
					return this.PREN_CLIENT;
				}
				
			    public String CD_POSTAL_CLIENT;

				public String getCD_POSTAL_CLIENT () {
					return this.CD_POSTAL_CLIENT;
				}
				
			    public String VILLE_CLIENT;

				public String getVILLE_CLIENT () {
					return this.VILLE_CLIENT;
				}
				
			    public String PAYS_CLIENT;

				public String getPAYS_CLIENT () {
					return this.PAYS_CLIENT;
				}
				
			    public String REGION_CLIENT;

				public String getREGION_CLIENT () {
					return this.REGION_CLIENT;
				}
				
			    public String CD_TYPE_CLIENT;

				public String getCD_TYPE_CLIENT () {
					return this.CD_TYPE_CLIENT;
				}
				
			    public String LB_TYPE_CLIENT;

				public String getLB_TYPE_CLIENT () {
					return this.LB_TYPE_CLIENT;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public java.util.Date DT_MISE_A_JOUR;

				public java.util.Date getDT_MISE_A_JOUR () {
					return this.DT_MISE_A_JOUR;
				}
				
			    public int BL_LIGNE_ACTIVE;

				public int getBL_LIGNE_ACTIVE () {
					return this.BL_LIGNE_ACTIVE;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.ID_CLIENT == null) ? 0 : this.ID_CLIENT.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final clientStruct other = (clientStruct) obj;
		
						if (this.ID_CLIENT == null) {
							if (other.ID_CLIENT != null)
								return false;
						
						} else if (!this.ID_CLIENT.equals(other.ID_CLIENT))
						
							return false;
					

		return true;
    }

	public void copyDataTo(clientStruct other) {

		other.ID_DIM_CLIENT = this.ID_DIM_CLIENT;
	            other.ID_CLIENT = this.ID_CLIENT;
	            other.NOM_CLIENT = this.NOM_CLIENT;
	            other.PREN_CLIENT = this.PREN_CLIENT;
	            other.CD_POSTAL_CLIENT = this.CD_POSTAL_CLIENT;
	            other.VILLE_CLIENT = this.VILLE_CLIENT;
	            other.PAYS_CLIENT = this.PAYS_CLIENT;
	            other.REGION_CLIENT = this.REGION_CLIENT;
	            other.CD_TYPE_CLIENT = this.CD_TYPE_CLIENT;
	            other.LB_TYPE_CLIENT = this.LB_TYPE_CLIENT;
	            other.DT_INSERTION = this.DT_INSERTION;
	            other.DT_MISE_A_JOUR = this.DT_MISE_A_JOUR;
	            other.BL_LIGNE_ACTIVE = this.BL_LIGNE_ACTIVE;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(clientStruct other) {

		other.ID_CLIENT = this.ID_CLIENT;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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
			if(length > commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length) {
				if(length < 1024 && commonByteArray_ICOMMERCE_REPORTING_jDwhVente.length == 0) {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[1024];
				} else {
   					commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length);
			strReturn = new String(commonByteArray_ICOMMERCE_REPORTING_jDwhVente, 0, length, utf8Charset);
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
	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
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
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
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
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}

	private java.util.Date readDate(DataInputStream dis, ObjectInputStream ois) throws IOException{
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
	
	private java.util.Date readDate(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller ) throws IOException{
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

	private void writeDate(java.util.Date date1, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
	}
	
	private void writeDate(java.util.Date date1, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
					this.ID_CLIENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
					this.ID_CLIENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ID_CLIENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ID_CLIENT,dos);
					
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
		
			            this.ID_DIM_CLIENT = dis.readInt();
					
						this.NOM_CLIENT = readString(dis,ois);
					
						this.PREN_CLIENT = readString(dis,ois);
					
						this.CD_POSTAL_CLIENT = readString(dis,ois);
					
						this.VILLE_CLIENT = readString(dis,ois);
					
						this.PAYS_CLIENT = readString(dis,ois);
					
						this.REGION_CLIENT = readString(dis,ois);
					
						this.CD_TYPE_CLIENT = readString(dis,ois);
					
						this.LB_TYPE_CLIENT = readString(dis,ois);
					
						this.DT_INSERTION = readDate(dis,ois);
					
						this.DT_MISE_A_JOUR = readDate(dis,ois);
					
			            this.BL_LIGNE_ACTIVE = dis.readInt();
					
						this.LB_JOB_NAME = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
			            this.ID_DIM_CLIENT = objectIn.readInt();
					
						this.NOM_CLIENT = readString(dis,objectIn);
					
						this.PREN_CLIENT = readString(dis,objectIn);
					
						this.CD_POSTAL_CLIENT = readString(dis,objectIn);
					
						this.VILLE_CLIENT = readString(dis,objectIn);
					
						this.PAYS_CLIENT = readString(dis,objectIn);
					
						this.REGION_CLIENT = readString(dis,objectIn);
					
						this.CD_TYPE_CLIENT = readString(dis,objectIn);
					
						this.LB_TYPE_CLIENT = readString(dis,objectIn);
					
						this.DT_INSERTION = readDate(dis,objectIn);
					
						this.DT_MISE_A_JOUR = readDate(dis,objectIn);
					
			            this.BL_LIGNE_ACTIVE = objectIn.readInt();
					
						this.LB_JOB_NAME = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
		            	dos.writeInt(this.ID_DIM_CLIENT);
					
						writeString(this.NOM_CLIENT, dos, oos);
					
						writeString(this.PREN_CLIENT, dos, oos);
					
						writeString(this.CD_POSTAL_CLIENT, dos, oos);
					
						writeString(this.VILLE_CLIENT, dos, oos);
					
						writeString(this.PAYS_CLIENT, dos, oos);
					
						writeString(this.REGION_CLIENT, dos, oos);
					
						writeString(this.CD_TYPE_CLIENT, dos, oos);
					
						writeString(this.LB_TYPE_CLIENT, dos, oos);
					
						writeDate(this.DT_INSERTION, dos, oos);
					
						writeDate(this.DT_MISE_A_JOUR, dos, oos);
					
		            	dos.writeInt(this.BL_LIGNE_ACTIVE);
					
						writeString(this.LB_JOB_NAME, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					objectOut.writeInt(this.ID_DIM_CLIENT);
					
						writeString(this.NOM_CLIENT, dos, objectOut);
					
						writeString(this.PREN_CLIENT, dos, objectOut);
					
						writeString(this.CD_POSTAL_CLIENT, dos, objectOut);
					
						writeString(this.VILLE_CLIENT, dos, objectOut);
					
						writeString(this.PAYS_CLIENT, dos, objectOut);
					
						writeString(this.REGION_CLIENT, dos, objectOut);
					
						writeString(this.CD_TYPE_CLIENT, dos, objectOut);
					
						writeString(this.LB_TYPE_CLIENT, dos, objectOut);
					
						writeDate(this.DT_INSERTION, dos, objectOut);
					
						writeDate(this.DT_MISE_A_JOUR, dos, objectOut);
					
					objectOut.writeInt(this.BL_LIGNE_ACTIVE);
					
						writeString(this.LB_JOB_NAME, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_DIM_CLIENT="+String.valueOf(ID_DIM_CLIENT));
		sb.append(",ID_CLIENT="+ID_CLIENT);
		sb.append(",NOM_CLIENT="+NOM_CLIENT);
		sb.append(",PREN_CLIENT="+PREN_CLIENT);
		sb.append(",CD_POSTAL_CLIENT="+CD_POSTAL_CLIENT);
		sb.append(",VILLE_CLIENT="+VILLE_CLIENT);
		sb.append(",PAYS_CLIENT="+PAYS_CLIENT);
		sb.append(",REGION_CLIENT="+REGION_CLIENT);
		sb.append(",CD_TYPE_CLIENT="+CD_TYPE_CLIENT);
		sb.append(",LB_TYPE_CLIENT="+LB_TYPE_CLIENT);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",DT_MISE_A_JOUR="+String.valueOf(DT_MISE_A_JOUR));
		sb.append(",BL_LIGNE_ACTIVE="+String.valueOf(BL_LIGNE_ACTIVE));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(clientStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.ID_CLIENT, other.ID_CLIENT);
						if(returnValue != 0) {
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
public void tDBInput_4Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_4_SUBPROCESS_STATE", 0);

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



		clientStruct client = new clientStruct();




	
	/**
	 * [tAdvancedHash_client begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_client", false);
		start_Hash.put("tAdvancedHash_client", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_client";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"client");
					}
				
		int tos_count_tAdvancedHash_client = 0;
		

			   		// connection name:client
			   		// source node:tDBInput_4 - inputs:(after_tDBInput_1) outputs:(client,client) | target node:tAdvancedHash_client - inputs:(client) outputs:()
			   		// linked node: tMap_1 - inputs:(vente,produit,client,calendrier) outputs:(venteToInsert)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_client = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<clientStruct> tHash_Lookup_client =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<clientStruct>getLookup(matchingModeEnum_client);
	   						   
		   	   	   globalMap.put("tHash_Lookup_client", tHash_Lookup_client);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_client begin ] stop
 */



	
	/**
	 * [tDBInput_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_4", false);
		start_Hash.put("tDBInput_4", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_4";

	
		int tos_count_tDBInput_4 = 0;
		
	
    
	
		    int nb_line_tDBInput_4 = 0;
		    java.sql.Connection conn_tDBInput_4 = null;
				conn_tDBInput_4 = (java.sql.Connection)globalMap.get("conn_tDBConnection_2");
				
		    
			java.sql.Statement stmt_tDBInput_4 = conn_tDBInput_4.createStatement();

		    String dbquery_tDBInput_4 = "SELECT \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"ID_DIM_CLIENT\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"ID_CLIENT\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"NOM_CLIENT\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"PREN_CLIENT\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"CD_POSTAL_CLIENT\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"VILLE_CLIENT\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"PAYS_CLIENT\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"REGION_CLIENT\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"CD_TYPE_CLIENT\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"LB_TYPE_CLIENT\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"DT_INSERTION\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"DT_MISE_A_JOUR\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"BL_LIGNE_ACTIVE\", \n  \""+context.schema_dwh+"\".\"DIM_CLIENT\".\"LB_JOB_NAME\"\nFROM \""+context.schema_dwh+"\".\"DIM_CLIENT\"\nWHERE \"BL_LIGNE_ACTIVE\"=1;\n";
		    

            	globalMap.put("tDBInput_4_QUERY",dbquery_tDBInput_4);
		    java.sql.ResultSet rs_tDBInput_4 = null;

		    try {
		    	rs_tDBInput_4 = stmt_tDBInput_4.executeQuery(dbquery_tDBInput_4);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_4 = rs_tDBInput_4.getMetaData();
		    	int colQtyInRs_tDBInput_4 = rsmd_tDBInput_4.getColumnCount();

		    String tmpContent_tDBInput_4 = null;
		    
		    
		    while (rs_tDBInput_4.next()) {
		        nb_line_tDBInput_4++;
		        
							if(colQtyInRs_tDBInput_4 < 1) {
								client.ID_DIM_CLIENT = 0;
							} else {
		                          
            client.ID_DIM_CLIENT = rs_tDBInput_4.getInt(1);
            if(rs_tDBInput_4.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_4 < 2) {
								client.ID_CLIENT = null;
							} else {
	                         		
        	client.ID_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_4, 2, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 3) {
								client.NOM_CLIENT = null;
							} else {
	                         		
        	client.NOM_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_4, 3, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 4) {
								client.PREN_CLIENT = null;
							} else {
	                         		
        	client.PREN_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_4, 4, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 5) {
								client.CD_POSTAL_CLIENT = null;
							} else {
	                         		
        	client.CD_POSTAL_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_4, 5, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 6) {
								client.VILLE_CLIENT = null;
							} else {
	                         		
        	client.VILLE_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_4, 6, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 7) {
								client.PAYS_CLIENT = null;
							} else {
	                         		
        	client.PAYS_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_4, 7, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 8) {
								client.REGION_CLIENT = null;
							} else {
	                         		
        	client.REGION_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_4, 8, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 9) {
								client.CD_TYPE_CLIENT = null;
							} else {
	                         		
        	client.CD_TYPE_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_4, 9, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 10) {
								client.LB_TYPE_CLIENT = null;
							} else {
	                         		
        	client.LB_TYPE_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_4, 10, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 11) {
								client.DT_INSERTION = null;
							} else {
										
			client.DT_INSERTION = routines.system.JDBCUtil.getDate(rs_tDBInput_4, 11);
		                    }
							if(colQtyInRs_tDBInput_4 < 12) {
								client.DT_MISE_A_JOUR = null;
							} else {
										
			client.DT_MISE_A_JOUR = routines.system.JDBCUtil.getDate(rs_tDBInput_4, 12);
		                    }
							if(colQtyInRs_tDBInput_4 < 13) {
								client.BL_LIGNE_ACTIVE = 0;
							} else {
		                          
            client.BL_LIGNE_ACTIVE = rs_tDBInput_4.getInt(13);
            if(rs_tDBInput_4.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_4 < 14) {
								client.LB_JOB_NAME = null;
							} else {
	                         		
        	client.LB_JOB_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_4, 14, false);
		                    }
					


 



/**
 * [tDBInput_4 begin ] stop
 */
	
	/**
	 * [tDBInput_4 main ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 


	tos_count_tDBInput_4++;

/**
 * [tDBInput_4 main ] stop
 */
	
	/**
	 * [tDBInput_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 



/**
 * [tDBInput_4 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_client main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_client";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"client"
						
						);
					}
					


			   
			   

					clientStruct client_HashRow = new clientStruct();
		   	   	   
				
				client_HashRow.ID_DIM_CLIENT = client.ID_DIM_CLIENT;
				
				client_HashRow.ID_CLIENT = client.ID_CLIENT;
				
				client_HashRow.NOM_CLIENT = client.NOM_CLIENT;
				
				client_HashRow.PREN_CLIENT = client.PREN_CLIENT;
				
				client_HashRow.CD_POSTAL_CLIENT = client.CD_POSTAL_CLIENT;
				
				client_HashRow.VILLE_CLIENT = client.VILLE_CLIENT;
				
				client_HashRow.PAYS_CLIENT = client.PAYS_CLIENT;
				
				client_HashRow.REGION_CLIENT = client.REGION_CLIENT;
				
				client_HashRow.CD_TYPE_CLIENT = client.CD_TYPE_CLIENT;
				
				client_HashRow.LB_TYPE_CLIENT = client.LB_TYPE_CLIENT;
				
				client_HashRow.DT_INSERTION = client.DT_INSERTION;
				
				client_HashRow.DT_MISE_A_JOUR = client.DT_MISE_A_JOUR;
				
				client_HashRow.BL_LIGNE_ACTIVE = client.BL_LIGNE_ACTIVE;
				
				client_HashRow.LB_JOB_NAME = client.LB_JOB_NAME;
				
			tHash_Lookup_client.put(client_HashRow);
			
            




 


	tos_count_tAdvancedHash_client++;

/**
 * [tAdvancedHash_client main ] stop
 */
	
	/**
	 * [tAdvancedHash_client process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_client";

	

 



/**
 * [tAdvancedHash_client process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_client process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_client";

	

 



/**
 * [tAdvancedHash_client process_data_end ] stop
 */



	
	/**
	 * [tDBInput_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 



/**
 * [tDBInput_4 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_4 end ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

	}
}finally{
	if (rs_tDBInput_4 != null) {
		rs_tDBInput_4.close();
	}
	if (stmt_tDBInput_4 != null) {
		stmt_tDBInput_4.close();
	}
}
globalMap.put("tDBInput_4_NB_LINE",nb_line_tDBInput_4);
 

ok_Hash.put("tDBInput_4", true);
end_Hash.put("tDBInput_4", System.currentTimeMillis());




/**
 * [tDBInput_4 end ] stop
 */

	
	/**
	 * [tAdvancedHash_client end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_client";

	

tHash_Lookup_client.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"client");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_client", true);
end_Hash.put("tAdvancedHash_client", System.currentTimeMillis());




/**
 * [tAdvancedHash_client end ] stop
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
	 * [tDBInput_4 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 



/**
 * [tDBInput_4 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_client finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_client";

	

 



/**
 * [tAdvancedHash_client finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_4_SUBPROCESS_STATE", 1);
	}
	


public static class calendrierStruct implements routines.system.IPersistableComparableLookupRow<calendrierStruct> {
    final static byte[] commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
    static byte[] commonByteArray_ICOMMERCE_REPORTING_jDwhVente = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int ID_DIM_CALENDRIER;

				public int getID_DIM_CALENDRIER () {
					return this.ID_DIM_CALENDRIER;
				}
				
			    public java.util.Date DT_JOUR;

				public java.util.Date getDT_JOUR () {
					return this.DT_JOUR;
				}
				
			    public int NB_ANNEE;

				public int getNB_ANNEE () {
					return this.NB_ANNEE;
				}
				
			    public int NB_SEMESTRE;

				public int getNB_SEMESTRE () {
					return this.NB_SEMESTRE;
				}
				
			    public int NB_TRIMESTRE;

				public int getNB_TRIMESTRE () {
					return this.NB_TRIMESTRE;
				}
				
			    public int NB_MOIS;

				public int getNB_MOIS () {
					return this.NB_MOIS;
				}
				
			    public int NB_JOUR_ANNEE;

				public int getNB_JOUR_ANNEE () {
					return this.NB_JOUR_ANNEE;
				}
				
			    public int NB_JOUR_MOIS;

				public int getNB_JOUR_MOIS () {
					return this.NB_JOUR_MOIS;
				}
				
			    public int NB_JOUR_SEMAINE;

				public int getNB_JOUR_SEMAINE () {
					return this.NB_JOUR_SEMAINE;
				}
				
			    public int NB_SEMAINE_ANNEE;

				public int getNB_SEMAINE_ANNEE () {
					return this.NB_SEMAINE_ANNEE;
				}
				
			    public String LB_MOIS;

				public String getLB_MOIS () {
					return this.LB_MOIS;
				}
				
			    public String LB_JOUR;

				public String getLB_JOUR () {
					return this.LB_JOUR;
				}
				
			    public int BL_DERNIER_JOUR_MOIS;

				public int getBL_DERNIER_JOUR_MOIS () {
					return this.BL_DERNIER_JOUR_MOIS;
				}
				
			    public int BL_BISSEXTILE;

				public int getBL_BISSEXTILE () {
					return this.BL_BISSEXTILE;
				}
				
			    public int BL_WEEK_END;

				public int getBL_WEEK_END () {
					return this.BL_WEEK_END;
				}
				
			    public int BL_JOUR_FERIE;

				public int getBL_JOUR_FERIE () {
					return this.BL_JOUR_FERIE;
				}
				
			    public String LB_JOUR_FERIE;

				public String getLB_JOUR_FERIE () {
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
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final calendrierStruct other = (calendrierStruct) obj;
		
						if (this.DT_JOUR == null) {
							if (other.DT_JOUR != null)
								return false;
						
						} else if (!this.DT_JOUR.equals(other.DT_JOUR))
						
							return false;
					

		return true;
    }

	public void copyDataTo(calendrierStruct other) {

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

	public void copyKeysDataTo(calendrierStruct other) {

		other.DT_JOUR = this.DT_JOUR;
	            	
	}




	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
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
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
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

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }
	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
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
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
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
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

        	try {

        		int length = 0;
		
					this.DT_JOUR = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_ICOMMERCE_REPORTING_jDwhVente) {

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
				
						writeDate(this.DT_JOUR,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.DT_JOUR,dos);
					
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
		
			            this.ID_DIM_CALENDRIER = dis.readInt();
					
			            this.NB_ANNEE = dis.readInt();
					
			            this.NB_SEMESTRE = dis.readInt();
					
			            this.NB_TRIMESTRE = dis.readInt();
					
			            this.NB_MOIS = dis.readInt();
					
			            this.NB_JOUR_ANNEE = dis.readInt();
					
			            this.NB_JOUR_MOIS = dis.readInt();
					
			            this.NB_JOUR_SEMAINE = dis.readInt();
					
			            this.NB_SEMAINE_ANNEE = dis.readInt();
					
						this.LB_MOIS = readString(dis,ois);
					
						this.LB_JOUR = readString(dis,ois);
					
			            this.BL_DERNIER_JOUR_MOIS = dis.readInt();
					
			            this.BL_BISSEXTILE = dis.readInt();
					
			            this.BL_WEEK_END = dis.readInt();
					
			            this.BL_JOUR_FERIE = dis.readInt();
					
						this.LB_JOUR_FERIE = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
			            this.ID_DIM_CALENDRIER = objectIn.readInt();
					
			            this.NB_ANNEE = objectIn.readInt();
					
			            this.NB_SEMESTRE = objectIn.readInt();
					
			            this.NB_TRIMESTRE = objectIn.readInt();
					
			            this.NB_MOIS = objectIn.readInt();
					
			            this.NB_JOUR_ANNEE = objectIn.readInt();
					
			            this.NB_JOUR_MOIS = objectIn.readInt();
					
			            this.NB_JOUR_SEMAINE = objectIn.readInt();
					
			            this.NB_SEMAINE_ANNEE = objectIn.readInt();
					
						this.LB_MOIS = readString(dis,objectIn);
					
						this.LB_JOUR = readString(dis,objectIn);
					
			            this.BL_DERNIER_JOUR_MOIS = objectIn.readInt();
					
			            this.BL_BISSEXTILE = objectIn.readInt();
					
			            this.BL_WEEK_END = objectIn.readInt();
					
			            this.BL_JOUR_FERIE = objectIn.readInt();
					
						this.LB_JOUR_FERIE = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
		            	dos.writeInt(this.ID_DIM_CALENDRIER);
					
		            	dos.writeInt(this.NB_ANNEE);
					
		            	dos.writeInt(this.NB_SEMESTRE);
					
		            	dos.writeInt(this.NB_TRIMESTRE);
					
		            	dos.writeInt(this.NB_MOIS);
					
		            	dos.writeInt(this.NB_JOUR_ANNEE);
					
		            	dos.writeInt(this.NB_JOUR_MOIS);
					
		            	dos.writeInt(this.NB_JOUR_SEMAINE);
					
		            	dos.writeInt(this.NB_SEMAINE_ANNEE);
					
						writeString(this.LB_MOIS, dos, oos);
					
						writeString(this.LB_JOUR, dos, oos);
					
		            	dos.writeInt(this.BL_DERNIER_JOUR_MOIS);
					
		            	dos.writeInt(this.BL_BISSEXTILE);
					
		            	dos.writeInt(this.BL_WEEK_END);
					
		            	dos.writeInt(this.BL_JOUR_FERIE);
					
						writeString(this.LB_JOUR_FERIE, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					objectOut.writeInt(this.ID_DIM_CALENDRIER);
					
					objectOut.writeInt(this.NB_ANNEE);
					
					objectOut.writeInt(this.NB_SEMESTRE);
					
					objectOut.writeInt(this.NB_TRIMESTRE);
					
					objectOut.writeInt(this.NB_MOIS);
					
					objectOut.writeInt(this.NB_JOUR_ANNEE);
					
					objectOut.writeInt(this.NB_JOUR_MOIS);
					
					objectOut.writeInt(this.NB_JOUR_SEMAINE);
					
					objectOut.writeInt(this.NB_SEMAINE_ANNEE);
					
						writeString(this.LB_MOIS, dos, objectOut);
					
						writeString(this.LB_JOUR, dos, objectOut);
					
					objectOut.writeInt(this.BL_DERNIER_JOUR_MOIS);
					
					objectOut.writeInt(this.BL_BISSEXTILE);
					
					objectOut.writeInt(this.BL_WEEK_END);
					
					objectOut.writeInt(this.BL_JOUR_FERIE);
					
						writeString(this.LB_JOUR_FERIE, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_DIM_CALENDRIER="+String.valueOf(ID_DIM_CALENDRIER));
		sb.append(",DT_JOUR="+String.valueOf(DT_JOUR));
		sb.append(",NB_ANNEE="+String.valueOf(NB_ANNEE));
		sb.append(",NB_SEMESTRE="+String.valueOf(NB_SEMESTRE));
		sb.append(",NB_TRIMESTRE="+String.valueOf(NB_TRIMESTRE));
		sb.append(",NB_MOIS="+String.valueOf(NB_MOIS));
		sb.append(",NB_JOUR_ANNEE="+String.valueOf(NB_JOUR_ANNEE));
		sb.append(",NB_JOUR_MOIS="+String.valueOf(NB_JOUR_MOIS));
		sb.append(",NB_JOUR_SEMAINE="+String.valueOf(NB_JOUR_SEMAINE));
		sb.append(",NB_SEMAINE_ANNEE="+String.valueOf(NB_SEMAINE_ANNEE));
		sb.append(",LB_MOIS="+LB_MOIS);
		sb.append(",LB_JOUR="+LB_JOUR);
		sb.append(",BL_DERNIER_JOUR_MOIS="+String.valueOf(BL_DERNIER_JOUR_MOIS));
		sb.append(",BL_BISSEXTILE="+String.valueOf(BL_BISSEXTILE));
		sb.append(",BL_WEEK_END="+String.valueOf(BL_WEEK_END));
		sb.append(",BL_JOUR_FERIE="+String.valueOf(BL_JOUR_FERIE));
		sb.append(",LB_JOUR_FERIE="+LB_JOUR_FERIE);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(calendrierStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.DT_JOUR, other.DT_JOUR);
						if(returnValue != 0) {
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
public void tDBInput_5Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_5_SUBPROCESS_STATE", 0);

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



		calendrierStruct calendrier = new calendrierStruct();




	
	/**
	 * [tAdvancedHash_calendrier begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_calendrier", false);
		start_Hash.put("tAdvancedHash_calendrier", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_calendrier";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"calendrier");
					}
				
		int tos_count_tAdvancedHash_calendrier = 0;
		

			   		// connection name:calendrier
			   		// source node:tDBInput_5 - inputs:(after_tDBInput_1) outputs:(calendrier,calendrier) | target node:tAdvancedHash_calendrier - inputs:(calendrier) outputs:()
			   		// linked node: tMap_1 - inputs:(vente,produit,client,calendrier) outputs:(venteToInsert)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_calendrier = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<calendrierStruct> tHash_Lookup_calendrier =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<calendrierStruct>getLookup(matchingModeEnum_calendrier);
	   						   
		   	   	   globalMap.put("tHash_Lookup_calendrier", tHash_Lookup_calendrier);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_calendrier begin ] stop
 */



	
	/**
	 * [tDBInput_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_5", false);
		start_Hash.put("tDBInput_5", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_5";

	
		int tos_count_tDBInput_5 = 0;
		
	
    
	
		    int nb_line_tDBInput_5 = 0;
		    java.sql.Connection conn_tDBInput_5 = null;
				conn_tDBInput_5 = (java.sql.Connection)globalMap.get("conn_tDBConnection_2");
				
		    
			java.sql.Statement stmt_tDBInput_5 = conn_tDBInput_5.createStatement();

		    String dbquery_tDBInput_5 = "SELECT \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"ID_DIM_CALENDRIER\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"DT_JOUR\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"NB_ANNEE\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"NB_SEMESTRE\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"NB_TRIMESTRE\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"NB_MOIS\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"NB_JOUR_ANNEE\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"NB_JOUR_MOIS\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"NB_JOUR_SEMAINE\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"NB_SEMAINE_ANNEE\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"LB_MOIS\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"LB_JOUR\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"BL_DERNIER_JOUR_MOIS\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"BL_BISSEXTILE\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"BL_WEEK_END\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"BL_JOUR_FERIE\", \n  \""+context.schema_dwh+"\".\"DIM_CALENDRIER\".\"LB_JOUR_FERIE\"\nFROM \""+context.schema_dwh+"\".\"DIM_CALENDRIER\"";
		    

            	globalMap.put("tDBInput_5_QUERY",dbquery_tDBInput_5);
		    java.sql.ResultSet rs_tDBInput_5 = null;

		    try {
		    	rs_tDBInput_5 = stmt_tDBInput_5.executeQuery(dbquery_tDBInput_5);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_5 = rs_tDBInput_5.getMetaData();
		    	int colQtyInRs_tDBInput_5 = rsmd_tDBInput_5.getColumnCount();

		    String tmpContent_tDBInput_5 = null;
		    
		    
		    while (rs_tDBInput_5.next()) {
		        nb_line_tDBInput_5++;
		        
							if(colQtyInRs_tDBInput_5 < 1) {
								calendrier.ID_DIM_CALENDRIER = 0;
							} else {
		                          
            calendrier.ID_DIM_CALENDRIER = rs_tDBInput_5.getInt(1);
            if(rs_tDBInput_5.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 2) {
								calendrier.DT_JOUR = null;
							} else {
										
			calendrier.DT_JOUR = routines.system.JDBCUtil.getDate(rs_tDBInput_5, 2);
		                    }
							if(colQtyInRs_tDBInput_5 < 3) {
								calendrier.NB_ANNEE = 0;
							} else {
		                          
            calendrier.NB_ANNEE = rs_tDBInput_5.getInt(3);
            if(rs_tDBInput_5.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 4) {
								calendrier.NB_SEMESTRE = 0;
							} else {
		                          
            calendrier.NB_SEMESTRE = rs_tDBInput_5.getInt(4);
            if(rs_tDBInput_5.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 5) {
								calendrier.NB_TRIMESTRE = 0;
							} else {
		                          
            calendrier.NB_TRIMESTRE = rs_tDBInput_5.getInt(5);
            if(rs_tDBInput_5.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 6) {
								calendrier.NB_MOIS = 0;
							} else {
		                          
            calendrier.NB_MOIS = rs_tDBInput_5.getInt(6);
            if(rs_tDBInput_5.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 7) {
								calendrier.NB_JOUR_ANNEE = 0;
							} else {
		                          
            calendrier.NB_JOUR_ANNEE = rs_tDBInput_5.getInt(7);
            if(rs_tDBInput_5.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 8) {
								calendrier.NB_JOUR_MOIS = 0;
							} else {
		                          
            calendrier.NB_JOUR_MOIS = rs_tDBInput_5.getInt(8);
            if(rs_tDBInput_5.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 9) {
								calendrier.NB_JOUR_SEMAINE = 0;
							} else {
		                          
            calendrier.NB_JOUR_SEMAINE = rs_tDBInput_5.getInt(9);
            if(rs_tDBInput_5.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 10) {
								calendrier.NB_SEMAINE_ANNEE = 0;
							} else {
		                          
            calendrier.NB_SEMAINE_ANNEE = rs_tDBInput_5.getInt(10);
            if(rs_tDBInput_5.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 11) {
								calendrier.LB_MOIS = null;
							} else {
	                         		
        	calendrier.LB_MOIS = routines.system.JDBCUtil.getString(rs_tDBInput_5, 11, false);
		                    }
							if(colQtyInRs_tDBInput_5 < 12) {
								calendrier.LB_JOUR = null;
							} else {
	                         		
        	calendrier.LB_JOUR = routines.system.JDBCUtil.getString(rs_tDBInput_5, 12, false);
		                    }
							if(colQtyInRs_tDBInput_5 < 13) {
								calendrier.BL_DERNIER_JOUR_MOIS = 0;
							} else {
		                          
            calendrier.BL_DERNIER_JOUR_MOIS = rs_tDBInput_5.getInt(13);
            if(rs_tDBInput_5.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 14) {
								calendrier.BL_BISSEXTILE = 0;
							} else {
		                          
            calendrier.BL_BISSEXTILE = rs_tDBInput_5.getInt(14);
            if(rs_tDBInput_5.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 15) {
								calendrier.BL_WEEK_END = 0;
							} else {
		                          
            calendrier.BL_WEEK_END = rs_tDBInput_5.getInt(15);
            if(rs_tDBInput_5.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 16) {
								calendrier.BL_JOUR_FERIE = 0;
							} else {
		                          
            calendrier.BL_JOUR_FERIE = rs_tDBInput_5.getInt(16);
            if(rs_tDBInput_5.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 17) {
								calendrier.LB_JOUR_FERIE = null;
							} else {
	                         		
        	calendrier.LB_JOUR_FERIE = routines.system.JDBCUtil.getString(rs_tDBInput_5, 17, false);
		                    }
					


 



/**
 * [tDBInput_5 begin ] stop
 */
	
	/**
	 * [tDBInput_5 main ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

 


	tos_count_tDBInput_5++;

/**
 * [tDBInput_5 main ] stop
 */
	
	/**
	 * [tDBInput_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

 



/**
 * [tDBInput_5 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_calendrier main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_calendrier";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"calendrier"
						
						);
					}
					


			   
			   

					calendrierStruct calendrier_HashRow = new calendrierStruct();
		   	   	   
				
				calendrier_HashRow.ID_DIM_CALENDRIER = calendrier.ID_DIM_CALENDRIER;
				
				calendrier_HashRow.DT_JOUR = calendrier.DT_JOUR;
				
				calendrier_HashRow.NB_ANNEE = calendrier.NB_ANNEE;
				
				calendrier_HashRow.NB_SEMESTRE = calendrier.NB_SEMESTRE;
				
				calendrier_HashRow.NB_TRIMESTRE = calendrier.NB_TRIMESTRE;
				
				calendrier_HashRow.NB_MOIS = calendrier.NB_MOIS;
				
				calendrier_HashRow.NB_JOUR_ANNEE = calendrier.NB_JOUR_ANNEE;
				
				calendrier_HashRow.NB_JOUR_MOIS = calendrier.NB_JOUR_MOIS;
				
				calendrier_HashRow.NB_JOUR_SEMAINE = calendrier.NB_JOUR_SEMAINE;
				
				calendrier_HashRow.NB_SEMAINE_ANNEE = calendrier.NB_SEMAINE_ANNEE;
				
				calendrier_HashRow.LB_MOIS = calendrier.LB_MOIS;
				
				calendrier_HashRow.LB_JOUR = calendrier.LB_JOUR;
				
				calendrier_HashRow.BL_DERNIER_JOUR_MOIS = calendrier.BL_DERNIER_JOUR_MOIS;
				
				calendrier_HashRow.BL_BISSEXTILE = calendrier.BL_BISSEXTILE;
				
				calendrier_HashRow.BL_WEEK_END = calendrier.BL_WEEK_END;
				
				calendrier_HashRow.BL_JOUR_FERIE = calendrier.BL_JOUR_FERIE;
				
				calendrier_HashRow.LB_JOUR_FERIE = calendrier.LB_JOUR_FERIE;
				
			tHash_Lookup_calendrier.put(calendrier_HashRow);
			
            




 


	tos_count_tAdvancedHash_calendrier++;

/**
 * [tAdvancedHash_calendrier main ] stop
 */
	
	/**
	 * [tAdvancedHash_calendrier process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_calendrier";

	

 



/**
 * [tAdvancedHash_calendrier process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_calendrier process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_calendrier";

	

 



/**
 * [tAdvancedHash_calendrier process_data_end ] stop
 */



	
	/**
	 * [tDBInput_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

 



/**
 * [tDBInput_5 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_5 end ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

	}
}finally{
	if (rs_tDBInput_5 != null) {
		rs_tDBInput_5.close();
	}
	if (stmt_tDBInput_5 != null) {
		stmt_tDBInput_5.close();
	}
}
globalMap.put("tDBInput_5_NB_LINE",nb_line_tDBInput_5);
 

ok_Hash.put("tDBInput_5", true);
end_Hash.put("tDBInput_5", System.currentTimeMillis());




/**
 * [tDBInput_5 end ] stop
 */

	
	/**
	 * [tAdvancedHash_calendrier end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_calendrier";

	

tHash_Lookup_calendrier.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"calendrier");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_calendrier", true);
end_Hash.put("tAdvancedHash_calendrier", System.currentTimeMillis());




/**
 * [tAdvancedHash_calendrier end ] stop
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
	 * [tDBInput_5 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

 



/**
 * [tDBInput_5 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_calendrier finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_calendrier";

	

 



/**
 * [tAdvancedHash_calendrier finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_5_SUBPROCESS_STATE", 1);
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
				tDBConnection_1Process(globalMap);



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
   	 				runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
				}
				tDBConnection_2Process(globalMap);



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
	

public void tDBConnection_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBConnection_2_SUBPROCESS_STATE", 0);

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
	 * [tDBConnection_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBConnection_2", false);
		start_Hash.put("tDBConnection_2", System.currentTimeMillis());
		
	
	currentComponent="tDBConnection_2";

	
		int tos_count_tDBConnection_2 = 0;
		


	
            String dbProperties_tDBConnection_2 = context.additionalParam;
            String url_tDBConnection_2 = "jdbc:postgresql://"+context.serverName+":"+context.port+"/"+context.database;
            
            if(dbProperties_tDBConnection_2 != null && !"".equals(dbProperties_tDBConnection_2.trim())) {
                url_tDBConnection_2 = url_tDBConnection_2 + "?" + dbProperties_tDBConnection_2;
            }
	String dbUser_tDBConnection_2 = context.utilisateur;
	
	
		
	final String decryptedPassword_tDBConnection_2 = context.password; 
		String dbPwd_tDBConnection_2 = decryptedPassword_tDBConnection_2;
	
	
	java.sql.Connection conn_tDBConnection_2 = null;
	
        java.util.Enumeration<java.sql.Driver> drivers_tDBConnection_2 =  java.sql.DriverManager.getDrivers();
        java.util.Set<String> redShiftDriverNames_tDBConnection_2 = new java.util.HashSet<String>(java.util.Arrays
                .asList("com.amazon.redshift.jdbc.Driver","com.amazon.redshift.jdbc41.Driver","com.amazon.redshift.jdbc42.Driver"));
    while (drivers_tDBConnection_2.hasMoreElements()) {
        java.sql.Driver d_tDBConnection_2 = drivers_tDBConnection_2.nextElement();
        if (redShiftDriverNames_tDBConnection_2.contains(d_tDBConnection_2.getClass().getName())) {
            try {
                java.sql.DriverManager.deregisterDriver(d_tDBConnection_2);
                java.sql.DriverManager.registerDriver(d_tDBConnection_2);
            } catch (java.lang.Exception e_tDBConnection_2) {
globalMap.put("tDBConnection_2_ERROR_MESSAGE",e_tDBConnection_2.getMessage());
                    //do nothing
            }
        }
    }
	
			String sharedConnectionName_tDBConnection_2 = "VENTE_DWH";
			conn_tDBConnection_2 = SharedDBConnection.getDBConnection("org.postgresql.Driver",url_tDBConnection_2,dbUser_tDBConnection_2 , dbPwd_tDBConnection_2 , sharedConnectionName_tDBConnection_2);
			globalMap.put("conn_tDBConnection_2", conn_tDBConnection_2);
	if (null != conn_tDBConnection_2) {
		
			conn_tDBConnection_2.setAutoCommit(false);
	}

	globalMap.put("schema_" + "tDBConnection_2",context.schema_dwh);

 



/**
 * [tDBConnection_2 begin ] stop
 */
	
	/**
	 * [tDBConnection_2 main ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";

	

 


	tos_count_tDBConnection_2++;

/**
 * [tDBConnection_2 main ] stop
 */
	
	/**
	 * [tDBConnection_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";

	

 



/**
 * [tDBConnection_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";

	

 



/**
 * [tDBConnection_2 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_2 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";

	

 

ok_Hash.put("tDBConnection_2", true);
end_Hash.put("tDBConnection_2", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
				}
				tJava_1Process(globalMap);



/**
 * [tDBConnection_2 end ] stop
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
	 * [tDBConnection_2 finally ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";

	

 



/**
 * [tDBConnection_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBConnection_2_SUBPROCESS_STATE", 1);
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
				tDBCommit_2Process(globalMap);



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
	

public void tDBCommit_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBCommit_2_SUBPROCESS_STATE", 0);

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
	 * [tDBCommit_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBCommit_2", false);
		start_Hash.put("tDBCommit_2", System.currentTimeMillis());
		
	
	currentComponent="tDBCommit_2";

	
		int tos_count_tDBCommit_2 = 0;
		

 



/**
 * [tDBCommit_2 begin ] stop
 */
	
	/**
	 * [tDBCommit_2 main ] start
	 */

	

	
	
	currentComponent="tDBCommit_2";

	

	java.sql.Connection conn_tDBCommit_2 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	if(conn_tDBCommit_2 != null && !conn_tDBCommit_2.isClosed())
	{
	
			
			conn_tDBCommit_2.commit();
			
	
	}

 


	tos_count_tDBCommit_2++;

/**
 * [tDBCommit_2 main ] stop
 */
	
	/**
	 * [tDBCommit_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBCommit_2";

	

 



/**
 * [tDBCommit_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBCommit_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBCommit_2";

	

 



/**
 * [tDBCommit_2 process_data_end ] stop
 */
	
	/**
	 * [tDBCommit_2 end ] start
	 */

	

	
	
	currentComponent="tDBCommit_2";

	

 

ok_Hash.put("tDBCommit_2", true);
end_Hash.put("tDBCommit_2", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk8", 0, "ok");
				}
				tDBCommit_1Process(globalMap);



/**
 * [tDBCommit_2 end ] stop
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
	 * [tDBCommit_2 finally ] start
	 */

	

	
	
	currentComponent="tDBCommit_2";

	

 



/**
 * [tDBCommit_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBCommit_2_SUBPROCESS_STATE", 1);
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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBCommit_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBCommit_1", false);
		start_Hash.put("tDBCommit_1", System.currentTimeMillis());
		
	
	currentComponent="tDBCommit_1";

	
		int tos_count_tDBCommit_1 = 0;
		

 



/**
 * [tDBCommit_1 begin ] stop
 */
	
	/**
	 * [tDBCommit_1 main ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

	java.sql.Connection conn_tDBCommit_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_2");
	if(conn_tDBCommit_1 != null && !conn_tDBCommit_1.isClosed())
	{
	
			
			conn_tDBCommit_1.commit();
			
	
	}

 


	tos_count_tDBCommit_1++;

/**
 * [tDBCommit_1 main ] stop
 */
	
	/**
	 * [tDBCommit_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

 



/**
 * [tDBCommit_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBCommit_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

 



/**
 * [tDBCommit_1 process_data_end ] stop
 */
	
	/**
	 * [tDBCommit_1 end ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

 

ok_Hash.put("tDBCommit_1", true);
end_Hash.put("tDBCommit_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk6", 0, "ok");
				}
				tChronometerStop_1Process(globalMap);



/**
 * [tDBCommit_1 end ] stop
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
	 * [tDBCommit_1 finally ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

 



/**
 * [tDBCommit_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBCommit_1_SUBPROCESS_STATE", 1);
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
	
	  	timetChronometerStop_1 = System.currentTimeMillis() - ((Long)globalMap.get("tChronometerStart_1")).longValue();
		
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
		


System.out.println("Fin d'exécution du job "+jobName+ "          : "+ 
TalendDate.formatDate("yyyy-MM-dd HH:mm:ss",new java.util.Date(((Long)globalMap.get("tChronometerStop_1_STOPTIME")))
));

System.out.println("Durée totale d'exécution du job "+jobName+ " : "+  
((Long)globalMap.get("tChronometerStop_1_DURATION")) + "");
System.out.println("-----------------------------------------------------------------------------");
 



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
        final jDwhVente jDwhVenteClass = new jDwhVente();

        int exitCode = jDwhVenteClass.runJobInTOS(args);

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
            java.io.InputStream inContext = jDwhVente.class.getClassLoader().getResourceAsStream("icommerce_reporting/jdwhvente_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = jDwhVente.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
                        context.setContextType("schema_dwh", "id_String");
                        if(context.getStringValue("schema_dwh") == null) {
                            context.schema_dwh = null;
                        } else {
                            context.schema_dwh=(String) context.getProperty("schema_dwh");
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
                        context.setContextType("schema_ods", "id_String");
                        if(context.getStringValue("schema_ods") == null) {
                            context.schema_ods = null;
                        } else {
                            context.schema_ods=(String) context.getProperty("schema_ods");
                        }
                        context.setContextType("schema_param", "id_String");
                        if(context.getStringValue("schema_param") == null) {
                            context.schema_param = null;
                        } else {
                            context.schema_param=(String) context.getProperty("schema_param");
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
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("additionalParam")) {
                context.additionalParam = (String) parentContextMap.get("additionalParam");
            }if (parentContextMap.containsKey("database")) {
                context.database = (String) parentContextMap.get("database");
            }if (parentContextMap.containsKey("password")) {
                context.password = (java.lang.String) parentContextMap.get("password");
            }if (parentContextMap.containsKey("port")) {
                context.port = (String) parentContextMap.get("port");
            }if (parentContextMap.containsKey("schema_dwh")) {
                context.schema_dwh = (String) parentContextMap.get("schema_dwh");
            }if (parentContextMap.containsKey("serverName")) {
                context.serverName = (String) parentContextMap.get("serverName");
            }if (parentContextMap.containsKey("utilisateur")) {
                context.utilisateur = (String) parentContextMap.get("utilisateur");
            }if (parentContextMap.containsKey("schema_ods")) {
                context.schema_ods = (String) parentContextMap.get("schema_ods");
            }if (parentContextMap.containsKey("schema_param")) {
                context.schema_param = (String) parentContextMap.get("schema_param");
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
errorCode = null;tDBInput_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tDBInput_1) {
globalMap.put("tDBInput_1_SUBPROCESS_STATE", -1);

e_tDBInput_1.printStackTrace();

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
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : jDwhVente");
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
            obj_conn = globalMap.remove("conn_tDBConnection_2");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
        } catch (java.lang.Exception e) {
        }
    }











    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
            connections.put("conn_tDBConnection_1", globalMap.get("conn_tDBConnection_1"));
            connections.put("conn_tDBConnection_2", globalMap.get("conn_tDBConnection_2"));






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
 *     355990 characters generated by Talend Open Studio for Data Integration 
 *     on the 8 septembre 2023 à 12:44:08 WAT
 ************************************************************************************************/
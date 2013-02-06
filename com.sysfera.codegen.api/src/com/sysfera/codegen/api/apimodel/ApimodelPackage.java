/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sysfera.codegen.api.apimodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.sysfera.codegen.api.apimodel.ApimodelFactory
 * @model kind="package"
 * @generated
 */
public interface ApimodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "apimodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.sysfera.codegen.apimodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApimodelPackage eINSTANCE = com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.sysfera.codegen.api.apimodel.impl.APIImpl <em>API</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sysfera.codegen.api.apimodel.impl.APIImpl
	 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getAPI()
	 * @generated
	 */
	int API = 0;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__MODULES = 0;

	/**
	 * The feature id for the '<em><b>Env Variable List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__ENV_VARIABLE_LIST = 1;

	/**
	 * The feature id for the '<em><b>Job Env Variable List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__JOB_ENV_VARIABLE_LIST = 2;

	/**
	 * The feature id for the '<em><b>Type List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__TYPE_LIST = 3;

	/**
	 * The number of structural features of the '<em>API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.sysfera.codegen.api.apimodel.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sysfera.codegen.api.apimodel.impl.ModuleImpl
	 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Api</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__API = 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__SERVICES = 2;

	/**
	 * The feature id for the '<em><b>Type List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__TYPE_LIST = 3;

	/**
	 * The feature id for the '<em><b>Result Code List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__RESULT_CODE_LIST = 4;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.sysfera.codegen.api.apimodel.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sysfera.codegen.api.apimodel.impl.ServiceImpl
	 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__MODULE = 2;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PORTS = 3;

	/**
	 * The feature id for the '<em><b>Admin Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ADMIN_ONLY = 4;

	/**
	 * The feature id for the '<em><b>Is Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__IS_COMMAND = 5;

	/**
	 * The feature id for the '<em><b>Is Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__IS_FUNCTION = 6;

	/**
	 * The feature id for the '<em><b>Result Codes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__RESULT_CODES = 7;

	/**
	 * The feature id for the '<em><b>Used Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__USED_SERVICES = 8;

	/**
	 * The feature id for the '<em><b>Used By Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__USED_BY_SERVICES = 9;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DETAILS = 10;

	/**
	 * The feature id for the '<em><b>Use Job Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__USE_JOB_ENV = 11;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link com.sysfera.codegen.api.apimodel.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sysfera.codegen.api.apimodel.impl.PortImpl
	 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DIRECTION = 2;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__USAGE = 3;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DATA_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__OPTIONAL = 6;

	/**
	 * The feature id for the '<em><b>Short Option Letter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__SHORT_OPTION_LETTER = 7;

	/**
	 * The feature id for the '<em><b>Long Option Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__LONG_OPTION_NAME = 8;

	/**
	 * The feature id for the '<em><b>Env Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ENV_OPTION = 9;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DEFAULT_VALUE_LITERAL = 10;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DETAILS = 11;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link com.sysfera.codegen.api.apimodel.impl.EnvVariableImpl <em>Env Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sysfera.codegen.api.apimodel.impl.EnvVariableImpl
	 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getEnvVariable()
	 * @generated
	 */
	int ENV_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VARIABLE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Is User Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VARIABLE__IS_USER_OPTION = 2;

	/**
	 * The number of structural features of the '<em>Env Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.sysfera.codegen.api.apimodel.impl.EnvVariableListImpl <em>Env Variable List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sysfera.codegen.api.apimodel.impl.EnvVariableListImpl
	 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getEnvVariableList()
	 * @generated
	 */
	int ENV_VARIABLE_LIST = 5;

	/**
	 * The feature id for the '<em><b>Env Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VARIABLE_LIST__ENV_VARIABLES = 0;

	/**
	 * The number of structural features of the '<em>Env Variable List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VARIABLE_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.sysfera.codegen.api.apimodel.impl.JobEnvVariableListImpl <em>Job Env Variable List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sysfera.codegen.api.apimodel.impl.JobEnvVariableListImpl
	 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getJobEnvVariableList()
	 * @generated
	 */
	int JOB_ENV_VARIABLE_LIST = 6;

	/**
	 * The feature id for the '<em><b>Env Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENV_VARIABLE_LIST__ENV_VARIABLES = 0;

	/**
	 * The number of structural features of the '<em>Job Env Variable List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENV_VARIABLE_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.sysfera.codegen.api.apimodel.impl.ResultCodeImpl <em>Result Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sysfera.codegen.api.apimodel.impl.ResultCodeImpl
	 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getResultCode()
	 * @generated
	 */
	int RESULT_CODE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CODE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CODE__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CODE__USAGE = 3;

	/**
	 * The feature id for the '<em><b>Diagnostic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CODE__DIAGNOSTIC = 4;

	/**
	 * The number of structural features of the '<em>Result Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CODE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.sysfera.codegen.api.apimodel.impl.ResultCodeListImpl <em>Result Code List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sysfera.codegen.api.apimodel.impl.ResultCodeListImpl
	 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getResultCodeList()
	 * @generated
	 */
	int RESULT_CODE_LIST = 8;

	/**
	 * The feature id for the '<em><b>Result Codes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CODE_LIST__RESULT_CODES = 0;

	/**
	 * The number of structural features of the '<em>Result Code List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CODE_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.sysfera.codegen.api.apimodel.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sysfera.codegen.api.apimodel.impl.TypeImpl
	 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>ECore Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ECORE_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.sysfera.codegen.api.apimodel.impl.TypeListImpl <em>Type List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sysfera.codegen.api.apimodel.impl.TypeListImpl
	 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getTypeList()
	 * @generated
	 */
	int TYPE_LIST = 10;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LIST__TYPES = 0;

	/**
	 * The feature id for the '<em><b>ETypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LIST__ETYPES = 1;

	/**
	 * The number of structural features of the '<em>Type List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.sysfera.codegen.api.apimodel.portDirection <em>port Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sysfera.codegen.api.apimodel.portDirection
	 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getportDirection()
	 * @generated
	 */
	int PORT_DIRECTION = 11;


	/**
	 * The meta object id for the '{@link com.sysfera.codegen.api.apimodel.APIUsage <em>API Usage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sysfera.codegen.api.apimodel.APIUsage
	 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getAPIUsage()
	 * @generated
	 */
	int API_USAGE = 12;

	/**
	 * Returns the meta object for class '{@link com.sysfera.codegen.api.apimodel.API <em>API</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API</em>'.
	 * @see com.sysfera.codegen.api.apimodel.API
	 * @generated
	 */
	EClass getAPI();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sysfera.codegen.api.apimodel.API#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see com.sysfera.codegen.api.apimodel.API#getModules()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_Modules();

	/**
	 * Returns the meta object for the containment reference '{@link com.sysfera.codegen.api.apimodel.API#getEnvVariableList <em>Env Variable List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Variable List</em>'.
	 * @see com.sysfera.codegen.api.apimodel.API#getEnvVariableList()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_EnvVariableList();

	/**
	 * Returns the meta object for the containment reference '{@link com.sysfera.codegen.api.apimodel.API#getJobEnvVariableList <em>Job Env Variable List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Job Env Variable List</em>'.
	 * @see com.sysfera.codegen.api.apimodel.API#getJobEnvVariableList()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_JobEnvVariableList();

	/**
	 * Returns the meta object for the containment reference '{@link com.sysfera.codegen.api.apimodel.API#getTypeList <em>Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type List</em>'.
	 * @see com.sysfera.codegen.api.apimodel.API#getTypeList()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_TypeList();

	/**
	 * Returns the meta object for class '{@link com.sysfera.codegen.api.apimodel.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.Module#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Module#getName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.sysfera.codegen.api.apimodel.Module#getApi <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Api</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Module#getApi()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Api();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sysfera.codegen.api.apimodel.Module#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Module#getServices()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Services();

	/**
	 * Returns the meta object for the containment reference '{@link com.sysfera.codegen.api.apimodel.Module#getTypeList <em>Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type List</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Module#getTypeList()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_TypeList();

	/**
	 * Returns the meta object for the containment reference '{@link com.sysfera.codegen.api.apimodel.Module#getResultCodeList <em>Result Code List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result Code List</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Module#getResultCodeList()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ResultCodeList();

	/**
	 * Returns the meta object for class '{@link com.sysfera.codegen.api.apimodel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.Service#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Service#getDescription()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Description();

	/**
	 * Returns the meta object for the container reference '{@link com.sysfera.codegen.api.apimodel.Service#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Service#getModule()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Module();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sysfera.codegen.api.apimodel.Service#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Service#getPorts()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Ports();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.Service#isAdminOnly <em>Admin Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin Only</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Service#isAdminOnly()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_AdminOnly();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.Service#isIsCommand <em>Is Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Command</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Service#isIsCommand()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_IsCommand();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.Service#isIsFunction <em>Is Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Function</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Service#isIsFunction()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_IsFunction();

	/**
	 * Returns the meta object for the reference list '{@link com.sysfera.codegen.api.apimodel.Service#getResultCodes <em>Result Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Result Codes</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Service#getResultCodes()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_ResultCodes();

	/**
	 * Returns the meta object for the reference list '{@link com.sysfera.codegen.api.apimodel.Service#getUsedServices <em>Used Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Services</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Service#getUsedServices()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_UsedServices();

	/**
	 * Returns the meta object for the reference list '{@link com.sysfera.codegen.api.apimodel.Service#getUsedByServices <em>Used By Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used By Services</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Service#getUsedByServices()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_UsedByServices();

	/**
	 * Returns the meta object for the map '{@link com.sysfera.codegen.api.apimodel.Service#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Details</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Service#getDetails()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Details();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.Service#isUseJobEnv <em>Use Job Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Job Env</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Service#isUseJobEnv()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_UseJobEnv();

	/**
	 * Returns the meta object for class '{@link com.sysfera.codegen.api.apimodel.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.sysfera.codegen.api.apimodel.Port#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Service</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Port#getService()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Service();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.Port#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Port#getDirection()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Direction();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.Port#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Port#getUsage()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Usage();

	/**
	 * Returns the meta object for the reference '{@link com.sysfera.codegen.api.apimodel.Port#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Port#getDataType()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_DataType();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.Port#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Port#getDescription()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.Port#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Port#isOptional()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Optional();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.Port#getShortOptionLetter <em>Short Option Letter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Option Letter</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Port#getShortOptionLetter()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_ShortOptionLetter();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.Port#getLongOptionName <em>Long Option Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Option Name</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Port#getLongOptionName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_LongOptionName();

	/**
	 * Returns the meta object for the reference '{@link com.sysfera.codegen.api.apimodel.Port#getEnvOption <em>Env Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Env Option</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Port#getEnvOption()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_EnvOption();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.Port#getDefaultValueLiteral <em>Default Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Literal</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Port#getDefaultValueLiteral()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_DefaultValueLiteral();

	/**
	 * Returns the meta object for the map '{@link com.sysfera.codegen.api.apimodel.Port#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Details</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Port#getDetails()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Details();

	/**
	 * Returns the meta object for class '{@link com.sysfera.codegen.api.apimodel.EnvVariable <em>Env Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Variable</em>'.
	 * @see com.sysfera.codegen.api.apimodel.EnvVariable
	 * @generated
	 */
	EClass getEnvVariable();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.EnvVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sysfera.codegen.api.apimodel.EnvVariable#getName()
	 * @see #getEnvVariable()
	 * @generated
	 */
	EAttribute getEnvVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.EnvVariable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.sysfera.codegen.api.apimodel.EnvVariable#getDescription()
	 * @see #getEnvVariable()
	 * @generated
	 */
	EAttribute getEnvVariable_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.EnvVariable#isIsUserOption <em>Is User Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is User Option</em>'.
	 * @see com.sysfera.codegen.api.apimodel.EnvVariable#isIsUserOption()
	 * @see #getEnvVariable()
	 * @generated
	 */
	EAttribute getEnvVariable_IsUserOption();

	/**
	 * Returns the meta object for class '{@link com.sysfera.codegen.api.apimodel.EnvVariableList <em>Env Variable List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Variable List</em>'.
	 * @see com.sysfera.codegen.api.apimodel.EnvVariableList
	 * @generated
	 */
	EClass getEnvVariableList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sysfera.codegen.api.apimodel.EnvVariableList#getEnvVariables <em>Env Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Variables</em>'.
	 * @see com.sysfera.codegen.api.apimodel.EnvVariableList#getEnvVariables()
	 * @see #getEnvVariableList()
	 * @generated
	 */
	EReference getEnvVariableList_EnvVariables();

	/**
	 * Returns the meta object for class '{@link com.sysfera.codegen.api.apimodel.JobEnvVariableList <em>Job Env Variable List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Env Variable List</em>'.
	 * @see com.sysfera.codegen.api.apimodel.JobEnvVariableList
	 * @generated
	 */
	EClass getJobEnvVariableList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sysfera.codegen.api.apimodel.JobEnvVariableList#getEnvVariables <em>Env Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Variables</em>'.
	 * @see com.sysfera.codegen.api.apimodel.JobEnvVariableList#getEnvVariables()
	 * @see #getJobEnvVariableList()
	 * @generated
	 */
	EReference getJobEnvVariableList_EnvVariables();

	/**
	 * Returns the meta object for class '{@link com.sysfera.codegen.api.apimodel.ResultCode <em>Result Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Code</em>'.
	 * @see com.sysfera.codegen.api.apimodel.ResultCode
	 * @generated
	 */
	EClass getResultCode();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.ResultCode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sysfera.codegen.api.apimodel.ResultCode#getName()
	 * @see #getResultCode()
	 * @generated
	 */
	EAttribute getResultCode_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.ResultCode#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.sysfera.codegen.api.apimodel.ResultCode#getDescription()
	 * @see #getResultCode()
	 * @generated
	 */
	EAttribute getResultCode_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.ResultCode#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.sysfera.codegen.api.apimodel.ResultCode#getValue()
	 * @see #getResultCode()
	 * @generated
	 */
	EAttribute getResultCode_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.ResultCode#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see com.sysfera.codegen.api.apimodel.ResultCode#getUsage()
	 * @see #getResultCode()
	 * @generated
	 */
	EAttribute getResultCode_Usage();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.ResultCode#getDiagnostic <em>Diagnostic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagnostic</em>'.
	 * @see com.sysfera.codegen.api.apimodel.ResultCode#getDiagnostic()
	 * @see #getResultCode()
	 * @generated
	 */
	EAttribute getResultCode_Diagnostic();

	/**
	 * Returns the meta object for class '{@link com.sysfera.codegen.api.apimodel.ResultCodeList <em>Result Code List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Code List</em>'.
	 * @see com.sysfera.codegen.api.apimodel.ResultCodeList
	 * @generated
	 */
	EClass getResultCodeList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sysfera.codegen.api.apimodel.ResultCodeList#getResultCodes <em>Result Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Codes</em>'.
	 * @see com.sysfera.codegen.api.apimodel.ResultCodeList#getResultCodes()
	 * @see #getResultCodeList()
	 * @generated
	 */
	EReference getResultCodeList_ResultCodes();

	/**
	 * Returns the meta object for class '{@link com.sysfera.codegen.api.apimodel.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.sysfera.codegen.api.apimodel.Type#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Type#getDescription()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Description();

	/**
	 * Returns the meta object for the reference '{@link com.sysfera.codegen.api.apimodel.Type#getECoreType <em>ECore Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ECore Type</em>'.
	 * @see com.sysfera.codegen.api.apimodel.Type#getECoreType()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_ECoreType();

	/**
	 * Returns the meta object for class '{@link com.sysfera.codegen.api.apimodel.TypeList <em>Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type List</em>'.
	 * @see com.sysfera.codegen.api.apimodel.TypeList
	 * @generated
	 */
	EClass getTypeList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sysfera.codegen.api.apimodel.TypeList#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see com.sysfera.codegen.api.apimodel.TypeList#getTypes()
	 * @see #getTypeList()
	 * @generated
	 */
	EReference getTypeList_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sysfera.codegen.api.apimodel.TypeList#getETypes <em>ETypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ETypes</em>'.
	 * @see com.sysfera.codegen.api.apimodel.TypeList#getETypes()
	 * @see #getTypeList()
	 * @generated
	 */
	EReference getTypeList_ETypes();

	/**
	 * Returns the meta object for enum '{@link com.sysfera.codegen.api.apimodel.portDirection <em>port Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>port Direction</em>'.
	 * @see com.sysfera.codegen.api.apimodel.portDirection
	 * @generated
	 */
	EEnum getportDirection();

	/**
	 * Returns the meta object for enum '{@link com.sysfera.codegen.api.apimodel.APIUsage <em>API Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>API Usage</em>'.
	 * @see com.sysfera.codegen.api.apimodel.APIUsage
	 * @generated
	 */
	EEnum getAPIUsage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApimodelFactory getApimodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.sysfera.codegen.api.apimodel.impl.APIImpl <em>API</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sysfera.codegen.api.apimodel.impl.APIImpl
		 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getAPI()
		 * @generated
		 */
		EClass API = eINSTANCE.getAPI();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__MODULES = eINSTANCE.getAPI_Modules();

		/**
		 * The meta object literal for the '<em><b>Env Variable List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__ENV_VARIABLE_LIST = eINSTANCE.getAPI_EnvVariableList();

		/**
		 * The meta object literal for the '<em><b>Job Env Variable List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__JOB_ENV_VARIABLE_LIST = eINSTANCE.getAPI_JobEnvVariableList();

		/**
		 * The meta object literal for the '<em><b>Type List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__TYPE_LIST = eINSTANCE.getAPI_TypeList();

		/**
		 * The meta object literal for the '{@link com.sysfera.codegen.api.apimodel.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sysfera.codegen.api.apimodel.impl.ModuleImpl
		 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

		/**
		 * The meta object literal for the '<em><b>Api</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__API = eINSTANCE.getModule_Api();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__SERVICES = eINSTANCE.getModule_Services();

		/**
		 * The meta object literal for the '<em><b>Type List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__TYPE_LIST = eINSTANCE.getModule_TypeList();

		/**
		 * The meta object literal for the '<em><b>Result Code List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__RESULT_CODE_LIST = eINSTANCE.getModule_ResultCodeList();

		/**
		 * The meta object literal for the '{@link com.sysfera.codegen.api.apimodel.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sysfera.codegen.api.apimodel.impl.ServiceImpl
		 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__DESCRIPTION = eINSTANCE.getService_Description();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__MODULE = eINSTANCE.getService_Module();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__PORTS = eINSTANCE.getService_Ports();

		/**
		 * The meta object literal for the '<em><b>Admin Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__ADMIN_ONLY = eINSTANCE.getService_AdminOnly();

		/**
		 * The meta object literal for the '<em><b>Is Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__IS_COMMAND = eINSTANCE.getService_IsCommand();

		/**
		 * The meta object literal for the '<em><b>Is Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__IS_FUNCTION = eINSTANCE.getService_IsFunction();

		/**
		 * The meta object literal for the '<em><b>Result Codes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__RESULT_CODES = eINSTANCE.getService_ResultCodes();

		/**
		 * The meta object literal for the '<em><b>Used Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__USED_SERVICES = eINSTANCE.getService_UsedServices();

		/**
		 * The meta object literal for the '<em><b>Used By Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__USED_BY_SERVICES = eINSTANCE.getService_UsedByServices();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__DETAILS = eINSTANCE.getService_Details();

		/**
		 * The meta object literal for the '<em><b>Use Job Env</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__USE_JOB_ENV = eINSTANCE.getService_UseJobEnv();

		/**
		 * The meta object literal for the '{@link com.sysfera.codegen.api.apimodel.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sysfera.codegen.api.apimodel.impl.PortImpl
		 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__SERVICE = eINSTANCE.getPort_Service();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__DIRECTION = eINSTANCE.getPort_Direction();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__USAGE = eINSTANCE.getPort_Usage();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__DATA_TYPE = eINSTANCE.getPort_DataType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__DESCRIPTION = eINSTANCE.getPort_Description();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__OPTIONAL = eINSTANCE.getPort_Optional();

		/**
		 * The meta object literal for the '<em><b>Short Option Letter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__SHORT_OPTION_LETTER = eINSTANCE.getPort_ShortOptionLetter();

		/**
		 * The meta object literal for the '<em><b>Long Option Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__LONG_OPTION_NAME = eINSTANCE.getPort_LongOptionName();

		/**
		 * The meta object literal for the '<em><b>Env Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__ENV_OPTION = eINSTANCE.getPort_EnvOption();

		/**
		 * The meta object literal for the '<em><b>Default Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__DEFAULT_VALUE_LITERAL = eINSTANCE.getPort_DefaultValueLiteral();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__DETAILS = eINSTANCE.getPort_Details();

		/**
		 * The meta object literal for the '{@link com.sysfera.codegen.api.apimodel.impl.EnvVariableImpl <em>Env Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sysfera.codegen.api.apimodel.impl.EnvVariableImpl
		 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getEnvVariable()
		 * @generated
		 */
		EClass ENV_VARIABLE = eINSTANCE.getEnvVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_VARIABLE__NAME = eINSTANCE.getEnvVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_VARIABLE__DESCRIPTION = eINSTANCE.getEnvVariable_Description();

		/**
		 * The meta object literal for the '<em><b>Is User Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_VARIABLE__IS_USER_OPTION = eINSTANCE.getEnvVariable_IsUserOption();

		/**
		 * The meta object literal for the '{@link com.sysfera.codegen.api.apimodel.impl.EnvVariableListImpl <em>Env Variable List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sysfera.codegen.api.apimodel.impl.EnvVariableListImpl
		 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getEnvVariableList()
		 * @generated
		 */
		EClass ENV_VARIABLE_LIST = eINSTANCE.getEnvVariableList();

		/**
		 * The meta object literal for the '<em><b>Env Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENV_VARIABLE_LIST__ENV_VARIABLES = eINSTANCE.getEnvVariableList_EnvVariables();

		/**
		 * The meta object literal for the '{@link com.sysfera.codegen.api.apimodel.impl.JobEnvVariableListImpl <em>Job Env Variable List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sysfera.codegen.api.apimodel.impl.JobEnvVariableListImpl
		 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getJobEnvVariableList()
		 * @generated
		 */
		EClass JOB_ENV_VARIABLE_LIST = eINSTANCE.getJobEnvVariableList();

		/**
		 * The meta object literal for the '<em><b>Env Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_ENV_VARIABLE_LIST__ENV_VARIABLES = eINSTANCE.getJobEnvVariableList_EnvVariables();

		/**
		 * The meta object literal for the '{@link com.sysfera.codegen.api.apimodel.impl.ResultCodeImpl <em>Result Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sysfera.codegen.api.apimodel.impl.ResultCodeImpl
		 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getResultCode()
		 * @generated
		 */
		EClass RESULT_CODE = eINSTANCE.getResultCode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CODE__NAME = eINSTANCE.getResultCode_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CODE__DESCRIPTION = eINSTANCE.getResultCode_Description();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CODE__VALUE = eINSTANCE.getResultCode_Value();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CODE__USAGE = eINSTANCE.getResultCode_Usage();

		/**
		 * The meta object literal for the '<em><b>Diagnostic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CODE__DIAGNOSTIC = eINSTANCE.getResultCode_Diagnostic();

		/**
		 * The meta object literal for the '{@link com.sysfera.codegen.api.apimodel.impl.ResultCodeListImpl <em>Result Code List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sysfera.codegen.api.apimodel.impl.ResultCodeListImpl
		 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getResultCodeList()
		 * @generated
		 */
		EClass RESULT_CODE_LIST = eINSTANCE.getResultCodeList();

		/**
		 * The meta object literal for the '<em><b>Result Codes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_CODE_LIST__RESULT_CODES = eINSTANCE.getResultCodeList_ResultCodes();

		/**
		 * The meta object literal for the '{@link com.sysfera.codegen.api.apimodel.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sysfera.codegen.api.apimodel.impl.TypeImpl
		 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__DESCRIPTION = eINSTANCE.getType_Description();

		/**
		 * The meta object literal for the '<em><b>ECore Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__ECORE_TYPE = eINSTANCE.getType_ECoreType();

		/**
		 * The meta object literal for the '{@link com.sysfera.codegen.api.apimodel.impl.TypeListImpl <em>Type List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sysfera.codegen.api.apimodel.impl.TypeListImpl
		 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getTypeList()
		 * @generated
		 */
		EClass TYPE_LIST = eINSTANCE.getTypeList();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_LIST__TYPES = eINSTANCE.getTypeList_Types();

		/**
		 * The meta object literal for the '<em><b>ETypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_LIST__ETYPES = eINSTANCE.getTypeList_ETypes();

		/**
		 * The meta object literal for the '{@link com.sysfera.codegen.api.apimodel.portDirection <em>port Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sysfera.codegen.api.apimodel.portDirection
		 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getportDirection()
		 * @generated
		 */
		EEnum PORT_DIRECTION = eINSTANCE.getportDirection();

		/**
		 * The meta object literal for the '{@link com.sysfera.codegen.api.apimodel.APIUsage <em>API Usage</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sysfera.codegen.api.apimodel.APIUsage
		 * @see com.sysfera.codegen.api.apimodel.impl.ApimodelPackageImpl#getAPIUsage()
		 * @generated
		 */
		EEnum API_USAGE = eINSTANCE.getAPIUsage();

	}

} //ApimodelPackage

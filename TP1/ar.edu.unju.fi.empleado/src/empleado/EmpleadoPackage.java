/**
 */
package empleado;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see empleado.EmpleadoFactory
 * @model kind="package"
 * @generated
 */
public interface EmpleadoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "empleado";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ar.edu.unju.fi.empleado";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "empleado";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmpleadoPackage eINSTANCE = empleado.impl.EmpleadoPackageImpl.init();

	/**
	 * The meta object id for the '{@link empleado.impl.PersonaImpl <em>Persona</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empleado.impl.PersonaImpl
	 * @see empleado.impl.EmpleadoPackageImpl#getPersona()
	 * @generated
	 */
	int PERSONA = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__ID = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Legajo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__LEGAJO = 2;

	/**
	 * The number of structural features of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link empleado.impl.UsuarioImpl <em>Usuario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empleado.impl.UsuarioImpl
	 * @see empleado.impl.EmpleadoPackageImpl#getUsuario()
	 * @generated
	 */
	int USUARIO = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ID = PERSONA__ID;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__NOMBRE = PERSONA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Legajo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__LEGAJO = PERSONA__LEGAJO;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__USER_NAME = PERSONA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__PASSWORD = PERSONA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Domicilio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__DOMICILIO = PERSONA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__RESPONSABLE = PERSONA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_FEATURE_COUNT = PERSONA_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_OPERATION_COUNT = PERSONA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link empleado.impl.DomicilioImpl <em>Domicilio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empleado.impl.DomicilioImpl
	 * @see empleado.impl.EmpleadoPackageImpl#getDomicilio()
	 * @generated
	 */
	int DOMICILIO = 2;

	/**
	 * The feature id for the '<em><b>Personal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMICILIO__PERSONAL = 0;

	/**
	 * The feature id for the '<em><b>Laboral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMICILIO__LABORAL = 1;

	/**
	 * The number of structural features of the '<em>Domicilio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMICILIO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Domicilio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMICILIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link empleado.impl.ResponsableImpl <em>Responsable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empleado.impl.ResponsableImpl
	 * @see empleado.impl.EmpleadoPackageImpl#getResponsable()
	 * @generated
	 */
	int RESPONSABLE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE__ID = PERSONA__ID;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE__NOMBRE = PERSONA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Legajo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE__LEGAJO = PERSONA__LEGAJO;

	/**
	 * The number of structural features of the '<em>Responsable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE_FEATURE_COUNT = PERSONA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Responsable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE_OPERATION_COUNT = PERSONA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link empleado.Persona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persona</em>'.
	 * @see empleado.Persona
	 * @generated
	 */
	EClass getPersona();

	/**
	 * Returns the meta object for the attribute '{@link empleado.Persona#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see empleado.Persona#getId()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Id();

	/**
	 * Returns the meta object for the attribute '{@link empleado.Persona#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see empleado.Persona#getNombre()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link empleado.Persona#getLegajo <em>Legajo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legajo</em>'.
	 * @see empleado.Persona#getLegajo()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Legajo();

	/**
	 * Returns the meta object for class '{@link empleado.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usuario</em>'.
	 * @see empleado.Usuario
	 * @generated
	 */
	EClass getUsuario();

	/**
	 * Returns the meta object for the attribute '{@link empleado.Usuario#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see empleado.Usuario#getUserName()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_UserName();

	/**
	 * Returns the meta object for the attribute '{@link empleado.Usuario#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see empleado.Usuario#getPassword()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Password();

	/**
	 * Returns the meta object for the containment reference '{@link empleado.Usuario#getDomicilio <em>Domicilio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domicilio</em>'.
	 * @see empleado.Usuario#getDomicilio()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_Domicilio();

	/**
	 * Returns the meta object for the reference '{@link empleado.Usuario#getResponsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsable</em>'.
	 * @see empleado.Usuario#getResponsable()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_Responsable();

	/**
	 * Returns the meta object for class '{@link empleado.Domicilio <em>Domicilio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domicilio</em>'.
	 * @see empleado.Domicilio
	 * @generated
	 */
	EClass getDomicilio();

	/**
	 * Returns the meta object for the attribute '{@link empleado.Domicilio#getPersonal <em>Personal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Personal</em>'.
	 * @see empleado.Domicilio#getPersonal()
	 * @see #getDomicilio()
	 * @generated
	 */
	EAttribute getDomicilio_Personal();

	/**
	 * Returns the meta object for the attribute '{@link empleado.Domicilio#getLaboral <em>Laboral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Laboral</em>'.
	 * @see empleado.Domicilio#getLaboral()
	 * @see #getDomicilio()
	 * @generated
	 */
	EAttribute getDomicilio_Laboral();

	/**
	 * Returns the meta object for class '{@link empleado.Responsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsable</em>'.
	 * @see empleado.Responsable
	 * @generated
	 */
	EClass getResponsable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmpleadoFactory getEmpleadoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link empleado.impl.PersonaImpl <em>Persona</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empleado.impl.PersonaImpl
		 * @see empleado.impl.EmpleadoPackageImpl#getPersona()
		 * @generated
		 */
		EClass PERSONA = eINSTANCE.getPersona();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__ID = eINSTANCE.getPersona_Id();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__NOMBRE = eINSTANCE.getPersona_Nombre();

		/**
		 * The meta object literal for the '<em><b>Legajo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__LEGAJO = eINSTANCE.getPersona_Legajo();

		/**
		 * The meta object literal for the '{@link empleado.impl.UsuarioImpl <em>Usuario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empleado.impl.UsuarioImpl
		 * @see empleado.impl.EmpleadoPackageImpl#getUsuario()
		 * @generated
		 */
		EClass USUARIO = eINSTANCE.getUsuario();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__USER_NAME = eINSTANCE.getUsuario_UserName();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__PASSWORD = eINSTANCE.getUsuario_Password();

		/**
		 * The meta object literal for the '<em><b>Domicilio</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__DOMICILIO = eINSTANCE.getUsuario_Domicilio();

		/**
		 * The meta object literal for the '<em><b>Responsable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__RESPONSABLE = eINSTANCE.getUsuario_Responsable();

		/**
		 * The meta object literal for the '{@link empleado.impl.DomicilioImpl <em>Domicilio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empleado.impl.DomicilioImpl
		 * @see empleado.impl.EmpleadoPackageImpl#getDomicilio()
		 * @generated
		 */
		EClass DOMICILIO = eINSTANCE.getDomicilio();

		/**
		 * The meta object literal for the '<em><b>Personal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMICILIO__PERSONAL = eINSTANCE.getDomicilio_Personal();

		/**
		 * The meta object literal for the '<em><b>Laboral</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMICILIO__LABORAL = eINSTANCE.getDomicilio_Laboral();

		/**
		 * The meta object literal for the '{@link empleado.impl.ResponsableImpl <em>Responsable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empleado.impl.ResponsableImpl
		 * @see empleado.impl.EmpleadoPackageImpl#getResponsable()
		 * @generated
		 */
		EClass RESPONSABLE = eINSTANCE.getResponsable();

	}

} //EmpleadoPackage

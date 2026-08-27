/**
 */
package empleado.impl;

import empleado.Domicilio;
import empleado.EmpleadoFactory;
import empleado.EmpleadoPackage;
import empleado.Persona;
import empleado.Responsable;
import empleado.Usuario;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmpleadoPackageImpl extends EPackageImpl implements EmpleadoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usuarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domicilioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsableEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see empleado.EmpleadoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EmpleadoPackageImpl() {
		super(eNS_URI, EmpleadoFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EmpleadoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EmpleadoPackage init() {
		if (isInited) return (EmpleadoPackage)EPackage.Registry.INSTANCE.getEPackage(EmpleadoPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEmpleadoPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EmpleadoPackageImpl theEmpleadoPackage = registeredEmpleadoPackage instanceof EmpleadoPackageImpl ? (EmpleadoPackageImpl)registeredEmpleadoPackage : new EmpleadoPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEmpleadoPackage.createPackageContents();

		// Initialize created meta-data
		theEmpleadoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEmpleadoPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EmpleadoPackage.eNS_URI, theEmpleadoPackage);
		return theEmpleadoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersona() {
		return personaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersona_Id() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersona_Nombre() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersona_Legajo() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsuario() {
		return usuarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsuario_UserName() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsuario_Password() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsuario_Domicilio() {
		return (EReference)usuarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsuario_Responsable() {
		return (EReference)usuarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomicilio() {
		return domicilioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomicilio_Personal() {
		return (EAttribute)domicilioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomicilio_Laboral() {
		return (EAttribute)domicilioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponsable() {
		return responsableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmpleadoFactory getEmpleadoFactory() {
		return (EmpleadoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		personaEClass = createEClass(PERSONA);
		createEAttribute(personaEClass, PERSONA__ID);
		createEAttribute(personaEClass, PERSONA__NOMBRE);
		createEAttribute(personaEClass, PERSONA__LEGAJO);

		usuarioEClass = createEClass(USUARIO);
		createEAttribute(usuarioEClass, USUARIO__USER_NAME);
		createEAttribute(usuarioEClass, USUARIO__PASSWORD);
		createEReference(usuarioEClass, USUARIO__DOMICILIO);
		createEReference(usuarioEClass, USUARIO__RESPONSABLE);

		domicilioEClass = createEClass(DOMICILIO);
		createEAttribute(domicilioEClass, DOMICILIO__PERSONAL);
		createEAttribute(domicilioEClass, DOMICILIO__LABORAL);

		responsableEClass = createEClass(RESPONSABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		usuarioEClass.getESuperTypes().add(this.getPersona());
		responsableEClass.getESuperTypes().add(this.getPersona());

		// Initialize classes, features, and operations; add parameters
		initEClass(personaEClass, Persona.class, "Persona", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersona_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_Legajo(), ecorePackage.getEString(), "legajo", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usuarioEClass, Usuario.class, "Usuario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsuario_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsuario_Password(), ecorePackage.getEString(), "password", null, 0, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsuario_Domicilio(), this.getDomicilio(), null, "domicilio", null, 0, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsuario_Responsable(), this.getResponsable(), null, "responsable", null, 0, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domicilioEClass, Domicilio.class, "Domicilio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomicilio_Personal(), ecorePackage.getEString(), "personal", null, 0, 1, Domicilio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomicilio_Laboral(), ecorePackage.getEString(), "laboral", null, 0, 1, Domicilio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responsableEClass, Responsable.class, "Responsable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EmpleadoPackageImpl

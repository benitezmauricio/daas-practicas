/**
 */
package empleado.impl;

import empleado.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmpleadoFactoryImpl extends EFactoryImpl implements EmpleadoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EmpleadoFactory init() {
		try {
			EmpleadoFactory theEmpleadoFactory = (EmpleadoFactory)EPackage.Registry.INSTANCE.getEFactory(EmpleadoPackage.eNS_URI);
			if (theEmpleadoFactory != null) {
				return theEmpleadoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EmpleadoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmpleadoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EmpleadoPackage.PERSONA: return createPersona();
			case EmpleadoPackage.USUARIO: return createUsuario();
			case EmpleadoPackage.DOMICILIO: return createDomicilio();
			case EmpleadoPackage.RESPONSABLE: return createResponsable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Persona createPersona() {
		PersonaImpl persona = new PersonaImpl();
		return persona;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usuario createUsuario() {
		UsuarioImpl usuario = new UsuarioImpl();
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Domicilio createDomicilio() {
		DomicilioImpl domicilio = new DomicilioImpl();
		return domicilio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Responsable createResponsable() {
		ResponsableImpl responsable = new ResponsableImpl();
		return responsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmpleadoPackage getEmpleadoPackage() {
		return (EmpleadoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EmpleadoPackage getPackage() {
		return EmpleadoPackage.eINSTANCE;
	}

} //EmpleadoFactoryImpl

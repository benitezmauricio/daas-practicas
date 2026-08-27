/**
 */
package empleado;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see empleado.EmpleadoPackage
 * @generated
 */
public interface EmpleadoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmpleadoFactory eINSTANCE = empleado.impl.EmpleadoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Persona</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persona</em>'.
	 * @generated
	 */
	Persona createPersona();

	/**
	 * Returns a new object of class '<em>Usuario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usuario</em>'.
	 * @generated
	 */
	Usuario createUsuario();

	/**
	 * Returns a new object of class '<em>Domicilio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domicilio</em>'.
	 * @generated
	 */
	Domicilio createDomicilio();

	/**
	 * Returns a new object of class '<em>Responsable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Responsable</em>'.
	 * @generated
	 */
	Responsable createResponsable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EmpleadoPackage getEmpleadoPackage();

} //EmpleadoFactory

/**
 */
package empleado;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domicilio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link empleado.Domicilio#getPersonal <em>Personal</em>}</li>
 *   <li>{@link empleado.Domicilio#getLaboral <em>Laboral</em>}</li>
 * </ul>
 *
 * @see empleado.EmpleadoPackage#getDomicilio()
 * @model
 * @generated
 */
public interface Domicilio extends EObject {
	/**
	 * Returns the value of the '<em><b>Personal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personal</em>' attribute.
	 * @see #setPersonal(String)
	 * @see empleado.EmpleadoPackage#getDomicilio_Personal()
	 * @model
	 * @generated
	 */
	String getPersonal();

	/**
	 * Sets the value of the '{@link empleado.Domicilio#getPersonal <em>Personal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personal</em>' attribute.
	 * @see #getPersonal()
	 * @generated
	 */
	void setPersonal(String value);

	/**
	 * Returns the value of the '<em><b>Laboral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Laboral</em>' attribute.
	 * @see #setLaboral(String)
	 * @see empleado.EmpleadoPackage#getDomicilio_Laboral()
	 * @model
	 * @generated
	 */
	String getLaboral();

	/**
	 * Sets the value of the '{@link empleado.Domicilio#getLaboral <em>Laboral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Laboral</em>' attribute.
	 * @see #getLaboral()
	 * @generated
	 */
	void setLaboral(String value);

} // Domicilio

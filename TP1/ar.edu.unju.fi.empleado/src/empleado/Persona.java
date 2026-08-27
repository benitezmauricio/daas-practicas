/**
 */
package empleado;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link empleado.Persona#getId <em>Id</em>}</li>
 *   <li>{@link empleado.Persona#getNombre <em>Nombre</em>}</li>
 *   <li>{@link empleado.Persona#getLegajo <em>Legajo</em>}</li>
 * </ul>
 *
 * @see empleado.EmpleadoPackage#getPersona()
 * @model
 * @generated
 */
public interface Persona extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see empleado.EmpleadoPackage#getPersona_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link empleado.Persona#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see empleado.EmpleadoPackage#getPersona_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link empleado.Persona#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Legajo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legajo</em>' attribute.
	 * @see #setLegajo(String)
	 * @see empleado.EmpleadoPackage#getPersona_Legajo()
	 * @model
	 * @generated
	 */
	String getLegajo();

	/**
	 * Sets the value of the '{@link empleado.Persona#getLegajo <em>Legajo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legajo</em>' attribute.
	 * @see #getLegajo()
	 * @generated
	 */
	void setLegajo(String value);

} // Persona

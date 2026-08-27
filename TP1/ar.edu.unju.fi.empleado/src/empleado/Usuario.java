/**
 */
package empleado;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link empleado.Usuario#getUserName <em>User Name</em>}</li>
 *   <li>{@link empleado.Usuario#getPassword <em>Password</em>}</li>
 *   <li>{@link empleado.Usuario#getDomicilio <em>Domicilio</em>}</li>
 *   <li>{@link empleado.Usuario#getResponsable <em>Responsable</em>}</li>
 * </ul>
 *
 * @see empleado.EmpleadoPackage#getUsuario()
 * @model
 * @generated
 */
public interface Usuario extends Persona {
	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see empleado.EmpleadoPackage#getUsuario_UserName()
	 * @model
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link empleado.Usuario#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see empleado.EmpleadoPackage#getUsuario_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link empleado.Usuario#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Domicilio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domicilio</em>' containment reference.
	 * @see #setDomicilio(Domicilio)
	 * @see empleado.EmpleadoPackage#getUsuario_Domicilio()
	 * @model containment="true"
	 * @generated
	 */
	Domicilio getDomicilio();

	/**
	 * Sets the value of the '{@link empleado.Usuario#getDomicilio <em>Domicilio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domicilio</em>' containment reference.
	 * @see #getDomicilio()
	 * @generated
	 */
	void setDomicilio(Domicilio value);

	/**
	 * Returns the value of the '<em><b>Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable</em>' reference.
	 * @see #setResponsable(Responsable)
	 * @see empleado.EmpleadoPackage#getUsuario_Responsable()
	 * @model
	 * @generated
	 */
	Responsable getResponsable();

	/**
	 * Sets the value of the '{@link empleado.Usuario#getResponsable <em>Responsable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsable</em>' reference.
	 * @see #getResponsable()
	 * @generated
	 */
	void setResponsable(Responsable value);

} // Usuario

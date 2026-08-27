/**
 */
package empleado.impl;

import empleado.Domicilio;
import empleado.EmpleadoPackage;
import empleado.Responsable;
import empleado.Usuario;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link empleado.impl.UsuarioImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link empleado.impl.UsuarioImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link empleado.impl.UsuarioImpl#getDomicilio <em>Domicilio</em>}</li>
 *   <li>{@link empleado.impl.UsuarioImpl#getResponsable <em>Responsable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsuarioImpl extends PersonaImpl implements Usuario {
	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomicilio() <em>Domicilio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomicilio()
	 * @generated
	 * @ordered
	 */
	protected Domicilio domicilio;

	/**
	 * The cached value of the '{@link #getResponsable() <em>Responsable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsable()
	 * @generated
	 * @ordered
	 */
	protected Responsable responsable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsuarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmpleadoPackage.Literals.USUARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpleadoPackage.USUARIO__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpleadoPackage.USUARIO__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Domicilio getDomicilio() {
		return domicilio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomicilio(Domicilio newDomicilio, NotificationChain msgs) {
		Domicilio oldDomicilio = domicilio;
		domicilio = newDomicilio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmpleadoPackage.USUARIO__DOMICILIO, oldDomicilio, newDomicilio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomicilio(Domicilio newDomicilio) {
		if (newDomicilio != domicilio) {
			NotificationChain msgs = null;
			if (domicilio != null)
				msgs = ((InternalEObject)domicilio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmpleadoPackage.USUARIO__DOMICILIO, null, msgs);
			if (newDomicilio != null)
				msgs = ((InternalEObject)newDomicilio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmpleadoPackage.USUARIO__DOMICILIO, null, msgs);
			msgs = basicSetDomicilio(newDomicilio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpleadoPackage.USUARIO__DOMICILIO, newDomicilio, newDomicilio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Responsable getResponsable() {
		if (responsable != null && responsable.eIsProxy()) {
			InternalEObject oldResponsable = (InternalEObject)responsable;
			responsable = (Responsable)eResolveProxy(oldResponsable);
			if (responsable != oldResponsable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmpleadoPackage.USUARIO__RESPONSABLE, oldResponsable, responsable));
			}
		}
		return responsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsable basicGetResponsable() {
		return responsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponsable(Responsable newResponsable) {
		Responsable oldResponsable = responsable;
		responsable = newResponsable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpleadoPackage.USUARIO__RESPONSABLE, oldResponsable, responsable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmpleadoPackage.USUARIO__DOMICILIO:
				return basicSetDomicilio(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmpleadoPackage.USUARIO__USER_NAME:
				return getUserName();
			case EmpleadoPackage.USUARIO__PASSWORD:
				return getPassword();
			case EmpleadoPackage.USUARIO__DOMICILIO:
				return getDomicilio();
			case EmpleadoPackage.USUARIO__RESPONSABLE:
				if (resolve) return getResponsable();
				return basicGetResponsable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmpleadoPackage.USUARIO__USER_NAME:
				setUserName((String)newValue);
				return;
			case EmpleadoPackage.USUARIO__PASSWORD:
				setPassword((String)newValue);
				return;
			case EmpleadoPackage.USUARIO__DOMICILIO:
				setDomicilio((Domicilio)newValue);
				return;
			case EmpleadoPackage.USUARIO__RESPONSABLE:
				setResponsable((Responsable)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EmpleadoPackage.USUARIO__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case EmpleadoPackage.USUARIO__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case EmpleadoPackage.USUARIO__DOMICILIO:
				setDomicilio((Domicilio)null);
				return;
			case EmpleadoPackage.USUARIO__RESPONSABLE:
				setResponsable((Responsable)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EmpleadoPackage.USUARIO__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case EmpleadoPackage.USUARIO__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case EmpleadoPackage.USUARIO__DOMICILIO:
				return domicilio != null;
			case EmpleadoPackage.USUARIO__RESPONSABLE:
				return responsable != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (userName: ");
		result.append(userName);
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} //UsuarioImpl

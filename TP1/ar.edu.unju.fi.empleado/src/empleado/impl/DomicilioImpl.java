/**
 */
package empleado.impl;

import empleado.Domicilio;
import empleado.EmpleadoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domicilio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link empleado.impl.DomicilioImpl#getPersonal <em>Personal</em>}</li>
 *   <li>{@link empleado.impl.DomicilioImpl#getLaboral <em>Laboral</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomicilioImpl extends MinimalEObjectImpl.Container implements Domicilio {
	/**
	 * The default value of the '{@link #getPersonal() <em>Personal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonal()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSONAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonal() <em>Personal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonal()
	 * @generated
	 * @ordered
	 */
	protected String personal = PERSONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLaboral() <em>Laboral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaboral()
	 * @generated
	 * @ordered
	 */
	protected static final String LABORAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLaboral() <em>Laboral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaboral()
	 * @generated
	 * @ordered
	 */
	protected String laboral = LABORAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomicilioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmpleadoPackage.Literals.DOMICILIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPersonal() {
		return personal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersonal(String newPersonal) {
		String oldPersonal = personal;
		personal = newPersonal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpleadoPackage.DOMICILIO__PERSONAL, oldPersonal, personal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLaboral() {
		return laboral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLaboral(String newLaboral) {
		String oldLaboral = laboral;
		laboral = newLaboral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpleadoPackage.DOMICILIO__LABORAL, oldLaboral, laboral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmpleadoPackage.DOMICILIO__PERSONAL:
				return getPersonal();
			case EmpleadoPackage.DOMICILIO__LABORAL:
				return getLaboral();
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
			case EmpleadoPackage.DOMICILIO__PERSONAL:
				setPersonal((String)newValue);
				return;
			case EmpleadoPackage.DOMICILIO__LABORAL:
				setLaboral((String)newValue);
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
			case EmpleadoPackage.DOMICILIO__PERSONAL:
				setPersonal(PERSONAL_EDEFAULT);
				return;
			case EmpleadoPackage.DOMICILIO__LABORAL:
				setLaboral(LABORAL_EDEFAULT);
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
			case EmpleadoPackage.DOMICILIO__PERSONAL:
				return PERSONAL_EDEFAULT == null ? personal != null : !PERSONAL_EDEFAULT.equals(personal);
			case EmpleadoPackage.DOMICILIO__LABORAL:
				return LABORAL_EDEFAULT == null ? laboral != null : !LABORAL_EDEFAULT.equals(laboral);
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
		result.append(" (personal: ");
		result.append(personal);
		result.append(", laboral: ");
		result.append(laboral);
		result.append(')');
		return result.toString();
	}

} //DomicilioImpl

/**
 */
package empleado.impl;

import empleado.EmpleadoPackage;
import empleado.Persona;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link empleado.impl.PersonaImpl#getId <em>Id</em>}</li>
 *   <li>{@link empleado.impl.PersonaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link empleado.impl.PersonaImpl#getLegajo <em>Legajo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonaImpl extends MinimalEObjectImpl.Container implements Persona {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLegajo() <em>Legajo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegajo()
	 * @generated
	 * @ordered
	 */
	protected static final String LEGAJO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLegajo() <em>Legajo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegajo()
	 * @generated
	 * @ordered
	 */
	protected String legajo = LEGAJO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmpleadoPackage.Literals.PERSONA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpleadoPackage.PERSONA__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpleadoPackage.PERSONA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLegajo() {
		return legajo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLegajo(String newLegajo) {
		String oldLegajo = legajo;
		legajo = newLegajo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpleadoPackage.PERSONA__LEGAJO, oldLegajo, legajo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmpleadoPackage.PERSONA__ID:
				return getId();
			case EmpleadoPackage.PERSONA__NOMBRE:
				return getNombre();
			case EmpleadoPackage.PERSONA__LEGAJO:
				return getLegajo();
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
			case EmpleadoPackage.PERSONA__ID:
				setId((Integer)newValue);
				return;
			case EmpleadoPackage.PERSONA__NOMBRE:
				setNombre((String)newValue);
				return;
			case EmpleadoPackage.PERSONA__LEGAJO:
				setLegajo((String)newValue);
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
			case EmpleadoPackage.PERSONA__ID:
				setId(ID_EDEFAULT);
				return;
			case EmpleadoPackage.PERSONA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case EmpleadoPackage.PERSONA__LEGAJO:
				setLegajo(LEGAJO_EDEFAULT);
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
			case EmpleadoPackage.PERSONA__ID:
				return id != ID_EDEFAULT;
			case EmpleadoPackage.PERSONA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case EmpleadoPackage.PERSONA__LEGAJO:
				return LEGAJO_EDEFAULT == null ? legajo != null : !LEGAJO_EDEFAULT.equals(legajo);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", legajo: ");
		result.append(legajo);
		result.append(')');
		return result.toString();
	}

} //PersonaImpl

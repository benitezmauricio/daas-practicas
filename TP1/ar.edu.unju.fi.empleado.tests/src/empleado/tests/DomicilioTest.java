/**
 */
package empleado.tests;

import empleado.Domicilio;
import empleado.EmpleadoFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Domicilio</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomicilioTest extends TestCase {

	/**
	 * The fixture for this Domicilio test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Domicilio fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DomicilioTest.class);
	}

	/**
	 * Constructs a new Domicilio test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomicilioTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Domicilio test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Domicilio fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Domicilio test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Domicilio getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EmpleadoFactory.eINSTANCE.createDomicilio());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DomicilioTest

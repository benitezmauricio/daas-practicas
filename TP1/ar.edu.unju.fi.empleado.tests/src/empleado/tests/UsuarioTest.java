/**
 */
package empleado.tests;

import empleado.EmpleadoFactory;
import empleado.Usuario;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsuarioTest extends PersonaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UsuarioTest.class);
	}

	/**
	 * Constructs a new Usuario test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsuarioTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Usuario test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Usuario getFixture() {
		return (Usuario)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EmpleadoFactory.eINSTANCE.createUsuario());
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

} //UsuarioTest

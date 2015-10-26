/**
 */
package proyectos.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import proyectos.Color;
import proyectos.Layout;
import proyectos.Pagina;
import proyectos.ProyectosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pagina</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link proyectos.impl.PaginaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyectos.impl.PaginaImpl#getColorFuente <em>Color Fuente</em>}</li>
 *   <li>{@link proyectos.impl.PaginaImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link proyectos.impl.PaginaImpl#getColorFondo <em>Color Fondo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PaginaImpl extends MinimalEObjectImpl.Container implements Pagina {
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
	 * The default value of the '{@link #getColorFuente() <em>Color Fuente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorFuente()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_FUENTE_EDEFAULT = Color.BLANCO;

	/**
	 * The cached value of the '{@link #getColorFuente() <em>Color Fuente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorFuente()
	 * @generated
	 * @ordered
	 */
	protected Color colorFuente = COLOR_FUENTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayout() <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected static final Layout LAYOUT_EDEFAULT = Layout.GRID;

	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected Layout layout = LAYOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getColorFondo() <em>Color Fondo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorFondo()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_FONDO_EDEFAULT = Color.BLANCO;

	/**
	 * The cached value of the '{@link #getColorFondo() <em>Color Fondo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorFondo()
	 * @generated
	 * @ordered
	 */
	protected Color colorFondo = COLOR_FONDO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaginaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectosPackage.Literals.PAGINA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectosPackage.PAGINA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColorFondo() {
		return colorFondo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorFondo(Color newColorFondo) {
		Color oldColorFondo = colorFondo;
		colorFondo = newColorFondo == null ? COLOR_FONDO_EDEFAULT : newColorFondo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectosPackage.PAGINA__COLOR_FONDO, oldColorFondo, colorFondo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColorFuente() {
		return colorFuente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorFuente(Color newColorFuente) {
		Color oldColorFuente = colorFuente;
		colorFuente = newColorFuente == null ? COLOR_FUENTE_EDEFAULT : newColorFuente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectosPackage.PAGINA__COLOR_FUENTE, oldColorFuente, colorFuente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout getLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout(Layout newLayout) {
		Layout oldLayout = layout;
		layout = newLayout == null ? LAYOUT_EDEFAULT : newLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectosPackage.PAGINA__LAYOUT, oldLayout, layout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectosPackage.PAGINA__NOMBRE:
				return getNombre();
			case ProyectosPackage.PAGINA__COLOR_FUENTE:
				return getColorFuente();
			case ProyectosPackage.PAGINA__LAYOUT:
				return getLayout();
			case ProyectosPackage.PAGINA__COLOR_FONDO:
				return getColorFondo();
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
			case ProyectosPackage.PAGINA__NOMBRE:
				setNombre((String)newValue);
				return;
			case ProyectosPackage.PAGINA__COLOR_FUENTE:
				setColorFuente((Color)newValue);
				return;
			case ProyectosPackage.PAGINA__LAYOUT:
				setLayout((Layout)newValue);
				return;
			case ProyectosPackage.PAGINA__COLOR_FONDO:
				setColorFondo((Color)newValue);
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
			case ProyectosPackage.PAGINA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ProyectosPackage.PAGINA__COLOR_FUENTE:
				setColorFuente(COLOR_FUENTE_EDEFAULT);
				return;
			case ProyectosPackage.PAGINA__LAYOUT:
				setLayout(LAYOUT_EDEFAULT);
				return;
			case ProyectosPackage.PAGINA__COLOR_FONDO:
				setColorFondo(COLOR_FONDO_EDEFAULT);
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
			case ProyectosPackage.PAGINA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ProyectosPackage.PAGINA__COLOR_FUENTE:
				return colorFuente != COLOR_FUENTE_EDEFAULT;
			case ProyectosPackage.PAGINA__LAYOUT:
				return layout != LAYOUT_EDEFAULT;
			case ProyectosPackage.PAGINA__COLOR_FONDO:
				return colorFondo != COLOR_FONDO_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", colorFuente: ");
		result.append(colorFuente);
		result.append(", layout: ");
		result.append(layout);
		result.append(", colorFondo: ");
		result.append(colorFondo);
		result.append(')');
		return result.toString();
	}

} //PaginaImpl

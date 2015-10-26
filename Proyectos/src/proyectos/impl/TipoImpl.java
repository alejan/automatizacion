/**
 */
package proyectos.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import proyectos.Colores;
import proyectos.Layout;
import proyectos.ProyectosPackage;
import proyectos.Tipo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tipo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link proyectos.impl.TipoImpl#getColorFondo <em>Color Fondo</em>}</li>
 *   <li>{@link proyectos.impl.TipoImpl#getColorFuente <em>Color Fuente</em>}</li>
 *   <li>{@link proyectos.impl.TipoImpl#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TipoImpl extends MinimalEObjectImpl.Container implements Tipo {
	/**
	 * The default value of the '{@link #getColorFondo() <em>Color Fondo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorFondo()
	 * @generated
	 * @ordered
	 */
	protected static final Colores COLOR_FONDO_EDEFAULT = Colores.BLANCO;
	/**
	 * The cached value of the '{@link #getColorFondo() <em>Color Fondo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorFondo()
	 * @generated
	 * @ordered
	 */
	protected Colores colorFondo = COLOR_FONDO_EDEFAULT;
	/**
	 * The default value of the '{@link #getColorFuente() <em>Color Fuente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorFuente()
	 * @generated
	 * @ordered
	 */
	protected static final Colores COLOR_FUENTE_EDEFAULT = Colores.BLANCO;
	/**
	 * The cached value of the '{@link #getColorFuente() <em>Color Fuente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorFuente()
	 * @generated
	 * @ordered
	 */
	protected Colores colorFuente = COLOR_FUENTE_EDEFAULT;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TipoImpl() {
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
	public Colores getColorFondo() {
		return colorFondo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorFondo(Colores newColorFondo) {
		Colores oldColorFondo = colorFondo;
		colorFondo = newColorFondo == null ? COLOR_FONDO_EDEFAULT : newColorFondo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectosPackage.PAGINA__COLOR_FONDO, oldColorFondo, colorFondo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colores getColorFuente() {
		return colorFuente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorFuente(Colores newColorFuente) {
		Colores oldColorFuente = colorFuente;
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
			case ProyectosPackage.PAGINA__COLOR_FONDO:
				return getColorFondo();
			case ProyectosPackage.PAGINA__COLOR_FUENTE:
				return getColorFuente();
			case ProyectosPackage.PAGINA__LAYOUT:
				return getLayout();
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
			case ProyectosPackage.PAGINA__COLOR_FONDO:
				setColorFondo((Colores)newValue);
				return;
			case ProyectosPackage.PAGINA__COLOR_FUENTE:
				setColorFuente((Colores)newValue);
				return;
			case ProyectosPackage.PAGINA__LAYOUT:
				setLayout((Layout)newValue);
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
			case ProyectosPackage.PAGINA__COLOR_FONDO:
				setColorFondo(COLOR_FONDO_EDEFAULT);
				return;
			case ProyectosPackage.PAGINA__COLOR_FUENTE:
				setColorFuente(COLOR_FUENTE_EDEFAULT);
				return;
			case ProyectosPackage.PAGINA__LAYOUT:
				setLayout(LAYOUT_EDEFAULT);
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
			case ProyectosPackage.PAGINA__COLOR_FONDO:
				return colorFondo != COLOR_FONDO_EDEFAULT;
			case ProyectosPackage.PAGINA__COLOR_FUENTE:
				return colorFuente != COLOR_FUENTE_EDEFAULT;
			case ProyectosPackage.PAGINA__LAYOUT:
				return layout != LAYOUT_EDEFAULT;
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
		result.append(" (colorFondo: ");
		result.append(colorFondo);
		result.append(", colorFuente: ");
		result.append(colorFuente);
		result.append(", layout: ");
		result.append(layout);
		result.append(')');
		return result.toString();
	}

} //TipoImpl

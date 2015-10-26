/**
 */
package proyectos.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import proyectos.Catalogo;
import proyectos.EstiloImagen;
import proyectos.ProyectosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalogo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link proyectos.impl.CatalogoImpl#isTieneBanner <em>Tiene Banner</em>}</li>
 *   <li>{@link proyectos.impl.CatalogoImpl#isTienePrecio <em>Tiene Precio</em>}</li>
 *   <li>{@link proyectos.impl.CatalogoImpl#getEstiloImagen <em>Estilo Imagen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CatalogoImpl extends PaginaImpl implements Catalogo {
	/**
	 * The default value of the '{@link #isTieneBanner() <em>Tiene Banner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTieneBanner()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TIENE_BANNER_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isTieneBanner() <em>Tiene Banner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTieneBanner()
	 * @generated
	 * @ordered
	 */
	protected boolean tieneBanner = TIENE_BANNER_EDEFAULT;
	/**
	 * The default value of the '{@link #isTienePrecio() <em>Tiene Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTienePrecio()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TIENE_PRECIO_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isTienePrecio() <em>Tiene Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTienePrecio()
	 * @generated
	 * @ordered
	 */
	protected boolean tienePrecio = TIENE_PRECIO_EDEFAULT;
	/**
	 * The default value of the '{@link #getEstiloImagen() <em>Estilo Imagen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstiloImagen()
	 * @generated
	 * @ordered
	 */
	protected static final EstiloImagen ESTILO_IMAGEN_EDEFAULT = EstiloImagen.SMALL;
	/**
	 * The cached value of the '{@link #getEstiloImagen() <em>Estilo Imagen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstiloImagen()
	 * @generated
	 * @ordered
	 */
	protected EstiloImagen estiloImagen = ESTILO_IMAGEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectosPackage.Literals.CATALOGO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTieneBanner() {
		return tieneBanner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTieneBanner(boolean newTieneBanner) {
		boolean oldTieneBanner = tieneBanner;
		tieneBanner = newTieneBanner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectosPackage.CATALOGO__TIENE_BANNER, oldTieneBanner, tieneBanner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTienePrecio() {
		return tienePrecio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTienePrecio(boolean newTienePrecio) {
		boolean oldTienePrecio = tienePrecio;
		tienePrecio = newTienePrecio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectosPackage.CATALOGO__TIENE_PRECIO, oldTienePrecio, tienePrecio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstiloImagen getEstiloImagen() {
		return estiloImagen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstiloImagen(EstiloImagen newEstiloImagen) {
		EstiloImagen oldEstiloImagen = estiloImagen;
		estiloImagen = newEstiloImagen == null ? ESTILO_IMAGEN_EDEFAULT : newEstiloImagen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectosPackage.CATALOGO__ESTILO_IMAGEN, oldEstiloImagen, estiloImagen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectosPackage.CATALOGO__TIENE_BANNER:
				return isTieneBanner();
			case ProyectosPackage.CATALOGO__TIENE_PRECIO:
				return isTienePrecio();
			case ProyectosPackage.CATALOGO__ESTILO_IMAGEN:
				return getEstiloImagen();
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
			case ProyectosPackage.CATALOGO__TIENE_BANNER:
				setTieneBanner((Boolean)newValue);
				return;
			case ProyectosPackage.CATALOGO__TIENE_PRECIO:
				setTienePrecio((Boolean)newValue);
				return;
			case ProyectosPackage.CATALOGO__ESTILO_IMAGEN:
				setEstiloImagen((EstiloImagen)newValue);
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
			case ProyectosPackage.CATALOGO__TIENE_BANNER:
				setTieneBanner(TIENE_BANNER_EDEFAULT);
				return;
			case ProyectosPackage.CATALOGO__TIENE_PRECIO:
				setTienePrecio(TIENE_PRECIO_EDEFAULT);
				return;
			case ProyectosPackage.CATALOGO__ESTILO_IMAGEN:
				setEstiloImagen(ESTILO_IMAGEN_EDEFAULT);
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
			case ProyectosPackage.CATALOGO__TIENE_BANNER:
				return tieneBanner != TIENE_BANNER_EDEFAULT;
			case ProyectosPackage.CATALOGO__TIENE_PRECIO:
				return tienePrecio != TIENE_PRECIO_EDEFAULT;
			case ProyectosPackage.CATALOGO__ESTILO_IMAGEN:
				return estiloImagen != ESTILO_IMAGEN_EDEFAULT;
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
		result.append(" (tieneBanner: ");
		result.append(tieneBanner);
		result.append(", tienePrecio: ");
		result.append(tienePrecio);
		result.append(", estiloImagen: ");
		result.append(estiloImagen);
		result.append(')');
		return result.toString();
	}

} //CatalogoImpl

/**
 */
package proyectos.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import proyectos.EstiloImagen;
import proyectos.Promocion;
import proyectos.ProyectosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Promocion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link proyectos.impl.PromocionImpl#isTieneBanner <em>Tiene Banner</em>}</li>
 *   <li>{@link proyectos.impl.PromocionImpl#getEstilo <em>Estilo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PromocionImpl extends PaginaImpl implements Promocion {
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
	 * The default value of the '{@link #getEstilo() <em>Estilo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstilo()
	 * @generated
	 * @ordered
	 */
	protected static final EstiloImagen ESTILO_EDEFAULT = EstiloImagen.SMALL;
	/**
	 * The cached value of the '{@link #getEstilo() <em>Estilo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstilo()
	 * @generated
	 * @ordered
	 */
	protected EstiloImagen estilo = ESTILO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PromocionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectosPackage.Literals.PROMOCION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectosPackage.PROMOCION__TIENE_BANNER, oldTieneBanner, tieneBanner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstiloImagen getEstilo() {
		return estilo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstilo(EstiloImagen newEstilo) {
		EstiloImagen oldEstilo = estilo;
		estilo = newEstilo == null ? ESTILO_EDEFAULT : newEstilo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectosPackage.PROMOCION__ESTILO, oldEstilo, estilo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectosPackage.PROMOCION__TIENE_BANNER:
				return isTieneBanner();
			case ProyectosPackage.PROMOCION__ESTILO:
				return getEstilo();
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
			case ProyectosPackage.PROMOCION__TIENE_BANNER:
				setTieneBanner((Boolean)newValue);
				return;
			case ProyectosPackage.PROMOCION__ESTILO:
				setEstilo((EstiloImagen)newValue);
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
			case ProyectosPackage.PROMOCION__TIENE_BANNER:
				setTieneBanner(TIENE_BANNER_EDEFAULT);
				return;
			case ProyectosPackage.PROMOCION__ESTILO:
				setEstilo(ESTILO_EDEFAULT);
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
			case ProyectosPackage.PROMOCION__TIENE_BANNER:
				return tieneBanner != TIENE_BANNER_EDEFAULT;
			case ProyectosPackage.PROMOCION__ESTILO:
				return estilo != ESTILO_EDEFAULT;
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
		result.append(", estilo: ");
		result.append(estilo);
		result.append(')');
		return result.toString();
	}

} //PromocionImpl

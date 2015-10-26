/**
 */
package proyectos.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import proyectos.Mapa;
import proyectos.ProyectosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapa</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link proyectos.impl.MapaImpl#isUbicacionActual <em>Ubicacion Actual</em>}</li>
 *   <li>{@link proyectos.impl.MapaImpl#isBuscarUbicacion <em>Buscar Ubicacion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapaImpl extends PaginaImpl implements Mapa {
	/**
	 * The default value of the '{@link #isUbicacionActual() <em>Ubicacion Actual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUbicacionActual()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UBICACION_ACTUAL_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isUbicacionActual() <em>Ubicacion Actual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUbicacionActual()
	 * @generated
	 * @ordered
	 */
	protected boolean ubicacionActual = UBICACION_ACTUAL_EDEFAULT;
	/**
	 * The default value of the '{@link #isBuscarUbicacion() <em>Buscar Ubicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBuscarUbicacion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BUSCAR_UBICACION_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isBuscarUbicacion() <em>Buscar Ubicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBuscarUbicacion()
	 * @generated
	 * @ordered
	 */
	protected boolean buscarUbicacion = BUSCAR_UBICACION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectosPackage.Literals.MAPA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUbicacionActual() {
		return ubicacionActual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUbicacionActual(boolean newUbicacionActual) {
		boolean oldUbicacionActual = ubicacionActual;
		ubicacionActual = newUbicacionActual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectosPackage.MAPA__UBICACION_ACTUAL, oldUbicacionActual, ubicacionActual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBuscarUbicacion() {
		return buscarUbicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuscarUbicacion(boolean newBuscarUbicacion) {
		boolean oldBuscarUbicacion = buscarUbicacion;
		buscarUbicacion = newBuscarUbicacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectosPackage.MAPA__BUSCAR_UBICACION, oldBuscarUbicacion, buscarUbicacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectosPackage.MAPA__UBICACION_ACTUAL:
				return isUbicacionActual();
			case ProyectosPackage.MAPA__BUSCAR_UBICACION:
				return isBuscarUbicacion();
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
			case ProyectosPackage.MAPA__UBICACION_ACTUAL:
				setUbicacionActual((Boolean)newValue);
				return;
			case ProyectosPackage.MAPA__BUSCAR_UBICACION:
				setBuscarUbicacion((Boolean)newValue);
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
			case ProyectosPackage.MAPA__UBICACION_ACTUAL:
				setUbicacionActual(UBICACION_ACTUAL_EDEFAULT);
				return;
			case ProyectosPackage.MAPA__BUSCAR_UBICACION:
				setBuscarUbicacion(BUSCAR_UBICACION_EDEFAULT);
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
			case ProyectosPackage.MAPA__UBICACION_ACTUAL:
				return ubicacionActual != UBICACION_ACTUAL_EDEFAULT;
			case ProyectosPackage.MAPA__BUSCAR_UBICACION:
				return buscarUbicacion != BUSCAR_UBICACION_EDEFAULT;
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
		result.append(" (ubicacionActual: ");
		result.append(ubicacionActual);
		result.append(", buscarUbicacion: ");
		result.append(buscarUbicacion);
		result.append(')');
		return result.toString();
	}

} //MapaImpl

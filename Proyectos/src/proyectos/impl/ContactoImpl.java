/**
 */
package proyectos.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import proyectos.Contacto;
import proyectos.ProyectosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contacto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link proyectos.impl.ContactoImpl#isTieneNombre <em>Tiene Nombre</em>}</li>
 *   <li>{@link proyectos.impl.ContactoImpl#isTieneEmail <em>Tiene Email</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContactoImpl extends PaginaImpl implements Contacto {
	/**
	 * The default value of the '{@link #isTieneNombre() <em>Tiene Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTieneNombre()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TIENE_NOMBRE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isTieneNombre() <em>Tiene Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTieneNombre()
	 * @generated
	 * @ordered
	 */
	protected boolean tieneNombre = TIENE_NOMBRE_EDEFAULT;
	/**
	 * The default value of the '{@link #isTieneEmail() <em>Tiene Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTieneEmail()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TIENE_EMAIL_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isTieneEmail() <em>Tiene Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTieneEmail()
	 * @generated
	 * @ordered
	 */
	protected boolean tieneEmail = TIENE_EMAIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectosPackage.Literals.CONTACTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTieneNombre() {
		return tieneNombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTieneNombre(boolean newTieneNombre) {
		boolean oldTieneNombre = tieneNombre;
		tieneNombre = newTieneNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectosPackage.CONTACTO__TIENE_NOMBRE, oldTieneNombre, tieneNombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTieneEmail() {
		return tieneEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTieneEmail(boolean newTieneEmail) {
		boolean oldTieneEmail = tieneEmail;
		tieneEmail = newTieneEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectosPackage.CONTACTO__TIENE_EMAIL, oldTieneEmail, tieneEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectosPackage.CONTACTO__TIENE_NOMBRE:
				return isTieneNombre();
			case ProyectosPackage.CONTACTO__TIENE_EMAIL:
				return isTieneEmail();
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
			case ProyectosPackage.CONTACTO__TIENE_NOMBRE:
				setTieneNombre((Boolean)newValue);
				return;
			case ProyectosPackage.CONTACTO__TIENE_EMAIL:
				setTieneEmail((Boolean)newValue);
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
			case ProyectosPackage.CONTACTO__TIENE_NOMBRE:
				setTieneNombre(TIENE_NOMBRE_EDEFAULT);
				return;
			case ProyectosPackage.CONTACTO__TIENE_EMAIL:
				setTieneEmail(TIENE_EMAIL_EDEFAULT);
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
			case ProyectosPackage.CONTACTO__TIENE_NOMBRE:
				return tieneNombre != TIENE_NOMBRE_EDEFAULT;
			case ProyectosPackage.CONTACTO__TIENE_EMAIL:
				return tieneEmail != TIENE_EMAIL_EDEFAULT;
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
		result.append(" (tieneNombre: ");
		result.append(tieneNombre);
		result.append(", tieneEmail: ");
		result.append(tieneEmail);
		result.append(')');
		return result.toString();
	}

} //ContactoImpl

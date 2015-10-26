/**
 */
package proyectos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contacto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link proyectos.Contacto#isTieneNombre <em>Tiene Nombre</em>}</li>
 *   <li>{@link proyectos.Contacto#isTieneEmail <em>Tiene Email</em>}</li>
 * </ul>
 * </p>
 *
 * @see proyectos.ProyectosPackage#getContacto()
 * @model
 * @generated
 */
public interface Contacto extends Pagina {

	/**
	 * Returns the value of the '<em><b>Tiene Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiene Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiene Nombre</em>' attribute.
	 * @see #setTieneNombre(boolean)
	 * @see proyectos.ProyectosPackage#getContacto_TieneNombre()
	 * @model
	 * @generated
	 */
	boolean isTieneNombre();

	/**
	 * Sets the value of the '{@link proyectos.Contacto#isTieneNombre <em>Tiene Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiene Nombre</em>' attribute.
	 * @see #isTieneNombre()
	 * @generated
	 */
	void setTieneNombre(boolean value);

	/**
	 * Returns the value of the '<em><b>Tiene Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiene Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiene Email</em>' attribute.
	 * @see #setTieneEmail(boolean)
	 * @see proyectos.ProyectosPackage#getContacto_TieneEmail()
	 * @model
	 * @generated
	 */
	boolean isTieneEmail();

	/**
	 * Sets the value of the '{@link proyectos.Contacto#isTieneEmail <em>Tiene Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiene Email</em>' attribute.
	 * @see #isTieneEmail()
	 * @generated
	 */
	void setTieneEmail(boolean value);
} // Contacto

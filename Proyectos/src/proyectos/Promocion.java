/**
 */
package proyectos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Promocion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link proyectos.Promocion#isTieneBanner <em>Tiene Banner</em>}</li>
 *   <li>{@link proyectos.Promocion#getEstilo <em>Estilo</em>}</li>
 * </ul>
 * </p>
 *
 * @see proyectos.ProyectosPackage#getPromocion()
 * @model
 * @generated
 */
public interface Promocion extends Pagina {

	/**
	 * Returns the value of the '<em><b>Tiene Banner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiene Banner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiene Banner</em>' attribute.
	 * @see #setTieneBanner(boolean)
	 * @see proyectos.ProyectosPackage#getPromocion_TieneBanner()
	 * @model
	 * @generated
	 */
	boolean isTieneBanner();

	/**
	 * Sets the value of the '{@link proyectos.Promocion#isTieneBanner <em>Tiene Banner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiene Banner</em>' attribute.
	 * @see #isTieneBanner()
	 * @generated
	 */
	void setTieneBanner(boolean value);

	/**
	 * Returns the value of the '<em><b>Estilo</b></em>' attribute.
	 * The literals are from the enumeration {@link proyectos.EstiloImagen}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estilo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estilo</em>' attribute.
	 * @see proyectos.EstiloImagen
	 * @see #setEstilo(EstiloImagen)
	 * @see proyectos.ProyectosPackage#getPromocion_Estilo()
	 * @model
	 * @generated
	 */
	EstiloImagen getEstilo();

	/**
	 * Sets the value of the '{@link proyectos.Promocion#getEstilo <em>Estilo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estilo</em>' attribute.
	 * @see proyectos.EstiloImagen
	 * @see #getEstilo()
	 * @generated
	 */
	void setEstilo(EstiloImagen value);
} // Promocion

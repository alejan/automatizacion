/**
 */
package proyectos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalogo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link proyectos.Catalogo#isTieneBanner <em>Tiene Banner</em>}</li>
 *   <li>{@link proyectos.Catalogo#isTienePrecio <em>Tiene Precio</em>}</li>
 *   <li>{@link proyectos.Catalogo#getEstiloImagen <em>Estilo Imagen</em>}</li>
 * </ul>
 * </p>
 *
 * @see proyectos.ProyectosPackage#getCatalogo()
 * @model
 * @generated
 */
public interface Catalogo extends Pagina {

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
	 * @see proyectos.ProyectosPackage#getCatalogo_TieneBanner()
	 * @model
	 * @generated
	 */
	boolean isTieneBanner();

	/**
	 * Sets the value of the '{@link proyectos.Catalogo#isTieneBanner <em>Tiene Banner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiene Banner</em>' attribute.
	 * @see #isTieneBanner()
	 * @generated
	 */
	void setTieneBanner(boolean value);

	/**
	 * Returns the value of the '<em><b>Tiene Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiene Precio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiene Precio</em>' attribute.
	 * @see #setTienePrecio(boolean)
	 * @see proyectos.ProyectosPackage#getCatalogo_TienePrecio()
	 * @model
	 * @generated
	 */
	boolean isTienePrecio();

	/**
	 * Sets the value of the '{@link proyectos.Catalogo#isTienePrecio <em>Tiene Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiene Precio</em>' attribute.
	 * @see #isTienePrecio()
	 * @generated
	 */
	void setTienePrecio(boolean value);

	/**
	 * Returns the value of the '<em><b>Estilo Imagen</b></em>' attribute.
	 * The literals are from the enumeration {@link proyectos.EstiloImagen}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estilo Imagen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estilo Imagen</em>' attribute.
	 * @see proyectos.EstiloImagen
	 * @see #setEstiloImagen(EstiloImagen)
	 * @see proyectos.ProyectosPackage#getCatalogo_EstiloImagen()
	 * @model
	 * @generated
	 */
	EstiloImagen getEstiloImagen();

	/**
	 * Sets the value of the '{@link proyectos.Catalogo#getEstiloImagen <em>Estilo Imagen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estilo Imagen</em>' attribute.
	 * @see proyectos.EstiloImagen
	 * @see #getEstiloImagen()
	 * @generated
	 */
	void setEstiloImagen(EstiloImagen value);
} // Catalogo

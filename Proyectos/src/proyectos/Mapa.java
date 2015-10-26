/**
 */
package proyectos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link proyectos.Mapa#isUbicacionActual <em>Ubicacion Actual</em>}</li>
 *   <li>{@link proyectos.Mapa#isBuscarUbicacion <em>Buscar Ubicacion</em>}</li>
 * </ul>
 * </p>
 *
 * @see proyectos.ProyectosPackage#getMapa()
 * @model
 * @generated
 */
public interface Mapa extends Pagina {

	/**
	 * Returns the value of the '<em><b>Ubicacion Actual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ubicacion Actual</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ubicacion Actual</em>' attribute.
	 * @see #setUbicacionActual(boolean)
	 * @see proyectos.ProyectosPackage#getMapa_UbicacionActual()
	 * @model
	 * @generated
	 */
	boolean isUbicacionActual();

	/**
	 * Sets the value of the '{@link proyectos.Mapa#isUbicacionActual <em>Ubicacion Actual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ubicacion Actual</em>' attribute.
	 * @see #isUbicacionActual()
	 * @generated
	 */
	void setUbicacionActual(boolean value);

	/**
	 * Returns the value of the '<em><b>Buscar Ubicacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buscar Ubicacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buscar Ubicacion</em>' attribute.
	 * @see #setBuscarUbicacion(boolean)
	 * @see proyectos.ProyectosPackage#getMapa_BuscarUbicacion()
	 * @model
	 * @generated
	 */
	boolean isBuscarUbicacion();

	/**
	 * Sets the value of the '{@link proyectos.Mapa#isBuscarUbicacion <em>Buscar Ubicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buscar Ubicacion</em>' attribute.
	 * @see #isBuscarUbicacion()
	 * @generated
	 */
	void setBuscarUbicacion(boolean value);
} // Mapa

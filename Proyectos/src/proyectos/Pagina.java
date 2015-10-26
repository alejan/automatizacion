/**
 */
package proyectos;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pagina</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link proyectos.Pagina#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyectos.Pagina#getColorFuente <em>Color Fuente</em>}</li>
 *   <li>{@link proyectos.Pagina#getLayout <em>Layout</em>}</li>
 *   <li>{@link proyectos.Pagina#getColorFondo <em>Color Fondo</em>}</li>
 * </ul>
 * </p>
 *
 * @see proyectos.ProyectosPackage#getPagina()
 * @model abstract="true"
 * @generated
 */
public interface Pagina extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see proyectos.ProyectosPackage#getPagina_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link proyectos.Pagina#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Color Fondo</b></em>' attribute.
	 * The literals are from the enumeration {@link proyectos.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Fondo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Fondo</em>' attribute.
	 * @see proyectos.Color
	 * @see #setColorFondo(Color)
	 * @see proyectos.ProyectosPackage#getPagina_ColorFondo()
	 * @model
	 * @generated
	 */
	Color getColorFondo();

	/**
	 * Sets the value of the '{@link proyectos.Pagina#getColorFondo <em>Color Fondo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Fondo</em>' attribute.
	 * @see proyectos.Color
	 * @see #getColorFondo()
	 * @generated
	 */
	void setColorFondo(Color value);

	/**
	 * Returns the value of the '<em><b>Color Fuente</b></em>' attribute.
	 * The literals are from the enumeration {@link proyectos.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Fuente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Fuente</em>' attribute.
	 * @see proyectos.Color
	 * @see #setColorFuente(Color)
	 * @see proyectos.ProyectosPackage#getPagina_ColorFuente()
	 * @model
	 * @generated
	 */
	Color getColorFuente();

	/**
	 * Sets the value of the '{@link proyectos.Pagina#getColorFuente <em>Color Fuente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Fuente</em>' attribute.
	 * @see proyectos.Color
	 * @see #getColorFuente()
	 * @generated
	 */
	void setColorFuente(Color value);

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' attribute.
	 * The literals are from the enumeration {@link proyectos.Layout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' attribute.
	 * @see proyectos.Layout
	 * @see #setLayout(Layout)
	 * @see proyectos.ProyectosPackage#getPagina_Layout()
	 * @model
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link proyectos.Pagina#getLayout <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' attribute.
	 * @see proyectos.Layout
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

} // Pagina

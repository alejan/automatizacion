/**
 */
package htmlMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link htmlMetamodel.WebApp#getPages <em>Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @see htmlMetamodel.HtmlMetamodelPackage#getWebApp()
 * @model
 * @generated
 */
public interface WebApp extends EObject {
	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link htmlMetamodel.HtmlPage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see htmlMetamodel.HtmlMetamodelPackage#getWebApp_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<HtmlPage> getPages();

} // WebApp

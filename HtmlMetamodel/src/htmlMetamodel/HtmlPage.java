/**
 */
package htmlMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Html Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link htmlMetamodel.HtmlPage#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @see htmlMetamodel.HtmlMetamodelPackage#getHtmlPage()
 * @model
 * @generated
 */
public interface HtmlPage extends EObject {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link htmlMetamodel.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see htmlMetamodel.HtmlMetamodelPackage#getHtmlPage_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

} // HtmlPage

/**
 *
 * $Id$
 */
package htmlMetamodel.validation;

import htmlMetamodel.Atributo;
import htmlMetamodel.Tag;
import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link htmlMetamodel.Tag}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TagValidator {
	boolean validate();

	boolean validateName(String value);

	boolean validateNombre(String value);
	boolean validateAtributos(EList<Atributo> value);

	boolean validateId(String value);

	boolean validateTags(EList<Tag> value);
}

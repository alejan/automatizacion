/**
 *
 * $Id$
 */
package proyectos.validation;

import proyectos.EstiloImagen;


/**
 * A sample validator interface for {@link proyectos.Catalogo}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CatalogoValidator {
	boolean validate();

	boolean validateTieneBanner(boolean value);

	boolean validateTienePrecio(boolean value);

	boolean validateEstiloImagen(EstiloImagen value);

}

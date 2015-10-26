/**
 */
package proyectos;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see proyectos.ProyectosFactory
 * @model kind="package"
 * @generated
 */
public interface ProyectosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "proyectos";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/proyectos";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "proyectos";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProyectosPackage eINSTANCE = proyectos.impl.ProyectosPackageImpl.init();

	/**
	 * The meta object id for the '{@link proyectos.impl.MarketPlaceImpl <em>Market Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectos.impl.MarketPlaceImpl
	 * @see proyectos.impl.ProyectosPackageImpl#getMarketPlace()
	 * @generated
	 */
	int MARKET_PLACE = 0;

	/**
	 * The feature id for the '<em><b>Paginas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PLACE__PAGINAS = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PLACE__NOMBRE = 1;

	/**
	 * The number of structural features of the '<em>Market Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PLACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Market Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PLACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link proyectos.impl.PaginaImpl <em>Pagina</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectos.impl.PaginaImpl
	 * @see proyectos.impl.ProyectosPackageImpl#getPagina()
	 * @generated
	 */
	int PAGINA = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Color Fuente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA__COLOR_FUENTE = 1;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA__LAYOUT = 2;

	/**
	 * The feature id for the '<em><b>Color Fondo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA__COLOR_FONDO = 3;

	/**
	 * The number of structural features of the '<em>Pagina</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Pagina</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link proyectos.impl.PromocionImpl <em>Promocion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectos.impl.PromocionImpl
	 * @see proyectos.impl.ProyectosPackageImpl#getPromocion()
	 * @generated
	 */
	int PROMOCION = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOCION__NOMBRE = PAGINA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Color Fuente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOCION__COLOR_FUENTE = PAGINA__COLOR_FUENTE;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOCION__LAYOUT = PAGINA__LAYOUT;

	/**
	 * The feature id for the '<em><b>Color Fondo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOCION__COLOR_FONDO = PAGINA__COLOR_FONDO;

	/**
	 * The feature id for the '<em><b>Tiene Banner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOCION__TIENE_BANNER = PAGINA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Estilo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOCION__ESTILO = PAGINA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Promocion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOCION_FEATURE_COUNT = PAGINA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Promocion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOCION_OPERATION_COUNT = PAGINA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link proyectos.impl.MapaImpl <em>Mapa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectos.impl.MapaImpl
	 * @see proyectos.impl.ProyectosPackageImpl#getMapa()
	 * @generated
	 */
	int MAPA = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPA__NOMBRE = PAGINA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Color Fuente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPA__COLOR_FUENTE = PAGINA__COLOR_FUENTE;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPA__LAYOUT = PAGINA__LAYOUT;

	/**
	 * The feature id for the '<em><b>Color Fondo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPA__COLOR_FONDO = PAGINA__COLOR_FONDO;

	/**
	 * The feature id for the '<em><b>Ubicacion Actual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPA__UBICACION_ACTUAL = PAGINA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Buscar Ubicacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPA__BUSCAR_UBICACION = PAGINA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mapa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPA_FEATURE_COUNT = PAGINA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mapa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPA_OPERATION_COUNT = PAGINA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link proyectos.impl.ContactoImpl <em>Contacto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectos.impl.ContactoImpl
	 * @see proyectos.impl.ProyectosPackageImpl#getContacto()
	 * @generated
	 */
	int CONTACTO = 4;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__NOMBRE = PAGINA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Color Fuente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__COLOR_FUENTE = PAGINA__COLOR_FUENTE;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__LAYOUT = PAGINA__LAYOUT;

	/**
	 * The feature id for the '<em><b>Color Fondo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__COLOR_FONDO = PAGINA__COLOR_FONDO;

	/**
	 * The feature id for the '<em><b>Tiene Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__TIENE_NOMBRE = PAGINA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tiene Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__TIENE_EMAIL = PAGINA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Contacto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO_FEATURE_COUNT = PAGINA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Contacto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO_OPERATION_COUNT = PAGINA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link proyectos.impl.CatalogoImpl <em>Catalogo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectos.impl.CatalogoImpl
	 * @see proyectos.impl.ProyectosPackageImpl#getCatalogo()
	 * @generated
	 */
	int CATALOGO = 5;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGO__NOMBRE = PAGINA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Color Fuente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGO__COLOR_FUENTE = PAGINA__COLOR_FUENTE;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGO__LAYOUT = PAGINA__LAYOUT;

	/**
	 * The feature id for the '<em><b>Color Fondo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGO__COLOR_FONDO = PAGINA__COLOR_FONDO;

	/**
	 * The feature id for the '<em><b>Tiene Banner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGO__TIENE_BANNER = PAGINA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tiene Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGO__TIENE_PRECIO = PAGINA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Estilo Imagen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGO__ESTILO_IMAGEN = PAGINA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Catalogo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGO_FEATURE_COUNT = PAGINA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Catalogo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGO_OPERATION_COUNT = PAGINA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link proyectos.EstiloImagen <em>Estilo Imagen</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectos.EstiloImagen
	 * @see proyectos.impl.ProyectosPackageImpl#getEstiloImagen()
	 * @generated
	 */
	int ESTILO_IMAGEN = 6;

	/**
	 * The meta object id for the '{@link proyectos.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectos.Color
	 * @see proyectos.impl.ProyectosPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 7;

	/**
	 * The meta object id for the '{@link proyectos.Layout <em>Layout</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectos.Layout
	 * @see proyectos.impl.ProyectosPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 8;

	/**
	 * Returns the meta object for class '{@link proyectos.MarketPlace <em>Market Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Market Place</em>'.
	 * @see proyectos.MarketPlace
	 * @generated
	 */
	EClass getMarketPlace();

	/**
	 * Returns the meta object for the containment reference list '{@link proyectos.MarketPlace#getPaginas <em>Paginas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paginas</em>'.
	 * @see proyectos.MarketPlace#getPaginas()
	 * @see #getMarketPlace()
	 * @generated
	 */
	EReference getMarketPlace_Paginas();

	/**
	 * Returns the meta object for the attribute '{@link proyectos.MarketPlace#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see proyectos.MarketPlace#getNombre()
	 * @see #getMarketPlace()
	 * @generated
	 */
	EAttribute getMarketPlace_Nombre();

	/**
	 * Returns the meta object for class '{@link proyectos.Pagina <em>Pagina</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pagina</em>'.
	 * @see proyectos.Pagina
	 * @generated
	 */
	EClass getPagina();

	/**
	 * Returns the meta object for the attribute '{@link proyectos.Pagina#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see proyectos.Pagina#getNombre()
	 * @see #getPagina()
	 * @generated
	 */
	EAttribute getPagina_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link proyectos.Pagina#getColorFondo <em>Color Fondo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Fondo</em>'.
	 * @see proyectos.Pagina#getColorFondo()
	 * @see #getPagina()
	 * @generated
	 */
	EAttribute getPagina_ColorFondo();

	/**
	 * Returns the meta object for the attribute '{@link proyectos.Pagina#getColorFuente <em>Color Fuente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Fuente</em>'.
	 * @see proyectos.Pagina#getColorFuente()
	 * @see #getPagina()
	 * @generated
	 */
	EAttribute getPagina_ColorFuente();

	/**
	 * Returns the meta object for the attribute '{@link proyectos.Pagina#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout</em>'.
	 * @see proyectos.Pagina#getLayout()
	 * @see #getPagina()
	 * @generated
	 */
	EAttribute getPagina_Layout();

	/**
	 * Returns the meta object for class '{@link proyectos.Promocion <em>Promocion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Promocion</em>'.
	 * @see proyectos.Promocion
	 * @generated
	 */
	EClass getPromocion();

	/**
	 * Returns the meta object for the attribute '{@link proyectos.Promocion#isTieneBanner <em>Tiene Banner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tiene Banner</em>'.
	 * @see proyectos.Promocion#isTieneBanner()
	 * @see #getPromocion()
	 * @generated
	 */
	EAttribute getPromocion_TieneBanner();

	/**
	 * Returns the meta object for the attribute '{@link proyectos.Promocion#getEstilo <em>Estilo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estilo</em>'.
	 * @see proyectos.Promocion#getEstilo()
	 * @see #getPromocion()
	 * @generated
	 */
	EAttribute getPromocion_Estilo();

	/**
	 * Returns the meta object for class '{@link proyectos.Mapa <em>Mapa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapa</em>'.
	 * @see proyectos.Mapa
	 * @generated
	 */
	EClass getMapa();

	/**
	 * Returns the meta object for the attribute '{@link proyectos.Mapa#isUbicacionActual <em>Ubicacion Actual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ubicacion Actual</em>'.
	 * @see proyectos.Mapa#isUbicacionActual()
	 * @see #getMapa()
	 * @generated
	 */
	EAttribute getMapa_UbicacionActual();

	/**
	 * Returns the meta object for the attribute '{@link proyectos.Mapa#isBuscarUbicacion <em>Buscar Ubicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buscar Ubicacion</em>'.
	 * @see proyectos.Mapa#isBuscarUbicacion()
	 * @see #getMapa()
	 * @generated
	 */
	EAttribute getMapa_BuscarUbicacion();

	/**
	 * Returns the meta object for class '{@link proyectos.Contacto <em>Contacto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contacto</em>'.
	 * @see proyectos.Contacto
	 * @generated
	 */
	EClass getContacto();

	/**
	 * Returns the meta object for the attribute '{@link proyectos.Contacto#isTieneNombre <em>Tiene Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tiene Nombre</em>'.
	 * @see proyectos.Contacto#isTieneNombre()
	 * @see #getContacto()
	 * @generated
	 */
	EAttribute getContacto_TieneNombre();

	/**
	 * Returns the meta object for the attribute '{@link proyectos.Contacto#isTieneEmail <em>Tiene Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tiene Email</em>'.
	 * @see proyectos.Contacto#isTieneEmail()
	 * @see #getContacto()
	 * @generated
	 */
	EAttribute getContacto_TieneEmail();

	/**
	 * Returns the meta object for class '{@link proyectos.Catalogo <em>Catalogo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalogo</em>'.
	 * @see proyectos.Catalogo
	 * @generated
	 */
	EClass getCatalogo();

	/**
	 * Returns the meta object for the attribute '{@link proyectos.Catalogo#isTieneBanner <em>Tiene Banner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tiene Banner</em>'.
	 * @see proyectos.Catalogo#isTieneBanner()
	 * @see #getCatalogo()
	 * @generated
	 */
	EAttribute getCatalogo_TieneBanner();

	/**
	 * Returns the meta object for the attribute '{@link proyectos.Catalogo#isTienePrecio <em>Tiene Precio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tiene Precio</em>'.
	 * @see proyectos.Catalogo#isTienePrecio()
	 * @see #getCatalogo()
	 * @generated
	 */
	EAttribute getCatalogo_TienePrecio();

	/**
	 * Returns the meta object for the attribute '{@link proyectos.Catalogo#getEstiloImagen <em>Estilo Imagen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estilo Imagen</em>'.
	 * @see proyectos.Catalogo#getEstiloImagen()
	 * @see #getCatalogo()
	 * @generated
	 */
	EAttribute getCatalogo_EstiloImagen();

	/**
	 * Returns the meta object for enum '{@link proyectos.EstiloImagen <em>Estilo Imagen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Estilo Imagen</em>'.
	 * @see proyectos.EstiloImagen
	 * @generated
	 */
	EEnum getEstiloImagen();

	/**
	 * Returns the meta object for enum '{@link proyectos.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see proyectos.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the meta object for enum '{@link proyectos.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout</em>'.
	 * @see proyectos.Layout
	 * @generated
	 */
	EEnum getLayout();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProyectosFactory getProyectosFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link proyectos.impl.MarketPlaceImpl <em>Market Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectos.impl.MarketPlaceImpl
		 * @see proyectos.impl.ProyectosPackageImpl#getMarketPlace()
		 * @generated
		 */
		EClass MARKET_PLACE = eINSTANCE.getMarketPlace();

		/**
		 * The meta object literal for the '<em><b>Paginas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_PLACE__PAGINAS = eINSTANCE.getMarketPlace_Paginas();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_PLACE__NOMBRE = eINSTANCE.getMarketPlace_Nombre();

		/**
		 * The meta object literal for the '{@link proyectos.impl.PaginaImpl <em>Pagina</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectos.impl.PaginaImpl
		 * @see proyectos.impl.ProyectosPackageImpl#getPagina()
		 * @generated
		 */
		EClass PAGINA = eINSTANCE.getPagina();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINA__NOMBRE = eINSTANCE.getPagina_Nombre();

		/**
		 * The meta object literal for the '<em><b>Color Fondo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINA__COLOR_FONDO = eINSTANCE.getPagina_ColorFondo();

		/**
		 * The meta object literal for the '<em><b>Color Fuente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINA__COLOR_FUENTE = eINSTANCE.getPagina_ColorFuente();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINA__LAYOUT = eINSTANCE.getPagina_Layout();

		/**
		 * The meta object literal for the '{@link proyectos.impl.PromocionImpl <em>Promocion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectos.impl.PromocionImpl
		 * @see proyectos.impl.ProyectosPackageImpl#getPromocion()
		 * @generated
		 */
		EClass PROMOCION = eINSTANCE.getPromocion();

		/**
		 * The meta object literal for the '<em><b>Tiene Banner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOCION__TIENE_BANNER = eINSTANCE.getPromocion_TieneBanner();

		/**
		 * The meta object literal for the '<em><b>Estilo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOCION__ESTILO = eINSTANCE.getPromocion_Estilo();

		/**
		 * The meta object literal for the '{@link proyectos.impl.MapaImpl <em>Mapa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectos.impl.MapaImpl
		 * @see proyectos.impl.ProyectosPackageImpl#getMapa()
		 * @generated
		 */
		EClass MAPA = eINSTANCE.getMapa();

		/**
		 * The meta object literal for the '<em><b>Ubicacion Actual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPA__UBICACION_ACTUAL = eINSTANCE.getMapa_UbicacionActual();

		/**
		 * The meta object literal for the '<em><b>Buscar Ubicacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPA__BUSCAR_UBICACION = eINSTANCE.getMapa_BuscarUbicacion();

		/**
		 * The meta object literal for the '{@link proyectos.impl.ContactoImpl <em>Contacto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectos.impl.ContactoImpl
		 * @see proyectos.impl.ProyectosPackageImpl#getContacto()
		 * @generated
		 */
		EClass CONTACTO = eINSTANCE.getContacto();

		/**
		 * The meta object literal for the '<em><b>Tiene Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACTO__TIENE_NOMBRE = eINSTANCE.getContacto_TieneNombre();

		/**
		 * The meta object literal for the '<em><b>Tiene Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACTO__TIENE_EMAIL = eINSTANCE.getContacto_TieneEmail();

		/**
		 * The meta object literal for the '{@link proyectos.impl.CatalogoImpl <em>Catalogo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectos.impl.CatalogoImpl
		 * @see proyectos.impl.ProyectosPackageImpl#getCatalogo()
		 * @generated
		 */
		EClass CATALOGO = eINSTANCE.getCatalogo();

		/**
		 * The meta object literal for the '<em><b>Tiene Banner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOGO__TIENE_BANNER = eINSTANCE.getCatalogo_TieneBanner();

		/**
		 * The meta object literal for the '<em><b>Tiene Precio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOGO__TIENE_PRECIO = eINSTANCE.getCatalogo_TienePrecio();

		/**
		 * The meta object literal for the '<em><b>Estilo Imagen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOGO__ESTILO_IMAGEN = eINSTANCE.getCatalogo_EstiloImagen();

		/**
		 * The meta object literal for the '{@link proyectos.EstiloImagen <em>Estilo Imagen</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectos.EstiloImagen
		 * @see proyectos.impl.ProyectosPackageImpl#getEstiloImagen()
		 * @generated
		 */
		EEnum ESTILO_IMAGEN = eINSTANCE.getEstiloImagen();

		/**
		 * The meta object literal for the '{@link proyectos.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectos.Color
		 * @see proyectos.impl.ProyectosPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '{@link proyectos.Layout <em>Layout</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectos.Layout
		 * @see proyectos.impl.ProyectosPackageImpl#getLayout()
		 * @generated
		 */
		EEnum LAYOUT = eINSTANCE.getLayout();

	}

} //ProyectosPackage

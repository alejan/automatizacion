/**
 */
package proyectos.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import proyectos.Catalogo;
import proyectos.Color;
import proyectos.Contacto;
import proyectos.EstiloImagen;
import proyectos.Layout;
import proyectos.Mapa;
import proyectos.MarketPlace;
import proyectos.Pagina;
import proyectos.Promocion;
import proyectos.ProyectosFactory;
import proyectos.ProyectosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProyectosPackageImpl extends EPackageImpl implements ProyectosPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass marketPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paginaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass promocionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum estiloImagenEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum layoutEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see proyectos.ProyectosPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProyectosPackageImpl() {
		super(eNS_URI, ProyectosFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ProyectosPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProyectosPackage init() {
		if (isInited) return (ProyectosPackage)EPackage.Registry.INSTANCE.getEPackage(ProyectosPackage.eNS_URI);

		// Obtain or create and register package
		ProyectosPackageImpl theProyectosPackage = (ProyectosPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProyectosPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProyectosPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theProyectosPackage.createPackageContents();

		// Initialize created meta-data
		theProyectosPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProyectosPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProyectosPackage.eNS_URI, theProyectosPackage);
		return theProyectosPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarketPlace() {
		return marketPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarketPlace_Paginas() {
		return (EReference)marketPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarketPlace_Nombre() {
		return (EAttribute)marketPlaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPagina() {
		return paginaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPagina_Nombre() {
		return (EAttribute)paginaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPagina_ColorFondo() {
		return (EAttribute)paginaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPagina_ColorFuente() {
		return (EAttribute)paginaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPagina_Layout() {
		return (EAttribute)paginaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPromocion() {
		return promocionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPromocion_TieneBanner() {
		return (EAttribute)promocionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPromocion_Estilo() {
		return (EAttribute)promocionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapa() {
		return mapaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapa_UbicacionActual() {
		return (EAttribute)mapaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapa_BuscarUbicacion() {
		return (EAttribute)mapaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContacto() {
		return contactoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContacto_TieneNombre() {
		return (EAttribute)contactoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContacto_TieneEmail() {
		return (EAttribute)contactoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalogo() {
		return catalogoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalogo_TieneBanner() {
		return (EAttribute)catalogoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalogo_TienePrecio() {
		return (EAttribute)catalogoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalogo_EstiloImagen() {
		return (EAttribute)catalogoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEstiloImagen() {
		return estiloImagenEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColor() {
		return colorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLayout() {
		return layoutEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectosFactory getProyectosFactory() {
		return (ProyectosFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		marketPlaceEClass = createEClass(MARKET_PLACE);
		createEReference(marketPlaceEClass, MARKET_PLACE__PAGINAS);
		createEAttribute(marketPlaceEClass, MARKET_PLACE__NOMBRE);

		paginaEClass = createEClass(PAGINA);
		createEAttribute(paginaEClass, PAGINA__NOMBRE);
		createEAttribute(paginaEClass, PAGINA__COLOR_FUENTE);
		createEAttribute(paginaEClass, PAGINA__LAYOUT);
		createEAttribute(paginaEClass, PAGINA__COLOR_FONDO);

		promocionEClass = createEClass(PROMOCION);
		createEAttribute(promocionEClass, PROMOCION__TIENE_BANNER);
		createEAttribute(promocionEClass, PROMOCION__ESTILO);

		mapaEClass = createEClass(MAPA);
		createEAttribute(mapaEClass, MAPA__UBICACION_ACTUAL);
		createEAttribute(mapaEClass, MAPA__BUSCAR_UBICACION);

		contactoEClass = createEClass(CONTACTO);
		createEAttribute(contactoEClass, CONTACTO__TIENE_NOMBRE);
		createEAttribute(contactoEClass, CONTACTO__TIENE_EMAIL);

		catalogoEClass = createEClass(CATALOGO);
		createEAttribute(catalogoEClass, CATALOGO__TIENE_BANNER);
		createEAttribute(catalogoEClass, CATALOGO__TIENE_PRECIO);
		createEAttribute(catalogoEClass, CATALOGO__ESTILO_IMAGEN);

		// Create enums
		estiloImagenEEnum = createEEnum(ESTILO_IMAGEN);
		colorEEnum = createEEnum(COLOR);
		layoutEEnum = createEEnum(LAYOUT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		promocionEClass.getESuperTypes().add(this.getPagina());
		mapaEClass.getESuperTypes().add(this.getPagina());
		contactoEClass.getESuperTypes().add(this.getPagina());
		catalogoEClass.getESuperTypes().add(this.getPagina());

		// Initialize classes, features, and operations; add parameters
		initEClass(marketPlaceEClass, MarketPlace.class, "MarketPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarketPlace_Paginas(), this.getPagina(), null, "paginas", null, 1, -1, MarketPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarketPlace_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, MarketPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paginaEClass, Pagina.class, "Pagina", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPagina_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Pagina.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPagina_ColorFuente(), this.getColor(), "colorFuente", null, 0, 1, Pagina.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPagina_Layout(), this.getLayout(), "layout", null, 0, 1, Pagina.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPagina_ColorFondo(), this.getColor(), "colorFondo", null, 0, 1, Pagina.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(promocionEClass, Promocion.class, "Promocion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPromocion_TieneBanner(), ecorePackage.getEBoolean(), "tieneBanner", null, 0, 1, Promocion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromocion_Estilo(), this.getEstiloImagen(), "estilo", null, 0, 1, Promocion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapaEClass, Mapa.class, "Mapa", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapa_UbicacionActual(), ecorePackage.getEBoolean(), "ubicacionActual", null, 0, 1, Mapa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapa_BuscarUbicacion(), ecorePackage.getEBoolean(), "buscarUbicacion", null, 0, 1, Mapa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactoEClass, Contacto.class, "Contacto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContacto_TieneNombre(), ecorePackage.getEBoolean(), "tieneNombre", null, 0, 1, Contacto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContacto_TieneEmail(), ecorePackage.getEBoolean(), "tieneEmail", null, 0, 1, Contacto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catalogoEClass, Catalogo.class, "Catalogo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCatalogo_TieneBanner(), ecorePackage.getEBoolean(), "tieneBanner", null, 0, 1, Catalogo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogo_TienePrecio(), ecorePackage.getEBoolean(), "tienePrecio", null, 0, 1, Catalogo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogo_EstiloImagen(), this.getEstiloImagen(), "estiloImagen", null, 0, 1, Catalogo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(estiloImagenEEnum, EstiloImagen.class, "EstiloImagen");
		addEEnumLiteral(estiloImagenEEnum, EstiloImagen.SMALL);
		addEEnumLiteral(estiloImagenEEnum, EstiloImagen.LARGE);

		initEEnum(colorEEnum, Color.class, "Color");
		addEEnumLiteral(colorEEnum, Color.BLANCO);
		addEEnumLiteral(colorEEnum, Color.NEGRO);
		addEEnumLiteral(colorEEnum, Color.AZUL);
		addEEnumLiteral(colorEEnum, Color.VERDE);
		addEEnumLiteral(colorEEnum, Color.ROJO);
		addEEnumLiteral(colorEEnum, Color.GRIS);

		initEEnum(layoutEEnum, Layout.class, "Layout");
		addEEnumLiteral(layoutEEnum, Layout.GRID);
		addEEnumLiteral(layoutEEnum, Layout.VERTICAL);
		addEEnumLiteral(layoutEEnum, Layout.HORIZONTAL);

		// Create resource
		createResource(eNS_URI);
	}

} //ProyectosPackageImpl

# Bitácora — Laboratorio 2

## Equipo
| Rol | Nombre | Usuario de GitHub |
|---|---|---|
| Integrador |Joseph Sebastian Martinez Forero | Joseph9488 |
| Formato y Estilo | Looana Marinella Leon Guevara | looleo2614|
| Vista | Derlys Xiomara Leal Castillo | Derlys820 |
| Controlador | Juan Sebastian Hernandez Ortiz | jshernandez-svg |

## Contrato

| Elemento | Valor acordado | Lo usan |
|---|---|---|
| Carpeta de la vista y la hoja de estilos | `src/main/resources/co/edu/unillanos/msg/infrastructure/ui/` | Vista, Formato y estilo, Integrador |
| Archivo de la vista | `funds-view.fxml`, en esa carpeta | Vista, Integrador |
| Controlador declarado en la vista | `fx:controller="co.edu.unillanos.msg.infrastructure.ui.FundsController"` | Vista, Controlador |
| Etiqueta del total | Un `Label` con `fx:id="totalLabel"` | Vista, Controlador |
| Acción del botón | `onAction="#onEstimate"` | Vista, Controlador |
| Constructor del controlador | `FundsController(EstimateFundsForWeek estimateFunds)` | Controlador, Integrador |
| Formato del dinero | `MoneyFormat.format(double)` devuelve, por ejemplo, `"$ 1160.00"` | Formato y estilo, Controlador |
| Hoja de estilos | `funds-view.css`, junto al FXML, con las clases `title` y `total` | Vista, Formato y estilo |

## Resultados del guion de aceptación

Ejecutado por: Joseph — Rama: `main`

`mvn test`: BUILD SUCCESS, 14 pruebas (las del Laboratorio 1 y `MoneyFormatTest`).

| Paso | Acción | Resultado esperado | Resultado obtenido |
|---|---|---|---|
| 1 | `mvn clean javafx:run` | No dice `skip non existing resourceDirectory`; abre la ventana con título, botón y etiqueta vacía | Abrió la ventana «MSG Foundation» con el título, el botón y la etiqueta vacía; sin aviso de `skip non existing resourceDirectory`. |
| 2 | Ejecutar `Launcher` desde el IDE | Abre la misma ventana | Abrió la misma ventana. |
| 3 | Pulsar **Calcular fondos** | La etiqueta muestra `$ 1160.00`, grande y en negrita | La etiqueta mostró `$ 1160.00`, grande y en negrita. |
| 4 | Ejecutar `Main` desde el IDE | La consola imprime `1160.00` | La consola imprimió `Fondos disponibles para la semana: 1160.00`. |
| 5 | `git diff --stat base main -- ...domain ...application` | No imprime nada | Salida vacía: el núcleo no cambió. |
| 6 | Abrir `FundsController` | Sin `new` de casos de uso ni de repositorios, ni 52, ni 0.28 | Sin `new` de casos de uso ni de repositorios, y sin 52 ni 0.28. |

Capturas de los pasos 3 y 5: carpeta `docs/` (`paso3-ventana.jng`, `paso5-diff.jng`).


## Lo que realmente cambió

**Predicción D6:** ningún archivo de `domain` ni de `application`.

**Resultado:** (llenar tras el paso 5: «Coincide, el diff salió vacío» o la lista de archivos que cambiaron).

Archivos nuevos o modificados en este laboratorio:

| Archivo | Capa o ubicación | Rol |
|---|---|---|
| `pom.xml` | raíz | Integrador |
| `App.java`, `Launcher.java` | `co.edu.unillanos.msg` | Integrador |
| `MoneyFormat.java`, `MoneyFormatTest.java` | `infrastructure/ui` | Formato y estilo |
| `funds-view.css` | `resources/.../infrastructure/ui` | Formato y estilo |
| `funds-view.fxml` | `resources/.../infrastructure/ui` | Vista |
| `FundsController.java` | `infrastructure/ui` | Controlador |
| `BITACORA.md`, `docs/` | raíz | Equipo |

**Conclusión:** (llenar, por ejemplo: «El núcleo no cambió porque la interfaz depende del caso de uso y no al revés; JavaFX quedó en infraestructura»).

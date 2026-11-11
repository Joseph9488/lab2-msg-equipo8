# Bitácora — Laboratorio 1

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
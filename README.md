# Aplicación de Gestión de Pedidos de Golosinas

Esta aplicación de gestión de pedidos de golosinas está desarrollada en Spring Boot Java y tiene como objetivo permitir a los usuarios realizar pedidos para abastecer sus negocios de golosinas. La aplicación incluye flujos de aprobación para garantizar que los pedidos sigan un proceso adecuado antes de ser aprobados o rechazados.

## Funcionalidades

- Los usuarios pueden iniciar un pedido, que comienza en estado "Borrador".
- Los pedidos pueden ser enviados para su aprobación, cambiando su estado a "Pend. Aprobación".
- Los pedidos pueden ser aprobados o rechazados por un responsable, cambiando su estado a "Aprobado/Rech.".
- Los pedidos pueden ser de tipo mayorista o minorista.

## Diagramas

### Diagrama de Clases

![Diagrama de Clases](https://raw.githubusercontent.com/marilynpb/AcedemiaTalendProveedorGolosinas/main/src/main/resources/static/img/DiagramaDeClases.png)


### Diagrama de Estados

El siguiente diagrama de estados muestra el flujo de estados de los pedidos:

![Diagrama de Estados](https://raw.githubusercontent.com/marilynpb/AcedemiaTalendProveedorGolosinas/main/src/main/resources/static/img/DiagramaEstados.png)

## Restricciones de Flujo de Pedidos

- Un pedido en estado "Borrador" no puede pasar a un estado "Aprobado".
- Ninguno de los estados puede volver a un estado anterior.
- No se pueden saltar estados en el flujo de pedidos.

## Instalación y Ejecución

1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en tu IDE preferido (como IntelliJ IDEA o Eclipse).
3. Asegúrate de tener Java y Maven instalados en tu sistema.
4. Compila y ejecuta la aplicación desde tu IDE.
5. Accede a la aplicación desde tu navegador web en `http://localhost:8080`.
6. Conectate a la BD H2 (http://localhost:8080/h2-console)


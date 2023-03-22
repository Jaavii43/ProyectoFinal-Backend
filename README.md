# Proyecto Portfolio Argentina Programa

## Resumen

La idea general del proyecto es poder crear un Porfolio, que se pueda editar cualquier dato del mismo.
Este es un proyecto integrador que incluye tanto la parte de Frontend como la de Backend para el curso de Argentina Programa, Programador Web FullStack.
Se desarrollo una web principal de libre acceso y una web de edicion, estilo dashboard al la cual hay que acceder mediante un login definidos en la base de datos, y en el cual se puede realizar CRUD (Create-Read-Update-Delete).

## Tecnologias utilizadas

Se listan los lenguajes utilizados en el ***frontend***:
* [Visual Studio Code](https://code.visualstudio.com/): Version 1.76.2
* [HTML5](https://developer.mozilla.org/es/docs/Web/HTML)
* [CSS3](https://developer.mozilla.org/es/docs/Web/CSS)
* [Bootstrap](https://getbootstrap.com/docs/5.0/getting-started/introduction/): Version 5.2.0
* [TypeScript](https://www.typescriptlang.org/)
* [Angular](https://angular.io/): Version 15.1.4
* [Firebase](https://firebase.google.com/)

## Desarrollo

Primero se instala VisualStudio Code siguiendo los pasos de los videos del curso, se instalan tambien las extensiones recomendadas, siendo la de angular Schematic la mas utilizada para crea los componentes.
Primeramente se realiza el maquetado HTML puro ya pensando en secciones para despues poder pasar a Angular.
Se crea un estructura de carpetas pensando en componentes, tambien separando la parte de edicion y visualisacion.
Se hacen pruebas con ```$ ng serve``` y con la parte de backend junto con una base de datos local.

## Deploy

Se realiza el deploy en Firebase segun videos e instructivos tanto como del curso y dela web.
Para hacer el deploy se instala las tools de Firebase en VisualStudio Code. Despues se hace el sicronizmo entre VisualStudio y Firebase.
Despues se utilizan los comandos:
```$ ng build```

```$ firebase deploy```
Para podes seguir modificando el FrontEnd y actualizando los cambios en FireBase.

## Agradecimientos

* Al canal de youtube *** ProgramTk y a todos los que trabajaron en los videos y brindaron su tiempo en enseñar.
* A Argentina Programa por brindar la posibilidad de poder hacer este curso sin costos.
* A mi Familia por apoyarme.



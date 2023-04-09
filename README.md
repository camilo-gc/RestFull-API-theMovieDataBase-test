# RestFull-API-theMovieDataBase-test

Aplicacion sencilla que consume la API del proyecto The Movie DataBase para obtener, procesar y exponer la informacion 
mediante los endpoints descritos en el apartado de **_Uso_**.

## Requisitos
1. Java 8 o superior instalado
2. Maven 3 o superior instalado

## Instalación
1. **Clonar el repositorio:** git clone https://github.com/camilo-gc/RestFull-API-theMovieDataBase-test.git
2. **Navegar al directorio:** cd RestFull-API-theMovieDataBase-test
3. **Compilar la aplicación:** mvn clean package
4. **Ejecutar la aplicación:** java -jar target/RestFull-API-theMovieDataBase-test-1.0-SNAPSHOT.jar

## Uso
Tomando en cuenta que la aplicacion se instalo de manera local, se toma como url base **_http://localhost:8080/api-test_** a 
continuacion se describen los endpoint disponibles y su funcionamiento:

1. Todas las respuestas estan estandarizadas mediante un JSON el cual contiene el codigo del estado, una descripcion y 
el contenido de la respuesta: `{"statusCode":"", "description":"", "content":[]}`
2. [**/movies/**]() Como resultado se obtienen un listado de 20 peliculas en 
el contenido del JSON, Para obtener otra lista diferente, se debe especificar el numero de pagina enviando la variable  
_**page**_ ejemplo: /api-test/movies/?page=2
3. [**/movies/{id}**]()
4. [**/auth/guest/new**]()
5. [**/movies/rated/{id}**]()
6. [**/movies/ratings**]()
7. [**/movies/rated/{id}**]()

## Contribuciones
Se agradecen y se aceptan contribuciones. Para contribuir a la aplicación, sigue estos pasos:

1. Haz un fork del repositorio
2. Crea una nueva rama: git checkout -b nombre-rama
3. Haz tus cambios y commitea: git commit -am 'Descripción de los cambios'
4. Push a la rama: git push origin nombre-rama
5. Crea un pull request

## Licencia
Este proyecto está regido por la Licencia  y restricciones de la API TMDB. Si desea leer mas sobre esto ingrese [aqui](https://www.themoviedb.org/documentation/api/terms-of-use).

## Contacto
Si tienes alguna pregunta o comentario, por favor contactarme al email **_camilogarcia.dev@gmail.com_**
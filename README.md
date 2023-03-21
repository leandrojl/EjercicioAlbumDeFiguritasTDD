# Proyecto de Album de Figuritas con Java.

## Descripcion del Proyecto:

Este proyecto se basa en un ejercicio de evaluacion dictado por la Universidad de La Matanza el cual se pide resolver a traves de TDD (Test Driven Development).

### Tecnologias utilizadas:

Para resolver el siguiente ejercicio se utilizo el lenguaje Java enfocado en el paradigma de Programacion Orientada a Objetos, donde se emplearon los casos de testeos solicitados y manejo de Excepciones especificamente para errores previstos.

### Consigna detallada del proyecto:

Nos contrata Panini para desarrollar la versión digital del álbum de figuritas del mundial.
Cada figurita está compuesta por su código identificatorio, la letra del grupo al que pertenece, la selección, el nombre del jugador y el valor del jugador en el mercado.
El sistema puede tener dos tipos de usuarios registrados. Los administradores, quienes son los encargados de administrar toda la información de las figuritas que se van a comercializar, y los usuarios finales que son los que en definitiva jugarán.
Según el tipo de usuario es la acción por realizar, por ejemplo, el método agregarFigurita de un usuario administrador se encarga de dar de alta una nueva figurita con sus características. Ahora bien, el método agregarFigurita de un usuario final en realidad lo que hace es agregar esa figurita en el stock disponible para ese usuario. 
Tanto la base de datos de figurita generada por los administradores como el stock de figuritas de cada usuario deben estar ordenados por grupo, selección y número de figurita en la selección.
Las figuritas tienen un identificador único que está compuesto por la selección y el número de figurita (cada selección tiene alrededor de 22 jugadores). Si un administrado intenta dar de alta un código ya existente, el sistema debe arrojar la excepción “CodigoExistente”.
A diferencia de lo que ocurre a nivel administrador, cuando un usuario final agregue una nueva figurita a su stock, estas pueden repetirse.
El usuario final tiene la posibilidad de pegarFigurita en su álbum. Si un usuario final intenta pegar una figurita que ya había pegado previamente, el sistema debe arrojar la excepción “FiguritaRepetida”.
Por último, el sistema debe permitir el intercambio de figuritas entre distintos usuarios. Si por alguna razón, un usuario intenta intercambiar una figurita que no posee o que YA HABIA PEGADO, el sistema debe lanzar la excepción “FiguritaNoDisponible”.

### Testeos a desarrollar: 

queSePuedaCrearUnaFigurita();

queSePuedaCrearUnAdministrador();

queSePuedaCrearUnUsuarioFinal();

queUnAdministradorPuedaAgregarUnaFigurita();

queUnUsuarioFinalPuedaAgregarUnaFigurita();

queLasFiguritasAgregadasDeFormaDesordenadaQuedenOrdenadas();

queUnAdministradorNoPuedaAgregarUnaFiguritaExistente();

queUnUsuarioFinalSiPuedaAgregarFiguritasExistentes();

queUnUsuarioFinalPuedaPegarUnaFigurita();

queUnUsuarioFinalNoPuedaPegarUnaFiguritaRepetida();

queSePuedaRealizarElIntercambioDeFiguritasEntreDosUsuariosFinales();

queNoSePuedaIntercambiarUnaFiguritaDeUnUsuarioQueNoLaTenga();

queNoSePuedaIntercambiarUnaFiguritaDeUnUsuarioQueYaLaHayaPegado();

## License

MIT License

Copyright (c) [2023] [leandrojl]

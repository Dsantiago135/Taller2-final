# Taller2-final

Este Proyecto consta de 6 opciones en las cuales podras registar tanto libros como lectores, prestar libros, devolver libros, guardar los datos generados y ver las multas realizadas
puedes acceder a estas funciones desde

-http://localhost:4567/CargarDatos 

-http://localhost:4567/RegistrarCopia/28/Disponible

-http://localhost:4567/RegistrarLector/2463/Pedro/Hernandez/cr24n56

-http://localhost:4567/PrestarLibro/102/34

-http://localhost:4567/DevolverLibro/102/34

-http://localhost:4567/VerMultas


Para el registro de copias es necesario el numero identificador y su estado (disponible, no disponible).

Para el registro de lectores es necesario un numero de socio, su nombre, su apellido y su direccion.

Para el prestamo y devolucion de libros se necesita proporcionar 2 datos el numero de socio del lector y el numero de identificacion de la copia a prestar

La generacion de la multa se hace automaticamente tomando la hora del dispositivo 

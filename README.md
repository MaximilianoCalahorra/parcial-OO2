# Descripción del programa

Consiste en mi resolución del parcial de la materia de Orientación a Objetos II de la carrera de Sistemas de la UNLa.

Está desarrollado completamente en Java mediante el paradigma de la POO, aplicando conceptos tales como clases, atributos, métodos, polimorfismo, reutilización de código, manejo de excepciones y de fechas y horas, herencia y clases abstractas, y con aplicación y manejo de la persistencia mediante el uso de Hibernate.

### Diagrama de clases
![modelo](https://github.com/MaximilianoCalahorra/parcial-OO2/assets/152804837/f4d457e4-b403-46f1-bbf2-41a7039dba64)

### Casos de uso
- #1: + traer(String codigo): Producto
- #2: + agregar(Producto producto): int (Implementa excepción por producto existente)
- #3: + traer(String codigo): Lote
- #4: + traer(Producto producto): List\<Lote>
- #5: + traer(String ubicacion): Lote
- #6: + traer(LocalDate fechaDesde, LocalDate fechaHasta): List\<Stock> (Intervalo cerrado, se tienen en cuenta las fechas pasadas como parámetro)
- #7: + traer(LocalDate fechaDesde, LocalDate fechaHasta, String cliente): List\<Stock> (Intervalo cerrado, se tienen en cuenta las fechas pasadas como parámetro)

### Test
- #1: Agregar e imprimir el producto:
  - Producto [idProducto=6, codigo=6, nombre=placa de video, precio=500000.0]

- #2: Intentar agregar el siguiente producto:
  - código = "6",
  - nombre = "audífonos",
  - precio = 500

- #3: Traer el Lote con código = "2" e imprimirlo con su información completa.
- #4: Traer los Lotes del producto con código = "2". Imprimir cada Lote con  su producto asociado.
- #5: Traer e imprimir los Stocks con ubicación = "Banfield" con su información completa (su producto y su lote).
- #6: Traer e imprimir los Stocks entre las fechas 17-05-2024 y 21-05-2024 con su información completa.
- #7: Traer e imprimir los Stocks entre las fechas 17-05-2024 y 21-05-2024 y cliente = "Pablo" con su información completa.

*Gracias por interesarte en visitar este repositorio y leer acerca de él.*

**¡Saludos!**

**Maximiliano Calahorra.**

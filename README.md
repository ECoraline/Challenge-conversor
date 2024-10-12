<h1>Challenge Conversor de monedas en Java</h1>
<p>:speech_balloon: Este programa es una solucion al Challenge de alura Conversor de Monedas :speech_balloon:</p>
<p>Fueron necesarios conocimientos de programación entre los cuales estan: </p>

  - :smile_cat: Programación orientada a objetos
  - :smile_cat: Consumo de API
  - :smile_cat: Manejo de excepciones
  - :smile_cat: Ciclos
  - :smile_cat: Estructuras de datos

<p>Estatus del proyecto: Finalizado :black_nib:</p>

<h2>Funcionalidad</h2>
<p>El programa consulta las tasas de cambio de monedas desde una api que proporciona los valores actualizados en tiempoo real,posteriormente utiliza estos valores para realizar conversiones entre  diferentes monedas monedas y el Dólar estadounidense</p>
<p>Las opciones que da el programa al usuario son las siguientes:</p>

  - :smile_cat: 1) Dolar a Peso Argentino
  - :smile_cat: 2) Peso Argentino a dolar
  - :smile_cat: 3) Dolar a Peso Mexicano
  - :smile_cat: 4) Peso Mexicano a dolar
  - :smile_cat: 5) Dolar a Sol Peruano
  - :smile_cat: 6) Sol Peruano a Dolar
  - :smile_cat: 7) Dolar a Yen Japones
  - :smile_cat: 8) Yen Japones a Dolar
  - :smile_cat: 9) Salir del programa
    
<h2>Clases</h2>
<p>Esta conformado por una clase Main que ejecuta el programa, instancia los objetos y contiene el menu de opciones para el usuario.</p>
<p>una clase registro donde se almacena el json obtenido de la api ExchangeRate y una clase llamada Conversiones que recibe los valores en un Map para ejecutar los metodos de conversion</p>

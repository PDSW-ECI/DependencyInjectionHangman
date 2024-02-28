### Escuela Colombiana de Ingeniería

### Ciclo de Vida de Desarrollo de Software

### Desarrollo Dirigido por Pruebas + DIP + DI

El sistema actual de puntuación del juego comienza en 100 puntos y va
descontando 10 puntos cada vez que se propone una letra incorrecta.

Algunos usuarios han propuesto diferentes esquemas para realizar la
puntuación, los cuales se describen a continuación:

* OriginalScore:
    * Es el esquema actual, se inicia con 100 puntos.
    * No se bonifican las letras correctas.
    * Se penaliza con 10 puntos con cada letra incorrecta.
    * El puntaje minimo es 0.

 ![image](https://github.com/Knight072/DependencyInjectionHangman/assets/116401447/c5e5545b-4cb3-494f-beda-375a2fb82247)


* BonusScore:
    * El juego inicia en 0 puntos.
    * Se bonifica con 10 puntos cada letra correcta.
    * Se penaliza con 5 puntos cada letra incorrecta.
    * El puntaje mínimo es 0
 
   ![image](https://github.com/Knight072/DependencyInjectionHangman/assets/116401447/594577d2-6bb4-4e7a-b519-24178e03b57a)


* PowerBonusScore:
    * El juego inicia en 0 puntos.
    * La $i-ésima$ letra correcta se bonifica con $5^i$.
    * Se penaliza con 8 puntos cada letra incorrecta.
    * El puntaje mínimo es 0
    * Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es
        500.

  ![image](https://github.com/Knight072/DependencyInjectionHangman/assets/116401447/c65fdd78-3d07-44bc-ab59-835b53e403ad)

### Parte I

1. Haga un fork del proyecto (no lo descargue directamente!).

   ![image](https://github.com/Knight072/DependencyInjectionHangman/assets/116401447/920d4dbb-2a91-45fd-b4b4-f0a270cc64e2)


2. A partir del código existente, implemente sólo los cascarones del
   modelo antes indicado.

4. Haga la especificación de los métodos calculateScore (de las tres
   variantes de GameScore), a partir de las especificaciones
   generales dadas anteriormente. Recuerde tener en cuenta: @pre,
   @pos, @param, @throws.

5. Haga commit de lo realizado hasta ahora. Desde la terminal:

    ```sh		
    git add .			
    git commit -m "especificación métodos"
    ```
   
   ![image](https://github.com/Knight072/DependencyInjectionHangman/assets/116401447/0382f902-0645-48bd-907e-25f32c352681)

    

6. Actualice el archivo `pom.xml` e incluya las dependencias para la ultima versión de JUnit.

![image](https://github.com/Knight072/DependencyInjectionHangman/assets/116401447/1d874d1e-f054-4a9a-b9c0-f501f15e0e85)


7. Para cada clase de equivalencia y condición de frontera, implemente
   una prueba utilizando JUnit.

![image](https://github.com/Knight072/DependencyInjectionHangman/assets/116401447/0aa0fe64-d8f1-4682-a07d-75d74bb11063)

![image](https://github.com/Knight072/DependencyInjectionHangman/assets/116401447/a173b6d6-7ef0-439c-8152-8dd791d0b83e)

![image](https://github.com/Knight072/DependencyInjectionHangman/assets/116401447/9fbc8015-5b58-4f8f-bd3b-b8056e3e0893)

![image](https://github.com/Knight072/DependencyInjectionHangman/assets/116401447/eccba811-ee60-4067-9376-f006255a7aa7)


### Parte II

1. Utilizando el HangmanFactoryMethod (MétodoFabrica) incluya el
   OriginalScore a la configuración.
   En la siguiente imagen se muestra dentro de la clase HangmanDefaultFactoryMethod que esta configurado con originalScore como el modo de juego actual.
   
![image](https://github.com/Knight072/DependencyInjectionHangman/assets/116401447/c0741799-e887-4fe6-a56c-c5a11cf3dc21)

   Se puede ver que al momento de correr el juego este inicia el juego en 100 y después de haber fallado una vez queda el puntaje en 90
   
   ![image](https://github.com/Knight072/DependencyInjectionHangman/assets/116401447/196fef5b-21e3-424e-b82b-b0c428a50149)
   
   Ahora vamos a configurar el juego como bonusScore
   
![image](https://github.com/Knight072/DependencyInjectionHangman/assets/116401447/f4d43f20-53a7-486a-a125-db9e9ce5345f)

   Después de jugar un rato vemos que el puntaje se redujo 5 puntos por cada palabra incorrecta e incremento 10 por cada acierto.
   
   ![image](https://github.com/Knight072/DependencyInjectionHangman/assets/116401447/18fc6ebc-a023-4bef-91bf-da1cce07039d)



### Escuela Colombiana de Ingeniería

### Ciclo de Vida de Desarrollo de Software

### Desarrollo Dirigido por Pruebas + DIP + DI

Para este taller se va a trabajar sobre el juego del ahorcado.

El sistema actual de puntuación del juego comienza en 100 puntos y va
descontando 10 puntos cada vez que se propone una letra incorrecta.

Algunos usuarios han propuesto diferentes esquemas para realizar la
puntuación, los cuales se describen a continuación:

* OriginalScore:
    * Es el esquema actual, se inicia con 100 puntos.
    * No se bonifican las letras correctas.
    * Se penaliza con 10 puntos con cada letra incorrecta.
    * El puntaje minimo es 0.

* BonusScore:
    * El juego inicia en 0 puntos.
    * Se bonifica con 10 puntos cada letra correcta.
    * Se penaliza con 5 puntos cada letra incorrecta.
    * El puntaje mínimo es 0

* PowerBonusScore:
    * El juego inicia en 0 puntos.
    * La $i-ésima$ letra correcta se bonifica con $5^i$.
    * Se penaliza con 8 puntos cada letra incorrecta.
    * El puntaje mínimo es 0
    * Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es
        500.

Lo anterior, se traduce en el siguiente modelo, donde se aplica el
principio de inversión de dependencias:

![imagen](img/model.png)

### Parte I

1. Haga un fork del proyecto (no lo descargue directamente!).

2. A partir del código existente, implemente sólo los cascarones del
   modelo antes indicado.

3. Haga la especificación de los métodos calculateScore (de las tres
   variantes de GameScore), a partir de las especificaciones
   generales dadas anteriormente. Recuerde tener en cuenta: @pre,
   @pos, @param, @throws.

4. Haga commit de lo realizado hasta ahora. Desde la terminal:

    ```sh		
    git add .			
    git commit -m "especificación métodos"
    ```

5. Actualice el archivo `pom.xml` e incluya las dependencias para la ultima versión de JUnit.

6. Teniendo en cuenta dichas especificaciones, en la clase donde se
   implementarán las pruebas (GameScoreTest), en los
   comentarios iniciales, especifique las clases de equivalencia para
   las tres variantes de GameScore, e identifique
   condiciones de frontera.

7. Para cada clase de equivalencia y condición de frontera, implemente
   una prueba utilizando JUnit.

8. Haga commit de lo realizado hasta ahora. Desde la terminal:

    ```sh		
    git add .			
    git commit -m "implementación pruebas"
    ```

9. Realice la implementación de los 'cascarones' realizados anteriormente.
   Asegúrese que todas las pruebas unitarias creadas en los puntos anteriores
   se ejecutan satisfactoriamente.

10. Al finalizar haga un nuevo commit:

    ```sh		
    git add .			
    git commit -m "implementación del modelo"
    ```

11. Para sincronizar el avance en el respositorio y NO PERDER el trabajo, use
    el comando de GIT para enviar los cambios:

    ```sh
    git push origin main
    ```

### Parte II

Actualmente se utiliza el patrón FactoryMethod
que desacopla la creación de los objetos para diseñar un juego
de ahorcado (revisar setup.factoryMethod, el
constructor de la clase GUI y HangmanFactoryMethod).

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



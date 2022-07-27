# HeapSort
Método de ordenamiento por Montículo, Utilizando algoritmo de  Árbol Binario con Recursividad.

El algoritmo empieza con un vector de N elementos que no cumple la condición de montículo.
Lo primero que hace el algoritmo es construir el montículo de partida. Para ello, considera el
montículo como una estructura recursiva. Se puede considerar que los nodos del montículo del último nivel del árbol son cada uno un sub montículo de 1 nodo. Subiendo un nivel en el árbol, cada nodo es la raíz de un árbol que cumple la condición del montículo, excepto, quizás, en la raíz (su rama izquierda y derecha cumplen la condición, ya que se está construyendo de abajo a arriba); entonces, al aplicar el método criba() (reconstruye el montículo hundiendo la raíz), se asegura que cumple la condición de ordenación y ya es submontículo. El algoritmo va subiendo de nivel en nivel, construyendo tantos sub montículos como nodos tiene el nivel, hasta llegar al primer nivel, en el que sólo hay un nodo, que es la raíz del montículo completo.

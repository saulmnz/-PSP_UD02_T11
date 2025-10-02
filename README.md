# 📋 TAREA 11 - DOMINÓ CON HILOS 📋


> ℹ️  Simulación del **efecto dominó** utilizando hilos en Java. Cada hilo simula una ficha que derriba a la siguiente, esperando a que toda la cadena termine antes de considerarse finalizada.



![GIF](https://i.pinimg.com/originals/5b/40/d7/5b40d7b8c626e62a663c3b0e719b0329.gif)

## DESCRIPCIÓN

### 🧩 3 NIVELES:
---

- **Nivel 1 :** Cadena fija de 5 hilos los cuales realizan 5 iteraciones con pausas aleatorias y esperan a que el siguiente hilo termine antes de finalizar.
---
- **Nivel 2 :** El programa **pregunta al usuario cuántas fichas quiere** ( siendo mínimo de fichas 1). Si la entrada no es válida, usa 5 por defecto.
---
- **Nivel 3 :** El hilo principal **mide el tiempo total ( en ms )** de la caída completa del programa y **vigila** al primer hilo, mostrando mensajes de estado mientras la cadena siga activa.
---


## 💻 CLASES ( TODAS LAS CLASES ESTÁN COMENTADAS PARA ENTENDER EL FUNCIONAMIENTO DE CADA BLOQUE DE CÓDIGO )
---
- `Domino.java`: Clase principal. Gestiona la entrada del usuario, crea la cadena de hilos y realiza la monitorización.
- `Fichita.java`: Clase que representa las "fichas del dominó". Extiende Thread y define el comportamiento de cada hilo.
---

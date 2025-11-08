# Análisis Orientado a Objetos - SoundPro Estudio de Grabación

## 1. Identificación del Dominio

**Nombre del negocio:** SoundPro
**Tipo:** Estudio de Grabación Profesional
**Descripción:** SoundPro es un estudio ubicado en Bogotá especializado en grabación musical, mezcla, masterización y producción de podcasts. Ofrece sus servicios a artistas y empresas, realizando aproximadamente 60 sesiones mensuales con equipos de alta gama y 4 ingenieros.

---

## 2. Objetos Identificados

### Objeto Principal: SesionGrabacion

**¿Qué es?:** Es la transacción central o el servicio principal que vende el estudio. Representa el evento de tiempo y recursos reservado por un cliente.

**Atributos identificados:**
- **codigoReserva:** String - Identificador único para el seguimiento de la sesión.
- **nombreArtista:** String - Nombre del cliente o banda que contrata la sesión.
- **tipoServicio:** String - Define el tipo de servicio (Grabación, Masterización, Podcast).
- **duracionHoras:** int - Duración total programada de la sesión en horas.
- **costoBase:** double - Tarifa monetaria establecida por hora.
- **cabinaAsignada:** boolean - Indica si la sesión ya tiene un espacio físico reservado.

**Métodos identificados:**
- **SesionGrabacion(...):** Constructor para inicializar una nueva reserva con datos clave.
- **imprimirResumen():** Método `void` que muestra un resumen de los detalles de la reserva.
- **calcularCostoTotal():** Método que retorna un `double` para calcular el valor total a facturar (horas * costo base).
- **getCodigoReserva():** Método `getter` para obtener el identificador de la reserva.
- **setCabinaAsignada(boolean):** Método `setter` para actualizar el estado de asignación de la cabina.

### Objeto Secundario: CabinaGrabacion

**¿Qué es?:** Es el recurso físico (espacio insonorizado) y la infraestructura del estudio necesaria para que la sesión de grabación se pueda llevar a cabo.

**Atributos identificados:**
- **nombreCabina:** String - Nombre descriptivo para la cabina (ej: "Cabina A").
- **capacidadPersonas:** int - Número máximo de personas que caben en el espacio.
- **equipoPrincipal:** String - Describe el equipo técnico más relevante de esa cabina.
- **estaDisponible:** boolean - Indica si el recurso está libre (`true`) u ocupado (`false`).

**Métodos identificados:**
- **CabinaGrabacion(...):** Constructor para inicializar una nueva cabina con sus especificaciones.
- **mostrarEstado():** Método `void` que imprime la información de la cabina y su estado de disponibilidad.
- **cambiarDisponibilidad(boolean):** Método `setter` para actualizar si la cabina pasa a estar libre u ocupada.
- **getNombre():** Método `getter` para obtener el nombre de la cabina.

---

## 3. Relación entre Objetos

**Tipo de relación:** Asociación (Dependencia Funcional).

**Descripción:** En el contexto de SoundPro, existe una relación de **Asociación** simple. Una **`SesionGrabacion`** debe ser asignada a una **`CabinaGrabacion`** para poder ejecutarse. La `SesionGrabacion` (el servicio) depende de la disponibilidad de una `CabinaGrabacion` (el recurso) para ser confirmada, estableciendo un vínculo conceptual en la operación del estudio.

---

## 4. Justificación del Diseño

**¿Por qué elegí estos objetos?**
Elegí **`SesionGrabacion`** como el flujo de valor principal del negocio y **`CabinaGrabacion`** como el recurso físico más crítico, modelando así los dos elementos esenciales para la gestión de las 60 sesiones mensuales de SoundPro.

**¿Por qué estos atributos son importantes?**
Los atributos capturan la información esencial para la operación y facturación: la **identificación** (`codigoReserva`), los datos de **facturación** (`duracionHoras`, `costoBase`) y el **estado logístico** (`cabinaAsignada`, `estaDisponible`) que es crucial para la gestión de horarios.

**¿Por qué estos métodos son necesarios?**
Los métodos representan la lógica de negocio y la interacción:
- **`calcularCostoTotal()`:** Es la función de facturación central.
- **`mostrarEstado()`/`imprimirResumen()`:** Son necesarios para la interacción con el usuario y el monitoreo.
- **`setters` (e.g., `cambiarDisponibilidad`):** Permiten que el sistema interactúe y cambie el estado de los objetos, reflejando acciones del mundo real (ej: una cabina es reservada o liberada).

---

## 5. Comparación: POO vs Programación Estructurada

### Sin POO (Programación Estructurada):

La programación estructurada se enfoca en dividir el programa en una serie de **funciones** o **procedimientos** que manipulan **datos globales**.

* **¿Cómo resolverías el mismo problema sin clases?**
    Se usarían variables sueltas para representar los datos de la sesión y la cabina (`sesion_1_artista`, `cabina_a_disponible`, `sesion_1_horas`), y luego se crearían funciones (como `calcular_costo`) que recibirían esos datos como parámetros. La lógica y los datos estarían separados.
    * **Inconveniente:** Si el negocio escala a 60 sesiones o más, es fácil que una función modifique por error los datos de otra sesión, pues no hay un "dueño" claro de la información.

### Con POO (Programación Orientada a Objetos):

La POO agrupa los datos (atributos) y las funciones que operan sobre esos datos (métodos) en una estructura llamada **Clase**.

* **¿Cómo se resuelve con clases?**
    Se crean **objetos** (`sesionPop`, `cabinaA`). Cada objeto es una unidad autosuficiente que contiene sus propios datos y su propia lógica. Para saber el costo, le preguntas al objeto: `sesionPop.calcularCostoTotal()`. Esto es más intuitivo y seguro.

### Ventajas específicas en mi dominio (SoundPro):

1.  **Modelado Realista:** Cada objeto de la realidad (una sesión, una cabina) se modela de forma independiente, lo que hace que el código sea intuitivo y fácil de relacionar con la operación diaria del estudio.
2.  **Encapsulamiento de Lógica (Seguridad):** La lógica de cálculo de costos (`calcularCostoTotal`) reside dentro del objeto `SesionGrabacion`. Esto garantiza que la facturación siempre se realice de la misma manera y que los datos internos (`costoBase`, `duracionHoras`) estén protegidos de modificaciones externas e indeseadas.
3.  **Reutilización y Escalabilidad:** Si SoundPro crece o abre una segunda sucursal, la misma plantilla de `CabinaGrabacion` puede ser reutilizada para crear nuevas cabinas sin reescribir la lógica de reserva o visualización, facilitando la gestión de un mayor volumen de sesiones.

---

## 6. Diagrama de Clases (Opcional)

┌─────────────────────────┐ ┌─────────────────────────┐ │ SesionGrabacion │ │ CabinaGrabacion │ ├─────────────────────────┤ ├─────────────────────────┤ │ + codigoReserva: String │ │ + nombreCabina: String │ │ + nombreArtista: String │ │ + capacidadPersonas: int│ │ + duracionHoras: int │ │ + equipoPrincipal: String │ │ + costoBase: double │ │ + estaDisponible: boolean │ │ + cabinaAsignada: boolean │ ├─────────────────────────┤ ├─────────────────────────┤ │ + CabinaGrabacion(...) │ │ + SesionGrabacion(...) │ │ + mostrarEstado(): void │ │ + imprimirResumen(): void │ │ + cambiarDisponibilidad(boolean): void │ │ + calcularCostoTotal(): double │ │ + getNombre(): String │ │ + getCodigoReserva(): String │ └─────────────────────────┘ │ + setCabinaAsignada(bool): void │ └─────────────────────────┘
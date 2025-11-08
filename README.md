# 🚀 Semana 01: Introducción a la Programación Orientada a Objetos (POO)

Este directorio contiene la solución a los ejercicios de la Semana 01, enfocados en aplicar los conceptos fundamentales de la Programación Orientada a Objetos (Clase, Objeto, Atributo, Método) al dominio de un Estudio de Grabación.

## Dominio Asignado
* **Nombre del Estudio:** SoundPro
* **Especialidad:** Grabación musical, mezcla, masterización y producción de podcasts.

## Contenido de la Carpeta

| Archivo | Clase Contenida | Propósito y Rol en POO |
| :--- | :--- | :--- |
| **`SesionGrabacion.java`** | `SesionGrabacion` | Clase Principal (Objeto Principal del negocio). |
| **`CabinaGrabacion.java`** | `CabinaGrabacion` | Clase Secundaria (Objeto de recurso clave). |
| **`Main.java`** | `Main` | Programa de Demostración que instancia y utiliza las clases anteriores. |
| **`ANALISIS.md`** | N/A | Documento que justifica el diseño POO y realiza la comparación con la Programación Estructurada. |

## Instrucciones para Ejecutar

Para correr la prueba del dominio y demostrar la funcionalidad de los objetos, sigue estos pasos en tu terminal (dentro de la carpeta `Semana-01`):

```bash
# 1. Compilar todos los archivos Java
javac SesionGrabacion.java CabinaGrabacion.java Main.java

# 2. Ejecutar la clase principal (la que contiene el método main)
java Main

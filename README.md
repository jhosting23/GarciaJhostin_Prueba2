# 🧬 BIOTECH-2K25: Sistema de Análisis Evolutivo y Mutación

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Platform](https://img.shields.io/badge/Platform-Windows-0078D6?style=for-the-badge&logo=windows&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)

## Descripción

**BIOTECH-2K25** es un sistema de simulación biológica desarrollado en Java que modela la evolución animal mediante un **Árbol Filogenético** basado en tiempo geológico y permite la generación de especímenes mutantes a través de un módulo de IA. El proyecto hace uso intensivo de conceptos de Programación Orientada a Objetos (POO) — herencia, polimorfismo, sobrecarga y abstracción — para representar la jerarquía taxonómica de vertebrados.

## Funcionalidades principales

- Árbol filogenético dinámico: visualización jerárquica automática desde Gnathostomata hasta la especie actual.
- Gestión de especímenes: creación y manejo de animales (ej.: cocodrilos) con atributos (nombre, edad, color).
- Módulo de mutación:
  - Interacción entre Biólogo (solicitante) e IA (ejecutora).
  - Simulación de radiación (mSv) para generar especies mutadas.
  - Generación de clases mutadas (por ejemplo, `CocodriloGarcia`) con comportamiento diferenciado.
- Interfaz de consola interactiva con animaciones de carga, fichas técnicas y feedback visual del proceso de mutación.

## Estructura del proyecto

El código está organizado en paquetes con prefijo personalizado (`jg`):

```text
src/
├── jgCocodrilo_pk/           # Lógica del animal
│   ├── Amiota.java           # Clase base de vertebrados terrestres
│   ├── Cocodrilo.java        # Especie base
│   └── CocodriloGarcia.java  # Especie mutada
├── jgFanerozoico/            # Jerarquía evolutiva (Clases abstractas)
│   ├── Gnathostomata.java
│   ├── Osteichthyes.java
│   ├── Sarcopterygii.java
│   └── Tetrapoda.java
├── jgMutacion/               # Actores y lógica de mutación
│   ├── Persona.java
│   ├── Biologo.java
│   ├── IA.java
│   └── TanqueMutacion.java
├── jgControlador.java        # Clase principal (Main) y orquestador
└── App.java                  # Entry point alternativo
```

## Tecnologías y conceptos

- Lenguaje: Java (JDK 17+)
- Paradigma: Programación Orientada a Objetos (POO)
- Patrones aplicados:
  - Herencia multinivel (árbol filogenético)
  - Polimorfismo (comportamientos diferenciados entre especies)
  - Sobrecarga de métodos

## Instalación y ejecución

Requisitos:
- JDK 17+
- IDE recomendado: Visual Studio Code, IntelliJ IDEA o similar

Desde terminal:

```bash
# Situarse en la carpeta del proyecto
cd path/to/GarciaJhostin_Prueba2/src

# Compilar (ejemplo)
javac jgControlador.java

# Ejecutar
java jgControlador
```

También puede abrir el proyecto en su IDE y ejecutar la clase `jgControlador` (o `App`) como entry point.

## Autor y metadatos

- Autor: Jhostin García  
- Asignatura: Programación II  
- Repositorio: https://github.com/jhosting23/GarciaJhostin_Prueba2  
- Fecha: Noviembre 2025

---

Gracias por revisar BIOTECH-2K25 — para dudas o mejoras, abrir un issue en el repositorio o contactar al autor.

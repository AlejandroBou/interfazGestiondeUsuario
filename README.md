# ☕ Evolución de Interfaces de Usuario en Java Swing

Este repositorio contiene tres versiones de una aplicación de escritorio desarrollada con Java Swing, mostrando la progresión desde un diseño simple y lineal hasta una interfaz compleja y funcional con múltiples componentes y pestañas.

Cada archivo Java representa una fase de la evolución en el diseño de interfaces de usuario.

---

## Fases del Proyecto

### 1. Interfaz 1 (`InicioSesion.java`)

La versión más básica y fundamental del formulario de inicio de sesión.

* **Diseño:** Utiliza un `GridLayout` simple que distribuye los componentes en una cuadrícula fija, resultando en un diseño rígido y lineal.
* **Componentes Clave:** `JFrame`, `JLabel`, `JTextField`, `JPasswordField`, `JCheckBox` y `JButton`.

### 2. Interfaz 2 (`Interfaz2.java`)

Introduce una mejora significativa en la organización al utilizar **paneles** (`JPanel`).

* **Diseño:** Utiliza un `BorderLayout` para el panel principal y un `GridLayout` para el centro, permitiendo dividir la interfaz en áreas lógicas (superior, central, inferior).
* **Componentes Adicionales:** Se añaden `JRadioButton` (para opciones como "Recordar usuario") y `JComboBox` (para selección de idioma).

### 3. Interfaz 3 (`Interfaz3.java`)

La versión más avanzada y funcional, con una estructura modular y elementos dinámicos.

* **Funcionalidad Destacada:** Implementa **`JTabbedPane`** para agrupar las vistas de "Login" y "Registro" en una sola ventana.
* **Componentes Avanzados:**
    * `JProgressBar`: Indica el estado de una tarea (como una simulación de carga).
    * `JSpinner`: Permite la selección controlada de valores numéricos (ej. edad).
* **Estructura del Código:** El código se modulariza en métodos (`createLoginPanel`, `createRegistrationPanel`), facilitando la lectura y el mantenimiento.

---

## 🚀 Cómo Ejecutar el Proyecto

Para compilar y ejecutar las interfaces:

1.  Clona el repositorio en tu máquina local.
2.  Abre el proyecto en **IntelliJ IDEA** (o tu IDE de Java preferido).
3.  Ejecuta el método `main` de la clase que desees probar: `InicioSesion.java`, `Interfaz2.java`, o `Interfaz3.java`.

---

## 🛠️ Sobre el Repositorio

Este proyecto fue subido usando la herramienta de control de versiones **Git** integrada en IntelliJ IDEA.

* **Autor:** AlejandroBOu

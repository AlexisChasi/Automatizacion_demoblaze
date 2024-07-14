# REPOSITORIO DE LA AUTOMATIZACION UTILIZANDO SCREEN PLAY

realice la automatizacion de las 2 maneras que nos enseñaron adjunto el repositorio de DemoBlaze en SCREENPLAY

https://github.com/AlexisChasi/screenplay_DemoBlaze.git

# NTTDATA EJERCICIO AUTOMATIZACION
Este proyecto contiene automatización de pruebas utilizando Selenium WebDriver y Cucumber  NTT DATA.

# Prerequisitos
Asegúrate de tener las siguientes herramientas y versiones instaladas en tu máquina local:


# Maquina local con el sistema operativo Windows 10
* IDE IntelliJ IDEA versión 2023.1 o superior
* Apache Maven versión 3.9.8 (debe estar configurado en la variable de entorno PATH)
* JDK versión 11.0.20 (debe estar configurado en la variable de entorno JAVA_HOME)
  
# Comandos de instalación
* Para configurar tu entorno de desarrollo, sigue estos pasos
  
1- Clonar el repositorio:
  
- git clone https://github.com/AlexisChasi/NTTDATA.git
- descargar el cromedriver y colocarlo en la ruta especificada y de la arquitectura del ordenador en este caso de 64bits

  ![image](https://github.com/user-attachments/assets/0474d1fb-c7b0-4086-b74a-b8be24f13ed9)
  
  https://googlechromelabs.github.io/chrome-for-testing/

  ![image](https://github.com/user-attachments/assets/c29ec796-afbf-4f4a-a31e-9e3d2549be68)



2- Compilar el proyecto:
- una vez clonado el repositorio ejecutar  mvn install -DskipTests (descarga todas las dependencias del POM)
- o dar click en la parte derecha  en MAVEN y Reload all maven projects
![image](https://github.com/user-attachments/assets/dd63cca2-9825-40ac-ac64-5467f8f57120)

# Instrucciones para ejecutar los test
Para ejecutar las pruebas automatizadas, sigue estos pasos:

- Abre el proyecto en IntelliJ IDEA.
- Configura el entorno de ejecución para ejecutar los tests de Cucumber.
- Ejecuta los tests desde IntelliJ IDEA o utilizando Maven:
- O dirigete al archivo RunnerTest
# src/test/java/com/nttdata/runner/RunnerTest.java
 
  ![image](https://github.com/user-attachments/assets/6fac4eaf-03bd-4045-8d4a-14e3a24e0b64)
- click en Public class RunnerTest y Run 'Runner Test' debe estar especificado en el tag

  - tags = "@DemoBlaze"

    ![image](https://github.com/user-attachments/assets/0738c8b3-9984-423e-b1c6-ced8dfee94e2)

# REPORTE

el reporte se genera en una carpeta especifica al momento de ejecutar el test

- target/cucumber/cucumber-report.html
- y se genera con las evidencias por cada paso del gherking
  
  ![image](https://github.com/user-attachments/assets/ac69c100-79db-4f0f-8316-dd83239cddd4)
  
  ![image](https://github.com/user-attachments/assets/5b095503-36a3-4cd4-b40e-6fa8564f8c56)


  
# Información adicional

Este proyecto utiliza Selenium WebDriver para interactuar con el navegador y Cucumber para escribir y ejecutar escenarios de prueba en lenguaje natural. Asegúrate de tener conexión a Internet durante la ejecución de los tests para cargar recursos externos necesarios.

# Ejecucion de la prueba

![image](https://github.com/user-attachments/assets/56790f6a-f67b-4f42-ac75-379d711a5373)






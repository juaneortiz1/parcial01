## Laboratorio No. 3 

  

   

Presentado por:   

# Juan Esteban Ortiz Pastrana 



   
 
Escuela Colombiana de Ingeniería Julio Garavito   

Grupo 1   


ingresar a la pagina del repositorio de maven, elegir el Jnunit elegir la actulización 4.13.2


Copiar el código de la pestaña maven y pegar el encabezado de “propiedades” con el fin de cambiar la versión del compilador a la version 8 java

<!-- https://mvnrepository.com/artifact/junit/junit -->
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
<properties>
<maven.compiler.target>1.8</maven.compiler.target>
<maven.compiler.source>1.8</maven.compiler.source>
</properties>

![image](https://github.com/juaneortiz1/Lab03CVDS/assets/97971732/39e101b4-5145-497a-bca6-dec4a2fb8a27)

![image](https://github.com/juaneortiz1/Lab03CVDS/assets/97971732/24042652-6adc-474a-a950-aa92ea70d22f)

![image](https://github.com/juaneortiz1/Lab03CVDS/assets/97971732/4e0198b5-5046-4ef0-87bb-7c2245e7d215)



# Aerolínea - Sistema de Cálculo de Tarifas

Este proyecto implementa un sistema de cálculo de tarifas para una aerolínea. El sistema determina el costo del boleto de avión en función de la tarifa base, la anticipación con la que se compra el boleto y la edad del pasajero, aplicando diferentes descuentos según ciertas condiciones.

## Desarrollo Guiado por Pruebas (TDD)

Este proyecto sigue el enfoque de Desarrollo Guiado por Pruebas (TDD), donde se escriben pruebas unitarias antes de implementar el código funcional. El proceso típico de TDD se basa en los siguientes pasos:

1. **Red:** Se escribe una prueba unitaria que describe el comportamiento esperado del código.
2. **Green:** Se implementa la funcionalidad mínima necesaria para que la prueba pase.
3. **Refactor:** Se refactoriza el código para mejorar su diseño y legibilidad, manteniendo las pruebas pasadas.

El uso de TDD nos permite asegurar que el código implementado cumpla con los requisitos especificados y que se mantenga correctamente a lo largo del tiempo, facilitando la detección temprana de errores y la incorporación de nuevas funcionalidades de manera segura.

## Estructura del Proyecto

El proyecto está organizado en los siguientes paquetes y clases:

mvn archetype:generate -DgroupId=edu.eci.cvds -DartifactId=ClasesEquivalencia -Dpackage=edu.eci.cvds.tdd -DarchetypeArtifactId=maven-archetype-quickstart
![image](https://github.com/juaneortiz1/Lab03CVDS/assets/97971732/86c1dbc8-1c29-4c81-ba57-5cc68f3bbba2)

Compilar y ejecutar: Utiliza los comandos necesarios de Maven para compilar el proyecto y verificar que se creó correctamente, así como para ejecutar las pruebas unitarias.

- `eci.edu.cvds.tdd.aerodescuentos.Tarifa`: Clase principal que contiene la lógica de cálculo de tarifas.
  ![image](https://github.com/juaneortiz1/Lab03CVDS/assets/97971732/447f0c7f-3961-414a-a1fd-035f2cda7ded)

- `eci.edu.cvds.tdd.aerodescuentos.CalculadorDescuentos`: Clase auxiliar que proporciona métodos para calcular descuentos.
  ![image](https://github.com/juaneortiz1/Lab03CVDS/assets/97971732/5f1bc72a-1699-44a5-a69e-61121c5eb628)

- `eci.edu.cvds.tdd.aerodescuentos.ExcepcionParametrosInvalidos`: Clase de excepción que se lanza cuando se ingresan parámetros inválidos.
  
  ![image](https://github.com/juaneortiz1/Lab03CVDS/assets/97971732/1abcc509-b66f-47c3-82dd-49921e887012)
  ![image](https://github.com/juaneortiz1/Lab03CVDS/assets/97971732/479701ae-02cf-429c-a447-b73b360eabb1)



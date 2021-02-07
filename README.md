<h1 align="center">CDCT 👨🏻‍💻 </h1>

<p align="center">
  <a href="/docs" target="_blank">
    <img alt="Documentation" src="https://img.shields.io/badge/documentation-yes-brightgreen.svg" />
  </a>
  <a href="#" target="_blank">
    <img alt="License: MIT" src="https://img.shields.io/badge/License-MIT-yellow.svg" />
  </a>
</p>

Proyecto para aplicar Consumer Driven Contract Testing.

## Authors
👤 **JuanCBM**: Juan Carlos Blázquez Muñoz
* Github: [@JuanCBM](https://github.com/JuanCBM)

👤 **mahuerta**: Miguel Ángel Huerta Rodríguez
* Github: [@mahuerta](https://github.com/mahuerta)

# CDCT: Consumer Driven Contract Testing
## Ejecución de la práctica
* Sobre el proyecto topoService (Proveedor):
> mvn clean install
* Sobre el proyecto planner (Cliente):
> mvn clean test


<h1 align="center">Artillery 👨🏻‍💻 </h1>
Proyecto para realizar pruebas de carga con Artillery.

# Artillery
## Ejecución de la práctica
- Primero tenemos que tener lanzada la aplicación Artillery_enunciado
- Instalamos artillery:
>  npm install -g artillery
- Es necesario instalar el plugin para expectations & assertions
> npm install -g artillery-plugin-expect
- Para ejecutar la práctica, ejecutaremos el comando:
> artillery run --environment local --output output.json solucion.yml 
- Con este comando te abre un explorador y te renderiza un informe:
> artillery report output.json 

## Apuntes teóricos
* ### En el proveedor: (Toposervice / Book)
> mvn clean install

ó

> mvn clean test
- mvn test:
    - Compila aplicación
    - Genera los test en base al contrato (target/generated-test-sources/contracts/ContractVerifierTest)
    - Compila y ejecuta los test y la clase base
    - Ejecuta los test
- mvn install:
    - Instala el certificado en el respositorio maven local para poder ser usado por el cliente
      > C:\Users\Juan Carlos\.m2\repository\jcblazquez2020-mahuerta\toposervice\0.0.1-SNAPSHOT

* ### En el consumidor: (Planner / Store)

- mvn test en el consumidor:
    - Compila la aplicación
    - Descarga el stub del repositorio maven local
      > C:\Users\Juan Carlos\.m2\repository\jcblazquez2020-mahuerta\toposervice\0.0.1-SNAPSHOT
    - Compila los test con el stub
    - Ejecuta los test
    
* ### Artillery
- Se pueden utilizar los environments para realizar pruebas de aceptación


### Pruebas de aceptación
- Lenguaje Gherkin para diseñar las pruebas de aceptación
- Cucumber te hace el código pegamento
- Karate evita tener que escribir el código pegamento, para pruebas de API rest
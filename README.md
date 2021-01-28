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

# CDCT_Artillery
C:\Users\Juan Carlos\.m2\repository\jc_blazquez_2020-ma_huerta\jc_blazquez_2020-ma_huerta\0.0.1-SNAPSHOT

* Sobre topoService (Proveedor):
> mvn clean install
> 

- 
- test de aceptación
- test de consumidor

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
# CDCT_Artillery
C:\Users\Juan Carlos\.m2\repository\jc_blazquez_2020-ma_huerta\jc_blazquez_2020-ma_huerta\0.0.1-SNAPSHOT

Sobre topoService:
- Ejecutar un mvn clean install 

- 
- test de aceptación
- test de consumidor

- mvn clean install o mvn clean test en el proveedor: (TOPOSERVICE / BOOOK)
 - mvn test: compila, genera los test en base al contrato, compila y ejecuta los test
 - mvn install: instala el certificado en el respositorio maven local para poder ser usado por el cliente.
 - Se puede ver el test en: target/generated-test-sources/ContractVerifierTest
 
 
- mvn test en el consumidor:
  - Compila la aplicación
  - Descarga el stub del repositorio maven local.
  - Compila los test con el stub
  - Ejecuta los test
package es.codeurjc.mastercloudapps.topo.contracts;

import es.codeurjc.mastercloudapps.topo.controller.TopoController;
import es.codeurjc.mastercloudapps.topo.model.City;
import es.codeurjc.mastercloudapps.topo.service.TopoService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public abstract class BaseCDC {

    @Autowired
    TopoController topoController;

    @MockBean
    TopoService topoService;

    // Es necesario mockear el servicio, no podemos basarnos en los datos de inicialización
    @BeforeEach
    public void setup() {
        Mockito.when(this.topoService.getCity(Mockito.anyString()))
            .thenReturn(new City("Madrid", "Flat"));

        RestAssuredMockMvc.standaloneSetup(topoController);
    }
}
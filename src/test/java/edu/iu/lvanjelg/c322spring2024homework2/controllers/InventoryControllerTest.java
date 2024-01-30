package edu.iu.lvanjelg.c322spring2024homework2.controllers;

import edu.iu.lvanjelg.c322spring2024homework2.model.Guitar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryControllerTest {

    @Test
    void search() {
        Guitar g = new Guitar();
        g.setPrice(1600);
        g.setSerialNumber("130");
        InventoryController.addGuitar(g);
        Guitar s = new Guitar();
        s.setSerialNumber("130");
        assertEquals(g,InventoryController.search(s));
    }

    @Test
    void getGuitar() {
        Guitar g = new Guitar();
        g.setPrice(1600);
        g.setSerialNumber("130");
        InventoryController.addGuitar(g);
        assertTrue(InventoryController.getGuitar("130") != null);
    }

    @Test
    void addGuitar() {
        Guitar g = new Guitar();
        g.setPrice(1600);
        g.setSerialNumber("130");
        assertTrue(InventoryController.addGuitar(g));
        Guitar s = new Guitar();
        s.setPrice(1300);
        s.setBuilder("Fender");
        assertTrue(InventoryController.addGuitar(s));
    }

}

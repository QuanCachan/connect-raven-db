package controller;

import entity.Inventory;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.InventoryService;

@RestController
public class InventoryController {
    private InventoryService inventoryService;

    public Inventory getInventoryByName(@RequestParam(name = "name") String name) {
        return inventoryService.getInventoryByName(name);
    }
}

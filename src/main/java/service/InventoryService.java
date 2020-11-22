package service;

import entity.Inventory;

public interface InventoryService {

    Inventory getInventoryByName(String name);
}

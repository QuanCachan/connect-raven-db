package service.internal.dao;

import entity.Inventory;

public interface InventoryDao {
    /**
     * Get inventory by given name
     * @param name : Inventory name
     * @return Inventory with the same name
     */
    Inventory getInventoryByName(String name);

}

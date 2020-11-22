package service.internal;

import entity.Inventory;
import service.InventoryService;

public class InventoryServiceImpl implements InventoryService {
    private final InventoryDao inventoryDao;
    @Override
    public Inventory getInventoryByName(String name) {
        return inventoryDao.getInventoryByName(name);
    }
}

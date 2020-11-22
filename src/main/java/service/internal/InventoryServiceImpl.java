package service.internal;

import entity.Inventory;
import service.InventoryService;
import service.internal.dao.InventoryDao;

public class InventoryServiceImpl implements InventoryService {
    private final InventoryDao inventoryDao;

    public InventoryServiceImpl(InventoryDao inventoryDao) {
       this.inventoryDao = inventoryDao;
    }

    @Override
    public Inventory getInventoryByName(String name) {
        return inventoryDao.getInventoryByName(name);
    }
}

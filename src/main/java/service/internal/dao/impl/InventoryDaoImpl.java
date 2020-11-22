package service.internal.dao.impl;

import entity.Inventory;
import net.ravendb.client.documents.session.IDocumentSession;
import org.springframework.stereotype.Repository;
import service.internal.dao.InventoryDao;


import java.util.List;

@Repository
public class InventoryDaoImpl implements InventoryDao {


    @Override
    public Inventory getInventoryByName(String name) {

        try (IDocumentSession session = DocumentStoreHolder.getStore().openSession()) {
            List<Inventory> results = (List<Inventory>) session.query(Inventory.class)
                    .whereEquals("name",name)
                    .toList(); // send query
        }

        return null;
    }


}

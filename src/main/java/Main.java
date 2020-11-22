import entity.Inventory;
import entity.Zone;
import net.ravendb.client.documents.DocumentStore;
import net.ravendb.client.documents.session.IDocumentSession;

public class Main {
    public static void main(String[] args) {
        DocumentStore store = DocumentStoreHolder.getStore();
        try (IDocumentSession session = store.openSession()) {
            /*Inventory inventory = new Inventory();
            inventory.setName("Entrepote");

            session.store(inventory);                            // Assign an 'Id' and collection (Inventories)
            // and start tracking an entity

            Zone zone = new Zone();
            zone.setName("Storage");
            zone.setInventory(inventory.getId());

            session.store(zone);                             // Assign an 'Id' and collection (Zones)
            // and start tracking an entity

            session.saveChanges();                              // Send to the Server
            // one request processed in one transaction*/

            Zone loadedZone = session.load(Zone.class, "zones/1-A");
            System.out.println(loadedZone);
            System.out.println("Name: "+ loadedZone.getName()
                    +" , Inventory: " + loadedZone.getInventory());

            System.out.println("test");
        }
    }
}

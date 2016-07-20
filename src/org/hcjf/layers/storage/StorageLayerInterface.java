package org.hcjf.layers.storage;

import org.hcjf.layers.LayerInterface;
import org.hcjf.layers.query.Query;

import java.util.List;

/**
 * This kind of layers provides a interface with a storage
 * implementation.
 * @author javaito
 * @mail javaito@gmail.com
 */
public interface StorageLayerInterface extends LayerInterface {

    /**
     * Return a session with the storage implementation.
     * @return Storage implementation.
     */
    public StorageSession begin();

}

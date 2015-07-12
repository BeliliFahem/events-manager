package fahem.belili.eventmgr.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao <T, PK extends Serializable> {

    /** Persist the newInstance object into database */
    PK create(T newInstance);

    /** Retrieve an object that was previously persisted to the database using
     *   the indicated id as primary key
     */
    T read(PK id);

    /** Save changes made to a persistent object.  */
    T update(T transientObject);

    /** Remove an object from persistent storage in the database */
    void delete(T persistentObject);
    
    // other shared operations
    
    List<T> readAll();
    
    List<T> readByKeyWord(List<String> keyWords);
}

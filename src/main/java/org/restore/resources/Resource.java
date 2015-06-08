package org.restore.resources;

import org.restore.adapters.Adapter;
import org.restore.dto.Dto;
import org.restore.dto.Key;
import org.restore.queries.Response;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collection;

/**
 * @author ben
 * @version 1.0
 */
public abstract class Resource<KEY extends Key,DTO extends Dto<Key>> {

    private final Adapter adapter;

    public Resource(Adapter adapter) {
        this.adapter = adapter;
    }

    public Collection<DTO> getAll(){
        throw new NotImplementedException();
    }

    public DTO get(KEY key){
        throw new NotImplementedException();
    }

    public Response insert(DTO dto) {
        throw new NotImplementedException();
    }

    public Response insert(Collection<DTO> dto){
        throw new NotImplementedException();
    }

    public Response delete(KEY dto){
        throw new NotImplementedException();
    }

    public Response delete(Collection<DTO> dto){
        throw new NotImplementedException();
    }

    public Response delete(){
        throw new NotImplementedException();
    }

    public Response update(KEY key, DTO dto){
        throw new NotImplementedException();
    }

    public Response update(Collection<DTO> dto){
        throw new NotImplementedException();
    }

}

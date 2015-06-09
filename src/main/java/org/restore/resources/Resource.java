package org.restore.resources;

import org.restore.http.HttpClient;
import org.restore.dto.Dto;
import org.restore.dto.Key;
import org.restore.http.Response;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collection;

/**
 * @author ben
 * @version 1.0
 */
public abstract class Resource<KEY extends Key,DTO extends Dto<Key>> {

    private final HttpClient httpClient;

    public Resource(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public Collection<DTO> getAll(){
        return null;
    }

    public DTO get(KEY key){
        return null;
    }

    public Response insert(DTO dto) {
        return null;
    }

    public Response insert(Collection<DTO> dto){
        return null;
    }

    public Response delete(KEY dto){
        return null;
    }

    public Response delete(Collection<DTO> dto){
        return null;
    }

    public Response delete(){
        return null;
    }

    public Response update(KEY key, DTO dto){
        return null;
    }

    public Response update(Collection<DTO> dto){
        return null;
    }

}

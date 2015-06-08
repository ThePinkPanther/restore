package org.restore.resources;

import org.restore.adapters.Adapter;
import org.restore.dto.Dto;

/**
 * @author ben
 * @version 1.0
 */
public abstract class Resource<DTO extends Dto> {

    private final Adapter adapter;

    public Resource(Adapter adapter) {
        this.adapter = adapter;
    }



}

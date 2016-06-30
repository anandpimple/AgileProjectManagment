package com.objectmantra.apm.base.entity;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by dev on 29/06/16.
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    @Id
    @Column(name = "ID")
    @XStreamOmitField
    private Long id;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @XStreamOmitField
    private static final XStream xStream = new XStream();
    @XStreamOmitField
    private static final XStream xstreamJson = new XStream(new JsonHierarchicalStreamDriver());
    static{
        xStream.autodetectAnnotations(true);
        xstreamJson.autodetectAnnotations(true);
    }
    public String toXml(){
        return xStream.toXML(this);
    }
    public String toString(){
        return xstreamJson.toXML(this);
    }

}

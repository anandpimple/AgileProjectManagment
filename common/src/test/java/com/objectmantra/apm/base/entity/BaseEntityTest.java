package com.objectmantra.apm.base.entity;

import com.objectmantra.apm.entity.Project;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dev on 30/06/16.
 */
public class BaseEntityTest {
    @Test
    public void testToString() throws Exception {
        Project project = new Project();
        project.setId(1l);
        String json = new Project().toString();

        assertTrue("Id is not allowed as it should always be hidden",!json.contains("\"id\":"));
        assertTrue("Project is root element, hence required",json.contains("\"Project\":"));
        assertTrue("Created on is by default not null, hence required",json.contains("\"createdOn\":"));
        assertTrue("Modified on is by default not null, hence required",json.contains("\"modifiedOn\":"));
    }
    @Test
    public void  testToXml() throws Exception {
        Project project = new Project();
        project.setId(1l);
        String myXml = new Project().toXml();

        assertTrue("Id is not allowed as it should always be hidden",!myXml.contains("<id>"));
        assertTrue("Project is root element, hence required",myXml.contains("<Project>"));
        assertTrue("Created on is by default not null, hence required",myXml.contains("<createdOn>"));
        assertTrue("Modified on is by default not null, hence required",myXml.contains("<modifiedOn>"));
    }



}
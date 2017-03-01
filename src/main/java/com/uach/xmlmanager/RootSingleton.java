/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uach.xmlmanager;

import com.uach.GUI.PyJDom;
import java.sql.Connection;
import org.jdom.Document;
import org.jdom.Element;

/**
 *
 * @author edgar
 */
public class RootSingleton {

    PyJDom p = new PyJDom();
    static Document docXML = new Document();
    private static RootSingleton INSTANCE;
    private RootSingleton rs;

    private RootSingleton() {
        this.createRoot();
    }

    private void createRoot() {
        Element raiz = p.crearNodo("CatLibros");
        docXML.addContent(raiz);
    }

    public static RootSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new RootSingleton();
        }
        return INSTANCE;
    }

    public Connection getRoot() {
        return rs;
    }

}
Contact GitHub API Training Shop Blog About
© 2017 GitHub, Inc. Terms

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uach.xmlmanager;

import com.uach.GUI.JDom;
import java.sql.Connection;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 *
 * @author edgar
 */
public class RootSingleton {

    JDom p = new JDom();
    static Document docXML = new Document();
    private static RootSingleton INSTANCE;

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

    public static void main(String[] args) {
            
    }
}

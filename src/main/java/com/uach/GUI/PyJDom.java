/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uach.GUI;

/**
 *
 * @author edgar
 */
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PyJDom {

    static Document docXML = new Document();

    public Element crearNodo(String tagElemento, String contenido) {
        Element nodo = new Element(tagElemento);
        nodo.addContent(contenido);
        return nodo;
    }

    public Element crearNodo(String tagElemento) {
        Element nodo = new Element(tagElemento);
        return nodo;
    }

    private static String nombre;

    public static void main(String[] args) {
        PyJDom p = new PyJDom();
        Document docXML = new Document();
        Element raiz = p.crearNodo("CatLibros");
        docXML.addContent(raiz);

        Element nodoHijo = p.crearNodo("Libro");
        Element autor = p.crearNodo("Autor", "Oscar Rocha");
        nodoHijo.setAttribute("ISBN", "12345");
//        nodoHijo.addContent(p.crearNodo("Autor", "Oscar Rocha"));
        nodoHijo.addContent(autor);
        nodoHijo.addContent(p.crearNodo("Titulo", "Inteligencia de Negocios"));
        nodoHijo.addContent(p.crearNodo("Editorial", "McGraw-Hill"));
        nodoHijo.addContent(p.crearNodo("Precio", "120.00"));
        raiz.addContent(nodoHijo);

        nodoHijo = p.crearNodo("Libro");
        nodoHijo.setAttribute("ISBN", "56789");
        nodoHijo.addContent(p.crearNodo("Autor", "Julio Meza"));
        nodoHijo.addContent(p.crearNodo("Titulo", "Redes Sociales"));
        nodoHijo.addContent(p.crearNodo("Editorial", "McGraw-Hill"));
        nodoHijo.addContent(p.crearNodo("Precio", "220.00"));
        raiz.addContent(nodoHijo);

        nodoHijo = p.crearNodo("Libro");
        nodoHijo.setAttribute("ISBN", "54321");
        nodoHijo.addContent(p.crearNodo("Autor", "Mario Fuentes"));
        nodoHijo.addContent(p.crearNodo("Titulo", "Tecnologias Emergentes"));
        nodoHijo.addContent(p.crearNodo("Editorial", "Pearson"));
        nodoHijo.addContent(p.crearNodo("Precio", "320.00"));
        raiz.addContent(nodoHijo);

        nodoHijo = p.crearNodo("Libro");
        nodoHijo.setAttribute("ISBN", "13579");
        nodoHijo.addContent(p.crearNodo("Autor", "Ana Arteaga"));
        nodoHijo.addContent(p.crearNodo("Titulo", "Administracion de TI"));
        nodoHijo.addContent(p.crearNodo("Editorial", "Pearson"));
        nodoHijo.addContent(p.crearNodo("Precio", "260.00"));
        raiz.addContent(nodoHijo);

        Format format = Format.getPrettyFormat();
        XMLOutputter xmloutputter = new XMLOutputter(format);
        String docStr = xmloutputter.outputString(docXML);
        System.out.println(docStr);
        try {
            File f = new File("C:\\ApJava\\Libreria.xml");
            FileWriter fw = new FileWriter(f);
            xmloutputter.output(docXML, fw);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}

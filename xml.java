package llerxml;

import java.io.*;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class xml {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
    	String nombreArchivo;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Leer el archivo xml");
        System.out.println("2. Escribir en el archivo xml");
        System.out.print("Choose an option: ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
            	System.out.println("Introduca la ruta del archivo xml para leer-lo:");
            	nombreArchivo = sc.next();
            	leer(nombreArchivo);
            	break;
            case 2:
            	System.out.println("Introduca la ruta del archivo xml para escribir:");
            	nombreArchivo = sc.next();
                escribir(nombreArchivo);
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
        sc.close();
    }

    public static void leer(String nombreArchivo) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File(nombreArchivo));

            NodeList nodeList = document.getElementsByTagName("parametros");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    NodeList childNodes = element.getChildNodes();
                	System.out.println("Dentro del archivo xml proporcionado existe la siguiente informacion:");
                    for (int j = 0; j < childNodes.getLength(); j++) {
                        Node childNode = childNodes.item(j);
                        if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                        	
                            System.out.println("valores --> "+childNode.getTextContent());
                        }
                    }
                    System.out.println();
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            System.out.println(ex.getMessage());
        }
        menu(); 

    }

    public static void escribir(String nombreArchivo) {
        Scanner sc = new Scanner(System.in);
        String manel;
    	try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File(nombreArchivo));

            NodeList nodeList = document.getElementsByTagName("parametros");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    NodeList childNodes = element.getChildNodes();
                	System.out.println("Dentro del archivo xml proporcionado existe la siguiente informacion:");
                    for (int j = 0; j < childNodes.getLength(); j++) {
                        Node childNode = childNodes.item(j);
                        if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                        	manel = sc.next();
                            childNode.setTextContent(manel);
                            System.out.println("valores --> "+childNode.getTextContent());
                        }
                    }
                    System.out.println();
                }
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource source = new DOMSource(document);
                StreamResult result = new StreamResult(new File("parametros.xml"));

                transformer.transform(source, result);
                
            }
    	} catch(Exception e) {
    		  e.printStackTrace();
    		}
    	        menu(); 
    	    }
    
}

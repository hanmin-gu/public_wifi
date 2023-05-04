package com.example.public_wifi;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Paths;

public class xml_Parsor {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        File WIFI_INF = new File(Paths.get("").toAbsolutePath()+"src/main/resources/wifi_INF.xml");
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(WIFI_INF);

        System.out.println("파일 출력");

        document.getDocumentElement().normalize();
        NodeList nodes = document.getElementsByTagName("row");
        for(int i=0; i<nodes.getLength(); i++){
            Node node = nodes.item(i);
            if(node.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element) node;
                System.out.println();
            }
        }




    }
}

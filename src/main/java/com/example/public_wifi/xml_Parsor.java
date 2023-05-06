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
        try {
            File WIFI_INF = new File(Paths.get("").toAbsolutePath() + "/src/main/resources/wifi_INF.xml");
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(WIFI_INF);

            System.out.println("파일 출력");

            document.getDocumentElement().normalize();
            NodeList nodes = document.getElementsByTagName("row");
            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    //System.out.println("거리: " + getValue("X_SWIFI_MGR_NO", element));
                    System.out.println("관리번호: " + getValue("X_SWIFI_MGR_NO", element));
                    System.out.println("자치구: " + getValue("X_SWIFI_WRDOFC", element));
                    System.out.println("와이파이명: " + getValue("X_SWIFI_MAIN_NM", element));
                    System.out.println("도로명 주소: " + getValue("X_SWIFI_ADRES1", element));
                    System.out.println("상세주소: " + getValue("X_SWIFI_ADRES2", element));
                    System.out.println("설치위치(층): " + getValue("X_SWIFI_INSTL_FLOOR", element));
                    System.out.println("설치유형: " + getValue("X_SWIFI_INSTL_TY", element));
                    System.out.println("설치기관: " + getValue("X_SWIFI_INSTL_MBY", element));
                    System.out.println("서비스 구분: " + getValue("X_SWIFI_SVC_SE", element));
                    System.out.println("망종류: " + getValue("X_SWIFI_CMCWR", element));
                    System.out.println("설치년도: " + getValue("X_SWIFI_CNSTC_YEAR", element));
                    System.out.println("실내외구분: " + getValue("X_SWIFI_INOUT_DOOR", element));
                    System.out.println("WIFI접속환경: " + getValue("X_SWIFI_REMARS3", element));
                    System.out.println("x 좌표: " + getValue("LAT", element));
                    System.out.println("y 좌표: " + getValue("LNT", element));
                    System.out.println("작업일자: " + getValue("WORK_DTTM", element));
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }




    }
    private static String getValue(String tag, Element element) {
        NodeList nodes = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodes.item(0);
        if(node == null) return "";
        return node.getNodeValue();
    }
}

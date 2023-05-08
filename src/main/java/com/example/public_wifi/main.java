package com.example.public_wifi;

import com.example.public_wifi.Domain.wifiInf;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        ApiExplorer apiExplorer = new ApiExplorer();
        apiExplorer.createXml();
        wifiInf wifi = new wifiInf();
        wifi.setWifiInf();
    }
}

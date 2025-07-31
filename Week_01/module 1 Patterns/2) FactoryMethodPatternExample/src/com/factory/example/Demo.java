package com.factory.example;

import com.factory.example.documents.Document;
import com.factory.example.factories.*;

public class Demo {
    public static void main(String[] args) {

        DocumentFactory factory;

        factory = new WordDocumentFactory();
        Document word = factory.createDocument();
        word.open(); word.save();

        factory = new PdfDocumentFactory();
        Document pdf = factory.createDocument();
        pdf.open(); pdf.save();

        factory = new ExcelDocumentFactory();
        Document excel = factory.createDocument();
        excel.open(); excel.save();
    }
}

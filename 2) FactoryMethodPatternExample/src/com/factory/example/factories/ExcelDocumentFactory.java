package com.factory.example.factories;

import com.factory.example.documents.Document;
import com.factory.example.documents.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override public Document createDocument() {
        return new ExcelDocument();
    }
}

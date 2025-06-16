package com.factory.example.factories;

import com.factory.example.documents.Document;
import com.factory.example.documents.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory {
    @Override public Document createDocument() {
        return new PdfDocument();
    }
}

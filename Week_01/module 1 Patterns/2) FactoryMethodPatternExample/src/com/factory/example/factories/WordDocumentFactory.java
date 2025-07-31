package com.factory.example.factories;

import com.factory.example.documents.Document;
import com.factory.example.documents.WordDocument;

public class WordDocumentFactory extends DocumentFactory {
    @Override public Document createDocument() {
        return new WordDocument();
    }
}

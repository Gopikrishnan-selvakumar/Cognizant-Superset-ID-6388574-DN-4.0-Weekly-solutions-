package com.factory.example.documents;

public class PdfDocument implements Document {
    @Override public void open() { System.out.println("Opening Pdf document"); }
    @Override public void save() { System.out.println("Saving Pdf document"); }
}

package org.example.HW.HW5;

public class reportService {

    public byte[] createReport(Document document, String reportType) {
        // reportType = {"pdf-1", "json", "xml", ...}
        switch (reportType){
            case ("pdf-1"):
                document.DocToPDF();
            case ("json"):
                document.DocToJSON();
            case ("xml"):
                document.DocToXml();
        }


        throw new UnsupportedOperationException();
    }


}



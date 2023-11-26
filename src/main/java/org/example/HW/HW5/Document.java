package org.example.HW.HW5;

public class Document implements Convertor{
    private long id;
    private String number;

    private void Document(long id,String number){
        this.id=id;
        this.number=number;

    }

    @Override
    public void DocToJSON() {

    }

    @Override
    public void DocToPDF() {

    }

    @Override
    public void DocToXml() {

    }
    // ...
}



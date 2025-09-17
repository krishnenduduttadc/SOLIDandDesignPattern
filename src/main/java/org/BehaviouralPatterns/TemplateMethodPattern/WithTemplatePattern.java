package org.BehaviouralPatterns.TemplateMethodPattern;


import javax.xml.crypto.Data;

abstract class DataParser{

    //Template Method Define the steps of the algorithm
    public final void parse(){
        openFile();
        parseData();
        closeFile();
    }
    protected void openFile(){
        System.out.println("Opening File");
    }
    protected void closeFile(){
        System.out.println("Closing File");
    }
    protected abstract void parseData();
}
//CSV Parser
class CSVParserII extends DataParser{

    @Override
    protected void parseData() {
        System.out.println("Parsing CSV Data");
    }
}
class JSONParserII extends DataParser{

    @Override
    protected void parseData() {
        System.out.println("Parsing JSON Data");
    }
}
class XMLParser extends DataParser{

    @Override
    protected void parseData() {
        System.out.println("Parsing XML Data");
    }
}

public class WithTemplatePattern {
    public static void main(String[] args) {
        DataParser csvParser = new CSVParserII();
        DataParser jsonParser = new JSONParserII();
        DataParser xmlParser=new XMLParser();
        csvParser.parse();
        jsonParser.parse();
        xmlParser.parse();
    }
}

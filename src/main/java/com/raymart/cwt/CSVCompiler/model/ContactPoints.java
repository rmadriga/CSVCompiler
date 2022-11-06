package com.raymart.cwt.CSVCompiler.model;

public class ContactPoints {

    private String recordId;
    private String type;
    private String recordNumber;

//    public ContactPoints(String recordId, String type, String recordNumber) {
//        this.recordId = recordId;
//        this.type = type;
//        this.recordNumber = recordNumber;
//    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }
}

package com.example.springcec.dominio;

import java.util.Map;

public class ErrorJSON {
    
    private int status;
    private String error;
    private String message;
    private String moment;
    private String path;

    public ErrorJSON(Map<String, Object> errorAttributes) {
        this.setStatus((int) errorAttributes.get("status"));
        this.setError((String) errorAttributes.get("error"));
        this.setMessage((String) errorAttributes.get("message"));
        this.setMoment(errorAttributes.get("timestamp").toString());
        this.setPath((String) errorAttributes.get("path"));
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMoment() {
        return moment;
    }

    public void setMoment(String moment) {
        this.moment = moment;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}

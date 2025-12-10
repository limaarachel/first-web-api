package com.rachellima.first_web_api.handler;

import java.util.Date;

public class ResponseError {
    private Date timestamp = new Date();

    public String getStatus() {
        return status;
    }

    public void setStatus(String stats) {
        this.status = stats;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public int getStatusCode() {
        return statusCode;
    }

    @Override
    public String toString() {
        return "ResponseError{" +
                "timestamp=" + timestamp +
                ", stats='" + status + '\'' +
                ", statusCode=" + statusCode +
                ", error='" + error + '\'' +
                '}';
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    private String status = "error";
    private int statusCode = 400;
    private String error;
}

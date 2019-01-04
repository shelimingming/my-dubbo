package com.sheliming.framework;

public class URL {
    private String hostName;
    private String port;

    public URL(String hostName, String port) {
        this.hostName = hostName;
        this.port = port;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "URL{" +
                "hostName='" + hostName + '\'' +
                ", port='" + port + '\'' +
                '}';
    }
}

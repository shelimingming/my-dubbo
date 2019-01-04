package com.sheliming.framework;

public class Producter {
    private URL url;
    private Class implClass;

    public Producter(URL url, Class implClass) {
        this.url = url;
        this.implClass = implClass;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public Class getImplClass() {
        return implClass;
    }

    public void setImplClass(Class implClass) {
        this.implClass = implClass;
    }

    @Override
    public String toString() {
        return "Producter{" +
                "url=" + url +
                ", implClass=" + implClass +
                '}';
    }
}

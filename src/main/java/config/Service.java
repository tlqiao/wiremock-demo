package config;

public enum Service {
    firstInterface("firstInterface", "http://test.firstInterface.cn"),
    secondInterface("secondInterface","http://test.secondInterface.cn");

    public String getPrefix() {
        return prefix;
    }

    public String getHost() {
        return host;
    }

    private final String prefix;
    private final String host;
    Service(String prefix, String host) {
        this.prefix =prefix;
        this.host =host;
    }
}

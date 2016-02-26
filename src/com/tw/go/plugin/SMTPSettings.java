package com.tw.go.plugin;

public class SMTPSettings {
    private String hostName;
    private int port;
    private boolean tls;
    private String fromEmailId;
    private String password;
    private String smtpUsername;

    public SMTPSettings(String hostName, int port, boolean tls, String fromEmailId, String smtpUsername, String password) {
        this.hostName = hostName;
        this.port = port;
        this.tls = tls;
        this.password = password;
        this.smtpUsername = smtpUsername;
        this.fromEmailId = fromEmailId;
    }

    public String getHostName() {
        return hostName;
    }

    public int getPort() {
        return port;
    }

    public boolean isTls() {
        return tls;
    }

    public String getFromEmailId() {
        return fromEmailId;
    }

    public String getPassword() {
        return password;
    }

    public String getSmtpUsername() { return smtpUsername; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SMTPSettings that = (SMTPSettings) o;

        if (port != that.port) return false;
        if (tls != that.tls) return false;
        if (fromEmailId != null ? !fromEmailId.equals(that.fromEmailId) : that.fromEmailId != null) return false;
        if (hostName != null ? !hostName.equals(that.hostName) : that.hostName != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (smtpUsername != null ? !smtpUsername.equals(that.smtpUsername) : that.smtpUsername != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hostName != null ? hostName.hashCode() : 0;
        result = 31 * result + port;
        result = 31 * result + (tls ? 1 : 0);
        result = 31 * result + (fromEmailId != null ? fromEmailId.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (smtpUsername != null ? smtpUsername.hashCode() : 0);
        return result;
    }
}

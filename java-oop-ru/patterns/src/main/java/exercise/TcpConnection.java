package exercise;
import exercise.connections.Connected;
import exercise.connections.Connection;
import exercise.connections.Disconnected;

import java.util.List;
import java.util.ArrayList;

public class TcpConnection {
    private String ip;
    private int port;
    private Connection connectionState;

    public TcpConnection(String ip, int port) {
        this.ip = ip;
        this.port = port;
        this.connectionState = new Disconnected(this);
    }

    public void setState(Connection c) {
        this.connectionState = c;
    }

    public String getCurrentState(){
        return connectionState.getClass().getSimpleName().toLowerCase();
    }

    public void connect(){
        this.connectionState.connect();
    }
    public void disconnect(){
        this.connectionState.disconnect();
    }

    public void write(String s){
        this.connectionState.write(s);
    }
}

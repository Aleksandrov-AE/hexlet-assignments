package exercise.connections;

import exercise.TcpConnection;

public class Disconnected implements Connection {

    private TcpConnection tcpConnection;

    public Disconnected(TcpConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void connect() {
        tcpConnection.setState(new Connected(tcpConnection));
    }

    @Override
    public void disconnect() {
        System.out.println("Error! Connection already disconnected");
    }

    @Override
    public void write(String s) {
        System.out.println("Error! Connection disconnected");
    }
}
package exercise.connections;

import exercise.TcpConnection;

public class Connected implements Connection {
    private TcpConnection  tcpConnection;

    public Connected(TcpConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }
    @Override
    public void connect() {
        System.out.println("Error! Connection already connected");
    }

    @Override
    public void disconnect() {
        tcpConnection.setState(new Disconnected(tcpConnection));
    }

    @Override
    public void write(String s) {

    }
}
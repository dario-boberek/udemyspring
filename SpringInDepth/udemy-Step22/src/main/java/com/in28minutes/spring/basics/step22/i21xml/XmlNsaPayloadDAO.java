package com.in28minutes.spring.basics.step22.i21xml;

public class XmlNsaPayloadDAO {

	private XmlNsaJDBCConnection connection;

	public String getConnectionStatus() {
		return "> payload instance ID: " + this.toString() + ", isAlive: " + connection.isConnectionAlive() + ", JDBC instance ID: " + connection.toString();
	}

	//error: Bean property 'b' is not writable or has an invalid setter method.
	//brakuje settera wiec Spring nie umie sie dostac do property

	public XmlNsaJDBCConnection getConnection() {
		return connection;
	}

	public void setConnection(XmlNsaJDBCConnection connection) {
		this.connection = connection;
	}
}

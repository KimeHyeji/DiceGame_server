package main;// This file contains material covering the answer of Project 3.X from// the textbook: "Object Oriented Software Engineering". It is issued under// a special answer license found at www.lloseng.com.  The contents of this// file must neither be posted on a public server nor made available in any// other way that would permit public access to it.import java.io.*;import DiceView.ServerFrame;import server.*;import common.*;public class ServerMain extends ServerFrame implements ChatIF {	// Class variables *************************************************	// final public static int DEFAULT_PORT = 5555;	// Instance variables **********************************************	ServerState server;	public ServerState getServer() {		return server;	}	public void setServer(ServerState server) {		this.server = server;	}	// Constructors ****************************************************	public ServerMain(int port) throws IOException {		server = new ServerState(port, this);	}	// Instance methods ************************************************	public void display(String message) {		System.out.println(message);	}	/*	 * public void accept() { 	 * try { BufferedReader fromConsole = new	 * BufferedReader(new InputStreamReader(System.in)); String message;	 * 	 * try { while (true) { message = fromConsole.readLine();	 * server.handleMessageFroClient(message); } } // Under Windows NT, a	 * NullPointerException is thrown when we // shutdown the client because it	 * is still trying to get data // from a non-existing variable. We can just	 * ignore it. catch (NullPointerException e) { } } catch (Exception ex) {	 * display("Unexpected error while reading from console!"); } }	 */	// Class methods ***************************************************	public static void main(String[] args) {		ServerFrame.getInstance().setVisible(true);		//new Member_List(); 회원관리창 필요없음.. 필요하면 차라리 서버 프레임에 버튼 달아서 나오게 하는 방법?!	}}
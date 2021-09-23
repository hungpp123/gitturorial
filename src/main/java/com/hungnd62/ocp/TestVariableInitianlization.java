package com.hungnd62.ocp;

public class TestVariableInitianlization {
    private static String host = "172.20.3.70";
    private static int port = 3117;

    public TestVariableInitianlization() {
        System.out.println("Constructor Initialzier");
    }

    public static void startClient() {
        host = "172.20.3.61";
        System.out.println("Init client to host: " + host + ", port: " + port);
    }

    {
        System.out.println("block inintialzer");
    }

}

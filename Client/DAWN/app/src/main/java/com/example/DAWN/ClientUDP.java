package com.example.DAWN;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientUDP {
    static Data dataclass;

    ClientUDP() {
        dataclass = new Data ();
    }

    public void testCon() {
        try {
            byte[] requestBytes = new byte[1024];
            byte[] ReceiveBytes = new byte[1024];
            DatagramPacket requestPacket = new DatagramPacket(requestBytes, requestBytes.length);
            DatagramPacket receivePacket = new DatagramPacket(ReceiveBytes,ReceiveBytes.length);
            DatagramSocket client = new DatagramSocket(5062);

            // Request
            requestPacket.setPort(5063);
            requestPacket.setAddress(InetAddress.getByName (dataclass.Server));
            requestPacket.setData ("Request for location!".getBytes ());

            long startTime = System.currentTimeMillis();
            client.send(requestPacket);
            long delay = System.currentTimeMillis() - startTime;

            dataclass.setDelay (delay);

            // Receive

            client.receive(receivePacket);

            ByteArrayInputStream byteArraySteam = new ByteArrayInputStream(ReceiveBytes);
            ObjectInputStream objectStream = new ObjectInputStream (byteArraySteam);

            float[] inData = (float []) objectStream.readObject();

            objectStream.close();
            byteArraySteam.close();

            dataclass.location = inData;
            System.out.println(dataclass.location[0] + "," + dataclass.location[1] + " SENDING");


            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace ();
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import com.corundumstudio.socketio.SocketIOClient;
import java.util.Vector;

/**
 *
 * @author morrispenasso
 */
public class DataClient {

    public SocketIOClient getClient()   {
        return client;
    }
    
    public void setClient(SocketIOClient client)    {
        this.client = client;
    }
    
    public void setName(String name)  {
        
        this.name = name;
    }

    public DataClient() {
    }

    public DataClient(SocketIOClient client, String name) {
        this.client = client;
        this.name = name;
    }
    
    SocketIOClient client;
    String name;
    
    public Object[] toRowTable(int row) {
        return new Object[]{this, row, name};
    }
}

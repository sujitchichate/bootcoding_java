package com.bootcoding.collection;

import com.bootcoding.basic.Marker;

import java.util.HashMap;

public class MarkerCollection {
    HashMap<Long, Marker> markers=new HashMap<>();
    public void addMarker(Marker m){
        markers.put(m.getId(),m);
    }

    public void printMarker(){
        for(Long key:markers.keySet()) {
            Marker m = markers.get(key);
            System.out.println("Id:" + m.getId());
            System.out.println("Company:" + m.getCompany());
            System.out.println("Type:"+m.getType());
            System.out.println("Color:"+m.getColor());
            System.out.println("Price:"+m.getPrice());
        }

    }
    public static void main(String[] args) {
        MarkerCollection object=new MarkerCollection();
        for(int i=1;i<=10;i++){
            Marker marker=new Marker();
            marker.setId(i);
            marker.setCompany("Marker"+i);
            marker.setType("WhiteBoard");
            marker.setColor("Blue");
            marker.setPrice(i*10.5);

            object.addMarker(marker);
        }
        object.printMarker();
    }
}

package com.bootcoding.basic;

public class SearchInArray {
public void find(){
    int a[]={10,20,30,40,80,90};
    boolean found=false;
    for(int i=0;i<a.length;i++){
        if(80==a[i]){
            found=true;
        }
    }if (found){
        System.out.println("found");
    }else{
        System.out.println("not found");
    }
}
}

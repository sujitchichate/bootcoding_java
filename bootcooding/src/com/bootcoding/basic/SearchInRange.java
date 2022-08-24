package com.bootcoding.basic;

public class SearchInRange {
    public void find(){
        int a[]={10, 15, 20, 25, 35, 75, 180, 95};
        for(int i=0;i<a.length;i++){
            if(a[i]>=30 && a[i]<=100){
                System.out.println(a[i]);
            }
        }
    }

    public static void main(String[] args) {
        SearchInRange s= new SearchInRange();
        s.find();
    }
}

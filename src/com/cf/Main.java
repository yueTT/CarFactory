package com.cf;


public class Main {
    public static void main(String [] args){

        Main a = new Main();
        int b = a.add(1,2,3,4,5,6,7,8,9);
        System.out.println(b);

    }

    public int add(int...value){
        int temp=0;
        for(int i=0; i<value.length; i++){
            temp+=value[i];
        }
        return temp;
    }

}



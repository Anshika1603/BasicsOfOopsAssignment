package com.knoldus.Question3;

class Degree{
    public void getDegree(){
        System.out.println("I got a Degree");
    }
}

class Undergraduate extends Degree{
    //Overriding getDegree Method for Undergraduate Class
    public void getDegree(){
        System.out.println("I got Undergraduate Degree");
    }
}

class Postgraduate extends Degree{
    //Overriding getDegree Method for Postgraduate Class
    public void getDegree(){
        System.out.println("I got Postgraduate Degree");
    }
}

public class DegreeProgram {
    public static void main(String[] args) {
        Degree degree=new Degree();
        degree.getDegree();
        Undergraduate undergraduate=new Undergraduate();
        undergraduate.getDegree();
        Postgraduate postgraduate=new Postgraduate();
        postgraduate.getDegree();
    }
}

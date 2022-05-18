package com.syntax;

public class Main {

    public static void main(String[] args) {

        SolarSystem FactorX = new SolarSystem();
        FactorX.sun = "1";
        FactorX.moon = "2";
        FactorX.planet = "5";
        FactorX.star = "10011";

        // adding features to our sun
        FeatureSun Xfact = new FeatureSun();
        Xfact.color = "green";
        Xfact.radius = "1000000000km";
        Xfact.heat = "309324934898kj";

        // adding features to our stars
        FeatureStars FacX = new FeatureStars();
        FacX.color = "green";
        FacX.radius = "789521.378km";
        FacX.size = "999999999m";

    }
}

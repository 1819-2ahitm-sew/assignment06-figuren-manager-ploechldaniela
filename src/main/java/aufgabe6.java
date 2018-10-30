abstract class Figuren {
    public static void main(String[]args) {
        Figuren[] figuren = new Figuren[4];
        figuren[0] = new Dreieck();
        figuren[1] = new Quadrat();
        figuren[2] = new Ellipse();
        figuren[3] = new Kreis();

        for (int i = 0; i < figuren.length; i++) {
            System.out.printf(figuren[i].output());
            System.out.println();
            System.out.println();
        }

    }

        abstract public double area();
        abstract public double circumference();
        abstract public String output();
}

    class Dreieck extends Figuren{
        private double seite1 = 10;
        private double seite2 = 7;
        private double winkel = 45;

        private double area = (seite1 * seite2) / 2;
        private double circumference = seite1 + seite2 + seite2;

        @Override public double area(){
            return area = Math.round(area * 1000) / 1000.0;
        }

        @Override public double circumference(){
            return circumference = Math.round(circumference * 1000)/ 1000.0;
        }

        @Override public  String output(){
            return ("Dreieck mit erster Seite "+ seite1 +", zweiter Seite "+ seite2 +" und Winkel "+ winkel +": Umfang -> "+ circumference()+", Fläche -> "+ area());
        }
    }

     class Quadrat extends Figuren{
        private double seite = 5;

        private double area = seite * seite;
        private double circumference = 4 * seite;

         @Override public double area(){
             return area = Math.round(area * 1000)/ 1000.0;
         }

         @Override public double circumference(){
             return circumference = Math.round(circumference * 1000)/ 1000.0;
         }

         @Override public  String output(){
             return ("Quadrat mit Seitenlänge "+ seite +" : Umfang -> "+ circumference()+", Fläche -> "+ area());
         }
    }

     class Ellipse extends Figuren{
        private double hauptachse = 10;
        private double nebenachse = 6;

        private double area = hauptachse * nebenachse * Math.PI;
        private double circumference = Math.PI * Math.sqrt(2 * ((hauptachse * hauptachse) + (nebenachse * nebenachse)));

         @Override public double area(){
             return area = Math.round(area * 1000)/ 1000.0;
         }

         @Override public double circumference(){
             return circumference = Math.round(circumference * 1000)/ 1000.0;
         }

         @Override public  String output(){
             return ("Ellipse mit Hauptachse "+ hauptachse +" und Nebenachse "+ nebenachse +" : Umfang -> "+ circumference()+", Fläche -> "+ area());
         }
    }

     class Kreis extends Figuren{
        private double radius = 5;

        private double area = radius * radius * Math.PI;
        private double circumference = 2 * radius * Math.PI;

         @Override public double area(){
             return area = Math.round(area * 1000)/ 1000.0;
         }

         @Override public double circumference(){
             return circumference = Math.round(circumference * 1000)/ 1000.0;
         }

         @Override public  String output(){
             return ("Kreis mit Radius "+ radius +" : Umfang -> "+ circumference()+", Fläche -> "+ area());
         }
    }
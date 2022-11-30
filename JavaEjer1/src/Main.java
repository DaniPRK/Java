import com.openbootcamp.Juego1;
import com.openbootcamp.Juego2;
import com.openbootcamp.VideoJuego;

public class Main {

    public static void main(String[] args) {

        VideoJuego Juego1 = new Juego1();

          Juego1.setNombre("Minecraft");
          Juego1.setMetascore(9.9);
          Juego1.setMotor("java");
          Juego1.setPrecio(19.8);

            System.out.println(Juego1.getNombre() + ", con motor basado en " + Juego1.getMotor() + ", precio de " + Juego1.getPrecio() + " y una puntuación de " + Juego1.getMetascore());


        VideoJuego Juego2 = new Juego2();


          Juego2.setNombre("FarCry");
          Juego2.setMetascore(7.8);
          Juego2.setMotor("Dunina Engine");
          Juego2.setPrecio(49.99);


            System.out.println(Juego2.getNombre() + ", con motor " + Juego2.getMotor() + ", precio de " + Juego2.getPrecio() + " y una puntuación de " +  Juego2.getMetascore() );




    }


    }

package exo1;

public class EnvoiPhoto extends ServiceEnvoiPhoto implements Envoi{
    public void envoi(Contact c, String image){
        envoiPhoto(c, image);
    }
}

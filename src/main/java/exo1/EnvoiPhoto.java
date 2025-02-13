package exo1;

public class EnvoiPhoto implements Envoi{
    private final ServiceEnvoiPhoto serviceEnvoi = new ServiceEnvoiPhoto();

    public void envoi(Contact c, String image){
        // envoiPhoto(c, image);            // Méthode 1 (si EnvoiPhoto étend ServiceEnvoiPhoto)
        serviceEnvoi.envoiPhoto(c, image);  // Méthode 2 (sans étendre ServiceEnvoiPhoto)
    }
}

package exo1;

public class Main {
    public static void main(String [] args) {
        Contact papa = new Contact("Papa", "0123456789");
        Contact maman = new Contact("Maman", "9876543210");

        Annuaire contacts = new Annuaire();
        contacts.ajouteContact(papa);
        contacts.ajouteContact(maman);

        contacts.afficheContacts();

        EnvoiSms sms = new EnvoiSms();

        sms.envoi(papa, "Coucou");

        EnvoiMail mail = new EnvoiMail();
        mail.envoi(maman, "Coucou (version mail)");

        EnvoiPhoto photo = new EnvoiPhoto();
        photo.envoi(maman, "Coucou (version photo)");
    }

}

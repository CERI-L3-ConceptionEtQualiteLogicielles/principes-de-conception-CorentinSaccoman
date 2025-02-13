package exo1;

public class Main {
    public static void main(String [] args) {
        Contact papa = new Contact.ContactBuilder("Papa", "0123456789").addVille("Salon").build();
        Contact maman = new Contact.ContactBuilder("Maman", "9876543210").addEmail("maman@gmail.com").build();

        System.out.println("-----------------------------------------------------------------");
        System.out.println(papa.getInfoContact(new FormatInfoXML()));
        System.out.println("-----------------------------------------------------------------");
        System.out.println(maman.getInfoContact(new FormatInfoJSON()));
        System.out.println("-----------------------------------------------------------------");

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

package exo1;

public class EnvoiSms implements Envoi{
    public void envoi(Contact contact, String sms){
        System.out.println("Envoi d'un sms à " + contact);
        System.out.println("Contenu : \n " + sms);
    }
}

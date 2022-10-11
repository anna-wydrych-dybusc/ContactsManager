package pl.annawydrych;

public class Main {
    public static void main(String[] args) {

        //once this program runs, the main method will start which will create the ContactManager object myContactManager and thus ready to be used.
        //Create the ContactsManager object
        ContactsManager myContactsManager = new ContactsManager();

        //create a new Contact object for Ola
        Contact friendOla = new Contact();
        //set the fields
        friendOla.name = "Ola";
        friendOla.phoneNumber = "123-456-789";
        //add Ola Contact to the ContactManager
        myContactsManager.addContact(friendOla);

        //Create a new Contact object for Agata
        Contact friendAgata = new Contact();
        //set the fields
        friendAgata.name = "Agata";
        friendAgata.phoneNumber = "234-567-891";
        //add Agata Contact to the ContactManager
        myContactsManager.addContact(friendAgata);

        //Create a new contact object for James
        Contact friendAsia = new Contact();
        friendAsia.name = "Asia";
        friendAsia.phoneNumber = "345-678-912";
        //add Asia Contact to the ContactManager
        myContactsManager.addContact(friendAsia);

        //search of a contact and display their number
        Contact result = myContactsManager.searchContact("Asia");
        System.out.println(result.phoneNumber);

    }

}
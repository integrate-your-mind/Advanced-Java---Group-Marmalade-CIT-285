package sample;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.junit.Assert.*;

public class AccountTest extends Account {

    @Test
    public void testAccountBuilder() {
        //need to implement subclass
        Account account = new Patient.PatientBuilder <>()
                .setAccountNumber(UUID.randomUUID())
                .setPassword("*****")
                .setFirstName("rocky")
                .setLastName("road")
                .setEmailAddress("rockyRoad@gmail.com")
                .setCellPhoneNumber("000-000-0000")
                .setSecretQuestion("What is your favorite color?")
                .build();

        assertEquals("rocky", account.getFirstName());
    }

    @Test
    public void testAccountMap() {

        Map <Account, Account> accounts = new HashMap <>();

        Account account = new Patient.PatientBuilder <>()
                .setAccountNumber(UUID.randomUUID())
                .setPassword("*****")
                .setFirstName("rocky")
                .setLastName("road")
                .setEmailAddress("rockyRoad@gmail.com")
                .setCellPhoneNumber("000-000-0000")
                .setSecretQuestion("What is your favorite color?")
                .build();

        Account account2 = new Patient.PatientBuilder <>()
                .setAccountNumber(UUID.randomUUID())
                .setPassword("*****")
                .setFirstName("ronny")
                .setLastName("roadsy")
                .setEmailAddress("rockyRoad@gmail.com")
                .setCellPhoneNumber("000-000-0000")
                .setSecretQuestion("What is your favorite color?")
                .build();

        Account account3 = new Patient.PatientBuilder <>()
                .setAccountNumber(UUID.randomUUID())
                .setPassword("*****")
                .setFirstName("rockys")
                .setLastName("roadsy")
                .setEmailAddress("rockyRoad@gmail.com")
                .setCellPhoneNumber("000-000-0000")
                .setSecretQuestion("What is your favorite color?")
                .build();
        accounts.put(account, account);
        accounts.put(account2, account2);
        accounts.put(account3, account3);
        if (accounts.containsKey(account)) {
            System.out.println("User found!");
        }
    }

}
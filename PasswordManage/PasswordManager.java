
import java.util.HashMap;
import java.util.Map;

public class PasswordManager {
    private Map<String, String> credentials;

    public PasswordManager() {
        credentials = new HashMap<>();
    }

    public void addCredential(String service, String password) {
        if (credentials.containsKey(service)) {
            System.out.println("Service already exists. Use update to change the password.");
        } else {
            credentials.put(service, password);
            System.out.println("Credential added successfully.");
        }
    }

    public void getCredential(String service) {
        if (credentials.containsKey(service)) {
            System.out.println("Password for " + service + ": " + credentials.get(service));
        } else {
            System.out.println("Service not found.");
        }
    }

    public void updateCredential(String service, String newPassword) {
        if (credentials.containsKey(service)) {
            credentials.put(service, newPassword);
            System.out.println("Password updated successfully.");
        } else {
            System.out.println("Service not found.");
        }
    }

    public void removeCredential(String service) {
        if (credentials.containsKey(service)) {
            credentials.remove(service);
            System.out.println("Credential removed successfully.");
        } else {
            System.out.println("Service not found.");
        }
    }

    public void listCredentials() {
        if (credentials.isEmpty()) {
            System.out.println("No credentials stored.");
        } else {
            System.out.println("Stored services:");
            for (String service : credentials.keySet()) {
                System.out.println("- " + service);
            }
        }
    }
}
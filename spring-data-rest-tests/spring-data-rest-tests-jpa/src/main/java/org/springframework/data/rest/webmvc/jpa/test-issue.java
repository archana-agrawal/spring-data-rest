import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountAnalyzer {
    public static void findOccurrences(List<String> accountIds, List<String> accountNames) {
        Map<String, Integer> accountIdOccurrences = new HashMap<>();
        Map<String, Integer> accountNameOccurrences = new HashMap<>();

        // Iterate over the list of Account Ids and count occurrences
        for (String accountId : accountIds) {
            if (accountIdOccurrences.containsKey(accountId)) {
                accountIdOccurrences.put(accountId, accountIdOccurrences.get(accountId) + 1);
            } else {
                accountIdOccurrences.put(accountId, 1);
            }
        }

        // Iterate over the list of Account Names and count occurrences
        for (String accountName : accountNames) {
            if (accountNameOccurrences.containsKey(accountName)) {
                accountNameOccurrences.put(accountName, accountNameOccurrences.get(accountName) + 1);
            } else {
                accountNameOccurrences.put(accountName, 1);
            }
        }

        // Print the occurrences of Account Ids
        System.out.println("Occurrences of Account Ids:");
        for (Map.Entry<String, Integer> entry : accountIdOccurrences.entrySet()) {
            System.out.println("Account Id: " + entry.getKey() + ", Occurrences: " + entry.getValue());
        }

        // Print the occurrences of Account Names
        System.out.println("Occurrences of Account Names:");
        for (Map.Entry<String, Integer> entry : accountNameOccurrences.entrySet()) {
            System.out.println("Account Name: " + entry.getKey() + ", Occurrences: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Example data
        List<String> accountIds = new ArrayList<>();
        accountIds.add("A001");
        accountIds.add("A002");
        accountIds.add("A001");
        accountIds.add("A003");
        accountIds.add("A002");

        List<String> accountNames = new ArrayList<>();
        accountNames.add("John Doe");
        accountNames.add("Jane Smith");
        accountNames.add("John Doe");
        accountNames.add("Adam Johnson");
        accountNames.add("Jane Smith");

        findOccurrences(accountIds, accountNames);
    }
}

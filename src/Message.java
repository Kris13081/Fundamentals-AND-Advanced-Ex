import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int possibleMessages = Integer.parseInt(scanner.nextLine());
        Map<String, User> users = new LinkedHashMap<>();

        String line = scanner.nextLine();
        while (!(line.equals("Statistics"))){
            String[] data = line.split("=");
            String command = data[0];
            switch (command){
                case "Add":
                    String username = data[1];
                    int sent = Integer.parseInt(data[2]);
                    int received = Integer.parseInt(data[3]);
                    if (!(users.containsKey(username))) {
                        User user = new User(username, sent, received);
                        users.put(user.Username, user);
                    }
                    break;
                case "Message":
                    String sender = data[1];
                    String receiver = data[1];
                    if (users.containsKey(sender) && users.containsKey(receiver)){
                        int addSends = users.get(sender).getSentMessages() + 1;
                        users.get(sender).setSentMessages(addSends);
                        int addReceived = users.get(receiver).getReceivedMessages() + 1;
                        users.get(receiver).setSentMessages(addReceived);
                    }
                    if(users.get(sender).getSentMessages() >= possibleMessages){
                        users.remove(sender);
                    }
                    if (users.get(receiver).getReceivedMessages() >= possibleMessages){
                        users.remove(receiver);
                    }
                    break;
            }
            line = scanner.nextLine();
        }
        System.out.println(users);
    }
    static  class  User{
        String Username;
        int sentMessages;
        int receivedMessages;

        public User(String username, int sentMessages, int receivedMessages) {
            Username = username;
            this.sentMessages = sentMessages;
            this.receivedMessages = receivedMessages;
        }

        public String getUsername() {
            return Username;
        }

        public void setUsername(String username) {
            Username = username;
        }

        public int getSentMessages() {
            return sentMessages;
        }

        public void setSentMessages(int sentMessages) {
            this.sentMessages = sentMessages;
        }

        public int getReceivedMessages() {
            return receivedMessages;
        }

        public void setReceivedMessages(int receivedMessages) {
            this.receivedMessages = receivedMessages;
        }
    }
}

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int piecesNum = Integer.parseInt(scanner.nextLine());
        Map<String, Pieces> pieces = new LinkedHashMap<>();

        String line = scanner.nextLine();
        while (piecesNum > pieces.size()) {
            String[] data = line.split("\\|");
            String name = data[0];
            String composer = data[1];
            String key = data[2];

            Pieces piece = new Pieces(name, composer, key);
            pieces.put(piece.name, piece);

            line = scanner.nextLine();

        }

        while (!(line.equals("Stop"))) {
            String[] data = line.split("\\|");
            String command = data[0];
            switch (command) {
                case "Add":
                    String name = data[1];
                    String composer = data[2];
                    String key = data[3];
                    if (pieces.containsKey(name)){
                        System.out.printf("%s is already in the collection!\n", name);
                    }else {
                        Pieces piece = new Pieces(name, composer, key);
                        pieces.put(piece.name, piece);
                        System.out.printf("%s by %s in %s added to the collection!\n", name, composer, key);

                    }
                    break;
                case "Remove":
                    String kay = data[1];

                    if (pieces.containsKey(kay)){
                        Pieces removed = pieces.remove(kay);
                        System.out.printf("Successfully removed %s!\n", kay);
                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", kay);
                    }
                    break;
                case "ChangeKey":
                    name = data[1];
                    String newKey = data[2];
                    if (pieces.containsKey(name)){
                        pieces.get(name).setKey(newKey);
                        System.out.printf("Changed the key of %s to %s!\n", name, newKey);
                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", name);

                    }
                    break;
            }
            line = scanner.nextLine();
        }
        pieces.forEach((s, pieces1) -> System.out.printf("%s -> Composer: %s, Key: %s\n", pieces1.name, pieces1.composer, pieces1.key));
    }

    static class Pieces {
        String name;
        String composer;
        String key;

        public Pieces(String name, String composer, String key) {
            this.name = name;
            this.composer = composer;
            this.key = key;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getComposer() {
            return composer;
        }

        public void setComposer(String composer) {
            this.composer = composer;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        @Override
        public String toString() {
            return String.format("%s -> Composer: %s, Key: %s", this.name, this.composer, this.name);
        }
    }
}

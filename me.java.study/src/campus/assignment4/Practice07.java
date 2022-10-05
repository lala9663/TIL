package campus.assignment4;

public class Practice07 {
    public static void main(String[] args) {
        final String jsonString = "{\n" +
                "\t\"name\": \"Molecule Man\",\n" +
                "\t\"age\": 29,\n" +
                "\t\"secretIdentity\": \"Dan Jukes\",\n" +
                "\t\"powers\": \"Radiation resistance\"\n" +
                "},\n" +
                "{\n" +
                "\t\"name\": \"Madame Uppercut\",\n" +
                "\t\"age\": 39,\n" +
                "\t\"secretIdentity\": \"Jane Wilson\",\n" +
                "\t\"powers\": \"Damage resistance\"\n" +
                "},\n" +
                "{\n" +
                "\t\"name\": \"Eternal Flame\",\n" +
                "\t\"age\": 1000000,\n" +
                "\t\"secretIdentity\": \"Unknown\",\n" +
                "\t\"powers\": \"Heat Immunity\"\n" +
                "}";

        String a = jsonString.replaceAll("[{\\n\\t\"}]","");
        String[] b = a.split(",");
        String[] c = new String[b.length];

        for (int i = 0; i < b.length; i++) {
            String[] d = b[i].split(": ");
            c[i] = d[1];
        }

        String[][] jsonTable = new String[3][4];
        int k = 0;

        for (int i = 0; i < jsonTable.length; i++) {
            for (int j = 0; j < jsonTable[i].length; j++) {
                jsonTable[i][j] = c[k];
                k++;
            }
        }

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("|                  name |                   age |        secretIdentity |                powers |");
        System.out.println("-------------------------------------------------------------------------------------------------");

        for (int i = 0; i < jsonTable.length; i++) {
            System.out.print("|");
            for (int j = 0; j < jsonTable[i].length; j++) {
                System.out.printf("%22s", jsonTable[i][j]);
                System.out.print(" |");
            }
            System.out.println("");
        }
    }
}

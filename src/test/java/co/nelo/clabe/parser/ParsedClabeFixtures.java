package co.nelo.clabe.parser;;

public class ParsedClabeFixtures {
    public static ParsedClabe testParsedClabe1() {
        return new ParsedClabe(
                "002",
                "010",
                "07777777777",
                '1',
                SpeiInstitution.INSTITUTIONS_MAP.get("002")
        );
    }

    public static ParsedClabe testParsedClabe2() {
        return new ParsedClabe(
                "002",
                "010",
                "07777777776",
                '1',
                SpeiInstitution.INSTITUTIONS_MAP.get("002")
        );
    }
}

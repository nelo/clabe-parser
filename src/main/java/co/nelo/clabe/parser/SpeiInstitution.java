package co.nelo.clabe.parser;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SpeiInstitution {
    protected static final Map<String, SpeiInstitution> INSTITUTIONS_MAP = createInstitutionsMap();

    private String id;
    private String shortName;
    private String detail;

    private SpeiInstitution(
            String id,
            String shortName,
            String detail
    ) {
        this.id = id;
        this.shortName = shortName;
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }

    public String getShortName() {
        return shortName;
    }

    public String getId() {
        return id;
    }

    private static Map<String, SpeiInstitution> createInstitutionsMap() {
        HashMap<String, SpeiInstitution> institutionsMap = new HashMap<>();

        institutionsMap.put("002", new SpeiInstitution(
                "002",
                "BANAMEX",
                "Banco Nacional de México, S.A., Institución de Banca Múltiple, Grupo Financiero Banamex"
        ));
        institutionsMap.put("006", new SpeiInstitution(
                "006",
                "BANCOMEXT",
                "Banco Nacional de Comercio Exterior, Sociedad Nacional de Crédito, Institución de Banca de Desarrollo"
        ));
        institutionsMap.put("009", new SpeiInstitution(
                "009",
                "BANOBRAS",
                "Banco Nacional de Obras y Servicios Públicos, Sociedad Nacional de Crédito, Institución de Banca de Desarrollo"
        ));
        institutionsMap.put("012", new SpeiInstitution(
                "012",
                "BBVA BANCOMER",
                "BBVA Bancomer, S.A., Institución de Banca Múltiple, Grupo Financiero BBVA Bancomer"
        ));
        institutionsMap.put("014", new SpeiInstitution(
                "014",
                "SANTANDER",
                "Banco Santander (México), S.A., Institución de Banca Múltiple, Grupo Financiero Santander"
        ));
        institutionsMap.put("019", new SpeiInstitution(
                "019",
                "BANJERCITO",
                "Banco Nacional del Ejército, Fuerza Aérea y Armada, Sociedad Nacional de Crédito, Institución de Banca de Desarrollo"
        ));
        institutionsMap.put("021", new SpeiInstitution(
                "021",
                "HSBC",
                "HSBC México, S.A., Institución De Banca Múltiple, Grupo Financiero HSBC"
        ));
        institutionsMap.put("030", new SpeiInstitution(
                "030",
                "BAJIO",
                "Banco del Bajío, S.A., Institución de Banca Múltiple"
        ));
        institutionsMap.put("032", new SpeiInstitution(
                "032",
                "IXE",
                "IXE Banco, S.A., Institución de Banca Múltiple, IXE Grupo Financiero"
        ));
        institutionsMap.put("036", new SpeiInstitution(
                "036",
                "INBURSA",
                "Banco Inbursa, S.A., Institución de Banca Múltiple, Grupo Financiero Inbursa"
        ));
        institutionsMap.put("037", new SpeiInstitution(
                "037",
                "INTERACCIONES",
                "Banco Interacciones, S.A., Institución de Banca Múltiple"
        ));
        institutionsMap.put("042", new SpeiInstitution(
                "042",
                "MIFEL",
                "Banca Mifel, S.A., Institución de Banca Múltiple, Grupo Financiero Mifel"
        ));
        institutionsMap.put("044", new SpeiInstitution(
                "044",
                "SCOTIABANK",
                "Scotiabank Inverlat, S.A."
        ));
        institutionsMap.put("058", new SpeiInstitution(
                "058",
                "BANREGIO",
                "Banco Regional de Monterrey, S.A., Institución de Banca Múltiple, Banregio Grupo Financiero"
        ));
        institutionsMap.put("059", new SpeiInstitution(
                "059",
                "INVEX",
                "Banco Invex, S.A., Institución de Banca Múltiple, Invex Grupo Financiero"
        ));
        institutionsMap.put("060", new SpeiInstitution(
                "060",
                "BANSI",
                "Bansi, S.A., Institución de Banca Múltiple"
        ));
        institutionsMap.put("062", new SpeiInstitution(
                "062",
                "AFIRME",
                "Banca Afirme, S.A., Institución de Banca Múltiple"
        ));
        institutionsMap.put("072", new SpeiInstitution(
                "072",
                "BANORTE",
                "Banco Mercantil del Norte, S.A., Institución de Banca Múltiple, Grupo Financiero Banorte"
        ));
        institutionsMap.put("102", new SpeiInstitution(
                "102",
                "THE ROYAL BANK",
                "The Royal Bank of Scotland México, S.A., Institución de Banca Múltiple"
        ));
        institutionsMap.put("103", new SpeiInstitution(
                "103",
                "AMERICAN EXPRESS",
                "American Express Bank (México), S.A., Institución de Banca Múltiple"
        ));
        institutionsMap.put("106", new SpeiInstitution(
                "106",
                "BAMSA",
                "Bank of America México, S.A., Institución de Banca Múltiple, Grupo Financiero Bank of America"
        ));
        institutionsMap.put("108", new SpeiInstitution(
                "108",
                "TOKYO",
                "Bank of Tokyo-Mitsubishi UFJ (México), S.A."
        ));
        institutionsMap.put("110", new SpeiInstitution(
                "110",
                "JP MORGAN",
                "Banco J.P. Morgan, S.A., Institución de Banca Múltiple, J.P. Morgan Grupo Financiero"
        ));
        institutionsMap.put("112", new SpeiInstitution(
                "112",
                "BMONEX",
                "Banco Monex, S.A., Institución de Banca Múltiple"
        ));
        institutionsMap.put("113", new SpeiInstitution(
                "113",
                "VE POR MAS",
                "Banco Ve Por Mas, S.A. Institución de Banca Múltiple"
        ));
        institutionsMap.put("116", new SpeiInstitution(
                "116",
                "ING",
                "ING Bank (México), S.A., Institución de Banca Múltiple, ING Grupo Financiero"
        ));
        institutionsMap.put("124", new SpeiInstitution(
                "124",
                "DEUTSCHE",
                "Deutsche Bank México, S.A., Institución de Banca Múltiple"
        ));
        institutionsMap.put("126", new SpeiInstitution(
                "126",
                "CREDIT SUISSE",
                "Banco Credit Suisse (México), S.A. Institución de Banca Múltiple, Grupo Financiero Credit Suisse (México)"
        ));
        institutionsMap.put("127", new SpeiInstitution(
                "127",
                "AZTECA",
                "Banco Azteca, S.A. Institución de Banca Múltiple."
        ));
        institutionsMap.put("128", new SpeiInstitution(
                "128",
                "AUTOFIN",
                "Banco Autofin México, S.A. Institución de Banca Múltiple"
        ));
        institutionsMap.put("129", new SpeiInstitution(
                "129",
                "BARCLAYS",
                "Barclays Bank México, S.A., Institución de Banca Múltiple, Grupo Financiero Barclays México"
        ));
        institutionsMap.put("130", new SpeiInstitution(
                "130",
                "COMPARTAMOS",
                "Banco Compartamos, S.A., Institución de Banca Múltiple"
        ));
        institutionsMap.put("131", new SpeiInstitution(
                "131",
                "BANCO FAMSA",
                "Banco Ahorro Famsa, S.A., Institución de Banca Múltiple"
        ));
        institutionsMap.put("132", new SpeiInstitution(
                "132",
                "BMULTIVA",
                "Banco Multiva, S.A., Institución de Banca Múltiple, Multivalores Grupo Financiero"
        ));
        institutionsMap.put("133", new SpeiInstitution(
                "133",
                "ACTINVER",
                "Banco Actinver, S.A. Institución de Banca Múltiple, Grupo Financiero Actinver"
        ));
        institutionsMap.put("134", new SpeiInstitution(
                "134",
                "WAL-MART",
                "Banco Wal-Mart de México Adelante, S.A., Institución de Banca Múltiple"
        ));
        institutionsMap.put("135", new SpeiInstitution(
                "135",
                "NAFIN",
                "Nacional Financiera, Sociedad Nacional de Crédito, Institución de Banca de Desarrollo"
        ));
        institutionsMap.put("136", new SpeiInstitution(
                "136",
                "INTERBANCO",
                "Inter Banco, S.A. Institución de Banca Múltiple"
        ));
        institutionsMap.put("137", new SpeiInstitution(
                "137",
                "BANCOPPEL",
                "BanCoppel, S.A., Institución de Banca Múltiple"
        ));
        institutionsMap.put("138", new SpeiInstitution(
                "138",
                "ABC CAPITAL",
                "ABC Capital, S.A., Institución de Banca Múltiple"
        ));
        institutionsMap.put("139", new SpeiInstitution(
                "139",
                "UBS BANK",
                "UBS Bank México, S.A., Institución de Banca Múltiple, UBS Grupo Financiero"
        ));
        institutionsMap.put("140", new SpeiInstitution(
                "140",
                "CONSUBANCO",
                "Consubanco, S.A. Institución de Banca Múltiple"
        ));
        institutionsMap.put("141", new SpeiInstitution(
                "141",
                "VOLKSWAGEN",
                "Volkswagen Bank, S.A., Institución de Banca Múltiple"
        ));
        institutionsMap.put("143", new SpeiInstitution(
                "143",
                "CIBANCO",
                "CIBanco, S.A."
        ));
        institutionsMap.put("145", new SpeiInstitution(
                "145",
                "BBASE",
                "Banco Base, S.A., Institución de Banca Múltiple"
        ));
        institutionsMap.put("166", new SpeiInstitution(
                "166",
                "BANSEFI",
                "Banco del Ahorro Nacional y Servicios Financieros, Sociedad Nacional de Crédito, Institución de Banca de Desarrollo"
        ));
        institutionsMap.put("168", new SpeiInstitution(
                "168",
                "HIPOTECARIA FEDERAL",
                "Sociedad Hipotecaria Federal, Sociedad Nacional de Crédito, Institución de Banca de Desarrollo"
        ));
        institutionsMap.put("600", new SpeiInstitution(
                "600",
                "MONEXCB",
                "Monex Casa de Bolsa, S.A. de C.V. Monex Grupo Financiero"
        ));
        institutionsMap.put("601", new SpeiInstitution(
                "601",
                "GBM",
                "GBM Grupo Bursátil Mexicano, S.A. de C.V. Casa de Bolsa"
        ));
        institutionsMap.put("602", new SpeiInstitution(
                "602",
                "MASARI",
                "Masari Casa de Bolsa, S.A."
        ));
        institutionsMap.put("605", new SpeiInstitution(
                "605",
                "VALUE",
                "Value, S.A. de C.V. Casa de Bolsa"
        ));
        institutionsMap.put("606", new SpeiInstitution(
                "606",
                "ESTRUCTURADORES",
                "Estructuradores del Mercado de Valores Casa de Bolsa, S.A. de C.V."
        ));
        institutionsMap.put("607", new SpeiInstitution(
                "607",
                "TIBER",
                "Casa de Cambio Tiber, S.A. de C.V."
        ));
        institutionsMap.put("608", new SpeiInstitution(
                "608",
                "VECTOR",
                "Vector Casa de Bolsa, S.A. de C.V."
        ));
        institutionsMap.put("610", new SpeiInstitution(
                "610",
                "B&B",
                "B y B, Casa de Cambio, S.A. de C.V."
        ));
        institutionsMap.put("614", new SpeiInstitution(
                "614",
                "ACCIVAL",
                "Acciones y Valores Banamex, S.A. de C.V., Casa de Bolsa"
        ));
        institutionsMap.put("615", new SpeiInstitution(
                "615",
                "MERRILL LYNCH",
                "Merrill Lynch México, S.A. de C.V. Casa de Bolsa"
        ));
        institutionsMap.put("616", new SpeiInstitution(
                "616",
                "FINAMEX",
                "Casa de Bolsa Finamex, S.A. de C.V."
        ));
        institutionsMap.put("617", new SpeiInstitution(
                "617",
                "VALMEX",
                "Valores Mexicanos Casa de Bolsa, S.A. de C.V."
        ));
        institutionsMap.put("618", new SpeiInstitution(
                "618",
                "UNICA",
                "Unica Casa de Cambio, S.A. de C.V."
        ));
        institutionsMap.put("619", new SpeiInstitution(
                "619",
                "MAPFRE",
                "MAPFRE Tepeyac, S.A."
        ));
        institutionsMap.put("620", new SpeiInstitution(
                "620",
                "PROFUTURO",
                "Profuturo G.N.P., S.A. de C.V., Afore"
        ));
        institutionsMap.put("621", new SpeiInstitution(
                "621",
                "CB ACTINVER",
                "Actinver Casa de Bolsa, S.A. de C.V."
        ));
        institutionsMap.put("622", new SpeiInstitution(
                "622",
                "OACTIN",
                "OPERADORA ACTINVER, S.A. DE C.V."
        ));
        institutionsMap.put("623", new SpeiInstitution(
                "623",
                "SKANDIA",
                "Skandia Vida, S.A. de C.V."
        ));
        institutionsMap.put("626", new SpeiInstitution(
                "626",
                "CBDEUTSCHE",
                "Deutsche Securities, S.A. de C.V. CASA DE BOLSA"
        ));
        institutionsMap.put("627", new SpeiInstitution(
                "627",
                "ZURICH",
                "Zurich Compañía de Seguros, S.A."
        ));
        institutionsMap.put("628", new SpeiInstitution(
                "628",
                "ZURICHVI",
                "Zurich Vida, Compañía de Seguros, S.A."
        ));
        institutionsMap.put("629", new SpeiInstitution(
                "629",
                "SU CASITA",
                "Hipotecaria Su Casita, S.A. de C.V. SOFOM ENR"
        ));
        institutionsMap.put("630", new SpeiInstitution(
                "630",
                "CB INTERCAM",
                "Intercam Casa de Bolsa, S.A. de C.V."
        ));
        institutionsMap.put("631", new SpeiInstitution(
                "631",
                "CI BOLSA",
                "CI Casa de Bolsa, S.A. de C.V."
        ));
        institutionsMap.put("632", new SpeiInstitution(
                "632",
                "BULLTICK CB",
                "Bulltick Casa de Bolsa, S.A., de C.V."
        ));
        institutionsMap.put("633", new SpeiInstitution(
                "633",
                "STERLING",
                "Sterling Casa de Cambio, S.A. de C.V."
        ));
        institutionsMap.put("634", new SpeiInstitution(
                "634",
                "FINCOMUN",
                "Fincomún, Servicios Financieros Comunitarios, S.A. de C.V."
        ));
        institutionsMap.put("636", new SpeiInstitution(
                "636",
                "HDI SEGUROS",
                "HDI Seguros, S.A. de C.V."
        ));
        institutionsMap.put("637", new SpeiInstitution(
                "637",
                "ORDER",
                "Order Express Casa de Cambio, S.A. de C.V."
        ));
        institutionsMap.put("638", new SpeiInstitution(
                "638",
                "AKALA",
                "Akala, S.A. de C.V., Sociedad Financiera Popular"
        ));
        institutionsMap.put("640", new SpeiInstitution(
                "640",
                "CB JPMORGAN",
                "J.P. Morgan Casa de Bolsa, S.A. de C.V. J.P. Morgan Grupo Financiero"
        ));
        institutionsMap.put("642", new SpeiInstitution(
                "642",
                "REFORMA",
                "Operadora de Recursos Reforma, S.A. de C.V., S.F.P."
        ));
        institutionsMap.put("646", new SpeiInstitution(
                "646",
                "STP",
                "Sistema de Transferencias y Pagos STP, S.A. de C.V.SOFOM ENR"
        ));
        institutionsMap.put("647", new SpeiInstitution(
                "647",
                "TELECOMM",
                "Telecomunicaciones de México"
        ));
        institutionsMap.put("648", new SpeiInstitution(
                "648",
                "EVERCORE",
                "Evercore Casa de Bolsa, S.A. de C.V."
        ));
        institutionsMap.put("649", new SpeiInstitution(
                "649",
                "SKANDIA",
                "Skandia Operadora de Fondos, S.A. de C.V."
        ));
        institutionsMap.put("651", new SpeiInstitution(
                "651",
                "SEGMTY",
                "Seguros Monterrey New York Life, S.A de C.V."
        ));
        institutionsMap.put("652", new SpeiInstitution(
                "652",
                "ASEA",
                "Solución Asea, S.A. de C.V., Sociedad Financiera Popular"
        ));
        institutionsMap.put("653", new SpeiInstitution(
                "653",
                "KUSPIT",
                "Kuspit Casa de Bolsa, S.A. de C.V."
        ));
        institutionsMap.put("655", new SpeiInstitution(
                "655",
                "SOFIEXPRESS",
                "J.P. SOFIEXPRESS, S.A. de C.V., S.F.P."
        ));
        institutionsMap.put("656", new SpeiInstitution(
                "656",
                "UNAGRA",
                "UNAGRA, S.A. de C.V., S.F.P."
        ));
        institutionsMap.put("659", new SpeiInstitution(
                "659",
                "OPCIONES EMPRESARIALES DEL NOROESTE",
                "OPCIONES EMPRESARIALES DEL NORESTE, S.A. DE C.V., S.F.P."
        ));
        institutionsMap.put("670", new SpeiInstitution(
                "670",
                "LIBERTAD",
                "Libertad Servicios Financieros, S.A. De C.V."
        ));
        institutionsMap.put("901", new SpeiInstitution(
                "901",
                "CLS",
                "Cls Bank International"
        ));
        institutionsMap.put("902", new SpeiInstitution(
                "902",
                "INDEVAL",
                "SD. Indeval, S.A. de C.V."
        ));
        institutionsMap.put("999", new SpeiInstitution(
                "999",
                "N/A",
                "N/A"
        ));

        return institutionsMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpeiInstitution that = (SpeiInstitution) o;
        return Objects.equals(id, that.getId()) &&
                Objects.equals(shortName, that.getShortName()) &&
                Objects.equals(detail, that.getDetail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shortName, detail);
    }
}

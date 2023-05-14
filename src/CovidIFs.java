public class CovidIFs {
    public static void main(String[] args) {

        float bodyTemperature = 38.5f;
        boolean difficultyBreathing = false;
        boolean diabetes = false;
        boolean cancer = false;
        boolean isPregnant = false;
        boolean isOver60yearsold = false;
        boolean hepatic = false;
        boolean kidneyDisease = false;
        boolean respiratoryDisease = false;
        String province = "Alicante";

        String res = covid(bodyTemperature, difficultyBreathing, diabetes, cancer, isPregnant,
                isOver60yearsold, hepatic, kidneyDisease, respiratoryDisease, province);

        System.out.println("Resultado: " + res);
    }
    public static String covid(float bodyTemperature, boolean difficultyBreathing, boolean diabetes, boolean cancer, boolean isPregnant, boolean isOver60yearsold, boolean hepatic, boolean kidneyDisease, boolean respiratoryDisease, String province) {
        boolean isHighTemperature = bodyTemperature >= 38;
        boolean otherSymptoms = diabetes || cancer || isPregnant || isOver60yearsold || hepatic ||
                kidneyDisease || respiratoryDisease;

        if (isHighTemperature &&
           (difficultyBreathing && otherSymptoms) ||
                otherSymptoms ) {
            return "/diagnostico/" + province;
        } else if (isHighTemperature) {
            return "/cuarentena/";
        } else {
            return "/diagnostico_bueno/";
        }
    }
}

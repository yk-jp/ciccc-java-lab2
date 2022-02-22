package classes;

public class Canada {
    private Province[] provinces;

    public Canada() {
        this.provinces = new Province[]{
                new Province("Ontario", "Toronto", 14223942)
                , new Province("Quebec", "Quebec City", 8501833)
                , new Province("British Columbia", "Victoria", 5000879)
                , new Province("Alberta", "Edmonton", 4262635)
                , new Province("Manitoba", "Winnipeg", 1342153)
                , new Province("Saskatchewan", "Regina", 1132505)
                , new Province("Nova Scotia", "Halifax", 969383)
                , new Province("New Brunswick", "Fredericton", 775610)
                , new Province("Newfoundland and Labrador", "St. John’s", 510550)
                , new Province("Prince Edward Island", "Charlottetown", 154331)
        };
    }

    public void displayAllProvinces() {
        for (Province province : this.provinces) {
            System.out.println(province.getDetails());
        }
    }

    public int getNumOfProvincesBetween(int min, int max) {
        int count = 0;
        long convertingUnit = 1000000;

        for (Province province : this.provinces) {
            if (min * convertingUnit <= province.getPopulation() && province.getPopulation() <= max * convertingUnit) {
                count++;
            }
        }
        return count;
    }

    public void setProvinces(Province[] provinces) {
        this.provinces = provinces;
    }

    public Province[] getProvinces() {
        return provinces;
    }
}

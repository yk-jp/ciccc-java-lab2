package classes;

public class Province {
    final static String[] canadaProvince = new String[]{"British Columbia", "Alberta", "Saskatchewan", "Manitoba",
            "Ontario", "Quebec", "New Brunswick", "Nova Scotia", "Prince Edward Island", "Newfoundland and Labrador"};
    final static String[] canadaCapital = new String[]{"Victoria", "Edmonton", "Regina", "Winnipeg", "Toronto",
            "Quebec City", "Fredericton", "Halifax", "Charlottetown", "St. John’s"};
    final private long DEFAULT_POPULATION = 4648055;
    final private String DEFAULT_PROVINCE = "British Columbia";
    final private String DEFAULT_CAPITAL = "Victoria";
    private String name;
    private String capital;
    private long population;

    public Province() {
        setPopulation(DEFAULT_POPULATION);
        setName(DEFAULT_PROVINCE);
        setCapital(DEFAULT_CAPITAL);
    }

    public Province(String name, String capital, long population) {
        if (isValidPopulation(population) && (isValidProvince(name))
                && (isValidCapitalCity(capital))) {
            this.name = name;
            this.capital = capital;
            this.population = population;
        } else {
            this.population = DEFAULT_POPULATION;
            this.name = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
        }
    }

    public String getDetails() {
        return "The capital of " + getName() + " (population. " + getPopulation() + ") is " + getCapital() + ".\n";
    }

    private boolean isValidPopulation(long population) {

        return 30000 <= population && population <= 15000000;
    }

    private boolean isValidProvince(String name) {
        for (String option : Province.canadaProvince) {
            if (name.equals(option)) return true;
        }

        return false;
    }

    private boolean isValidCapitalCity(String capital) {
        for (String option : Province.canadaCapital) {
            if (capital.equals(option)) return true;
        }

        return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public long getPopulation() {
        return population;
    }
}

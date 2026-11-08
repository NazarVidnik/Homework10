package part1;

public class ComputerGames {
    private int price;
    private int hoursSpend;
    private String name;
    private boolean downloaded;
    private String genre;

    // constructor
    public ComputerGames(int price, int hoursSpend, String name, boolean downloaded, String genre) {
        this.price = price;
        this.hoursSpend = hoursSpend;
        this.name = name;
        this.downloaded = downloaded;
        this.genre = genre;
    }

    // --- (Getters) ---
    public int getPrice() {
        return price;
    }
    public int getHoursSpend() {
        return hoursSpend;
    }

    public String getName() {
        return name;
    }

    public boolean isDownloaded() {
        return downloaded;
    }

    public String getGenre() {
        return genre;
    }

    // --- (Setters) ---
    public void setPrice(int price) {
        this.price = price;
    }

    public void setHoursSpend(int hoursSpend) {
        this.hoursSpend = hoursSpend;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDownloaded(boolean downloaded) {
        this.downloaded = downloaded;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double calculateCostPerHour() {
        if (hoursSpend == 0) {
            return 0.0;
        }
        return (double) price / hoursSpend;
    }
    public void printInfo() {
        IO.println("=== Game Information ===");
        IO.println("Name: " + this.name);
        IO.println("Genre: " + this.genre);
        IO.println("Price: $" + this.price);
        IO.println("Hours spent: " + this.hoursSpend);
        IO.println("Downloaded: " + (this.downloaded ? "Yes" : "No"));
        IO.println("Cost per hour: $" + String.format("%.2f", this.calculateCostPerHour()));
        IO.println("------------------------");
    }
}
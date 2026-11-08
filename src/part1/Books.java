package part1;

public class Books {
     private String name;
     private int pages;
     private String genres;
     private int currentPage;

     public Books(String name, int pages, String genres, int currentPage){
          this.name = name;
          this.pages = pages;
          this.genres = genres;
          this.currentPage = currentPage;
     }

     // --- (Getters) ---
     public String getName() {
          return name;
     }

     public int getPages() {
          return pages;
     }

     public String getGenres() {
          return genres;
     }

     public float getcurentPage() {
          return currentPage;
     }

     // --- (Setters) ---
     public void setName(String name) {
          this.name = name;
     }

     public void setPages(int pages) {
          this.pages = pages;
     }

     public void setGenres(String genres) {
          this.genres = genres;
     }

     public void setcurentPage(int curentPage) {
          this.currentPage = curentPage;
     }

     private float calculateCompletePercent(){
          if (pages == 0) return 0.0f;
          return ((float) currentPage / pages) * 100;
     }

     public void printInfo() {
          IO.println("=== Book Information ===");
          IO.println("Name: " + this.name);
          IO.println("Total pages: " + this.pages);
          IO.println("Current page: " + this.currentPage);
          IO.println("Genre: " + this.genres);
          IO.println("Completed: " + this.calculateCompletePercent() + "%");
          IO.println("------------------------");
     }
}
//Movie: Private: movieName, rating
//Constructor and using Getter. Display details.

public class movie {
    private String name;
    private int rating;
    movie(String name, int rating){
        this.name=name;
        this.rating=rating;
    }
    public String getName(){
        return name;
    }
    public int getRating(){
        return rating;
    }
    public static void main(String[] args){
        movie m=new movie("insidious",5);
        System.out.println("Movie name: " + m.getName());
        System.out.println("Movie rating: " + m.getRating());
    }
}

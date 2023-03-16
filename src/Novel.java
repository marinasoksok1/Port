import java.util.Objects;

public class Novel {
    String title;
    int editionYear;

    public Novel(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Novel novel = (Novel) o;
        return editionYear == novel.editionYear && Objects.equals(title, novel.title);
    }



    public static void main(String[] args) {
        Novel novel = new Novel ("");
        System.out.println("Novel is titled " + novel.getTitle());
        Novel nov1, nov2, nov3;
        nov1 = new Novel ("Oliver Twist");
        nov2 = new Novel ("Oliver Twist");
        nov3 = nov1;
        System.out.println(nov1 == nov2);
        System.out.println(nov1 == nov3);
        System.out.println(nov1.equals(nov2));
        System.out.println(nov1.equals(nov3));
        nov1.setTitle("Another title");
        System.out.println("nov1: "+nov1.getTitle()+" nov3: "+nov3.getTitle());
    }
}

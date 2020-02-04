import behaviours.IReviewed;
import java.util.ArrayList;

public class ThemePark{

    private ArrayList<IReviewed> entertainments;

    public ThemePark(){
        this.entertainments = new ArrayList<IReviewed>();
    }

    public void addEntertainment(IReviewed entertainment){
        this.entertainments.add(entertainment);
    }

    public int getEntertainmentCount(){
        return this.entertainments.size();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return this.entertainments;
    }


}

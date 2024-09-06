package Ooops.EnumExamples;

public class Basic {
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // These are enum constants.
        // Public, Static and Final.
        // Since it's final so you can't create any child enums.
        // Type is week.
        Week(){
            System.out.println("Constructor called for " + this);
        }
        // This is not public or protected, only private or default.
        // We don't want to create objects.
        // This is not the enum concept that's why.
        // Internally: public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Sunday;
//        for(Week day :  Week.values()){k
//            System.out.println(day);
//        }
        System.out.println(week.ordinal());
    }
}

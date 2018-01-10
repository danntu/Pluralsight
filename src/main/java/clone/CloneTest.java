package clone;

public class CloneTest {
    public static void main(String[] args) {
        DollySheet dollySheet = new DollySheet();
        DollySheet dollySheet2 = null;
        try {
            dollySheet2 =(DollySheet) dollySheet.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        DollySheet dollySheet3=foo(dollySheet2);

        dollySheet.setName("Dolly");
        dollySheet2.setName("Sheet");
        dollySheet3.setName("Molly");

        System.out.println(dollySheet.getName());
        System.out.println(dollySheet2.getName());
        System.out.println(dollySheet3.getName());
    }

    public static DollySheet foo(DollySheet dollySheet2){
        DollySheet sheet = null;
        try {
            sheet = (DollySheet) dollySheet2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheet;
    }
}

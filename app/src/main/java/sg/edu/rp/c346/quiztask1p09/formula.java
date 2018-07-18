package sg.edu.rp.c346.quiztask1p09;

public class formula {

    private String areaOr;
    private String steps;
    private String type;


    public formula(String Area, String Steps, String Type) {
        areaOr = Area;
        steps = Steps;
        type = Type;

    }

    public String getAreaOr() {
        return areaOr;
    }

    public void setAreaOr(String areaOr) {
        this.areaOr = areaOr;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    //tostring()


    @Override
    public String toString() {
        return "formula{" +
                "areaOr='" + areaOr + '\'' +
                ", steps='" + steps + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}


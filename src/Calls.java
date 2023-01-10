class Calls {
    public static final double LOCAL = 0;
    public static final double PROVINCIAL;

// COST
    public static final double LOCAL = 15;
    public static final double BAND1 = 20;
    public static final double BAND2 = 25;
    public static final double BAND3 = 30;

    private String origin;
    private String destination;
    private int duration;
    private int timeband;
    private int cost;

    Call (String or, String dest, int dur,int tb){
        origin = or;
        destination = dest;
        duration = dur;
        timeband = tb;
        switch (tb){
            case 1:
                cost= duration + LOCAL;
                break;
            case 2:
                cost= duration + BAND1;
                break;
            case 3:
                cost= duration + BAND2;
                break;
            case 4:
                cost= duration + BAND3;
                break;
            default:
                cost= 0;
                break;
        }
        public String  toString(){
            return origin + "-" + destination + "=" + duration;
        }
    }

}

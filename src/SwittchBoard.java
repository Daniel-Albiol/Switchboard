 class SwittchBoard<PhoneCall, PhoneCalls> {
    private final static int NUM_CALLS = 100;
    public PhoneCalls[] calls = new PhoneCalls[NUM_CALLS];
    private int count;

    public SwittchBoard(){
        count = 0;
    }
    public void registerCall(PhoneCalls c){
        calls[count] = c;
        count = count + 1;
    }

    public static int getNumCalls() {
        return count;
    }
}

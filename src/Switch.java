public class Switch {
    private String switch_calling;
    private boolean switch_result;

    public Switch(String switch_calling, boolean switch_result) {
        this.switch_type = switch_calling;
        this.switchvalue = switch_result;
    }

    public boolean getSwitch_result() {
        return switch_result;
    }

    public void setSwitch_result(boolean switch_result) {
        this.switch_result = switch_result;
        System.out.println(switch_result);
    }


    public String getSwitch_calling() {
        return switch_calling;
    }

    public void setSwitch_calling(String switch_calling) {
        this.switch_calling = switch_calling;
    }

}

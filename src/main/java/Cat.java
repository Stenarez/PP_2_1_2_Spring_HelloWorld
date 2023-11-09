public class Cat {
    private String say;

    @Override
    public String toString() {
        return "Cat{" +
                "say='" + say + '\'' +
                '}';
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }
}

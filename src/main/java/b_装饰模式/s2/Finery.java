package b_装饰模式.s2;

public class Finery extends Person {
    private Person person;

    public void decorate(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }
}

public class Program {
    private int myNumber;

    public Program(int myNumber) {
        this.myNumber = myNumber;
    }

    public int test(int inputInt) {
        if (inputInt == myNumber) {
            System.out.println("Tallene er like");
        } else if (inputInt > myNumber) {
            System.out.println("Input tallet er større enn myNumber");
        } else {
            System.out.println("Input tallet er mindre enn myNumber");
        }

        if (inputInt % 5 == 0) {
            System.out.println("Tallet er delelig med 5");
        } else {
            System.out.println("Tallet er ikke delelig med 5");
        }

        if (inputInt % 2 == 0 && inputInt % 3 == 0) {
            System.out.println("Tallet er delelig med 2 og 3");
        } else {
            System.out.println("Tallet er ikke delelig med 2 og 3");
        }

        if (inputInt % 10 == 7 || myNumber % 10 == 7) {
            System.out.println("Et tallene slutter på 7");
        } else {
            System.out.println("Ingen av tallene slutter på 7");
        }

        return myNumber * inputInt;
    }

    public void test2(int inputInt) {
        if(inputInt < 1) {
            System.out.println("Tallet må være større enn null");
            return;
        }

        while (inputInt > 0) {
            if (inputInt % 2 == 0) {
                System.out.println(inputInt);
            }

            inputInt --;
        }
    }
}

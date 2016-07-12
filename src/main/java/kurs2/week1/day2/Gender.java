package kurs2.week1.day2;

/**
 * Created by miha on 12.07.2016.
 */
public enum  Gender {
    MALE{
        public void say(){
            System.out.println("Male");
        }

    },FEMALE{
        public void say(){
            System.out.println("Female");
        }
    };
    public abstract void say();
}

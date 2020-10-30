package demo04;

public class KindMain {
    public static void main(String[] args) {
        useAbstract(new Abstract() {
            @Override
            public void happy() {
                System.out.println("好嗨哦，abstract");
            }
        });

        useInter(new Inter() {
            @Override
            public void happy() {
                System.out.println("好嗨哦， Inter");
            }
        });

        useNormal(new Normal() {
            @Override
            public void happy() {
                System.out.println("好嗨哦， Normal");
            }
        });


        useInter(() -> System.out.println("好嗨哦， Inter"));
//        useAbstract(() -> System.out.println("好嗨哦， abstract"));
//        useNormal(() -> System.out.println("好嗨哦， Normal"));




    }


    public static void useAbstract(Abstract ab) {
        ab.happy();
    }

    public static void useInter(Inter in) {
        in.happy();
    }

    public static void useNormal(Normal no) {
        no.happy();
    }
}

package inside;

public class Inside {
    private static int propertyOuterClass = 1;

    public static void main(String[] args) {
        Inside.InnerClass in = new Inside().new InnerClass();
        Inside.NestedClass nc = new Inside.NestedClass();
        new Inside().createLocalClass();


        Thread run = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("anonymous");
            }
        });
        run.start();
    }

    private void createLocalClass() {
        class Local {
            Local() {
                System.out.println("I`m local inner class");
            }
        }
        Local local = new Local();
    }


    class InnerClass {
        InnerClass() {
            System.out.println("I`m InnerClass. I have access to " + propertyOuterClass);
        }
    }

    static class NestedClass {
        NestedClass() {
            System.out.println("I`m nested class. I`m member of Outer class");
        }
    }


}

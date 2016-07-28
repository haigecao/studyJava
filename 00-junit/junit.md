###

    使用 junit 测试程序，可以做到局部调试


    @Test

    @before

    @after

    可以定义两个方法，before在测试方法之前执行，after在测试代码之后执行。



    public class Demo {
        private Person p;

        @before
        public void before () {
            p = new Person();
        }

        @Test
        public void test() {
            p.test();
        }

        @after
        public void after() {
            p = null;
        }
    }


    public class Demo {
        private Person p;

        @before
        public static void beforeClass () {
            p = new Person();
        }

        @Test
        public void test() {
            p.test();
        }

        @after
        public static void afterClass() {
            p = null;
        }
    }

    afterClass 和 beforeClass 类的初始化时候执行。
















###

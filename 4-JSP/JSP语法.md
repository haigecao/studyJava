###

    理解JSP，JSP就是一个类似于展示的 ［HTML＋java］ 的代码。

    默认语言是HTML。使用 <% ... %>, 中间插入java代码，处理逻辑。

    跟servlet的相似，JSP是处理样式迅速，servlet是处理逻辑比较有优势。

    指令标示：

        JSP指令标示的语法格式如下：
            <%@ 指令名 属性1="属性值1" 属性2="属性值2" .... %>


            JSP 包含page，include，taglib；3条指令。


###
        page

            <%@ page contentType="text/html"  %>







###


            <%@ improt="java.awt.*, java.util.*" %>
  java.uitl.HashMap


            include 包含的是静态页面。



                一种是说明标签<%@ include  file="xxx.jsp"%>，
                    当前页面可以使用的xxx.jsp的变量和方法。源码级导入。

                一种是动作标签<jsp:include  page="xxx.jsp"/>。

                    所谓静态引入和动态引入，就是说，静态引入就是将引入的JS跟当前的文件中的java合并，然后在编译。
                    动态，就是分别编译，这样，如果文件中有2个同名的方法或者变量，静态引入，就无法编译通过。


###
        隐藏注释
            <%-   -%>

        <!-- --!> 针对浏览器的注释
        <%--  --%> 针对jsp的注释。






###

    表达式

    <%= dd %>       // 这意思就是输出 dd 这个变量的值。



###

    声明

        可以给定义一个类的方法和属性。

        <%!
            int a = 1;
            void test() {
                System.out.println();
            }
        %>




###

    内置对象 几个 个

        response

        request

        out                 // 输出用 out.println("fuck jsp.");

        session             // request.getSession();

                <% page session="false" %>  // 禁用session

        application         // servletContext


        pageContext         // 页面上下文对象，

                getRequest, getRespose, getPage,
                getServletContext, ....


        forward,include




###
















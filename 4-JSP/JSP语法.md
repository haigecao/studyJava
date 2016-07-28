###

    理解JSP，JSP就是一个类似于展示的 ［HTML＋java］ 的代码。

    默认语言是HTML。使用 <% ... %>, 中间插入java代码，处理逻辑。

    跟servlet的相似，JSP是处理样式迅速，servlet是处理逻辑比较有优势。

    指令标示：

        JSP指令标示的语法格式如下：
            <%@ 指令名 属性1="属性值1" 属性2="属性值2" .... %>


            JSP 包含page，include，taglib；3条指令。


###

        JSP的运行机制

            一个是转译阶段，一个是请求阶段。

                转译：JSP ——> servlet类，转成java的类。同时将java类编译成class文件。
                请求：servlet类执行，将响应结果发送到客户端，该阶段class文件，将会被执行为HTML代码。

    第一次执行，会执行2个阶段，第二次以后，就执行2个阶段。


###
        page

            <%@ page language="java" contentType="text/html" pageEncoding="gb2312" %>


###

    指令
        <JSP:XXX></JSP:XXX>

            1) <%@ improt="java.awt.*, java.util.*" %>


            2) include 包含的是静态页面。

            {

                a: 一种是说明标签<%@ include  file="xxx.jsp"%>，
                    当前页面可以使用的xxx.jsp的变量和方法。源码级导入。

                b: 一种是动作标签<jsp:include  page="xxx.jsp"/>。

                    所谓静态引入和动态引入，就是说，静态引入就是将引入的JS跟当前的文件中的java合并，然后在编译。
                    动态，就是分别编译，这样，如果文件中有2个同名的方法或者变量，静态引入，就无法编译通过。

            }



            3) useBean

            4) forward : 请求转发，服务器端条转，浏览器，地址栏不会发生变化

                <JSP:forward page="HelloWorld.jsp"></JSP:forward>页面将跳转到这个页面。

            5） param
                <JSP:param name="hg 参数名" value="value 参数值"></JSP:param>

###
    注释

        隐藏 注释
            <%-   -%>

        <!-- --!> 针对浏览器的注释
        <%--  --%> 针对jsp的注释。





###

    JSP 声明

        <%!
            code
        %>


        可以给定义一个类的方法和属性。

        <%!
            int a = 1;
            void test() {
                System.out.println();
            }
        %>




###

    JSP 表达式

        <%= dd %>       // 这意思就是输出 dd 这个变量的值。




###

    JSP 脚本

        将java代码插入进去。





###

    内置对象 9个


    响应对象
        response        HttpServletResponse
                            可以用来添加cookie，添加头，设置页面重定向。。。
                        重定向
                            sendRedirect(url); 重定向到url。

    请求信息：

        request         HttpServletRequest 接口实例。

                        request.setAttribute("key", "value");
                        (String)request.getAttribute("Key");    // 获取的是object类型。

                        request.getParameterNames();
                        request.getParameterValues();           // 获取多个


        out                 // 输出用 out.println("fuck jsp.");

    session:

        session:

                    session.getCreationTime();  // 取得session生成的时间
                    session.getId()             // 获取session ID
                    session.isNow(); ....等等。。。

                    request.setSession();
                    request.getSession();

                            <% page session="false" %>  // 禁用session



    与服务器相关，重启就更新，最大范围。一直保存在服务器。

        application

        servletContext

    pageContext         // 页面上下文对象，

            getRequest, getRespose, getPage,
            getServletContext, ....








### JSTL 标签库

    EL表达式

        EL提供多种运算符操作。算数，关系，逻辑。

            ${1 + 1}  --> 输出  --> 2


        查找范围

            pageContext --> request --> session --> application.

























###
















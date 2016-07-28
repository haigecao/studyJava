###
    servlet 在MVC中是一个控制器状态。

    servlet 的功能
        1）读取客户端发来的显示信息（表单信息）
        2）读取客户端发来的隐式信息（请求头信息）
        3）生成相应的结果
        4）发送显示信息给客户端（html）
        5）发送隐式数据到客户端（状态码和隐藏头信息）


    servlet 工作原理

        HttpServletRequest   请求类
        HttpServletResponse     响应类
        servlet 3.0 默认是没有web.xml文件的。


    映射关系

        类的接口 < —— >网页之间的映射。


            servlet-name 和 servlet-class 映射关系
                找到类和包之间的关系。

            <servlet>
                <servlet-name>XXXX</servlet-name>
                <servlet-class>com.geel.demo.MyServlet</servlet-class>
            </servlet>

            <servlet-mapping>
                <servlet-name>XXXX</servlet-name>
                <url-pattern>/hello.html</url-pattern>
            </servlet-mapping>

            通过

                servlet-name --> servlet-class --> url-pattern
                将URL和类对应，XXXX 就是一个表示，写啥都行。


###
        提交表单

            <form action="get/post"></form>

            servlet 生命周期
            {
                构造函数
                init
                doGet
                doPost
                destory
            }


        在没有JSP之前，用servlet动态输出一个页面。
        PrintWrite out = request.getWrite();
        out.write("<h1>Hello world</h1>");

###

    可以在web.xml中配置参数

    <context-param>
        <param-name>geek</param-name>
        <param-value>http://www.baidu.com</param-value>
    </context-param>

    // 在java中使用如下方法，获取key-->value
    String str = this.getServletContext().getInitParameter("geek");
    out.print(str);


###

    页面导航

        1）请求重定向
            resp.sendRedirect("http://www.baidu.com");

        2) forward
            跳转到Print
            request.getRequestDispatcher("Print").forward(request, response);

        3) include
            包含是2个页面的内容一起。forward只是一个跳转。
            request.getRequestDispatcher("Print").include(request, response);




###

    servlet 处理表单

        input，text，password，radio，checkout，hidden，
        file，button，reset，submit，select，textarea。。。。。


        request.getParameter("key");        // 单个的数据表单
        request.getParameterValues("name"); // 多个重名的数据表单





###
    头信息

    请求头信息

        Enumeration<String> enum1 = request.getHeaderNames();
        while (enum1.hasMoreElements()) {
            String name = enum1.nextElement();
            String value = request.getHeader(name);

            System.out.println(name + " " + value);
        }


    响应头信息

        response.header


###
    cookie

        下次自动登录。
        是保存在客户端中的key－value。用来标识用户的一些信息。

        setMaxAge(t); 设定时间

    设定cookie
        Cookie c = new Cookie("key", "value");
        c.setMaxAge(60*60*24*7);
        response.addCookie(c);


    获取cookie

        Cookie[] cs = request.getCookies();
        for (Cookie c: cs) {
            System.out.println(cs.getName() + " " + cs.getValue())
        }



###

    session
        会话，是浏览器和服务器之间的对话。

        request.getSession()


        session.setAttribute("key", "value")



###

    servlet 共享变量

        ——setAttribute("key", obj);
        ——getAttribute("key");

    变量的作用域，
        ServletContext：     范围最大，应用程序级别，整个项目都能访问。［跨浏览器，跨端］
        HttpSession：        次之，会话级别的。 ［对应的来说是浏览器级别的］
        HttpServletRequest： 范围最小，请求级别，请求结束，的作用域也结束。［页面级别的作用域，无法跨浏览器］




###

    Filter
        1——）过滤器

            位于客户端和请求资源之间，在此起到过滤作用。
            资源请求可以是， Servlet, JSP页面，HTML页面。


        2——）如下几方面：

            Session管理
            权限验证
            日志记录
            字符编码转换


        3——实例创建 Filter

            <filter>
                <filter-name>MyFilter</filter-name>
                <filter-class>com.geel.demo.MyFilter</filter-class>
            </filter>

            <filter-mapping>
                <filter-name>MyFilter</filter-name>
                <url-pattern>/*</url-pattern>
            </filter-mapping>


            package com.geel.demo;

            import java.io.IOException;

            import javax.servlet.Filter;
            import javax.servlet.FilterChain;
            import javax.servlet.FilterConfig;
            import javax.servlet.ServletException;
            import javax.servlet.ServletRequest;
            import javax.servlet.ServletResponse;

            import com.sun.net.httpserver.Filter.Chain;

            public class MyFilter implements Filter {

                @Override
                public void destroy() {
                    // TODO Auto-generated method stub

                }

                @Override
                public void doFilter(ServletRequest req, ServletResponse res,
                        FilterChain chain) throws IOException, ServletException {

                    System.out.print("doFilter....");

                    chain.doFilter(req, res);   // 过滤链，继续向后传递，如果不写，就中断了。

                }

                @Override
                public void init(FilterConfig arg0) throws ServletException {
                    // TODO Auto-generated method stub

                }

            }

        每次调用都会执行，打印 ——> doFilter....


        filter可以做权限验证。











###

    总结 servlet 作用

        响应用户请求；
        获取表单；
        调用后台逻辑，包括业务逻辑和数据逻辑；
        页面之间的导航。











###

###

    通过浏览器访问web项目。

    1）虚拟目录的映射方式一：在server.xml文件的host元素中配置.

    如下：

    1 <Host name="localhost"  appBase="webapps"
    2              unpackWARs="true" autoDeploy="true"
    3              xmlValidation="false" xmlNamespaceAware="false">
    4
    5          <Context path="/JavaWebApp" docBase="F:\JavaWebDemoProject" />
    6  </Host>

    然后访问：
        http://127.0.0.1:8080/JavaWebApp/
            等价于 访问目录 http://127.0.0.1:8080/F:\JavaWebDemoProject/


    2） 通过将项目移入webapps目录下，也可以访问。
            http://127.0.0.1:8080/JavaWebDemoProject/index.html




###

    Tomcat服务器配置虚似主机


        1 <Host name="www.gacl.cn" appBase="F:\JavaWebApps">
        2
        3 </Host>










###





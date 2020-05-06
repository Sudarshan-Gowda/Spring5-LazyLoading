# Spring5-LazyLoading
Lazy Loading in Spring Core

### Introduction:
In Spring application by default "<b>application context</b>" eagerly creates and initializes all singleton scoped  beans during application startup itself. It helps in detecting the any bean configuration issues at early stage, in most of the cases. But sometimes, we may need to use some or all beans to be lazy initialized due to different project requirements.


### Spring provides two easy ways to configure lazy initialization of beans 
<ol>
  <li>java based configuration</li>
   <li>XML based configuration</li>
</ol>


### Java Based Configuration:
To work with Java side configuration, use @Lazy annotation to load the bean lazily.


### XML Based Configuration:
<ul>
  <li>To enable lazy loading for specific beans, use <b>lazy-init="true"</b> attribute on bean definitions in bean configuration xml  files.

    <bean id="technologyService"
		class="com.star.sud.xmlbased.service.TechnologyServiceImpl" lazy-init="true"></bean>
</li>
  
  
  <li>In case to enable lazy loading for all beans, use <b>default-lazy-init="true"</b> attribute on beans tag in bean configuration xml files.

      <beans default-lazy-init="true">
        <bean id="technologyService"
          class="com.star.sud.xmlbased.service.TechnologyServiceImpl">
        </bean>
      </beans>

  </li>
</ul>  


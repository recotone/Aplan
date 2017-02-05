package com.aplan.app.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;
import org.thymeleaf.templateresolver.UrlTemplateResolver;

@Component
@Configuration
@ConfigurationProperties(prefix = "thymeleaf")
public class ThymeleafConfig {

  private String hostAndPort;
  


  /**
   * @return the hostAndPort
   */
  public String getHostAndPort() {
    return hostAndPort;
  }

  /**
   * @param hostAndPort the hostAndPort to set
   */
  public void setHostAndPort(String hostAndPort) {
    this.hostAndPort = hostAndPort;
  }

  @Bean
  public UrlTemplateResolver templateResolver() {
//    FileTemplateResolver resolver = new FileTemplateResolver();
//    ServletContextTemplateResolver resolver = new ServletContextTemplateResolver();
    UrlTemplateResolver resolver = new UrlTemplateResolver();
    resolver.setPrefix(hostAndPort);
    resolver.setSuffix(".html");
    resolver.setTemplateMode("LEGACYHTML5");
    resolver.setCacheable(false);
    return resolver;
  }

  @Bean
  public ResourceBundleMessageSource messageSource() {
    ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
    messageSource.setBasename("messages");
    //messageSource.setDefaultEncoding("UTF-8");
    return messageSource;
  }

}

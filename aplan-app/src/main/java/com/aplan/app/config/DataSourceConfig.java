package com.aplan.app.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "datasource")
public class DataSourceConfig {

  private String url;

  private String username;

  private String password;

  private int minIdleConnSize = 1;

  private int initConnSize = 1;

  private int maxActiveConnSize = 20;
  
  private String driver;

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public int getInitConnSize() {
    return initConnSize;
  }

  public void setInitConnSize(int initConnSize) {
    this.initConnSize = initConnSize;
  }

  public int getMaxActiveConnSize() {
    return maxActiveConnSize;
  }

  public void setMaxActiveConnSize(int maxActiveConnSize) {
    this.maxActiveConnSize = maxActiveConnSize;
  }

  public int getMinIdleConnSize() {
    return minIdleConnSize;
  }

  public void setMinIdleConnSize(int minIdleConnSize) {
    this.minIdleConnSize = minIdleConnSize;
  }

  /**
   * @return the driver
   */
  public String getDriver() {
    return driver;
  }

  /**
   * @param driver the driver to set
   */
  public void setDriver(String driver) {
    this.driver = driver;
  }

}

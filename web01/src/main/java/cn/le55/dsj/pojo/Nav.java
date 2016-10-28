package cn.le55.dsj.pojo;

import java.math.BigInteger;
import java.util.Date;

public class Nav
{
    private  long id; 
    private  String name; 
    private  int parentid; 
    private  String css; 
    private  String url; 
    private  int target; 
    private  int taxis; 
    private  int language; 

  public long getId() { return id;} 
  public void setId(long _id) { id = _id;} 


  public String getName() { return name;} 
  public void setName(String _name) { name = _name;} 


  public int getParentid() { return parentid;} 
  public void setParentid(int _parentid) { parentid = _parentid;} 


  public String getCss() { return css;} 
  public void setCss(String _css) { css = _css;} 


  public String getUrl() { return url;} 
  public void setUrl(String _url) { url = _url;} 


  public int getTarget() { return target;} 
  public void setTarget(int _target) { target = _target;} 


  public int getTaxis() { return taxis;} 
  public void setTaxis(int _taxis) { taxis = _taxis;} 


  public int getLanguage() { return language;} 
  public void setLanguage(int _language) { language = _language;} 

}

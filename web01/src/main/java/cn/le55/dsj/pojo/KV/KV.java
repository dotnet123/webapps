package cn.le55.dsj.pojo.KV;

import java.math.BigInteger;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class KV
{
    private  Long id; 
    private  String mykey; 
    private  String myvalue; 

  public Long getId() { return id;} 
  public void setId(Long _id) { id = _id;} 


  public String getMykey() { return mykey;} 
  public void setMykey(String _mykey) { mykey = _mykey;} 


  public String getMyvalue() { return myvalue;} 
  public void setMyvalue(String _myvalue) { myvalue = _myvalue;} 

}

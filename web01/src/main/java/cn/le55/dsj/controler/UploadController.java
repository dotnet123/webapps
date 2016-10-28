package cn.le55.dsj.controler;

import cn.le55.dsj.pojo.Msg;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/upload")
public class UploadController {

    @Autowired
    private HttpServletRequest request;
    final Gson gson = new Gson();
    @ResponseBody
    @RequestMapping("/upload2json")
    public String upload2json(MultipartFile imgFile) {
        String retUrl = "";
        MultipartFile file = imgFile;

        Map<String, Object> map = new HashMap<String, Object>();
        try {
            if (!file.isEmpty()) {
                // 文件保存路径
                String filePath = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/statics/kindeditor/attached/";
                String fileExt = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1).toLowerCase();
                SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
                String newFileName = df.format(new Date()) + "_" + new Random().nextInt(1000) + "." + fileExt;
                retUrl = "/kindeditor/attached/" + newFileName;
                // 转存文件
                file.transferTo(new File(filePath + newFileName));
                map.put("error", 0);
                map.put("url", retUrl);
               Msg msg= new Msg();
                msg.setBody("zheshiceshgi");
                map.put("test",msg);

            }

        } catch (IOException e) {
            e.printStackTrace();
            map.put("error", 1);
            map.put("url", e.getMessage());
        }

        String str=gson.toJson(map);
        Type type = new TypeToken<Map<String, Object>>() {}.getType();

        Map<String, Object> mm= gson.fromJson(str,type);
        return str;
    }


}

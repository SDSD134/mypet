package com.pet.util;
import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
/*第五步：封装一个处理图片的工具类，大概分为一下几个步骤
(1)验证传入的图片非空
(2)定义图片的存储路径 realPath
(3)得到原始图片名：xxoo.jpg
(4)创建新的唯一图片名 = uuidName + .扩展名  9d76abf6-2702-4d18-881d-4e151b5445f3.jpg
(5)封装上传的文件将要存储的 全路径 = 路径 + 文件名
C:\java\ide-workspace\project-a\pa-web\target\pa-web\libs\img\9d76abf6-2702-4d18-881d-4e151b5445f3.jpg
(6)把图片文件转移至 全路径
(7)返回新图片名 newImageName
第六步：控制器接收数据模型，完成图片的上传，图片名的保存。
1.UserDto是前面封装的数据传输 模型
2.调用第五步封装的工具类完成图片的上传，得到图片唯一的名字
3.把新的图片名保存在user对象
4.保存之后跳转到用户详情页
作者：simple大鱼
        来源：CSDN
        原文：https://blog.csdn.net/weixin_43682869/article/details/84072303
        版权声明：本文为博主原创文章，转载请附上博文链接！*/


public class ImageUtils {
    //上传图片
    public  static String upload(HttpServletRequest request,
                                 MultipartFile pictureFile) throws IOException {
        String imgPath=null;
        //上传图片
        if(pictureFile!=null&&!pictureFile.isEmpty()) {
            String name = UUID.randomUUID().toString().replaceAll("_","");
            //获取文件扩展名
            String ext = FilenameUtils.getExtension(pictureFile.getOriginalFilename());
            //设置图片上传路径
            String url = request.getSession().getServletContext().getRealPath("/upload");
            //校验文件是否存在
            isFolderExists(url);
            //保存图片到路径下
            pictureFile.transferTo(new File(url + "/" + name + "." + ext));
            imgPath="upload/" + name + "." + ext;

        }
        return imgPath;
    }

    //文件目录是否存在
    private static boolean isFolderExists(String imgFolder) {
        File file = new File(imgFolder);
        if (!file.exists()) {
            if (file.mkdir()) {
                return true;
            } else {
                return false;
            }
        }
        return  true;
    }

    //获取目录下所有文件
    public static List<File> getFiles(String realpath, List<File> files) {
        File fileList = new File(realpath);
        if (fileList.isDirectory()) {
            File[] fileArray = fileList.listFiles();
            for (File file: fileArray
                 ) {
                if (file.isDirectory()) {
                    getFiles(file.getAbsolutePath(),files);
                } else {
                    files.add(file);
                }

            }
        }
        return  files;
    }
}

package com.flyfish.guliMall.product;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.PutObjectRequest;
import com.flyfish.guliMall.product.entity.BrandEntity;
import com.flyfish.guliMall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

/**
 * @autohr flyfish
 * @date: 2023/3/7 14:03
 * @description:
 */
@SpringBootTest
public class MallProductApplication {
    @Autowired
    private BrandService brandService;
    @Autowired
    private OSSClient ossClient;


    @Test
    public void demo01() {
        List<BrandEntity> list = brandService.list();
        list.forEach(System.out::println);
    }
    
    
    @Test
    public void demo02() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为Mate30");
        brandEntity.setDescript("麒麟990 5G加持");
        brandService.save(brandEntity);
        System.out.println(brandService.getById(1L));
        System.out.println("============>" + brandService);
    }

    @Test
    public void demo03() {
        System.out.println("=========dsahujdhawuhawhdsjkadsasda");
    }

    @Test
    public void demo04(){
        // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
        String endpoint = "https://oss-cn-shanghai.aliyuncs.com";
        // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
        String accessKeyId = "LTAI5tQzwSgNguJWP2dnUjs3";
        String accessKeySecret = "7UqoBpZSU3G1UIq09LbJlBYUilvExO";
        // 填写Bucket名称，例如examplebucket。
        String bucketName = "gulimall-flyfish";
        // 填写Object完整路径，完整路径中不能包含Bucket名称，例如exampledir/exampleobject.txt。
        String objectName = "dog.png";
        // 填写本地文件的完整路径，例如D:\\localpath\\examplefile.txt。
        // 如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件。
        String filePath= "C:\\Users\\会飞的鱼\\Pictures\\dog.png";
//        String filePath= "E:\\resources\\images\\kil'jaden.jpg";

        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        try {
            // 创建PutObjectRequest对象。
            PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, objectName, new File(filePath));
            // 如果需要上传时设置存储类型和访问权限，请参考以下示例代码。
            // ObjectMetadata metadata = new ObjectMetadata();
            // metadata.setHeader(OSSHeaders.OSS_STORAGE_CLASS, StorageClass.Standard.toString());
            // metadata.setObjectAcl(CannedAccessControlList.Private);
            // putObjectRequest.setMetadata(metadata);

            // 上传文件。
            ossClient.putObject(putObjectRequest);
        } catch (OSSException oe) {
            System.out.println("Caught an OSSException, which means your request made it to OSS, "
                    + "but was rejected with an error response for some reason.");
            System.out.println("Error Message:" + oe.getErrorMessage());
            System.out.println("Error Code:" + oe.getErrorCode());
            System.out.println("Request ID:" + oe.getRequestId());
            System.out.println("Host ID:" + oe.getHostId());
        } finally {
            if (ossClient != null) {
                ossClient.shutdown();
            }
        }
        System.out.println("========>上传成功");
    }

    @Test
    public void demo05(){
        // ossClient.getObject(new GetObjectRequest(bucketName, objectName), new File("pathOfYourLocalFile"));
        try {
            FileInputStream inputStream = new FileInputStream("E:\\resources\\images\\323.png");
            ossClient.putObject("gulimall-flyfish","777.png",inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void demo06(){
//        try {
//            FileInputStream inputStream = new FileInputStream("E:\\resources\\images\\323.png");
//            ossClient.putObject("gulimall-flyfish","323",inputStream);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.out.println("=====>结束");

        System.out.println(ossClient);
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("E:\\resources\\images\\323.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ossClient.putObject("gulimall-ambition","bug.jpg",inputStream);
//        关闭OSSClient
        ossClient.shutdown();
        System.out.println("上传完成...");
    }
}

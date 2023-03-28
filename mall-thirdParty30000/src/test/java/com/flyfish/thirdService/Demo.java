package com.flyfish.thirdService;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @autohr flyfish
 * @date: 2023/3/28 18:23
 * @description:
 */
@SpringBootTest
public class Demo {
    @Resource
    private OSSClient ossClient;

    @Test
    public void demo01(){
        System.out.println("hello world");
    }

    @Test
    public void demo02(){
        System.out.println(ossClient);
//         ossClient.getObject(new GetObjectRequest(bucketName, objectName), new File("pathOfYourLocalFile"));
        try {
            FileInputStream inputStream = new FileInputStream("E:\\resources\\images\\323.png");
            ossClient.putObject("gulimall-flyfish","999.png",inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

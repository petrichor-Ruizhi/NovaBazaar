package com.ruizhili.novabazaar.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NovabazaarThirdPartyApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	OSSClient ossClient;

	@Test
	public void testUpload() throws FileNotFoundException {
//		String endpoint = "oss-us-west-1.aliyuncs.com";
//
//		String accessKeyId = "LTAI5tBBgMkX4goFiF7ijkBz";
//		String accessKeySecret = "uVR7YHRtVIK0zFc4SzanQSxAJw67Ly";
//
//		OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

		InputStream inputStream = new FileInputStream("/Users/liruizhi/Downloads/图片/road1.jpg");
		ossClient.putObject("novabazaar", "1号公路.jpg", inputStream);

		ossClient.shutdown();

		System.out.println("上传完成...");
	}

}

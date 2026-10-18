package com.spring.eks;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;

@RestController
public class DemoController {

    private static final Logger log =
            LoggerFactory.getLogger(DemoController.class);

    @GetMapping("/api/hello")
    public String hello() {
        return "Hey Akash! Finally, your Spring Boot project is deployed in EKS! 🚀";
    }

    @GetMapping("/api/get-pod")
    public String getPod() throws Exception {
        String hostname = InetAddress.getLocalHost().getHostName();
        log.info("Request received at /api/get-pod, handled by pod: {}", hostname);


        return "Hey Akash! Request handled by Pod: " + hostname;
    }

    @GetMapping("/api/pipeline-test")
    public String pipelineTest() {
        return "SUCCESS! \uD83D\uDE80 Fresh commit automatically deployed to EKS! ";
    }
}

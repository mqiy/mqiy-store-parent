package xyz.mqiy.demo.compoent;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.utils.ReferenceConfigCache;
import org.apache.dubbo.rpc.service.GenericService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author chris
 * @Description TODO
 * @Date 2021/5/24 15:11
 */


@Component
public class DubboService {

    @Resource
    RegistryConfig registry;

    public void testCall(){

        // 普通编码配置方式
        ApplicationConfig application = new ApplicationConfig();
        application.setName("chris-consumer");

        ReferenceConfig<GenericService> reference = new ReferenceConfig<GenericService>();
        reference.setApplication(application);
        reference.setRegistry(registry);
        reference.setInterface("xyz.mqiy.demo.service.userService");
        reference.setGeneric(true); // 声明为泛化接口

        ReferenceConfigCache cache = ReferenceConfigCache.getCache();
        GenericService genericService = cache.get(reference);

        // 基本类型以及Date,List,Map等不需要转换，直接调用
        Object result = genericService.$invoke("getById", new String[] { "java.lang.Long" },
                new Object[] { "33" });
        System.out.println(result);

    }




}

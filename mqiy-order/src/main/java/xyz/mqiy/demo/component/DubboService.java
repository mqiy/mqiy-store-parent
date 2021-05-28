package xyz.mqiy.demo.component;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.utils.ReferenceConfigCache;
import com.alibaba.dubbo.rpc.service.GenericService;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Component;
import xyz.mqiy.demo.web.vo.AddUserIvo;

/**
 * @author chris
 * @Description TODO
 * @Date 2021/5/24 15:11
 */


@Component
public class DubboService {


    public void testCall(){

        // 普通编码配置方式
        ApplicationConfig application = new ApplicationConfig();
        application.setName("chris-consumer");

        RegistryConfig registry = new RegistryConfig();
        registry.setAddress("zookeeper://127.0.0.1:2181");

        ReferenceConfig<GenericService> reference = new ReferenceConfig<GenericService>();
        reference.setApplication(application);
        reference.setRegistry(registry);
        reference.setInterface("xyz.mqiy.demo.service.UserService");

        // 声明为泛化接口
        reference.setGeneric(true);

        ReferenceConfigCache cache = ReferenceConfigCache.getCache();
        GenericService genericService = cache.get(reference);
        // 基本类型以及Date,List,Map等不需要转换，直接调用

        AddUserIvo userIvo = new AddUserIvo();
        userIvo.setName("hdh");

        Object result = genericService.$invoke("save", new String[] { "xyz.mqiy.demo.domain.User" },
                new Object[] {JSON.parseObject(JSON.toJSONString(userIvo))});
        System.out.println(result);

    }



}

package cn.zuoqy.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zuoqiyin on 22:39 2021/8/3.
 */
@Configuration
public class MySelfRule {

    public IRule myRule() {
        return new RandomRule(); // 定义为随机
    }
}

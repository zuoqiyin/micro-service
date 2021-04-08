package cn.zuoqy.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by zuoqy on 19:54 2021/4/8.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable{

    private Long id;
    private String serial;

}

package com.hm.hospitalproject.server;

import com.hm.hospitalproject.entity.Drugs;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 唐贵欣
 * @Date: 2021/01/07/2:16
 * @Description:
 */



public interface DrusServer {

    List<Drugs> getAllDrus();
}

package com.hm.hospitalproject.server;

import com.hm.hospitalproject.entity.RoomInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 唐贵欣
 * @Date: 2021/01/07/1:07
 * @Description:
 */





public interface office {
    List<RoomInfo> getAllroos();
    RoomInfo  findroomByid(int id);



}

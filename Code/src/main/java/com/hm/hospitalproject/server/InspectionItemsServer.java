package com.hm.hospitalproject.server;

import com.hm.hospitalproject.entity.InspectionItems;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 唐贵欣
 * @Date: 2021/01/07/2:24
 * @Description:
 */


public interface InspectionItemsServer {
 List<InspectionItems> getAllItems();
}

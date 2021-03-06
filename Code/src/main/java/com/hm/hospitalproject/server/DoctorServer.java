package com.hm.hospitalproject.server;

import com.hm.hospitalproject.entity.DoctorInfo;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TGX
 * @Auther: 唐贵欣
 * @Date: 2021/01/06/23:54
 * @Description:
 */




public interface DoctorServer {

    public   DoctorInfo getDoctorInfoByshenfenzheng(String shenfenzheng);
    public  List<DoctorInfo> getAllDoctorInfo();
    public   List<DoctorInfo> getpageDoctorInfo(int start,int size);
    public   List<DoctorInfo> getdoctorByroomname(String roomname);
    public   DoctorInfo getDoctorInfoByid(int  doctorId);

}

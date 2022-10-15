package com.ashokit.datacollection.service;

import com.ashokit.datacollection.bean.SaveResponse;
import com.ashokit.datacollection.entity.CitizenEducation;

public interface CitizenEducationService {
    SaveResponse saveEducationDetail(CitizenEducation children);
    CitizenEducation getById(Long id);
}

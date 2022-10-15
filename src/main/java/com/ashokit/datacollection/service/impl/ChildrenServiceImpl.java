package com.ashokit.datacollection.service.impl;

import com.ashokit.datacollection.bean.SaveResponse;
import com.ashokit.datacollection.entity.CitizenChildren;
import com.ashokit.datacollection.repository.CitizenChildrenRepo;
import com.ashokit.datacollection.service.CitizenChildrenService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CitizenChildrenServiceImpl implements CitizenChildrenService {
    final CitizenChildrenRepo childrenRepo;
    @Override
    public SaveResponse saveChildrenDetail(CitizenChildren children) {
        Long parentId = childrenRepo.save(children).getParentId();

        if(parentId != 0)
            return new SaveResponse("Children details saved with parentId " + parentId);

        return new SaveResponse("Children details not saved");
    }

    @Override
    public CitizenChildren getById(Long id) {
        return childrenRepo.findById(id).orElse(null);
    }
}

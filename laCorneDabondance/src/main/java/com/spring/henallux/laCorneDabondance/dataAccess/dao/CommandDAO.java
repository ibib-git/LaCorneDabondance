package com.spring.henallux.laCorneDabondance.dataAccess.dao;

import com.spring.henallux.laCorneDabondance.dataAccess.entity.CommandEntity;
import com.spring.henallux.laCorneDabondance.dataAccess.repository.CommandRepository;
import com.spring.henallux.laCorneDabondance.dataAccess.util.CommandConverter;
import com.spring.henallux.laCorneDabondance.model.CommandModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CommandDAO {

    @Autowired
    private CommandRepository commandRepository;
    @Autowired
    private CommandConverter commandConverter;



    public void insertCommand (CommandModel commandModel)
    {
        CommandEntity commandEntity = new CommandEntity();

        commandEntity =commandConverter.commandModelToEntity(commandModel);
        commandRepository.save(commandEntity);

    }
}

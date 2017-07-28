package com.water.service.Impl;

import com.water.dao.ProjectDao;
import com.water.entity.Project;
import com.water.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.List;

/**
 * Created by Administrator on 2017/7/27.
 */
@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    ProjectDao projectDao;
    public List<Project> findAllProjects() {
        return projectDao.findAll();
    }

    public Project findProjectByID(long idProject) {
        return projectDao.get(idProject);
    }

    @Override
    public long saveProject(Project project) {
        projectDao.save(project);
        return project.getIdProject();
    }

    @Override
    public boolean deleteProject(long projectID) {
        return projectDao.delete(projectID);
    }

    @Override
    public boolean updateProject(Project project) {
        return projectDao.saveOrUpdate(project);
    }


}
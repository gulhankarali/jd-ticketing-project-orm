package com.cybertek.dto;

import com.cybertek.entity.User;
import com.cybertek.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ProjectDTO {

    private String projectCode;
    private String projectName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;
    private UserDTO assignedManager;
    private Status status;
    private String projectDetail;

    private int completeTaskCount;
    private int unfinishedTaskCount;

    public ProjectDTO(String projectCode, String projectName, LocalDate startDate, LocalDate endDate,  UserDTO assignedManager, Status projectStatus, String projectDetail) {
        this.projectName = projectName;
        this.projectCode = projectCode;
        this.assignedManager = assignedManager;
        this.startDate = startDate;
        this.endDate = endDate;
        this.projectDetail = projectDetail;
        this.status = projectStatus;
    }

}

package com.scms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.scms.entity.Complaint;

public interface ComplaintRepository
extends JpaRepository<Complaint,Long>{

}
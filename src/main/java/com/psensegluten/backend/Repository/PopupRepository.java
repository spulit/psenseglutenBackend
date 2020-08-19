package com.psensegluten.backend.Repository;

import com.psensegluten.backend.Entity.Customer;
import com.psensegluten.backend.Entity.PopupEntity;
import org.springframework.data.repository.CrudRepository;

public interface PopupRepository extends CrudRepository<PopupEntity, String> {
}

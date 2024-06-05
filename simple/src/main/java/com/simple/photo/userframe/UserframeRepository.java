package com.simple.photo.userframe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*database에 쿼리를 이용해서 CRUD를 하는 계층(Data Access Layer)*/
@Repository
public interface UserframeRepository extends JpaRepository<Userframe, Long> {
    
}

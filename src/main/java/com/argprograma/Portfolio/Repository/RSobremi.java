
package com.argprograma.Portfolio.Repository;

import com.argprograma.Portfolio.entity.Sobremi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSobremi extends JpaRepository<Sobremi, Long>{
    
}

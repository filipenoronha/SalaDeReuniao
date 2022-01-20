package br.com.dio.saladereuniao.repository;

import br.com.dio.saladereuniao.model.Room;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long>{

}

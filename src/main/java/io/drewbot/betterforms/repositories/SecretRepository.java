package io.drewbot.betterforms.repositories;


import io.drewbot.betterforms.models.Secret;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecretRepository extends CrudRepository<Secret, Long> {

}

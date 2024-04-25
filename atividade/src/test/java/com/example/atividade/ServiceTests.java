package com.example.atividade;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Optional;

import com.example.atividade.models.Person;
import com.example.atividade.repository.PersonRepository;
import com.example.atividade.services.PersonService;

// Isso dai a gente vai estender as funcionalidades do Mockito
@ExtendWith(MockitoExtension.class) 
public class ServiceTests {
    
    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    @Test
    @DisplayName("Teste mockado para criar pessoa")
    void createPerson() {
        Person person = new Person(
            "Aurora",
            "Kruschewsky",
            "Aurora@email.com.br",
            "Uberlândia - Minas Gerais - Brasil",
            "aaaaa");

        when(personRepository.findByEmail(person.getEmail())).thenReturn(Optional.empty());
        when(personRepository.save(person)).thenReturn(person);

        Person savedPerson = personService.create(person);

        assertNotNull(savedPerson);
        assertEquals(person.getFirstName(), savedPerson.getFirstName());
        assertEquals(person.getLastName(), savedPerson.getLastName());
        assertEquals(person.getEmail(), savedPerson.getEmail());
        assertEquals(person.getAddress(), savedPerson.getAddress());
    }
}

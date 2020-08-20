package com.dam.consume.xml.repository;

import com.dam.consume.xml.domain.XMLPayload;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.ANY)
public class XMLPayloadRepositoryTest {

    @Autowired
    private XMLPayloadRepository xmlPayloadRepository;

    @Test
    public void save() throws IOException {
        XMLPayload xmlPayload = new XMLPayload();
        xmlPayload.setXml(Files.readString(Path.of("src/test/resources/notes.xml")));
        XMLPayload xmlPayload1 = xmlPayloadRepository.save(xmlPayload);

        assertNotNull(xmlPayload1);
    }
}
package com.iteration21.udemy.spring.version3withspring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * plain spring in this udemy1 module
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class ComplexBusinessServiceV3ImplTest {

    @Autowired
    ComplexBusinessServiceV3Impl complexBusinessServiceV3Impl;

    //i21c plain SPRINF FRAMEWORK HERE - no boot..
    @Test
    public void isContextUp() {
        assertThat(complexBusinessServiceV3Impl, is(not(nullValue())));

        List names = new ArrayList<String>();
        assertThat(names.size(), is(equalTo(0)));

        complexBusinessServiceV3Impl.executeCommand(names);

        assertThat(names.size(), is(equalTo(1)));
    }


}
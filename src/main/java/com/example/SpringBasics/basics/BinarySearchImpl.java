package com.example.SpringBasics.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private SortAlgorithm sortAlgorithm;

    @Autowired
    public BinarySearchImpl(@Qualifier("bubble") SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numbersToSearchFor) {
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortedNumbers);
        return numbersToSearchFor;
    }

    @PostConstruct
    public void postCons(){
        logger.info("postConstruct");
    }

    @PreDestroy
    public void preDes(){
        logger.info("preDestroy");
    }
}

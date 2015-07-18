package com.opnitech.rules.core.validators;

/**
 * @author Rigre Gregorio Garciandia Sonora
 */
public interface RunnerDefinitionValidator {

    /**
     * Allow to define a common interface for a executable validation
     * 
     * @param executable
     * @throws Exception
     */
    void validate(Object executable) throws Exception;
}

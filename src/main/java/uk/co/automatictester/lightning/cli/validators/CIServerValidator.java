package uk.co.automatictester.lightning.cli.validators;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

import java.util.ArrayList;
import java.util.List;

public class CIServerValidator implements IParameterValidator {

    public void validate(String name, String value) throws ParameterException {
        List<String> ciServers = new ArrayList<>();
        ciServers.add("jenkins");
        ciServers.add("teamcity");

        if (!(ciServers.contains(value.toLowerCase()))) {
            throw new ParameterException(String.format("CI server '%s' not in list: %s", value, ciServers.toString()));
        }
    }
}

package slayer404.web4.validators;

import slayer404.web4.exceptions.ValidationException;

public class ValidatorY extends Validator{

    @Override
    public void validate(String value, String name) throws ValidationException {

        isEmpty(value, name);

        try {
            double val = handleValue(value);

            if (!(val >= -5 && val <= 5)) {
                throw new ValidationException("Value " + name + " out of range.\n");
            }
        } catch (NumberFormatException e) {
            throw new ValidationException("Value " + name + " is incorrect.\n");
        }
    }
}
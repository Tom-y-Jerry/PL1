package es.ulpgc.dacd;

public class PasswordValidatorTest{
    @Test
    public void testValidPassword(){
        PasswordValidator validator = new PasswordValidator();
        validator.isValid();
    }
}
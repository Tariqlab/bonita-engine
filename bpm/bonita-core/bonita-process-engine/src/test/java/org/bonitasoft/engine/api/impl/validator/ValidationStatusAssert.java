package org.bonitasoft.engine.api.impl.validator;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.util.Objects;

/**
 * {@link ValidationStatus} specific assertions - Generated by CustomAssertionGenerator.
 */
public class ValidationStatusAssert extends AbstractAssert<ValidationStatusAssert, ValidationStatus> {

  /**
   * Creates a new <code>{@link ValidationStatusAssert}</code> to make assertions on actual ValidationStatus.
   * @param actual the ValidationStatus we want to make assertions on.
   */
  public ValidationStatusAssert(ValidationStatus actual) {
    super(actual, ValidationStatusAssert.class);
  }

  /**
   * An entry point for ValidationStatusAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myValidationStatus)</code> and get specific assertion with code completion.
   * @param actual the ValidationStatus we want to make assertions on.
   * @return a new <code>{@link ValidationStatusAssert}</code>
   */
  public static ValidationStatusAssert assertThat(ValidationStatus actual) {
    return new ValidationStatusAssert(actual);
  }

  /**
   * Verifies that the actual ValidationStatus's message is equal to the given one.
   * @param message the given message to compare the actual ValidationStatus's message to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ValidationStatus's message is not equal to the given one.
   */
  public ValidationStatusAssert hasMessage(String message) {
    // check that actual ValidationStatus we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpected message of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualMessage = actual.getMessage();
    if (!Objects.areEqual(actualMessage, message)) {
      failWithMessage(assertjErrorMessage, actual, message, actualMessage);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ValidationStatus is valid.
   * @return this assertion object.
   * @throws AssertionError - if the actual ValidationStatus is not valid.
   */
  public ValidationStatusAssert isValid() {
    // check that actual ValidationStatus we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.isValid()) {
      failWithMessage("\nExpected actual ValidationStatus to be valid but was not.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ValidationStatus is not valid.
   * @return this assertion object.
   * @throws AssertionError - if the actual ValidationStatus is valid.
   */
  public ValidationStatusAssert isNotValid() {
    // check that actual ValidationStatus we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.isValid()) {
      failWithMessage("\nExpected actual ValidationStatus not to be valid but was.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

}

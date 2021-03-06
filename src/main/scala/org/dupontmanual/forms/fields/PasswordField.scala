package org.dupontmanual.forms.fields

import org.dupontmanual.forms.validators.ValidationError
import org.dupontmanual.forms.widgets.PasswordInput

/*
 * PasswordField returns the string the user inputs.
 */
/**
 * Creates a new required PasswordField.
 */
class PasswordField(name: String) extends TextField(name) {
  
  /**
   * Sets the widget for the password field.
   */
  override def widget = new PasswordInput(this.required)
}

/**
 * Creates a new optional password field.
 */
class PasswordFieldOptional(name: String) extends TextFieldOptional(name) {
  
  /**
   * Sets the widget for the password field.
   */
  override def widget = new PasswordInput(required=false)
}

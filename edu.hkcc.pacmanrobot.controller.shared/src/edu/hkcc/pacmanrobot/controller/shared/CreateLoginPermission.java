/**
 * 
 */
package edu.hkcc.pacmanrobot.controller.shared;

import java.security.BasicPermission;

/**
 * @author 13058456a
 */
public class CreateLoginPermission extends BasicPermission {

  private static final long serialVersionUID = 1L;

  /**
 * 
 */
  public CreateLoginPermission() {
    super("CreateLogin");
  }
}

/**
 */
package edu.cmu.sei.alisa.alisa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Verification Result Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationResultStatus()
 * @model
 * @generated
 */
public enum VerificationResultStatus implements Enumerator
{
  /**
   * The '<em><b>PASS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PASS_VALUE
   * @generated
   * @ordered
   */
  PASS(0, "PASS", "pass"),

  /**
   * The '<em><b>FAIL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FAIL_VALUE
   * @generated
   * @ordered
   */
  FAIL(1, "FAIL", "fail"),

  /**
   * The '<em><b>NEUTRAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEUTRAL_VALUE
   * @generated
   * @ordered
   */
  NEUTRAL(2, "NEUTRAL", "neutral"),

  /**
   * The '<em><b>UNKNOWN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNKNOWN_VALUE
   * @generated
   * @ordered
   */
  UNKNOWN(3, "UNKNOWN", "unknown");

  /**
   * The '<em><b>PASS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PASS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PASS
   * @model literal="pass"
   * @generated
   * @ordered
   */
  public static final int PASS_VALUE = 0;

  /**
   * The '<em><b>FAIL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FAIL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FAIL
   * @model literal="fail"
   * @generated
   * @ordered
   */
  public static final int FAIL_VALUE = 1;

  /**
   * The '<em><b>NEUTRAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NEUTRAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NEUTRAL
   * @model literal="neutral"
   * @generated
   * @ordered
   */
  public static final int NEUTRAL_VALUE = 2;

  /**
   * The '<em><b>UNKNOWN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UNKNOWN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNKNOWN
   * @model literal="unknown"
   * @generated
   * @ordered
   */
  public static final int UNKNOWN_VALUE = 3;

  /**
   * An array of all the '<em><b>Verification Result Status</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final VerificationResultStatus[] VALUES_ARRAY =
    new VerificationResultStatus[]
    {
      PASS,
      FAIL,
      NEUTRAL,
      UNKNOWN,
    };

  /**
   * A public read-only list of all the '<em><b>Verification Result Status</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<VerificationResultStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Verification Result Status</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VerificationResultStatus get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      VerificationResultStatus result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Verification Result Status</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VerificationResultStatus getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      VerificationResultStatus result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Verification Result Status</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VerificationResultStatus get(int value)
  {
    switch (value)
    {
      case PASS_VALUE: return PASS;
      case FAIL_VALUE: return FAIL;
      case NEUTRAL_VALUE: return NEUTRAL;
      case UNKNOWN_VALUE: return UNKNOWN;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private VerificationResultStatus(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //VerificationResultStatus

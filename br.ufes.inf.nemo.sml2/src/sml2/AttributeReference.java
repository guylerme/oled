/**
 */
package sml2;

import RefOntoUML.Quality;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sml2.AttributeReference#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see sml2.Sml2Package#getAttributeReference()
 * @model
 * @generated
 */
public interface AttributeReference extends ReferableElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Quality)
	 * @see sml2.Sml2Package#getAttributeReference_Type()
	 * @model required="true"
	 * @generated
	 */
	Quality getType();

	/**
	 * Sets the value of the '{@link sml2.AttributeReference#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Quality value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/ocl/examples/OCL body='AttributeLink.allInstances()->select(x | x.getAttribute() = self)->asOrderedSet()->at(1).getEntity()'"
	 *        annotation="Comments getEntity='Returns the Node that owns the AttributeReference.'"
	 * @generated
	 */
	Node getEntity();

} // AttributeReference

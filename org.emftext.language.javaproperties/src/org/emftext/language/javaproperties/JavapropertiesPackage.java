/**
 * Copyright (c) 2006-2011
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany 
 *      - initial API and implementation
 * 
 */
package org.emftext.language.javaproperties;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.emftext.language.javaproperties.JavapropertiesFactory
 * @model kind="package"
 * @generated
 */
public interface JavapropertiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "javaproperties";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.emftext.org/language/javaproperties";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "javaproperties";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavapropertiesPackage eINSTANCE = org.emftext.language.javaproperties.impl.JavapropertiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.emftext.language.javaproperties.impl.PropertySetImpl <em>Property Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.javaproperties.impl.PropertySetImpl
	 * @see org.emftext.language.javaproperties.impl.JavapropertiesPackageImpl#getPropertySet()
	 * @generated
	 */
	int PROPERTY_SET = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SET__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Property Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.javaproperties.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.javaproperties.impl.KeyValuePairImpl
	 * @see org.emftext.language.javaproperties.impl.JavapropertiesPackageImpl#getKeyValuePair()
	 * @generated
	 */
	int KEY_VALUE_PAIR = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__VALUE = 1;

	/**
	 * The feature id for the '<em><b>White Space Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__WHITE_SPACE_BEFORE = 2;

	/**
	 * The feature id for the '<em><b>White Space After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__WHITE_SPACE_AFTER = 3;

	/**
	 * The number of structural features of the '<em>Key Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link org.emftext.language.javaproperties.PropertySet <em>Property Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Set</em>'.
	 * @see org.emftext.language.javaproperties.PropertySet
	 * @generated
	 */
	EClass getPropertySet();

	/**
	 * Returns the meta object for the map '{@link org.emftext.language.javaproperties.PropertySet#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Properties</em>'.
	 * @see org.emftext.language.javaproperties.PropertySet#getProperties()
	 * @see #getPropertySet()
	 * @generated
	 */
	EReference getPropertySet_Properties();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Key Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value Pair</em>'.
	 * @see java.util.Map.Entry
	 * @model features="key value whiteSpaceBefore whiteSpaceAfter" 
	 *        keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
	 *        valueDefault="" valueDataType="org.eclipse.emf.ecore.EString" valueRequired="true"
	 *        whiteSpaceBeforeDataType="org.eclipse.emf.ecore.EString"
	 *        whiteSpaceAfterDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getKeyValuePair();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EAttribute getKeyValuePair_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EAttribute getKeyValuePair_Value();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>White Space Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>White Space Before</em>'.
	 * @see java.util.Map.Entry
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EAttribute getKeyValuePair_WhiteSpaceBefore();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>White Space After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>White Space After</em>'.
	 * @see java.util.Map.Entry
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EAttribute getKeyValuePair_WhiteSpaceAfter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JavapropertiesFactory getJavapropertiesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.emftext.language.javaproperties.impl.PropertySetImpl <em>Property Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.javaproperties.impl.PropertySetImpl
		 * @see org.emftext.language.javaproperties.impl.JavapropertiesPackageImpl#getPropertySet()
		 * @generated
		 */
		EClass PROPERTY_SET = eINSTANCE.getPropertySet();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_SET__PROPERTIES = eINSTANCE.getPropertySet_Properties();

		/**
		 * The meta object literal for the '{@link org.emftext.language.javaproperties.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.javaproperties.impl.KeyValuePairImpl
		 * @see org.emftext.language.javaproperties.impl.JavapropertiesPackageImpl#getKeyValuePair()
		 * @generated
		 */
		EClass KEY_VALUE_PAIR = eINSTANCE.getKeyValuePair();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__KEY = eINSTANCE.getKeyValuePair_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__VALUE = eINSTANCE.getKeyValuePair_Value();

		/**
		 * The meta object literal for the '<em><b>White Space Before</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__WHITE_SPACE_BEFORE = eINSTANCE.getKeyValuePair_WhiteSpaceBefore();

		/**
		 * The meta object literal for the '<em><b>White Space After</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__WHITE_SPACE_AFTER = eINSTANCE.getKeyValuePair_WhiteSpaceAfter();

	}

} //JavapropertiesPackage

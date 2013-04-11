/*
Copyright (c) 2011-2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package org.sireum.util.math

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
trait IsRational {
  def asRational : Rational  
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
sealed case class Rational //
(isPos : Boolean, c : Integer, numerator : Integer, denominator : Integer) {
  require(denominator != SireumNumber(0))

  override def toString =
    (if (isPos) "" else "-") + c + "+" + numerator.toString + "/" + denominator.toString
}

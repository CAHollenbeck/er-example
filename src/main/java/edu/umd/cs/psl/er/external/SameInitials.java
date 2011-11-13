/*
 * This file is part of the PSL software.
 * Copyright 2011 University of Maryland
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.umd.cs.psl.er.external;

import java.util.*;
import edu.umd.cs.psl.model.function.AttributeSimilarityFunction;
//import edu.umd.cs.psl.model.argument.Attribute;
//import edu.umd.cs.psl.model.argument.GroundTerm;
//import edu.umd.cs.psl.model.argument.type.ArgumentType;
//import edu.umd.cs.psl.model.argument.type.ArgumentTypes;
//import edu.umd.cs.psl.model.function.ExternalFunction;
//import edu.umd.cs.psl.model.predicate.type.PredicateType;
//import edu.umd.cs.psl.model.predicate.type.PredicateTypes;

/**
 * This is an example external function.
 */
class SameInitials implements AttributeSimilarityFunction {
    public double similarity (String a, String b) {
	String[] tokens0 = a.split("\\s+");
	String[] tokens1 = b.split("\\s+");
	if (tokens0.length != tokens1.length) return 0.0;
	for(int i = 0; i < tokens0.length; i++)
	    if (tokens0[i].charAt(0) != tokens1[i].charAt(0)) return 0.0;
	return 1.0;
    }
}
package com.raju.geektrust.meetfamily.model;

import java.util.function.Supplier;

import com.raju.geektrust.meetfamily.operations.AddChildOperationProcessor;
import com.raju.geektrust.meetfamily.operations.GetRelationshipOperationProcessor;
import com.raju.geektrust.meetfamily.operations.OperationProcessor;

/**
 * This enum contains the operations that can be performed. It compares the
 * operation with the command and returns the handler for the command.
 * 
 * @author Nagaraju
 *
 */
public enum Operation {
	ADD_CHILD(() -> AddChildOperationProcessor.getInstance()),
	GET_RELATIONSHIP(() -> GetRelationshipOperationProcessor.getInstance());

	private Supplier<OperationProcessor> supplier;

	Operation(Supplier<OperationProcessor> supp) {
		supplier = supp;
	}

	public OperationProcessor getProcessor() {
		return supplier.get();
	}
}

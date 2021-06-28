package com.raju.geektrust.meetfamily.operations;

import java.util.List;

import com.raju.geektrust.meetfamily.model.FamilyTree;

public interface OperationProcessor {
	
	void processOperation(List<String> args, FamilyTree family);

}

package com.raju.geektrust.meetfamily.operations;


import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.raju.geektrust.meetfamily.model.FamilyTree;
import com.raju.geektrust.meetfamily.operations.AddChildOperationProcessor;


public class AddChildOperationProcessorTest {

	@Test
	public void test() {
		
		List<String> list=new ArrayList<>();
		
		AddChildOperationProcessor.getInstance().processOperation(list,  FamilyTree.builder().build());
		Assert.assertTrue(true);
	}

}

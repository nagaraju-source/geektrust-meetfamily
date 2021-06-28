package com.raju.geektrust.meetfamily;

import java.util.List;

import com.raju.geektrust.meetfamily.model.FamilyTree;
import com.raju.geektrust.meetfamily.model.InputFileData;
import com.raju.geektrust.meetfamily.operations.FamilyTreeInitializer;
import com.raju.geektrust.meetfamily.operations.FileProcessor;

/**
 * The task of this class is to just start and run the application. Its just
 * playing the role of orchestrator.
 * 
 * @author Nagaraju
 *
 */
public class MeetFamilyApplication {

	public static void main(String[] args) {
		processRequest(args);
	}

	private static void processRequest(String[] args) {
		String pathOfInputFile = args[0];

		FamilyTree familyTree = FamilyTreeInitializer.initializeFamilyTree();

		List<InputFileData> inputFileContent = FileProcessor.processFile(pathOfInputFile);

		inputFileContent.stream().forEach(inputLineData -> inputLineData.getOperation().getProcessor()
				.processOperation(inputLineData.getArguments(), familyTree));
	}

}

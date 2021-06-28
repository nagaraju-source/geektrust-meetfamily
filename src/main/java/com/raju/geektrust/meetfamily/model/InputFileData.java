package com.raju.geektrust.meetfamily.model;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
/**
 * This pojo class holds the input command provided in the file.s
 * @author Nagaraju
 *
 */
@Getter
@Setter
@Builder
public class InputFileData {
	private Operation operation;
	private List<String> arguments;

	

}

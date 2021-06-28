package com.raju.geektrust.meetfamily.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
/**
 * This pojo is the main holder object of the family, containing the king and the queen.
 * @author Nagaraju
 *
 */
@Getter
@Setter
@Builder
public class FamilyTree {
	private Person king;
	private Person queen;


}

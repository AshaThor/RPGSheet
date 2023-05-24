/**
 * 
 */
package com.ashathor.rpgsheet.utils;

import org.json.simple.*;

import com.ashathor.rpgsheet.model.Character;

/**
 * @author Ash Dev
 *
 */
public class SaveCharacter {
	public SaveCharacter(Character character) {
		JSONValue parser = new JSONValue();
		String json = parser.toJSONString(character);
		System.out.println(json);
	}

}

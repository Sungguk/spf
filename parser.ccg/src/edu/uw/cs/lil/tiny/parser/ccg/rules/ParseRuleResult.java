/*******************************************************************************
 * UW SPF - The University of Washington Semantic Parsing Framework. Copyright (C) 2013 Yoav Artzi
 * <p>
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or any later version.
 * <p>
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * <p>
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 ******************************************************************************/
package edu.uw.cs.lil.tiny.parser.ccg.rules;

import edu.uw.cs.lil.tiny.ccg.categories.Category;

/**
 * Result of applying a parse rule.
 * 
 * @author Yoav Artzi
 * @param <Y>
 */
public class ParseRuleResult<Y> {
	private final Category<Y>	resultCategory;
	private final String		ruleName;
	
	public ParseRuleResult(String ruleName, Category<Y> resultCategory) {
		super();
		this.ruleName = ruleName;
		this.resultCategory = resultCategory;
	}
	
	public Category<Y> getResultCategory() {
		return resultCategory;
	}
	
	public String getRuleName() {
		return ruleName;
	}
	
}
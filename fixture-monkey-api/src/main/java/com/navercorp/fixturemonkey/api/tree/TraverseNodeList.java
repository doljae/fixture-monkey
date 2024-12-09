/*
 * Fixture Monkey
 *
 * Copyright (c) 2021-present NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.fixturemonkey.api.tree;

import java.util.List;

import org.apiguardian.api.API;
import org.apiguardian.api.API.Status;

/**
 * The list of {@link TraverseNode}. It is just to avoid the compile error, use {@link #asList()}.
 *
 * @see NodeList
 */
@API(since = "1.1.4", status = Status.EXPERIMENTAL)
public final class TraverseNodeList implements NodeList {
	private final List<TraverseNode> traverseNodeList;

	public TraverseNodeList(List<TraverseNode> traverseNodeList) {
		this.traverseNodeList = traverseNodeList;
	}

	@Override
	public List<TraverseNode> asList() {
		return this.traverseNodeList;
	}

	public List<TraverseNode> getTraverseNodeList() {
		return traverseNodeList;
	}
}
/*
 * Copyright 2012-2019 the original author or authors.
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

package org.springframework.cloud.function.adapter.openwhisk;

/**
 * @author Mark Fisher
 */
public class OpenWhiskInitRequest {

	private String name;

	private boolean binary;

	private String main;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isBinary() {
		return this.binary;
	}

	public void setBinary(boolean binary) {
		this.binary = binary;
	}

	public String getMain() {
		return this.main;
	}

	public void setMain(String main) {
		this.main = main;
	}

}

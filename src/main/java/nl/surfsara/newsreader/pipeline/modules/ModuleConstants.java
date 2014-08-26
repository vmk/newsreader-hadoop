/**
 * Copyright 2014 SURFsara
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nl.surfsara.newsreader.pipeline.modules;

/**
 * Constants for all modules.
 * 
 * @author mathijs.kattenberg@surfsara.nl
 */
public final class ModuleConstants {
	/**
	 * The components are provided to the tasks via a zipfile and distributed
	 * cache. The zipfile can have any name but will be symlinked to this value.
	 * The distributed cache directory (provided by the system) plus this
	 * constant and the component name provide the absolute path to the
	 * component directory.
	 */
	public static final String ARCHIVEROOT = "components";
}

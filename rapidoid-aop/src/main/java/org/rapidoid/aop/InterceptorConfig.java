package org.rapidoid.aop;

/*
 * #%L
 * rapidoid-aop
 * %%
 * Copyright (C) 2014 - 2015 Nikolche Mihajlovski and contributors
 * %%
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
 * #L%
 */

import java.lang.annotation.Annotation;
import java.util.Set;

import org.rapidoid.annotation.Authors;
import org.rapidoid.annotation.Since;
import org.rapidoid.util.U;

@Authors("Nikolche Mihajlovski")
@Since("4.1.0")
public class InterceptorConfig {

	public final Set<Class<? extends Annotation>> annotated;

	public final AOPInterceptor interceptor;

	public InterceptorConfig(AOPInterceptor interceptor, Class<? extends Annotation>[] annotated) {
		this.annotated = U.set(annotated);
		this.interceptor = interceptor;
	}

}
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cr.model.v20160607;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteNamespaceRequest extends RoaAcsRequest<DeleteNamespaceResponse> {
	
	public DeleteNamespaceRequest() {
		super("cr", "2016-06-07", "DeleteNamespace");
		setUriPattern("/namespace/[Namespace]");
		setMethod(MethodType.DELETE);
	}

	private String namespace;

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putPathParameter("Namespace", namespace);
		}
	}

	@Override
	public Class<DeleteNamespaceResponse> getResponseClass() {
		return DeleteNamespaceResponse.class;
	}

}
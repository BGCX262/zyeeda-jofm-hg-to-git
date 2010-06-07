/*
 * Copyright 2010 Zyeeda Co. Ltd.
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
package com.zyeeda.jofm.commands;

import java.util.Map;

public interface Command {
	
    public String getScope();
	
    public String getOperation();
    
    public String getExecutor();
    
    public String getId();
    
    public String getParameter(String name);
    
    public String[] getParameterValues(String name);

    public Map<String, Object> getParameterMap();
    
}

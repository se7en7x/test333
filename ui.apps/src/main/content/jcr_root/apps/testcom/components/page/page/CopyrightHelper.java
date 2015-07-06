/*
 *  Copyright 2014 Adobe Systems Incorporated
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package apps.testcom.components.page.page;

import io.sightly.java.api.Use;
import javax.script.Bindings;
import java.util.Calendar;

public class CopyrightHelper implements Use {
    
    @Override
    public void init(Bindings bindings) {
    	// nothing to be done here in this case
    }
     
    public String getYear() {
    	return String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
    }
}
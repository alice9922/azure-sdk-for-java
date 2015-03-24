/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.storage.models;

/**
* Parameters supplied to the Regenerate Keys operation.
*/
public class StorageAccountRegenerateKeysParameters {
    private StorageKeyType keyType;
    
    /**
    * Required. Specifies which key to regenerate.
    * @return The KeyType value.
    */
    public StorageKeyType getKeyType() {
        return this.keyType;
    }
    
    /**
    * Required. Specifies which key to regenerate.
    * @param keyTypeValue The KeyType value.
    */
    public void setKeyType(final StorageKeyType keyTypeValue) {
        this.keyType = keyTypeValue;
    }
    
    private String name;
    
    /**
    * Required. The name of the desired storage account.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Required. The name of the desired storage account.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    /**
    * Initializes a new instance of the StorageAccountRegenerateKeysParameters
    * class.
    *
    */
    public StorageAccountRegenerateKeysParameters() {
    }
    
    /**
    * Initializes a new instance of the StorageAccountRegenerateKeysParameters
    * class with required arguments.
    *
    * @param name The name of the desired storage account.
    * @param keyType Specifies which key to regenerate.
    */
    public StorageAccountRegenerateKeysParameters(String name, StorageKeyType keyType) {
        if (name == null) {
            throw new NullPointerException("name");
        }
        if (keyType == null) {
            throw new NullPointerException("keyType");
        }
        this.setName(name);
        this.setKeyType(keyType);
    }
}

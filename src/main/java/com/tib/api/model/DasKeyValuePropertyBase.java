
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.DasFieldType;
import com.tib.api.model.enums.DasKeyValuePropertyType;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class DasKeyValuePropertyBase   {

    
    /**
 * 
 */
    @JsonProperty("FieldId")
    private DasFieldType fieldId;

    /**
 * 
 */
    @JsonProperty("InnerValue")
    private Object innerValue;

    /**
 * 
 */
    @JsonProperty("DasKeyValuePropertyType")
    private DasKeyValuePropertyType dasKeyValuePropertyType;


    
    public DasKeyValuePropertyBase() {
    }

    
    public DasKeyValuePropertyBase(DasFieldType fieldId, Object innerValue, DasKeyValuePropertyType dasKeyValuePropertyType) {
        this.fieldId = fieldId;
this.innerValue = innerValue;
this.dasKeyValuePropertyType = dasKeyValuePropertyType;

    }
    
    

    
    public DasFieldType getFieldId() {
        return fieldId;
    }

    public void setFieldId(DasFieldType fieldId) {
        this.fieldId = fieldId;
    }

    public Object getInnerValue() {
        return innerValue;
    }

    public void setInnerValue(Object innerValue) {
        this.innerValue = innerValue;
    }

    public DasKeyValuePropertyType getDasKeyValuePropertyType() {
        return dasKeyValuePropertyType;
    }

    public void setDasKeyValuePropertyType(DasKeyValuePropertyType dasKeyValuePropertyType) {
        this.dasKeyValuePropertyType = dasKeyValuePropertyType;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DasKeyValuePropertyBase that = (DasKeyValuePropertyBase) o;
        return Objects.equals(fieldId, that.fieldId) && Objects.equals(innerValue, that.innerValue) && Objects.equals(dasKeyValuePropertyType, that.dasKeyValuePropertyType) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(fieldId, innerValue, dasKeyValuePropertyType);
    }

    @Override
    public String toString() {
        return "DasKeyValuePropertyBase{" +
                 "fieldId='" + fieldId + '\'' +
 ", innerValue='" + innerValue + '\'' +
 ", dasKeyValuePropertyType='" + dasKeyValuePropertyType + '\'' +

                '}';
    }
}

package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.DasKeyValuePropertyType;
import com.tib.api.model.enums.DasFieldType;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class DasKeyValueProperty<T>  extends DasKeyValuePropertyBase  {

    
    /**
 * 
 */
    @JsonProperty("Value")
    private T value;

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


    
    public DasKeyValueProperty() {
    }

    
    public DasKeyValueProperty(T value, Object innerValue, DasKeyValuePropertyType dasKeyValuePropertyType) {
        this.value = value;
this.innerValue = innerValue;
this.dasKeyValuePropertyType = dasKeyValuePropertyType;

    }
    
    
    public DasKeyValueProperty(DasFieldType fieldId, T value, Object innerValue, DasKeyValuePropertyType dasKeyValuePropertyType) {
        super(fieldId, innerValue, dasKeyValuePropertyType);
        this.value = value;
this.innerValue = innerValue;
this.dasKeyValuePropertyType = dasKeyValuePropertyType;

    }

    
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
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
        DasKeyValueProperty that = (DasKeyValueProperty) o;
        return Objects.equals(value, that.value) && Objects.equals(innerValue, that.innerValue) && Objects.equals(dasKeyValuePropertyType, that.dasKeyValuePropertyType) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(value, innerValue, dasKeyValuePropertyType);
    }

    @Override
    public String toString() {
        return "DasKeyValueProperty{" +
                 "value='" + value + '\'' +
 ", innerValue='" + innerValue + '\'' +
 ", dasKeyValuePropertyType='" + dasKeyValuePropertyType + '\'' +

                '}';
    }
}
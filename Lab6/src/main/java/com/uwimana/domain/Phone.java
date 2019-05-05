package com.uwimana.domain;

import java.io.Serializable;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

/**
 * @author B.Pirasanth
 *
 */
public class Phone implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @NotNull
    @Range(min=100, max=999, message="{Size.phone.area}")
    private Integer area;
    private Integer prefix;
    private Integer number;


    @NotNull
    @Range(min=100, max=999, message="{Size.phone.prefix}")
    public Integer getArea() {
        return area;
    }

    @NotNull
    @Range(min=100, max=999, message="{Size.phone.prefix}")
    public void setArea(Integer area) {
        this.area = area;
    }
    @NotNull
    @Range(min=1000, max=9999, message="{Size.phone.number}")
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getPrefix() {
        return prefix;
    }

    public void setPrefix(Integer prefix) {
        this.prefix = prefix;
    }
}

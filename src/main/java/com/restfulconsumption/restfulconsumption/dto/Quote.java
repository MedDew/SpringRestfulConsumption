/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfulconsumption.restfulconsumption.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author Mehdi
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private String type;

    private Value value;

    public Quote() {

    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Quote{" + "type=" + type + ", value=" + value + '}';
    }

}

package com.ejdev.companyservice.contexts.company.domain.valueObject;

import lombok.Getter;

import java.util.UUID;

@Getter
public final class CompanyId {
    private final String value;

    private CompanyId( String value ) { 
        this.value = value;
    }

    public static CompanyId of( String value ) {
        try{
            UUID.fromString(value);
            return new CompanyId(value);
        }  catch ( Exception e ) {
            throw new IllegalArgumentException( "Invalid CompanyId value: " + value, e );
        }
    }

    public static  CompanyId generate() {
        return new CompanyId( UUID.randomUUID().toString() );
    }

    public  UUID getValueAsUUID(){
        return UUID.fromString( generate().getValue() );
    }

    @Override
    public String toString() {
        return value;
    }

}

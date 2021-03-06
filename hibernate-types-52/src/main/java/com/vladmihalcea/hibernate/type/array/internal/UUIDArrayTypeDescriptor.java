package com.vladmihalcea.hibernate.type.array.internal;

import java.util.UUID;

public class UUIDArrayTypeDescriptor extends AbstractArrayTypeDescriptor<UUID[]> {

    public UUIDArrayTypeDescriptor() {
        super(UUID[].class);
    }

    @Override
    protected String getSqlArrayType() {
        return "UUID";
    }
}
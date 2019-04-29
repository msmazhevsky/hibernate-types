package com.vladmihalcea.hibernate.type.array;

import com.vladmihalcea.hibernate.type.array.internal.ArraySqlTypeDescriptor;
import com.vladmihalcea.hibernate.type.array.internal.UUIDArrayTypeDescriptor;
import org.hibernate.type.AbstractSingleColumnStandardBasicType;
import org.hibernate.usertype.DynamicParameterizedType;

import java.util.Properties;
import java.util.UUID;

public class UUIDArrayType
        extends AbstractSingleColumnStandardBasicType<UUID[]>
        implements DynamicParameterizedType {

    public static final UUIDArrayType INSTANCE = new UUIDArrayType();

    public UUIDArrayType() {
        super(ArraySqlTypeDescriptor.INSTANCE, new UUIDArrayTypeDescriptor());
    }

    public String getName() {
        return "uuid-array";
    }

    @Override
    protected boolean registerUnderJavaType() {
        return true;
    }

    @Override
    public void setParameterValues(Properties parameters) {
        ((UUIDArrayTypeDescriptor) getJavaTypeDescriptor()).setParameterValues(parameters);
    }
}



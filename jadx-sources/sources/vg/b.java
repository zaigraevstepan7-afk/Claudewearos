package vg;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mg.c;
import t.m1;
import ug.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f18072a = new ConcurrentHashMap();

    public static Double a(Object obj) {
        if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        }
        if (!(obj instanceof Long)) {
            if (obj instanceof Double) {
                return (Double) obj;
            }
            throw new c("Failed to convert a value of type " + obj.getClass().getName() + " to double");
        }
        Long l10 = (Long) obj;
        Double dValueOf = Double.valueOf(l10.doubleValue());
        if (dValueOf.longValue() == l10.longValue()) {
            return dValueOf;
        }
        throw new c("Loss of precision while converting number to double: " + obj + ". Did you mean to use a 64-bit long instead?");
    }

    public static Object b(Object obj, Class cls) {
        if (obj == null) {
            return null;
        }
        if (!cls.isPrimitive() && !Number.class.isAssignableFrom(cls) && !Boolean.class.isAssignableFrom(cls) && !Character.class.isAssignableFrom(cls)) {
            if (String.class.isAssignableFrom(cls)) {
                if (obj instanceof String) {
                    return (String) obj;
                }
                throw new c("Failed to convert value of type " + obj.getClass().getName() + " to String");
            }
            if (cls.isArray()) {
                throw new c("Converting to Arrays is not supported, please use Listsinstead");
            }
            if (cls.getTypeParameters().length > 0) {
                throw new c("Class " + cls.getName() + " has generic type parameters, please use GenericTypeIndicator instead");
            }
            if (cls.equals(Object.class)) {
                return obj;
            }
            if (!cls.isEnum()) {
                a aVarE = e(cls);
                if (obj instanceof Map) {
                    return aVarE.c(d(obj), Collections.EMPTY_MAP);
                }
                throw new c("Can't convert object of type " + obj.getClass().getName() + " to type " + cls.getName());
            }
            if (!(obj instanceof String)) {
                throw new c("Expected a String while deserializing to enum " + cls + " but got a " + obj.getClass());
            }
            String str = (String) obj;
            try {
                return Enum.valueOf(cls, str);
            } catch (IllegalArgumentException unused) {
                throw new c("Could not find enum value of " + cls.getName() + " for value \"" + str + "\"");
            }
        }
        if (Integer.class.isAssignableFrom(cls) || Integer.TYPE.isAssignableFrom(cls)) {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            if (!(obj instanceof Long) && !(obj instanceof Double)) {
                throw new c("Failed to convert a value of type " + obj.getClass().getName() + " to int");
            }
            Number number = (Number) obj;
            double dDoubleValue = number.doubleValue();
            if (dDoubleValue >= -2.147483648E9d && dDoubleValue <= 2.147483647E9d) {
                return Integer.valueOf(number.intValue());
            }
            throw new c("Numeric value out of 32-bit integer range: " + dDoubleValue + ". Did you mean to use a long or double instead of an int?");
        }
        if (Boolean.class.isAssignableFrom(cls) || Boolean.TYPE.isAssignableFrom(cls)) {
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            throw new c("Failed to convert value of type " + obj.getClass().getName() + " to boolean");
        }
        if (Double.class.isAssignableFrom(cls) || Double.TYPE.isAssignableFrom(cls)) {
            return a(obj);
        }
        if (!Long.class.isAssignableFrom(cls) && !Long.TYPE.isAssignableFrom(cls)) {
            if (Float.class.isAssignableFrom(cls) || Float.TYPE.isAssignableFrom(cls)) {
                return Float.valueOf(a(obj).floatValue());
            }
            throw new c(m1.j("Deserializing values to ", cls.getSimpleName(), " is not supported"));
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (!(obj instanceof Double)) {
            throw new c("Failed to convert a value of type " + obj.getClass().getName() + " to long");
        }
        Double d10 = (Double) obj;
        if (d10.doubleValue() >= -9.223372036854776E18d && d10.doubleValue() <= 9.223372036854776E18d) {
            return Long.valueOf(d10.longValue());
        }
        throw new c("Numeric value out of 64-bit long range: " + d10 + ". Did you mean to use a double instead of a long?");
    }

    public static Object c(Object obj, Type type) {
        if (obj == null) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof Class) {
                return b(obj, (Class) type);
            }
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                if (wildcardType.getLowerBounds().length > 0) {
                    throw new c("Generic lower-bounded wildcard types are not supported");
                }
                Type[] upperBounds = wildcardType.getUpperBounds();
                l.b("Wildcard type " + type + " is not upper bounded.", upperBounds.length > 0);
                return c(obj, upperBounds[0]);
            }
            if (!(type instanceof TypeVariable)) {
                if (type instanceof GenericArrayType) {
                    throw new c("Generic Arrays are not supported, please use Lists instead");
                }
                throw new IllegalStateException("Unknown type encountered: " + type);
            }
            Type[] bounds = ((TypeVariable) type).getBounds();
            l.b("Wildcard type " + type + " is not upper bounded.", bounds.length > 0);
            return c(obj, bounds[0]);
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Class cls = (Class) parameterizedType.getRawType();
        if (List.class.isAssignableFrom(cls)) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            if (!(obj instanceof List)) {
                throw new c("Expected a List while deserializing, but got a " + obj.getClass());
            }
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c(it.next(), type2));
            }
            return arrayList;
        }
        if (Map.class.isAssignableFrom(cls)) {
            Type type3 = parameterizedType.getActualTypeArguments()[0];
            Type type4 = parameterizedType.getActualTypeArguments()[1];
            if (!type3.equals(String.class)) {
                throw new c("Only Maps with string keys are supported, but found Map with key type " + type3);
            }
            Map mapD = d(obj);
            HashMap map = new HashMap();
            for (Map.Entry entry : mapD.entrySet()) {
                map.put((String) entry.getKey(), c(entry.getValue(), type4));
            }
            return map;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            throw new c("Collections are not supported, please use Lists instead");
        }
        Map mapD2 = d(obj);
        a aVarE = e(cls);
        HashMap map2 = new HashMap();
        TypeVariable[] typeParameters = aVarE.f18064a.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments.length != typeParameters.length) {
            throw new IllegalStateException("Mismatched lengths for type variables and actual types");
        }
        for (int i10 = 0; i10 < typeParameters.length; i10++) {
            map2.put(typeParameters[i10], actualTypeArguments[i10]);
        }
        return aVarE.c(mapD2, map2);
    }

    public static Map d(Object obj) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new c("Expected a Map while deserializing, but got a " + obj.getClass());
    }

    public static a e(Class cls) {
        ConcurrentHashMap concurrentHashMap = f18072a;
        a aVar = (a) concurrentHashMap.get(cls);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(cls);
        concurrentHashMap.put(cls, aVar2);
        return aVar2;
    }

    public static Object f(Object obj) {
        Object objInvoke;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            if ((obj instanceof Float) || (obj instanceof Double)) {
                Number number = (Number) obj;
                double dDoubleValue = number.doubleValue();
                return (dDoubleValue > 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d || Math.floor(dDoubleValue) != dDoubleValue) ? Double.valueOf(dDoubleValue) : Long.valueOf(number.longValue());
            }
            if ((obj instanceof Long) || (obj instanceof Integer)) {
                return obj;
            }
            throw new c(m1.j("Numbers of type ", obj.getClass().getSimpleName(), " are not supported, please use an int, long, float or double"));
        }
        if ((obj instanceof String) || (obj instanceof Boolean)) {
            return obj;
        }
        if (obj instanceof Character) {
            throw new c("Characters are not supported, please use Strings");
        }
        if (obj instanceof Map) {
            HashMap map = new HashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw new c("Maps with non-string keys are not supported");
                }
                map.put((String) key, f(entry.getValue()));
            }
            return map;
        }
        if (obj instanceof Collection) {
            if (!(obj instanceof List)) {
                throw new c("Serializing Collections is not supported, please use Lists instead");
            }
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(f(it.next()));
            }
            return arrayList;
        }
        if (obj.getClass().isArray()) {
            throw new c("Serializing Arrays is not supported, please use Lists instead");
        }
        if (obj instanceof Enum) {
            return ((Enum) obj).name();
        }
        a aVarE = e(obj.getClass());
        HashMap map2 = aVarE.f18069f;
        Class cls = aVarE.f18064a;
        if (!cls.isAssignableFrom(obj.getClass())) {
            throw new IllegalArgumentException("Can't serialize object of class " + obj.getClass() + " with BeanMapper for class " + cls);
        }
        HashMap map3 = new HashMap();
        for (String str : aVarE.f18068e.values()) {
            if (map2.containsKey(str)) {
                try {
                    objInvoke = ((Method) map2.get(str)).invoke(obj, null);
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException(e11);
                }
            } else {
                Field field = (Field) aVarE.f18071h.get(str);
                if (field == null) {
                    throw new IllegalStateException(m1.i("Bean property without field or getter:", str));
                }
                try {
                    objInvoke = field.get(obj);
                } catch (IllegalAccessException e12) {
                    throw new RuntimeException(e12);
                }
            }
            map3.put(str, f(objInvoke));
        }
        return map3;
    }
}

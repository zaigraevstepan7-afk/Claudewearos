package vg;

import android.util.Log;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import mg.c;
import mg.e;
import mg.h;
import mg.i;
import mg.k;
import t.m1;
import ug.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Class f18064a;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f18065b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18066c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18067d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f18068e = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f18070g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f18069f = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f18071h = new HashMap();

    public a(Class cls) throws NoSuchMethodException, SecurityException {
        this.f18064a = cls;
        this.f18066c = cls.isAnnotationPresent(k.class);
        this.f18067d = !cls.isAnnotationPresent(h.class);
        Constructor constructor = null;
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            constructor = declaredConstructor;
        } catch (NoSuchMethodException unused) {
        }
        this.f18065b = constructor;
        Method[] methods = cls.getMethods();
        int length = methods.length;
        int i10 = 0;
        while (true) {
            Class cls2 = Void.TYPE;
            if (i10 >= length) {
                for (Field field : cls.getFields()) {
                    if (!field.getDeclaringClass().equals(Object.class) && Modifier.isPublic(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers()) && !field.isAnnotationPresent(e.class)) {
                        String strB = b(field);
                        a(strB == null ? field.getName() : strB);
                    }
                }
                HashMap map = new HashMap();
                Class superclass = cls;
                do {
                    for (Method method : superclass.getDeclaredMethods()) {
                        if (method.getName().startsWith("set") && !method.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method.getModifiers()) && method.getReturnType().equals(cls2) && method.getParameterTypes().length == 1 && !method.isAnnotationPresent(e.class)) {
                            String strE = e(method);
                            String str = (String) this.f18068e.get(strE.toLowerCase(Locale.US));
                            if (str == null) {
                                continue;
                            } else {
                                if (!str.equals(strE)) {
                                    throw new c("Found setter with invalid case-sensitive name: " + method.getName());
                                }
                                if (method.isBridge()) {
                                    map.put(strE, method);
                                } else {
                                    Method method2 = (Method) this.f18070g.get(strE);
                                    Method method3 = (Method) map.get(strE);
                                    if (method2 == null) {
                                        method.setAccessible(true);
                                        this.f18070g.put(strE, method);
                                    } else if (!d(method, method2) && (method3 == null || !d(method, method3))) {
                                        throw new c("Found a conflicting setters with name: " + method.getName() + " (conflicts with " + method2.getName() + " defined on " + method2.getDeclaringClass().getName() + ")");
                                    }
                                }
                            }
                        }
                    }
                    for (Field field2 : superclass.getDeclaredFields()) {
                        String strB2 = b(field2);
                        strB2 = strB2 == null ? field2.getName() : strB2;
                        if (this.f18068e.containsKey(strB2.toLowerCase(Locale.US)) && !this.f18071h.containsKey(strB2)) {
                            field2.setAccessible(true);
                            this.f18071h.put(strB2, field2);
                        }
                    }
                    superclass = superclass.getSuperclass();
                    if (superclass == null) {
                        break;
                    }
                } while (!superclass.equals(Object.class));
                if (this.f18068e.isEmpty()) {
                    throw new c("No properties to serialize found on class ".concat(cls.getName()));
                }
                return;
            }
            Method method4 = methods[i10];
            if ((method4.getName().startsWith("get") || method4.getName().startsWith("is")) && !method4.getDeclaringClass().equals(Object.class) && Modifier.isPublic(method4.getModifiers()) && !Modifier.isStatic(method4.getModifiers()) && !method4.getReturnType().equals(cls2) && method4.getParameterTypes().length == 0 && !method4.isBridge() && !method4.isAnnotationPresent(e.class)) {
                String strE2 = e(method4);
                a(strE2);
                method4.setAccessible(true);
                if (this.f18069f.containsKey(strE2)) {
                    throw new c("Found conflicting getters for name: " + method4.getName());
                }
                this.f18069f.put(strE2, method4);
            }
            i10++;
        }
    }

    public static String b(AccessibleObject accessibleObject) {
        if (accessibleObject.isAnnotationPresent(i.class)) {
            return ((i) accessibleObject.getAnnotation(i.class)).value();
        }
        return null;
    }

    public static boolean d(Method method, Method method2) {
        l.b("Expected override from a base class", method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()));
        Class<?> returnType = method.getReturnType();
        Class cls = Void.TYPE;
        l.b("Expected void return type", returnType.equals(cls));
        l.b("Expected void return type", method2.getReturnType().equals(cls));
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?>[] parameterTypes2 = method2.getParameterTypes();
        l.b("Expected exactly one parameter", parameterTypes.length == 1);
        l.b("Expected exactly one parameter", parameterTypes2.length == 1);
        return method.getName().equals(method2.getName()) && parameterTypes[0].equals(parameterTypes2[0]);
    }

    public static String e(Method method) {
        String strB = b(method);
        if (strB != null) {
            return strB;
        }
        String name = method.getName();
        String[] strArr = {"get", "set", "is"};
        String str = null;
        for (int i10 = 0; i10 < 3; i10++) {
            String str2 = strArr[i10];
            if (name.startsWith(str2)) {
                str = str2;
            }
        }
        if (str == null) {
            throw new IllegalArgumentException(m1.i("Unknown Bean prefix for method: ", name));
        }
        char[] charArray = name.substring(str.length()).toCharArray();
        for (int i11 = 0; i11 < charArray.length && Character.isUpperCase(charArray[i11]); i11++) {
            charArray[i11] = Character.toLowerCase(charArray[i11]);
        }
        return new String(charArray);
    }

    public static Type f(Type type, Map map) {
        if (!(type instanceof TypeVariable)) {
            return type;
        }
        Type type2 = (Type) map.get(type);
        if (type2 != null) {
            return type2;
        }
        throw new IllegalStateException("Could not resolve type " + type);
    }

    public final void a(String str) {
        Locale locale = Locale.US;
        String str2 = (String) this.f18068e.put(str.toLowerCase(locale), str);
        if (str2 == null || str.equals(str2)) {
            return;
        }
        throw new c("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
    }

    public final Object c(Map map, Map map2) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Class cls = this.f18064a;
        Constructor constructor = this.f18065b;
        if (constructor == null) {
            throw new c("Class " + cls.getName() + " does not define a no-argument constructor. If you are using ProGuard, make sure these constructors are not stripped.");
        }
        try {
            Object objNewInstance = constructor.newInstance(null);
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                HashMap map3 = this.f18070g;
                if (map3.containsKey(str)) {
                    Method method = (Method) map3.get(str);
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    if (genericParameterTypes.length != 1) {
                        throw new IllegalStateException("Setter does not have exactly one parameter");
                    }
                    try {
                        method.invoke(objNewInstance, b.c(entry.getValue(), f(genericParameterTypes[0], map2)));
                    } catch (IllegalAccessException e10) {
                        throw new RuntimeException(e10);
                    } catch (InvocationTargetException e11) {
                        throw new RuntimeException(e11);
                    }
                } else {
                    HashMap map4 = this.f18071h;
                    if (map4.containsKey(str)) {
                        Field field = (Field) map4.get(str);
                        try {
                            field.set(objNewInstance, b.c(entry.getValue(), f(field.getGenericType(), map2)));
                        } catch (IllegalAccessException e12) {
                            throw new RuntimeException(e12);
                        }
                    } else {
                        StringBuilder sbK = m6.a.k("No setter/field for ", str, " found on class ");
                        sbK.append(cls.getName());
                        String string = sbK.toString();
                        if (this.f18068e.containsKey(str.toLowerCase(Locale.US))) {
                            string = m1.v(string, " (fields/setters are case sensitive!)");
                        }
                        if (this.f18066c) {
                            throw new c(string);
                        }
                        if (this.f18067d) {
                            Log.w("ClassMapper", string);
                        }
                    }
                }
            }
            return objNewInstance;
        } catch (IllegalAccessException e13) {
            throw new RuntimeException(e13);
        } catch (InstantiationException e14) {
            throw new RuntimeException(e14);
        } catch (InvocationTargetException e15) {
            throw new RuntimeException(e15);
        }
    }
}

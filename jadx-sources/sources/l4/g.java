package l4;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class g extends uk.c {
    public static Class D = null;
    public static Constructor E = null;
    public static Method F = null;
    public static Method G = null;
    public static boolean H = false;
    public final Method A;
    public final Method B;
    public final Method C;

    /* renamed from: d, reason: collision with root package name */
    public final Class f9977d;

    /* renamed from: e, reason: collision with root package name */
    public final Constructor f9978e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f9979f;

    /* renamed from: z, reason: collision with root package name */
    public final Method f9980z;

    public g() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodR0;
        Constructor<?> constructor;
        Method methodQ0;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodQ0 = q0(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodR0 = r0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e10.getClass().getName()), e10);
            methodR0 = null;
            constructor = null;
            methodQ0 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f9977d = cls;
        this.f9978e = constructor;
        this.f9979f = methodQ0;
        this.f9980z = method;
        this.A = method2;
        this.B = method3;
        this.C = methodR0;
    }

    public static boolean m0(Object obj, String str, int i10, boolean z2) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        p0();
        try {
            return ((Boolean) F.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void p0() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (H) {
            return;
        }
        H = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        E = constructor;
        D = cls;
        F = method2;
        G = method;
    }

    public static Method q0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean l0(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f9979f.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface n0(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f9977d, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.C.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean o0(Object obj) {
        try {
            return ((Boolean) this.A.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method r0(Class cls) throws NoSuchMethodException, SecurityException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // uk.c
    public final Typeface s(Context context, k4.f fVar, Resources resources, int i10) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        Object objNewInstance;
        Method method = this.f9979f;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                objNewInstance = this.f9978e.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                k4.g[] gVarArr = fVar.f9422a;
                int length = gVarArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        k4.g gVar = gVarArr[i11];
                        Context context2 = context;
                        if (l0(context2, objNewInstance, gVar.f9423a, gVar.f9427e, gVar.f9424b, gVar.f9425c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.f9426d))) {
                            i11++;
                            context = context2;
                        } else {
                            try {
                                this.B.invoke(objNewInstance, null);
                                break;
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                    } else if (o0(objNewInstance)) {
                        return n0(objNewInstance);
                    }
                }
            }
            return null;
        }
        p0();
        try {
            Object objNewInstance2 = E.newInstance(null);
            for (k4.g gVar2 : fVar.f9422a) {
                File fileE = wd.a.E(context);
                if (fileE == null) {
                    return null;
                }
                try {
                } catch (RuntimeException unused3) {
                } catch (Throwable th2) {
                    fileE.delete();
                    throw th2;
                }
                if (!wd.a.s(fileE, resources, gVar2.f9428f) || !m0(objNewInstance2, fileE.getPath(), gVar2.f9424b, gVar2.f9425c)) {
                    fileE.delete();
                    return null;
                }
                fileE.delete();
            }
            p0();
            try {
                Object objNewInstance3 = Array.newInstance((Class<?>) D, 1);
                Array.set(objNewInstance3, 0, objNewInstance2);
                return (Typeface) G.invoke(null, objNewInstance3);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // uk.c
    public final Typeface t(Context context, q4.h[] hVarArr, int i10) throws IllegalAccessException, InstantiationException, IOException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Typeface typefaceN0;
        boolean zBooleanValue;
        if (hVarArr.length >= 1) {
            Method method = this.f9979f;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (q4.h hVar : hVarArr) {
                        if (hVar.f13231f == 0) {
                            Uri uri = hVar.f13226a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, wd.a.K(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f9978e.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = hVarArr.length;
                        int i11 = 0;
                        boolean z2 = false;
                        while (true) {
                            Method method2 = this.B;
                            if (i11 < length) {
                                q4.h hVar2 = hVarArr[i11];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(hVar2.f13226a);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.f9980z.invoke(objNewInstance, byteBuffer, Integer.valueOf(hVar2.f13227b), null, Integer.valueOf(hVar2.f13228c), Integer.valueOf(hVar2.f13229d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                    if (!zBooleanValue) {
                                        method2.invoke(objNewInstance, null);
                                        break;
                                    }
                                    z2 = true;
                                }
                                i11++;
                                z2 = z2;
                            } else if (!z2) {
                                method2.invoke(objNewInstance, null);
                            } else if (o0(objNewInstance) && (typefaceN0 = n0(objNewInstance)) != null) {
                                return Typeface.create(typefaceN0, i10);
                            }
                        }
                    }
                } else {
                    q4.h hVarZ = z(hVarArr, i10);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(hVarZ.f13226a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(hVarZ.f13228c).setItalic(hVarZ.f13229d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // uk.c
    public final Typeface v(Context context, Resources resources, int i10, String str, int i11) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f9979f;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.v(context, resources, i10, str, i11);
        }
        try {
            objNewInstance = this.f9978e.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!l0(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.B.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (o0(objNewInstance)) {
                return n0(objNewInstance);
            }
        }
        return null;
    }
}

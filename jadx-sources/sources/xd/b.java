package xd;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.common.zzb;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends zzb implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20045a;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.f20045a = obj;
    }

    public static a n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new e(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static Object u(a aVar) throws SecurityException {
        if (aVar instanceof b) {
            return ((b) aVar).f20045a;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            throw new IllegalArgumentException(m6.a.d(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        }
        e0.i(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }
}

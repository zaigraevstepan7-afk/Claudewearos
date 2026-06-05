package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y0 extends h9.a {

    /* renamed from: e, reason: collision with root package name */
    public static y0 f1157e;

    /* renamed from: f, reason: collision with root package name */
    public static final ef.f f1158f = new ef.f();

    /* renamed from: d, reason: collision with root package name */
    public final Application f1159d;

    public y0(Application application) {
        super(3);
        this.f1159d = application;
    }

    @Override // h9.a, androidx.lifecycle.z0
    public final x0 a(Class cls) {
        Application application = this.f1159d;
        if (application != null) {
            return j(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // h9.a, androidx.lifecycle.z0
    public final x0 c(Class cls, d6.c cVar) {
        if (this.f1159d != null) {
            return a(cls);
        }
        Application application = (Application) cVar.f4977a.get(f1158f);
        if (application != null) {
            return j(cls, application);
        }
        if (a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return uk.c.w(cls);
    }

    public final x0 j(Class cls, Application application) {
        if (!a.class.isAssignableFrom(cls)) {
            return uk.c.w(cls);
        }
        try {
            x0 x0Var = (x0) cls.getConstructor(Application.class).newInstance(application);
            fj.l.c(x0Var);
            return x0Var;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Cannot create an instance of " + cls, e13);
        }
    }
}

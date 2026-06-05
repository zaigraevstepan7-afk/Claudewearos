package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u0 implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f1134a;

    /* renamed from: b, reason: collision with root package name */
    public final y0 f1135b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f1136c;

    /* renamed from: d, reason: collision with root package name */
    public final v f1137d;

    /* renamed from: e, reason: collision with root package name */
    public final mh.g f1138e;

    public u0(Application application, a7.f fVar, Bundle bundle) {
        y0 y0Var;
        this.f1138e = fVar.g();
        this.f1137d = fVar.h();
        this.f1136c = bundle;
        this.f1134a = application;
        if (application != null) {
            if (y0.f1157e == null) {
                y0.f1157e = new y0(application);
            }
            y0Var = y0.f1157e;
            fj.l.c(y0Var);
        } else {
            y0Var = new y0(null);
        }
        this.f1135b = y0Var;
    }

    @Override // androidx.lifecycle.z0
    public final x0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final x0 b(Class cls, String str) throws NoSuchMethodException, SecurityException {
        v vVar = this.f1137d;
        if (vVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Application application = this.f1134a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? v0.a(cls, v0.f1149b) : v0.a(cls, v0.f1148a);
        if (constructorA == null) {
            if (application != null) {
                return this.f1135b.a(cls);
            }
            if (h9.a.f7739b == null) {
                h9.a.f7739b = new h9.a(3);
            }
            fj.l.c(h9.a.f7739b);
            return uk.c.w(cls);
        }
        mh.g gVar = this.f1138e;
        fj.l.c(gVar);
        o0 o0VarB = r0.b(gVar.i(str), this.f1136c);
        p0 p0Var = new p0(str, o0VarB);
        p0Var.s(vVar, gVar);
        o oVar = vVar.f1141c;
        if (oVar == o.f1112b || oVar.compareTo(o.f1114d) >= 0) {
            gVar.C();
        } else {
            vVar.a(new g(vVar, gVar));
        }
        x0 x0VarB = (!zIsAssignableFrom || application == null) ? v0.b(cls, constructorA, o0VarB) : v0.b(cls, constructorA, application, o0VarB);
        x0VarB.a("androidx.lifecycle.savedstate.vm.tag", p0Var);
        return x0VarB;
    }

    @Override // androidx.lifecycle.z0
    public final x0 c(Class cls, d6.c cVar) {
        lh.e eVar = r0.f1126e;
        LinkedHashMap linkedHashMap = cVar.f4977a;
        String str = (String) linkedHashMap.get(eVar);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(r0.f1122a) == null || linkedHashMap.get(r0.f1123b) == null) {
            if (this.f1137d != null) {
                return b(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(y0.f1158f);
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? v0.a(cls, v0.f1149b) : v0.a(cls, v0.f1148a);
        return constructorA == null ? this.f1135b.c(cls, cVar) : (!zIsAssignableFrom || application == null) ? v0.b(cls, constructorA, r0.c(cVar)) : v0.b(cls, constructorA, application, r0.c(cVar));
    }

    @Override // androidx.lifecycle.z0
    public final x0 e(fj.f fVar, d6.c cVar) {
        return c(cg.b.D(fVar), cVar);
    }
}
